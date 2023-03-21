/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapp;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Zali
 */

public class Chat extends UnicastRemoteObject {
    private int chatId;
    private String chatName;
    private List<User> members;
    private List<Message> chatHistory;
    private List<Subscription> subscriptions;
    private Database database;

    public Chat(int chatId, String chatName, Database database) throws RemoteException {
        this.chatId = chatId;
        this.chatName = chatName;
        this.members = new ArrayList<>();
        this.chatHistory = new ArrayList<>();
        this.subscriptions = new ArrayList<>();
        this.database = database;
    }

    public int getChatId() {
        return chatId;
    }

    public String getChatName() {
        return chatName;
    }

    public List<User> getMembers() {
        return members;
    }

    public void addMember(User user) {
        if (!members.contains(user)) {
            members.add(user);
            // Add user to database
            database.addUserToChat(user, this);
        }
    }

    public void removeMember(User user) {
        members.remove(user);
        // Remove user from database
        database.removeUserFromChat(user, this);
    }

    public boolean hasMember(User user) {
        return members.contains(user);
    }

    public List<Message> getChatHistory() {
        return chatHistory;
    }

    public void addMessage(Message message) {
        chatHistory.add(message);
        // Add message to database
        database.addMessageToChat(message, this);
    }

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        if (!hasSubscription(user)) {
            Subscription subscription = new Subscription(user, this);
            subscriptions.add(subscription);
            // Add subscription to database
            database.addSubscription(subscription);
        }
    }

    public void unsubscribe(User user) {
        subscriptions.removeIf(subscription -> subscription.getUser().equals(user));
        // Remove subscription from database
        database.removeSubscription(user, this);
    }

    public boolean hasSubscription(User user) {
        for (Subscription subscription : subscriptions) {
            if (subscription.getUser().equals(user)) {
                return true;
            }
        }
        return false;
    }

    public void notifySubscribers(Message message) {
        for (Subscription subscription : subscriptions) {
            try {
                subscription.getUser().receiveMessage(message);
            } catch (RemoteException e) {
                // Handle exception
                e.printStackTrace();
            }
        }
    }
}