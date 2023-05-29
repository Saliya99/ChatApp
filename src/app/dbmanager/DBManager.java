package app.dbmanager;

import app.controller.Connection;
import app.pojos.Files;
import app.pojos.Groups;
import app.pojos.User;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DBManager {

    private static DBManager dbm;

    private DBManager() {
    }

    static {
        dbm = new DBManager();
    }

    public static DBManager getDBM() {
        return dbm;
    }

    public boolean insert(byte[] avatar64based, String email, String username, String nickname, String password) {
        Session s = Connection.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        User user = new User();

        if (avatar64based != null) {
            user.setAvatar(avatar64based);
        }
        user.setEmail(email);
        user.setUsername(username);
        user.setNickname(nickname);
        user.setPassword(password);
        user.setRoleId(2);
        user.setIsDeleted(0);

        s.save(user);
        t.commit();
        s.close();
        return true;

    }

    public List login(String username, String password) {
        Session sess = Connection.getSessionFactory().openSession();
        String sql = "FROM User WHERE username='" + username + "' AND password='" + password + "'";
        Query qu = sess.createQuery(sql);
        List User = qu.list();
        return User;
    }

    public void update(byte[] img, String email, String nickname, int id) {
        Session s = Connection.getSessionFactory().openSession();
        Transaction tran = s.beginTransaction();

        User user = (User) s.load(User.class, id);
        user.setEmail(email);
        user.setNickname(nickname);

        s.update(user);
        tran.commit();
        System.out.println("Update success..");
        s.close();
    }

    public void chang_pwd(String current_password) {
        Session s = Connection.getSessionFactory().openSession();
    }

    public boolean create_chat(String chatname, String chatdes) {
        Session s = Connection.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        Groups groups = new Groups();

        Time time = Time.valueOf(LocalTime.now());
        Date date = Date.valueOf(LocalDate.now());

        groups.setName(chatname);
        groups.setDescription(chatdes);
        groups.setCreatedDate(date);
        groups.setCreatedTime(time);
        groups.setStatus(0);
        groups.setIsDeleted(0);

        try {
            s.save(groups);
            t.commit();
            s.close();
            
            this.init_msg_file(chatname);
            
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public void init_msg_file(String chat_name) {

        Session s = Connection.getSessionFactory().openSession();
        String sql = "FROM Groups WHERE name='" + chat_name + "'";
        Query qu = s.createQuery(sql);
        List Group = qu.list();

        Iterator i = Group.iterator();
        int chat_id=0;
        if (i.hasNext()) {
            Groups g = (Groups) i.next();
            chat_id = g.getId();
        }


        Transaction t = s.beginTransaction();
        Files files = new Files();

        files.setChatId(chat_id);
        files.setLink("chat_log/"+chat_id + "_.ser");
        files.setIsDeleted(0);

        s.save(files);
        t.commit();
        s.close();

    }

    public List get_chats() {
        Session sess = Connection.getSessionFactory().openSession();
        String sql = "FROM Groups WHERE is_deleted=0";
        Query qu = sess.createQuery(sql);
        List Group = qu.list();
        return Group;
    }

    public boolean is_online(int chat_id) {
        Session sess = Connection.getSessionFactory().openSession();
        String sql = "FROM Groups WHERE status=1 AND id=" + chat_id;
        Query qu = sess.createQuery(sql);
        List Group = qu.list();

        Iterator i = Group.iterator();
        if (i.hasNext()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean check_all_offline() {
        Session sess = Connection.getSessionFactory().openSession();
        String sql = "FROM Groups WHERE status=1";
        Query qu = sess.createQuery(sql);
        List Group = qu.list();

        Iterator i = Group.iterator();
        if (i.hasNext()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean put_online(int chat_id) {

        if (check_all_offline()) {

            Session s = Connection.getSessionFactory().openSession();
            Transaction tran = s.beginTransaction();

            Groups group = (Groups) s.load(Groups.class, chat_id);
            group.setStatus(1);

            s.update(group);
            tran.commit();
            System.out.println(chat_id + "online...");
            s.close();

            return true;
        } else {
            return false;
        }
    }

    public void put_offline(int id) {
        Session s = Connection.getSessionFactory().openSession();
        Transaction tran = s.beginTransaction();

        Groups groups = (Groups) s.load(Groups.class, id);
        groups.setStatus(0);

        s.update(groups);
        tran.commit();
        System.out.println(id + "offline...");
        s.close();
    }

    public List get_avatart(int user_id) {

        Session sess = Connection.getSessionFactory().openSession();
        String sql = "FROM User WHERE id='" + user_id + "' AND is_deleted=0";
        Query qu = sess.createQuery(sql);
        List User = qu.list();
        return User;
    }

}
