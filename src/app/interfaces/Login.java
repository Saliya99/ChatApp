package app.interfaces;

import app.dbmanager.DBManager;
import app.pojos.Groups;
import app.pojos.User;
import app.services.Chat;
import app.services.ChatService;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Login extends javax.swing.JFrame {

    Registry reg;
    Chat chat;

    static int xx, yy;
   
    int id;
    ChatClient me;

    public Login() {
        initComponents();

        Dimension screen_size = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(screen_size.width - 425, getY());

//        App starting
        signin_panel.setVisible(true);
        signup_panel.setVisible(false);
        forgot_password_panel.setVisible(false);
        chat_list_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        setting_panel.setVisible(false);
        update_panel.setVisible(false);
        update_pwd_panel.setVisible(false);
        admin_panel.setVisible(false);

       panelchange_signin();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layered_pane = new javax.swing.JLayeredPane();
        title_panel = new javax.swing.JPanel();
        titlebar = new javax.swing.JLabel();
        minimize1 = new javax.swing.JLabel();
        close1 = new javax.swing.JLabel();
        signin_panel = new javax.swing.JPanel();
        background = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        username_icon = new javax.swing.JLabel();
        usernamefield = new javax.swing.JTextField();
        password_icon = new javax.swing.JLabel();
        eye_open_icon = new javax.swing.JLabel();
        eye_close_icon = new javax.swing.JLabel();
        passwordfield = new javax.swing.JPasswordField();
        signinbtn = new javax.swing.JLabel();
        signin_error = new javax.swing.JLabel();
        forgot_password = new javax.swing.JTextField();
        forgot_password_hover = new javax.swing.JTextField();
        sign_up_link = new javax.swing.JTextField();
        sign_up_link_hover = new javax.swing.JTextField();
        signup_panel = new javax.swing.JPanel();
        profilepic = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        signup_email_line = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        signup_username_line = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        signup_eye_open_icon = new javax.swing.JLabel();
        signup_eye_close_icon = new javax.swing.JLabel();
        signup_password_line = new javax.swing.JLabel();
        signup_nickname_line = new javax.swing.JLabel();
        nickname = new javax.swing.JTextField();
        signup = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        signin = new javax.swing.JTextField();
        signin_link_hover = new javax.swing.JTextField();
        background1 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        forgot_password_panel = new javax.swing.JPanel();
        fp_logo = new javax.swing.JLabel();
        fp_resend_code = new javax.swing.JLabel();
        fp_description = new javax.swing.JLabel();
        fp_recovery_code = new javax.swing.JTextField();
        fp_recovery_code_line = new javax.swing.JLabel();
        fp_confirm_btn = new javax.swing.JLabel();
        fp_error = new javax.swing.JLabel();
        fp_signin_link = new javax.swing.JTextField();
        fp_signin_link_hover = new javax.swing.JTextField();
        background2 = new javax.swing.JLabel();
        chat_body_panel = new javax.swing.JPanel();
        chatlist_title2 = new javax.swing.JLabel();
        chatlist_setting2 = new javax.swing.JLabel();
        client_logout2 = new javax.swing.JLabel();
        msgScrollPane = new javax.swing.JScrollPane();
        chatbox = new javax.swing.JPanel();
        inputmsg = new javax.swing.JTextField();
        send_btn = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        chat_list_panel = new javax.swing.JPanel();
        background4 = new javax.swing.JLabel();
        chatlist_title = new javax.swing.JLabel();
        chatlist_setting = new javax.swing.JLabel();
        client_logout1 = new javax.swing.JLabel();
        chat_list_scrollPane = new javax.swing.JScrollPane();
        available_chats = new javax.swing.JPanel();
        setting_panel = new javax.swing.JPanel();
        setting_lable = new javax.swing.JLabel();
        setting_previous = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        update_pwd_panel = new javax.swing.JPanel();
        new_pwd = new javax.swing.JTextField();
        signup_email_line1 = new javax.swing.JLabel();
        new_pwd2 = new javax.swing.JTextField();
        signup_username_line1 = new javax.swing.JLabel();
        signup_nickname_line1 = new javax.swing.JLabel();
        current_pwd = new javax.swing.JTextField();
        success_msg = new javax.swing.JLabel();
        signin_link_hover1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        update_panel = new javax.swing.JPanel();
        update_profile_pic1 = new javax.swing.JLabel();
        update_email = new javax.swing.JTextField();
        signup_email_line2 = new javax.swing.JLabel();
        signup_username_line2 = new javax.swing.JLabel();
        update_nickname = new javax.swing.JTextField();
        success_msg1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        success_update_msg = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        background3 = new javax.swing.JLabel();
        admin_panel = new javax.swing.JPanel();
        signup_error1 = new javax.swing.JLabel();
        signup_copyrights3 = new javax.swing.JLabel();
        create_new_chat_btn = new javax.swing.JLabel();
        group_scrollPane = new javax.swing.JScrollPane();
        group_panel = new javax.swing.JPanel();
        logout1 = new javax.swing.JLabel();
        label2 = new java.awt.Label();
        group_create_panel = new javax.swing.JPanel();
        groupname = new javax.swing.JTextField();
        username_line1 = new javax.swing.JLabel();
        create_group_btn = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        group_creation_state = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        desc = new javax.swing.JTextArea();
        logout2 = new javax.swing.JLabel();
        back1 = new javax.swing.JLabel();
        label3 = new java.awt.Label();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 550));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        layered_pane.setBackground(new java.awt.Color(28, 36, 47));
        layered_pane.setMinimumSize(new java.awt.Dimension(800, 550));

        title_panel.setBackground(new java.awt.Color(0, 153, 255));

        titlebar.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        titlebar.setForeground(new java.awt.Color(255, 255, 255));
        titlebar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlebar.setText("  Chat App");
        titlebar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        titlebar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        titlebar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                titlebarMouseDragged(evt);
            }
        });
        titlebar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                titlebarMousePressed(evt);
            }
        });

        minimize1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/minimize.png"))); // NOI18N
        minimize1.setToolTipText("Minimize");
        minimize1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimize1MouseClicked(evt);
            }
        });

        close1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/close.png"))); // NOI18N
        close1.setToolTipText("Close");
        close1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout title_panelLayout = new javax.swing.GroupLayout(title_panel);
        title_panel.setLayout(title_panelLayout);
        title_panelLayout.setHorizontalGroup(
            title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(title_panelLayout.createSequentialGroup()
                .addComponent(titlebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minimize1)
                .addGap(16, 16, 16)
                .addComponent(close1)
                .addContainerGap())
        );
        title_panelLayout.setVerticalGroup(
            title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(minimize1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(titlebar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(close1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        signin_panel.setBackground(new java.awt.Color(255, 255, 255));
        signin_panel.setMinimumSize(new java.awt.Dimension(800, 550));
        signin_panel.setPreferredSize(new java.awt.Dimension(800, 550));
        signin_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/background.png"))); // NOI18N
        background.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        background.setMinimumSize(new java.awt.Dimension(800, 550));
        background.setPreferredSize(new java.awt.Dimension(800, 550));
        signin_panel.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 800, 100));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/logo_blue.png"))); // NOI18N
        signin_panel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 130, 130));

        username_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/username.png"))); // NOI18N
        signin_panel.add(username_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 80, 70));

        usernamefield.setBackground(new java.awt.Color(204, 204, 204));
        usernamefield.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        usernamefield.setForeground(new java.awt.Color(111, 117, 124));
        usernamefield.setAutoscrolls(false);
        usernamefield.setBorder(null);
        usernamefield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernamefieldFocusLost(evt);
            }
        });
        usernamefield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernamefieldMouseClicked(evt);
            }
        });
        usernamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernamefieldActionPerformed(evt);
            }
        });
        signin_panel.add(usernamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 360, 20));

        password_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/password.png"))); // NOI18N
        signin_panel.add(password_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 90, 70));

        eye_open_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/eye_open.png"))); // NOI18N
        eye_open_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eye_open_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eye_open_iconMouseClicked(evt);
            }
        });
        signin_panel.add(eye_open_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 20, 20));

        eye_close_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/eye_close.png"))); // NOI18N
        eye_close_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eye_close_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eye_close_iconMouseClicked(evt);
            }
        });
        signin_panel.add(eye_close_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 20, 20));

        passwordfield.setBackground(new java.awt.Color(204, 204, 204));
        passwordfield.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        passwordfield.setForeground(new java.awt.Color(111, 117, 124));
        passwordfield.setBorder(null);
        passwordfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordfieldFocusLost(evt);
            }
        });
        passwordfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordfieldMouseClicked(evt);
            }
        });
        passwordfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordfieldActionPerformed(evt);
            }
        });
        signin_panel.add(passwordfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 360, 20));

        signinbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/signin_pink.png"))); // NOI18N
        signinbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signinbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signinbtnMouseClicked(evt);
            }
        });
        signin_panel.add(signinbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 200, 30));

        signin_error.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        signin_error.setForeground(new java.awt.Color(51, 51, 255));
        signin_error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signin_panel.add(signin_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 310, 20));

        forgot_password.setEditable(false);
        forgot_password.setBackground(new java.awt.Color(204, 204, 204));
        forgot_password.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        forgot_password.setForeground(new java.awt.Color(51, 51, 255));
        forgot_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        forgot_password.setText("Forgot Password ?");
        forgot_password.setBorder(null);
        forgot_password.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgot_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forgot_passwordMouseEntered(evt);
            }
        });
        signin_panel.add(forgot_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 130, 20));

        forgot_password_hover.setEditable(false);
        forgot_password_hover.setBackground(new java.awt.Color(28, 36, 47));
        forgot_password_hover.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        forgot_password_hover.setForeground(new java.awt.Color(51, 102, 255));
        forgot_password_hover.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        forgot_password_hover.setText("Forgot Password ?");
        forgot_password_hover.setBorder(null);
        forgot_password_hover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgot_password_hover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgot_password_hoverMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forgot_password_hoverMouseExited(evt);
            }
        });
        forgot_password_hover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgot_password_hoverActionPerformed(evt);
            }
        });
        signin_panel.add(forgot_password_hover, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 130, 20));

        sign_up_link.setBackground(new java.awt.Color(204, 204, 204));
        sign_up_link.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        sign_up_link.setForeground(new java.awt.Color(51, 51, 255));
        sign_up_link.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sign_up_link.setText("Sign Up");
        sign_up_link.setBorder(null);
        sign_up_link.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sign_up_link.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sign_up_linkMouseEntered(evt);
            }
        });
        sign_up_link.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_up_linkActionPerformed(evt);
            }
        });
        signin_panel.add(sign_up_link, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 50, 20));

        sign_up_link_hover.setEditable(false);
        sign_up_link_hover.setBackground(new java.awt.Color(28, 36, 47));
        sign_up_link_hover.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        sign_up_link_hover.setForeground(new java.awt.Color(0, 153, 255));
        sign_up_link_hover.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sign_up_link_hover.setText("Sign Up");
        sign_up_link_hover.setBorder(null);
        sign_up_link_hover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sign_up_link_hover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sign_up_link_hoverMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sign_up_link_hoverMouseExited(evt);
            }
        });
        signin_panel.add(sign_up_link_hover, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 50, 20));

        signup_panel.setBackground(new java.awt.Color(255, 255, 255));
        signup_panel.setMinimumSize(new java.awt.Dimension(800, 550));
        signup_panel.setPreferredSize(new java.awt.Dimension(800, 550));
        signup_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profilepic.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        profilepic.setForeground(new java.awt.Color(111, 117, 124));
        profilepic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profilepic.setText("Profile Picture");
        profilepic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 117, 124), 2));
        profilepic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profilepic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profilepicMouseClicked(evt);
            }
        });
        signup_panel.add(profilepic, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 120, 120));

        email.setBackground(new java.awt.Color(204, 204, 204));
        email.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        email.setForeground(new java.awt.Color(51, 51, 255));
        email.setText("Email");
        email.setAutoscrolls(false);
        email.setBorder(null);
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailMouseClicked(evt);
            }
        });
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        signup_panel.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 240, 20));

        signup_email_line.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        signup_email_line.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        signup_panel.add(signup_email_line, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, 10));

        username.setBackground(new java.awt.Color(204, 204, 204));
        username.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        username.setForeground(new java.awt.Color(51, 51, 255));
        username.setText("Username");
        username.setAutoscrolls(false);
        username.setBorder(null);
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFocusLost(evt);
            }
        });
        username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameMouseClicked(evt);
            }
        });
        signup_panel.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 240, 20));

        signup_username_line.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        signup_username_line.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        signup_panel.add(signup_username_line, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, 10));

        password.setBackground(new java.awt.Color(204, 204, 204));
        password.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        password.setForeground(new java.awt.Color(51, 51, 255));
        password.setText("Password");
        password.setBorder(null);
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        signup_panel.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 240, 20));

        signup_eye_open_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/eye_open.png"))); // NOI18N
        signup_eye_open_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signup_eye_open_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signup_eye_open_iconMouseClicked(evt);
            }
        });
        signup_panel.add(signup_eye_open_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 20, 20));

        signup_eye_close_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/eye_close.png"))); // NOI18N
        signup_eye_close_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signup_eye_close_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signup_eye_close_iconMouseClicked(evt);
            }
        });
        signup_panel.add(signup_eye_close_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 20, 20));

        signup_password_line.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        signup_password_line.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        signup_panel.add(signup_password_line, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, 10));

        signup_nickname_line.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        signup_nickname_line.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        signup_panel.add(signup_nickname_line, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, 10));

        nickname.setBackground(new java.awt.Color(204, 204, 204));
        nickname.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        nickname.setForeground(new java.awt.Color(51, 51, 255));
        nickname.setText("Nick name");
        nickname.setAutoscrolls(false);
        nickname.setBorder(null);
        nickname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nicknameFocusLost(evt);
            }
        });
        nickname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nicknameMouseClicked(evt);
            }
        });
        signup_panel.add(nickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 240, 20));

        signup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/signup_blue.png"))); // NOI18N
        signup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupMouseClicked(evt);
            }
        });
        signup_panel.add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 200, 30));

        error.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        error.setForeground(new java.awt.Color(206, 47, 131));
        error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signup_panel.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 310, 20));

        signin.setBackground(new java.awt.Color(204, 204, 204));
        signin.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        signin.setForeground(new java.awt.Color(51, 51, 255));
        signin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        signin.setText("Sign In");
        signin.setBorder(null);
        signin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signinMouseEntered(evt);
            }
        });
        signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinActionPerformed(evt);
            }
        });
        signup_panel.add(signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 50, 20));

        signin_link_hover.setEditable(false);
        signin_link_hover.setBackground(new java.awt.Color(204, 204, 204));
        signin_link_hover.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        signin_link_hover.setForeground(new java.awt.Color(0, 51, 255));
        signin_link_hover.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        signin_link_hover.setText("Sign In");
        signin_link_hover.setBorder(null);
        signin_link_hover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signin_link_hover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signin_link_hoverMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signin_link_hoverMouseExited(evt);
            }
        });
        signup_panel.add(signin_link_hover, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 50, 20));

        background1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/background.png"))); // NOI18N
        background1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        background1.setMinimumSize(new java.awt.Dimension(800, 550));
        background1.setPreferredSize(new java.awt.Dimension(800, 550));
        signup_panel.add(background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 800, 100));

        label1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(51, 51, 255));
        label1.setText("New User");
        signup_panel.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 100));
        label1.getAccessibleContext().setAccessibleDescription("");

        forgot_password_panel.setBackground(new java.awt.Color(255, 255, 255));
        forgot_password_panel.setPreferredSize(new java.awt.Dimension(800, 550));
        forgot_password_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fp_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/logo_blue.png"))); // NOI18N
        forgot_password_panel.add(fp_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 140, 130));

        fp_resend_code.setFont(new java.awt.Font("Bookman Old Style", 1, 11)); // NOI18N
        fp_resend_code.setForeground(new java.awt.Color(51, 51, 255));
        fp_resend_code.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fp_resend_code.setText("resend code.");
        fp_resend_code.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgot_password_panel.add(fp_resend_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 80, -1));

        fp_description.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        fp_description.setForeground(new java.awt.Color(111, 117, 124));
        fp_description.setText("<html>We've sent a recovery code to your email.<br>Please enter the code to change your password. If you haven't received any mail, please</html>");
        forgot_password_panel.add(fp_description, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 240, 70));

        fp_recovery_code.setBackground(new java.awt.Color(204, 204, 204));
        fp_recovery_code.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        fp_recovery_code.setForeground(new java.awt.Color(51, 51, 255));
        fp_recovery_code.setText("Recovery code");
        fp_recovery_code.setAutoscrolls(false);
        fp_recovery_code.setBorder(null);
        fp_recovery_code.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fp_recovery_codeFocusLost(evt);
            }
        });
        fp_recovery_code.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fp_recovery_codeMouseClicked(evt);
            }
        });
        forgot_password_panel.add(fp_recovery_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 240, 20));

        fp_recovery_code_line.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        fp_recovery_code_line.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        forgot_password_panel.add(fp_recovery_code_line, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, 10));

        fp_confirm_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/confirm_blue.png"))); // NOI18N
        fp_confirm_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgot_password_panel.add(fp_confirm_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 200, 30));

        fp_error.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        fp_error.setForeground(new java.awt.Color(51, 51, 255));
        fp_error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fp_error.setText("username and password are required");
        forgot_password_panel.add(fp_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 310, -1));

        fp_signin_link.setBackground(new java.awt.Color(204, 204, 204));
        fp_signin_link.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        fp_signin_link.setForeground(new java.awt.Color(51, 51, 255));
        fp_signin_link.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fp_signin_link.setText("Sign In");
        fp_signin_link.setBorder(null);
        fp_signin_link.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fp_signin_link.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fp_signin_linkMouseEntered(evt);
            }
        });
        forgot_password_panel.add(fp_signin_link, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 50, 20));

        fp_signin_link_hover.setEditable(false);
        fp_signin_link_hover.setBackground(new java.awt.Color(28, 36, 47));
        fp_signin_link_hover.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        fp_signin_link_hover.setForeground(new java.awt.Color(206, 47, 131));
        fp_signin_link_hover.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fp_signin_link_hover.setText("Sign In");
        fp_signin_link_hover.setBorder(null);
        fp_signin_link_hover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fp_signin_link_hover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fp_signin_link_hoverMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fp_signin_link_hoverMouseExited(evt);
            }
        });
        forgot_password_panel.add(fp_signin_link_hover, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 50, 20));

        background2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/background.png"))); // NOI18N
        background2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        background2.setMinimumSize(new java.awt.Dimension(800, 550));
        background2.setPreferredSize(new java.awt.Dimension(800, 550));
        forgot_password_panel.add(background2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 800, 100));

        chat_body_panel.setBackground(new java.awt.Color(255, 255, 255));
        chat_body_panel.setMinimumSize(new java.awt.Dimension(800, 550));
        chat_body_panel.setPreferredSize(new java.awt.Dimension(800, 550));
        chat_body_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chatlist_title2.setBackground(new java.awt.Color(255, 255, 255));
        chatlist_title2.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        chatlist_title2.setForeground(new java.awt.Color(51, 51, 255));
        chatlist_title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chatlist_title2.setText("Inbox");
        chat_body_panel.add(chatlist_title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 300, 30));

        chatlist_setting2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/setting_blue.png"))); // NOI18N
        chatlist_setting2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chatlist_setting2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chatlist_setting2MouseClicked(evt);
            }
        });
        chat_body_panel.add(chatlist_setting2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 30, 30));

        client_logout2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/client_logout.png"))); // NOI18N
        client_logout2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        client_logout2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                client_logout2MouseClicked(evt);
            }
        });
        chat_body_panel.add(client_logout2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 30, 30));

        msgScrollPane.setBackground(new java.awt.Color(51, 51, 255));
        msgScrollPane.setForeground(new java.awt.Color(204, 204, 204));

        chatbox.setBackground(new java.awt.Color(153, 153, 153));
        chatbox.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        msgScrollPane.setViewportView(chatbox);

        chat_body_panel.add(msgScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 340, 350));

        inputmsg.setBackground(new java.awt.Color(153, 153, 153));
        inputmsg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inputmsg.setBorder(null);
        inputmsg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputmsgKeyPressed(evt);
            }
        });
        chat_body_panel.add(inputmsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 290, 30));

        send_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/send.png"))); // NOI18N
        send_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        send_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                send_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                send_btnMouseEntered(evt);
            }
        });
        chat_body_panel.add(send_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 40, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrlinelong.png"))); // NOI18N
        chat_body_panel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 290, 10));

        chat_list_panel.setBackground(new java.awt.Color(255, 255, 255));
        chat_list_panel.setMinimumSize(new java.awt.Dimension(800, 550));
        chat_list_panel.setPreferredSize(new java.awt.Dimension(800, 550));
        chat_list_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/background.png"))); // NOI18N
        background4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        background4.setMinimumSize(new java.awt.Dimension(800, 550));
        background4.setPreferredSize(new java.awt.Dimension(800, 550));
        chat_list_panel.add(background4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 800, 130));

        chatlist_title.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        chatlist_title.setForeground(new java.awt.Color(0, 0, 255));
        chatlist_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chatlist_title.setText("Available Chats");
        chat_list_panel.add(chatlist_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 300, 30));

        chatlist_setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/setting_blue.png"))); // NOI18N
        chatlist_setting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chatlist_setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chatlist_settingMouseClicked(evt);
            }
        });
        chat_list_panel.add(chatlist_setting, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 30, 30));

        client_logout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/client_logout.png"))); // NOI18N
        client_logout1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        client_logout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                client_logout1MouseClicked(evt);
            }
        });
        chat_list_panel.add(client_logout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 30, 30));

        chat_list_scrollPane.setBackground(new java.awt.Color(0, 153, 255));
        chat_list_scrollPane.setForeground(new java.awt.Color(204, 204, 204));

        available_chats.setBackground(new java.awt.Color(0, 153, 255));
        available_chats.setForeground(new java.awt.Color(204, 204, 204));
        available_chats.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        chat_list_scrollPane.setViewportView(available_chats);

        chat_list_panel.add(chat_list_scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 340, 350));

        setting_panel.setBackground(new java.awt.Color(0, 153, 255));
        setting_panel.setPreferredSize(new java.awt.Dimension(800, 86));
        setting_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setting_lable.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        setting_lable.setForeground(new java.awt.Color(255, 255, 255));
        setting_lable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setting_lable.setText("  Settings");
        setting_panel.add(setting_lable, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 340, 30));

        setting_previous.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/setting_blue.png"))); // NOI18N
        setting_previous.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setting_previous.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setting_previousMouseClicked(evt);
            }
        });
        setting_panel.add(setting_previous, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 30, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Admin");
        setting_panel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        update_pwd_panel.setBackground(new java.awt.Color(255, 255, 255));
        update_pwd_panel.setPreferredSize(new java.awt.Dimension(800, 550));
        update_pwd_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        new_pwd.setBackground(new java.awt.Color(204, 204, 204));
        new_pwd.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        new_pwd.setForeground(new java.awt.Color(111, 117, 124));
        new_pwd.setText("New Passowrd");
        new_pwd.setAutoscrolls(false);
        new_pwd.setBorder(null);
        new_pwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                new_pwdFocusLost(evt);
            }
        });
        new_pwd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new_pwdMouseClicked(evt);
            }
        });
        update_pwd_panel.add(new_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 350, 30));

        signup_email_line1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        signup_email_line1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        update_pwd_panel.add(signup_email_line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, 20));

        new_pwd2.setBackground(new java.awt.Color(204, 204, 204));
        new_pwd2.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        new_pwd2.setForeground(new java.awt.Color(111, 117, 124));
        new_pwd2.setText("New Corfirm Password");
        new_pwd2.setAutoscrolls(false);
        new_pwd2.setBorder(null);
        new_pwd2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                new_pwd2FocusLost(evt);
            }
        });
        new_pwd2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new_pwd2MouseClicked(evt);
            }
        });
        update_pwd_panel.add(new_pwd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 350, 30));

        signup_username_line1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        signup_username_line1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        update_pwd_panel.add(signup_username_line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, 10));

        signup_nickname_line1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        signup_nickname_line1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        update_pwd_panel.add(signup_nickname_line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, 10));

        current_pwd.setBackground(new java.awt.Color(204, 204, 204));
        current_pwd.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        current_pwd.setForeground(new java.awt.Color(111, 117, 124));
        current_pwd.setText("Current Password");
        current_pwd.setAutoscrolls(false);
        current_pwd.setBorder(null);
        current_pwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                current_pwdFocusLost(evt);
            }
        });
        current_pwd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                current_pwdMouseClicked(evt);
            }
        });
        update_pwd_panel.add(current_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 350, 30));

        success_msg.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        success_msg.setForeground(new java.awt.Color(206, 47, 131));
        success_msg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update_pwd_panel.add(success_msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 280, 40));

        signin_link_hover1.setEditable(false);
        signin_link_hover1.setBackground(new java.awt.Color(255, 255, 255));
        signin_link_hover1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        signin_link_hover1.setForeground(new java.awt.Color(51, 51, 255));
        signin_link_hover1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        signin_link_hover1.setText("Home");
        signin_link_hover1.setBorder(null);
        signin_link_hover1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signin_link_hover1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signin_link_hover1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signin_link_hover1MouseExited(evt);
            }
        });
        signin_link_hover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signin_link_hover1ActionPerformed(evt);
            }
        });
        update_pwd_panel.add(signin_link_hover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 90, 30));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 255));
        jButton3.setText("change password");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        update_pwd_panel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, -1, -1));

        update_panel.setBackground(new java.awt.Color(255, 255, 255));
        update_panel.setPreferredSize(new java.awt.Dimension(800, 550));
        update_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        update_profile_pic1.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        update_profile_pic1.setForeground(new java.awt.Color(111, 117, 124));
        update_profile_pic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update_profile_pic1.setText("Profile Picture");
        update_profile_pic1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 117, 124), 2));
        update_profile_pic1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_profile_pic1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_profile_pic1MouseClicked(evt);
            }
        });
        update_panel.add(update_profile_pic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 180, 120));

        update_email.setBackground(new java.awt.Color(204, 204, 204));
        update_email.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        update_email.setForeground(new java.awt.Color(51, 51, 255));
        update_email.setText("Email");
        update_email.setAutoscrolls(false);
        update_email.setBorder(null);
        update_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                update_emailFocusLost(evt);
            }
        });
        update_email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_emailMouseClicked(evt);
            }
        });
        update_panel.add(update_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 240, 20));

        signup_email_line2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        signup_email_line2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        update_panel.add(signup_email_line2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, 10));

        signup_username_line2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        signup_username_line2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        update_panel.add(signup_username_line2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, -1, 10));

        update_nickname.setBackground(new java.awt.Color(204, 204, 204));
        update_nickname.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        update_nickname.setForeground(new java.awt.Color(51, 51, 255));
        update_nickname.setText("Nick name");
        update_nickname.setAutoscrolls(false);
        update_nickname.setBorder(null);
        update_nickname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                update_nicknameFocusLost(evt);
            }
        });
        update_nickname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_nicknameMouseClicked(evt);
            }
        });
        update_panel.add(update_nickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 240, 20));

        success_msg1.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        success_msg1.setForeground(new java.awt.Color(206, 47, 131));
        success_msg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update_panel.add(success_msg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 280, 20));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Home");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        update_panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Change Password");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        update_panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        success_update_msg.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        success_update_msg.setForeground(new java.awt.Color(204, 0, 102));
        success_update_msg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update_panel.add(success_update_msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 210, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/update.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        update_panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 200, 30));

        background3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/background.png"))); // NOI18N
        background3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        background3.setMinimumSize(new java.awt.Dimension(800, 550));
        background3.setPreferredSize(new java.awt.Dimension(800, 550));
        update_panel.add(background3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 800, 90));

        admin_panel.setBackground(new java.awt.Color(255, 255, 255));
        admin_panel.setMinimumSize(new java.awt.Dimension(800, 550));
        admin_panel.setPreferredSize(new java.awt.Dimension(800, 550));
        admin_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signup_error1.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        signup_error1.setForeground(new java.awt.Color(206, 47, 131));
        signup_error1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin_panel.add(signup_error1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 310, 20));

        signup_copyrights3.setFont(new java.awt.Font("Bookman Old Style", 0, 10)); // NOI18N
        signup_copyrights3.setForeground(new java.awt.Color(255, 255, 255));
        signup_copyrights3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signup_copyrights3.setText("<html><center>Copyrights &copy; 2020 Team Semicolon<br>All rights reserved</center></html>");
        admin_panel.add(signup_copyrights3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 360, 30));

        create_new_chat_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/create new.png"))); // NOI18N
        create_new_chat_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        create_new_chat_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                create_new_chat_btnMouseClicked(evt);
            }
        });
        admin_panel.add(create_new_chat_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 200, 30));

        group_scrollPane.setBackground(new java.awt.Color(204, 204, 204));
        group_scrollPane.setBorder(null);
        group_scrollPane.setForeground(new java.awt.Color(204, 204, 204));

        group_panel.setBackground(new java.awt.Color(51, 51, 255));
        group_panel.setForeground(new java.awt.Color(204, 204, 204));
        group_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        group_scrollPane.setViewportView(group_panel);

        admin_panel.add(group_scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 340, 290));

        logout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/logout.png"))); // NOI18N
        logout1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout1MouseClicked(evt);
            }
        });
        admin_panel.add(logout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, -1, 30));

        label2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 0, 255));
        label2.setText("Admin Panel");
        admin_panel.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        group_create_panel.setBackground(new java.awt.Color(255, 255, 255));
        group_create_panel.setMinimumSize(new java.awt.Dimension(800, 550));
        group_create_panel.setPreferredSize(new java.awt.Dimension(800, 550));
        group_create_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        groupname.setBackground(new java.awt.Color(204, 204, 204));
        groupname.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        groupname.setForeground(new java.awt.Color(111, 117, 124));
        groupname.setAutoscrolls(false);
        groupname.setBorder(null);
        groupname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                groupnameFocusLost(evt);
            }
        });
        groupname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                groupnameMouseClicked(evt);
            }
        });
        group_create_panel.add(groupname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 240, 20));

        username_line1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        username_line1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        group_create_panel.add(username_line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, 10));

        create_group_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/create.png"))); // NOI18N
        create_group_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        create_group_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                create_group_btnMouseClicked(evt);
            }
        });
        group_create_panel.add(create_group_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 200, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Group Description");
        group_create_panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        group_creation_state.setForeground(new java.awt.Color(255, 0, 102));
        group_creation_state.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        group_create_panel.add(group_creation_state, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 220, 10));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Group name");
        group_create_panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        desc.setBackground(new java.awt.Color(204, 204, 204));
        desc.setColumns(20);
        desc.setForeground(new java.awt.Color(255, 255, 255));
        desc.setRows(5);
        jScrollPane1.setViewportView(desc);

        group_create_panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 240, 60));

        logout2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/logout.png"))); // NOI18N
        logout2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout2MouseClicked(evt);
            }
        });
        group_create_panel.add(logout2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, -1, 30));

        back1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back1.setForeground(new java.awt.Color(51, 51, 255));
        back1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back1.setText("back");
        back1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back1MouseClicked(evt);
            }
        });
        group_create_panel.add(back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 40, -1));

        label3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 0, 255));
        label3.setText("Create New Channel");
        group_create_panel.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        javax.swing.GroupLayout layered_paneLayout = new javax.swing.GroupLayout(layered_pane);
        layered_pane.setLayout(layered_paneLayout);
        layered_paneLayout.setHorizontalGroup(
            layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signin_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(title_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layered_paneLayout.createSequentialGroup()
                    .addComponent(signup_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layered_paneLayout.createSequentialGroup()
                    .addComponent(forgot_password_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layered_paneLayout.createSequentialGroup()
                    .addComponent(chat_list_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layered_paneLayout.createSequentialGroup()
                    .addComponent(setting_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layered_paneLayout.createSequentialGroup()
                    .addComponent(update_pwd_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layered_paneLayout.createSequentialGroup()
                    .addComponent(update_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layered_paneLayout.createSequentialGroup()
                    .addComponent(admin_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layered_paneLayout.createSequentialGroup()
                    .addComponent(group_create_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layered_paneLayout.createSequentialGroup()
                    .addComponent(chat_body_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layered_paneLayout.setVerticalGroup(
            layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                .addComponent(title_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(signin_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                    .addGap(0, 37, Short.MAX_VALUE)
                    .addComponent(signup_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                    .addGap(0, 37, Short.MAX_VALUE)
                    .addComponent(forgot_password_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                    .addGap(0, 37, Short.MAX_VALUE)
                    .addComponent(chat_list_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                    .addGap(0, 37, Short.MAX_VALUE)
                    .addComponent(setting_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                    .addGap(0, 37, Short.MAX_VALUE)
                    .addComponent(update_pwd_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                    .addContainerGap(36, Short.MAX_VALUE)
                    .addComponent(update_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(1, 1, 1)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                    .addGap(0, 37, Short.MAX_VALUE)
                    .addComponent(admin_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                    .addGap(0, 37, Short.MAX_VALUE)
                    .addComponent(group_create_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                    .addGap(0, 37, Short.MAX_VALUE)
                    .addComponent(chat_body_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layered_pane.setLayer(title_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(signin_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(signup_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(forgot_password_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(chat_body_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(chat_list_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(setting_panel, javax.swing.JLayeredPane.PALETTE_LAYER);
        layered_pane.setLayer(update_pwd_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(update_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(admin_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(group_create_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(layered_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 550));

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/minimize.png"))); // NOI18N
        minimize.setToolTipText("Minimize");
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        getContentPane().add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, -1, 30));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/close.png"))); // NOI18N
        close.setToolTipText("Close");
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, -1, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void titlebarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titlebarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xx, y - yy);
    }//GEN-LAST:event_titlebarMouseDragged

    private void titlebarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titlebarMousePressed
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_titlebarMousePressed

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        
        //this.setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void usernamefieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernamefieldFocusLost
        if (usernamefield.getText().trim().equalsIgnoreCase("")) {
            usernamefield.setText("Username");
        }
    }//GEN-LAST:event_usernamefieldFocusLost

    private void usernamefieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernamefieldMouseClicked
        if (usernamefield.getText().trim().equalsIgnoreCase("username")) {
            usernamefield.setText(null);
        }
    }//GEN-LAST:event_usernamefieldMouseClicked

    private void passwordfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordfieldFocusLost
        if (passwordfield.getText().trim().equalsIgnoreCase("")) {
            passwordfield.setText("Password");
            passwordfield.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_passwordfieldFocusLost

    private void passwordfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordfieldMouseClicked
        if (passwordfield.getText().trim().equalsIgnoreCase("password")) {
            passwordfield.setText(null);
            passwordfield.setEchoChar('●');
        }
    }//GEN-LAST:event_passwordfieldMouseClicked

    private void passwordfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordfieldActionPerformed

    private void eye_open_iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eye_open_iconMouseClicked
        if (passwordfield.getText().trim().equalsIgnoreCase("password")) {

        } else {
            eye_close_icon.setVisible(true);
            eye_open_icon.setVisible(false);
            passwordfield.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_eye_open_iconMouseClicked

    private void eye_close_iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eye_close_iconMouseClicked
        if (passwordfield.getText().trim().equalsIgnoreCase("password")) {

        } else {
            eye_open_icon.setVisible(true);
            eye_close_icon.setVisible(false);
            passwordfield.setEchoChar('●');
        }
    }//GEN-LAST:event_eye_close_iconMouseClicked

    private void signinbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinbtnMouseClicked
        
//        Sign in function
        
        String userName = usernamefield.getText();
        String userPassword = passwordfield.getText();

        ArrayList<String> error = loginvalidation(userName, userPassword);

        if (error.isEmpty() == false) {
            signin_error.setText(error.get(0));
        } else {

            List data = DBManager.getDBM().login(userName, userPassword);
            Iterator i = data.iterator();
            if (i.hasNext()) {
                User user = (User) i.next();
//                If user is Admin
                if (user.getRoleId() == 1) {
         
                    System.out.println(user.getUsername());
                   
                    load_group(true);
                    admin_default();

                } else {
                    //client
                    chat_list_default();

                    me = new ChatClient(user.getId(), user.getUsername(), user.getNickname(), user.getEmail());
                    //start client
                    load_client_groups();
                    this.start_client();
                }

                this.id = user.getId();
                update_nickname.setText(user.getNickname());
                update_email.setText(user.getEmail());
                

            } else {
                System.out.println("Username or Password Incorrect");
                signin_error.setText("Username or Password Incorrect");
            }

        }

    }//GEN-LAST:event_signinbtnMouseClicked

    private void forgot_passwordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgot_passwordMouseEntered
        forgot_password.setVisible(false);
        forgot_password_hover.setVisible(true);
    }//GEN-LAST:event_forgot_passwordMouseEntered

    private void forgot_password_hoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgot_password_hoverMouseClicked
        forgot_password_default();
    }//GEN-LAST:event_forgot_password_hoverMouseClicked

    private void forgot_password_hoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgot_password_hoverMouseExited
        forgot_password_hover.setVisible(false);
        forgot_password.setVisible(true);
    }//GEN-LAST:event_forgot_password_hoverMouseExited

    private void forgot_password_hoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgot_password_hoverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forgot_password_hoverActionPerformed

    private void sign_up_linkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_up_linkMouseEntered
        sign_up_link.setVisible(false);
        sign_up_link_hover.setVisible(true);
    }//GEN-LAST:event_sign_up_linkMouseEntered

    private void sign_up_linkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_up_linkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sign_up_linkActionPerformed

    private void sign_up_link_hoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_up_link_hoverMouseClicked
        signup_default();
    }//GEN-LAST:event_sign_up_link_hoverMouseClicked

    private void sign_up_link_hoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_up_link_hoverMouseExited
        sign_up_link_hover.setVisible(false);
        sign_up_link.setVisible(true);
    }//GEN-LAST:event_sign_up_link_hoverMouseExited

    private void profilepicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilepicMouseClicked
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG Images", "jpg", "png"); 
        chooser.setFileFilter(filter); 
        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) { 
            File file = chooser.getSelectedFile(); 
            String strfilepath = file.getAbsolutePath(); 
            try {
                ImageIcon icon = new ImageIcon(strfilepath); 
                ImageIcon iconresized = new ImageIcon(icon.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT)); 
                profilepic.setText(null); 
                profilepic.setIcon(iconresized); 

            } catch (Exception e) {
                System.out.println("Exception occurred : " + e.getMessage());
            }
        }
    }//GEN-LAST:event_profilepicMouseClicked

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        if (email.getText().trim().equalsIgnoreCase("")) {
            email.setText("Email");
        }
    }//GEN-LAST:event_emailFocusLost

    private void emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseClicked
        if (email.getText().trim().equalsIgnoreCase("email")) {
            email.setText(null);
        }
    }//GEN-LAST:event_emailMouseClicked

    private void usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusLost
        if (username.getText().trim().equalsIgnoreCase("")) {
            username.setText("Username");
        }
    }//GEN-LAST:event_usernameFocusLost

    private void usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseClicked
        if (username.getText().trim().equalsIgnoreCase("username")) {
            username.setText(null);
        }
    }//GEN-LAST:event_usernameMouseClicked

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        if (password.getText().trim().equalsIgnoreCase("")) {
            password.setText("Password");
            password.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_passwordFocusLost

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        if (password.getText().trim().equalsIgnoreCase("password")) {
            password.setText(null);
            password.setEchoChar('●');
        }
    }//GEN-LAST:event_passwordMouseClicked

    private void signup_eye_open_iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_eye_open_iconMouseClicked
        if (password.getText().trim().equalsIgnoreCase("password")) {

        } else {
            signup_eye_close_icon.setVisible(true);
            signup_eye_open_icon.setVisible(false);
            password.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_signup_eye_open_iconMouseClicked

    private void signup_eye_close_iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_eye_close_iconMouseClicked
        if (password.getText().trim().equalsIgnoreCase("password")) {

        } else {
            signup_eye_open_icon.setVisible(true);
            signup_eye_close_icon.setVisible(false);
            password.setEchoChar('●');
        }
    }//GEN-LAST:event_signup_eye_close_iconMouseClicked

    private void nicknameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nicknameFocusLost
        if (nickname.getText().trim().equalsIgnoreCase("")) {
            nickname.setText("Nick name");
        }
    }//GEN-LAST:event_nicknameFocusLost

    private void nicknameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nicknameMouseClicked
        if (nickname.getText().trim().equalsIgnoreCase("nick name")) {
            nickname.setText(null);
        }
    }//GEN-LAST:event_nicknameMouseClicked

    private void signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseClicked
        signup_default();

//        Get user data 
        String email = this.email.getText();
        String username = this.username.getText();
        String nickname = this.nickname.getText();
        String password = this.password.getText();

        //error array
        ArrayList<String> error = validateform(email, username, nickname, password);

        if (error.isEmpty() == false) {
            this.error.setText(error.get(0));
        } else {
            this.error.setText(null);
            //Data inserting
            byte[] img = null;
            ImageIcon avatar = (ImageIcon) profilepic.getIcon();
            if (avatar != null) {
                try {
                   
                    BufferedImage bImage = ImageIconToBufferedImage(avatar);
                    ByteArrayOutputStream bos = new ByteArrayOutputStream();
                    ImageIO.write(bImage, "jpg", bos);
                    img = bos.toByteArray();

                } catch (IOException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            if (DBManager.getDBM().insert(img, email, username, nickname, password)) {
                panelchange_signin();
                this.error.setText("User created!");
            }

        }

    }//GEN-LAST:event_signupMouseClicked

    private void signinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_signinMouseClicked

    private void signinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinMouseEntered
        signin.setVisible(false);
        signin_link_hover.setVisible(true);
    }//GEN-LAST:event_signinMouseEntered

    private void signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signinActionPerformed

    private void signin_link_hoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signin_link_hoverMouseClicked
        panelchange_signin();
    }//GEN-LAST:event_signin_link_hoverMouseClicked

    private void signin_link_hoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signin_link_hoverMouseExited
        signin_link_hover.setVisible(false);
        signin.setVisible(true);
    }//GEN-LAST:event_signin_link_hoverMouseExited

    private void fp_recovery_codeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fp_recovery_codeFocusLost
        if (fp_recovery_code.getText().trim().equalsIgnoreCase("")) {
            fp_recovery_code.setText("Recovery code");
        }
    }//GEN-LAST:event_fp_recovery_codeFocusLost

    private void fp_recovery_codeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fp_recovery_codeMouseClicked
        if (fp_recovery_code.getText().trim().equalsIgnoreCase("recovery code")) {
            fp_recovery_code.setText(null);
        }
    }//GEN-LAST:event_fp_recovery_codeMouseClicked

    private void fp_signin_linkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fp_signin_linkMouseEntered
        fp_signin_link.setVisible(false);
        fp_signin_link_hover.setVisible(true);
    }//GEN-LAST:event_fp_signin_linkMouseEntered

    private void fp_signin_link_hoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fp_signin_link_hoverMouseClicked
      panelchange_signin();
    }//GEN-LAST:event_fp_signin_link_hoverMouseClicked

    private void fp_signin_link_hoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fp_signin_link_hoverMouseExited
        fp_signin_link_hover.setVisible(false);
        fp_signin_link.setVisible(true);
    }//GEN-LAST:event_fp_signin_link_hoverMouseExited

    private void chatlist_setting2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chatlist_setting2MouseClicked
        update_default();
    }//GEN-LAST:event_chatlist_setting2MouseClicked

    private void client_logout2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_client_logout2MouseClicked
      panelchange_signin();
    }//GEN-LAST:event_client_logout2MouseClicked

    private void inputmsgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputmsgKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.sender();
        }
    }//GEN-LAST:event_inputmsgKeyPressed

    private void send_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_send_btnMouseClicked
        this.sender();
    }//GEN-LAST:event_send_btnMouseClicked

    private void send_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_send_btnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_send_btnMouseEntered

    private void chatlist_settingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chatlist_settingMouseClicked
        update_default();
    }//GEN-LAST:event_chatlist_settingMouseClicked

    private void client_logout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_client_logout1MouseClicked
          panelchange_signin();
    }//GEN-LAST:event_client_logout1MouseClicked

    private void setting_previousMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setting_previousMouseClicked
        update_default();
    }//GEN-LAST:event_setting_previousMouseClicked

    private void new_pwdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_new_pwdFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_new_pwdFocusLost

    private void new_pwdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_pwdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_new_pwdMouseClicked

    private void new_pwd2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_new_pwd2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_new_pwd2FocusLost

    private void new_pwd2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_pwd2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_new_pwd2MouseClicked

    private void current_pwdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_current_pwdFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_current_pwdFocusLost

    private void current_pwdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_current_pwdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_current_pwdMouseClicked

    private void signin_link_hover1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signin_link_hover1MouseClicked
        chatlist_default();
    }//GEN-LAST:event_signin_link_hover1MouseClicked

    private void signin_link_hover1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signin_link_hover1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_signin_link_hover1MouseExited

    private void signin_link_hover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signin_link_hover1ActionPerformed

    }//GEN-LAST:event_signin_link_hover1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String current_password = current_pwd.getText().trim();
        DBManager.getDBM().chang_pwd(current_password);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void update_profile_pic1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_profile_pic1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_update_profile_pic1MouseClicked

    private void update_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_update_emailFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_update_emailFocusLost

    private void update_emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_emailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_update_emailMouseClicked

    private void update_nicknameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_update_nicknameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_update_nicknameFocusLost

    private void update_nicknameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_nicknameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_update_nicknameMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        chatlist_default();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        chang_password_default();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        String email = update_email.getText().trim();
        String nickname = update_nickname.getText().trim();
        byte[] update_img = null;

        DBManager.getDBM().update(update_img, email, nickname, id);
        success_update_msg.setText("Successful update!");
    }//GEN-LAST:event_jLabel3MouseClicked

    private void create_new_chat_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_new_chat_btnMouseClicked
        group_create_default();
    }//GEN-LAST:event_create_new_chat_btnMouseClicked

    private void logout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout1MouseClicked
       panelchange_signin();
    }//GEN-LAST:event_logout1MouseClicked

    private void groupnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_groupnameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_groupnameFocusLost

    private void groupnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_groupnameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_groupnameMouseClicked

    private void create_group_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_group_btnMouseClicked
        String gname = groupname.getText();
        String gdec = desc.getText();

        if (DBManager.getDBM().create_chat(gname, gdec)) {
            group_creation_state.setText("Chat Group created!");
        } else {
            group_creation_state.setText("Could not create!");
        }

    }//GEN-LAST:event_create_group_btnMouseClicked

    private void logout2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout2MouseClicked
       panelchange_signin();
    }//GEN-LAST:event_logout2MouseClicked

    private void back1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back1MouseClicked
        load_group(false);
        admin_default();
    }//GEN-LAST:event_back1MouseClicked

    private void minimize1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize1MouseClicked
        
        
    }//GEN-LAST:event_minimize1MouseClicked

    private void close1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_close1MouseClicked

    private void usernamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernamefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernamefieldActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed


    int y = 13;

    public void load_group(boolean is_called_signin) {
        y = 13;
        List groups = DBManager.getDBM().get_chats();

        group_panel.removeAll();
       

        for (Iterator iterator = groups.iterator(); iterator.hasNext();) {
            Groups next = (Groups) iterator.next();

            if (is_called_signin) {
               
                DBManager.getDBM().put_offline(next.getId());
            }

            JPanel group = new javax.swing.JPanel();
            group.setBackground(new java.awt.Color(44, 47, 62));
            group.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            JLabel g_action = new javax.swing.JLabel();

            if (DBManager.getDBM().is_online(next.getId())) {
                g_action.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/end.png"))); // NOI18N
            } else {
                g_action.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/start.png"))); // NOI18N
            }

            g_action.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    group_action(next.getId(), g_action);

                }
            });

            JLabel g_des = new javax.swing.JLabel();
            g_des.setForeground(new java.awt.Color(255, 255, 255));
            g_des.setText("<html>" + next.getDescription() + "</html>");

            JLabel g_name = new javax.swing.JLabel();
            g_name.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            g_name.setForeground(new java.awt.Color(255, 255, 255));
            g_name.setText(next.getName());
            group.add(g_action, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, 29));
            group.add(g_des, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 36, 163, 33));
            group.add(g_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 160, -1));
            group_panel.add(group, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, y, 294, 90));

            y += 110;
        }

    }

    public void group_action(int chat_id, JLabel g_action) {

        File btn_icon = new File("");
        String abspath = btn_icon.getAbsolutePath();

        if (DBManager.getDBM().is_online(chat_id)) {
            DBManager.getDBM().put_offline(chat_id);
            ImageIcon icon = new ImageIcon(abspath + "\\src\\app\\images\\start.png");
            g_action.setIcon(icon);
        } else if (DBManager.getDBM().put_online(chat_id)) {
            ImageIcon icon = new ImageIcon(abspath + "\\src\\app\\images\\end.png");
            g_action.setIcon(icon);

           
            start_server(chat_id);

        }
    }

    int y1 = 13;

    public void load_client_groups() {

        List chats = DBManager.getDBM().get_chats();

        available_chats.removeAll();

        for (Iterator iterator = chats.iterator(); iterator.hasNext();) {
            Groups next = (Groups) iterator.next();

            JPanel client_grp_panel = new javax.swing.JPanel();
            client_grp_panel.setBackground(new java.awt.Color(39, 51, 67));
            client_grp_panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            client_grp_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            client_grp_panel.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    enter_to_chat(next.getId());

                }
            });

            boolean is_sub = false;
//            try {
//                is_sub = chat.is_subscribed(me.getId());
//                System.out.println(is_sub);
//            } catch (RemoteException ex) {
//                System.out.println(ex);
//            }

            JLabel subscribe = new javax.swing.JLabel();

            if (is_sub) {
                subscribe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/unsubscribe.png"))); // NOI18N
            } else {
                subscribe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/subscribe.png"))); // NOI18N
            }

            if (next.getStatus() == 1) {
                subscribe.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        subscribe_action(next.getId(), subscribe);

                    }
                });

            } else {
                subscribe.setEnabled(false);
                subscribe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            }

            JLabel grp_dec = new javax.swing.JLabel();
            grp_dec.setForeground(new java.awt.Color(255, 255, 255));
            grp_dec.setText(next.getDescription());

            JLabel statuts_txt = new javax.swing.JLabel();
            statuts_txt.setBackground(new java.awt.Color(28, 36, 47));
            statuts_txt.setForeground(new java.awt.Color(255, 255, 255));

            JLabel statuts_icon = new javax.swing.JLabel();

            if (next.getStatus() == 1) {
                statuts_txt.setText("online");
                statuts_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/online.png")));
            } else {
                statuts_txt.setText("offline");
                statuts_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/offline.png")));
            }

            JLabel grp_name = new javax.swing.JLabel();
            grp_name.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            grp_name.setForeground(new java.awt.Color(255, 255, 255));
            grp_name.setText(next.getName());

            client_grp_panel.add(subscribe, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 42, 99, 35));
            client_grp_panel.add(grp_dec, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 42, 160, 35));
            client_grp_panel.add(statuts_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 13, 51, -1));
            client_grp_panel.add(statuts_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 13, 18, 16));
            client_grp_panel.add(grp_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 160, -1));
            available_chats.add(client_grp_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, y1, 299, 96));

            y1 += 110;

        }

    }

    public void subscribe_action(int grp_id, JLabel sub_btn) {
        try {
            File btn_icon = new File("");
            String abspath = btn_icon.getAbsolutePath();

            if (chat.is_subscribed(me.getId())) {
                chat.unsubscribre(grp_id, me);
                ImageIcon icon = new ImageIcon(abspath + "\\src\\app\\images\\subscribe.png");
                sub_btn.setIcon(icon);
            } else {
                chat.subscribre(grp_id, me);
                ImageIcon icon = new ImageIcon(abspath + "\\src\\app\\images\\unsubscribe.png");
                sub_btn.setIcon(icon);
            }

        } catch (RemoteException ex) {
            System.out.println(ex);
        }
    }

    static int enterd_grup_id;
    public void enter_to_chat(int grup_id) {
        try {
            if (chat.is_subscribed(me.getId())) {
                chat_body_default();
                enterd_grup_id = grup_id;
                retrivemsg.start();
            }

        } catch (RemoteException ex) {
            System.out.println(ex);
        }
    }



    public void sender() {
//        User message
        String m = inputmsg.getText();
//        bye function
        if (m.equalsIgnoreCase("bye")) {
            panelchange_signin();
        } else {
//      Get time 
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String time_now = myDateObj.format(myFormatObj);

            Message msg = new Message();
            msg.setGroup_id(enterd_grup_id);
            msg.setMsgid(msg.hashCode());
            msg.setUserid(me.getId());
            msg.setName(me.getUsername());
            msg.setMessage(m);
            msg.setDate_time(time_now);

            try {
                chat.send_message(msg);
                inputmsg.setText("");
            } catch (RemoteException ex) {
                System.out.println(ex);
            }
        }

    }

    public void panelchange_signin() {
        signin_panel.setVisible(true);
        signup_panel.setVisible(false);
        forgot_password_panel.setVisible(false);
        chat_list_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        setting_panel.setVisible(false);
        update_pwd_panel.setVisible(false);
        update_panel.setVisible(false);
        admin_panel.setVisible(false);
        group_create_panel.setVisible(false);

        passwordfield.setEchoChar((char) 0);
        eye_open_icon.setVisible(true);
        eye_close_icon.setVisible(false);

    }

    public void signup_default() {
        signin_panel.setVisible(false);
        signup_panel.setVisible(true);
        forgot_password_panel.setVisible(false);
        chat_list_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        setting_panel.setVisible(false);
        update_pwd_panel.setVisible(false);
        update_panel.setVisible(false);
        admin_panel.setVisible(false);
        group_create_panel.setVisible(false);

        password.setEchoChar((char) 0);
        signup_eye_open_icon.setVisible(true);
        signup_eye_close_icon.setVisible(false);

    }

    public void forgot_password_default() {
        signin_panel.setVisible(false);
        signup_panel.setVisible(false);
        chat_list_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        setting_panel.setVisible(false);
        update_pwd_panel.setVisible(false);
        update_panel.setVisible(false);
        admin_panel.setVisible(false);
        group_create_panel.setVisible(false);
        forgot_password_panel.setVisible(true);
    }

    public void chang_password_default() {
        signin_panel.setVisible(false);
        signup_panel.setVisible(false);
        forgot_password_panel.setVisible(false);
        chat_list_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        setting_panel.setVisible(false);
        update_panel.setVisible(false);
        admin_panel.setVisible(false);
        group_create_panel.setVisible(false);
        update_pwd_panel.setVisible(true);
    }

    public void chat_list_default() {
        signin_panel.setVisible(false);
        signup_panel.setVisible(false);
        forgot_password_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        setting_panel.setVisible(false);
        update_pwd_panel.setVisible(false);
        update_panel.setVisible(false);
        admin_panel.setVisible(false);
        group_create_panel.setVisible(false);
        chat_list_panel.setVisible(true);
    }

    public void chat_body_default() {
        signin_panel.setVisible(false);
        signup_panel.setVisible(false);
        forgot_password_panel.setVisible(false);
        chat_list_panel.setVisible(false);
        setting_panel.setVisible(false);
        update_pwd_panel.setVisible(false);
        update_panel.setVisible(false);
        admin_panel.setVisible(false);
        group_create_panel.setVisible(false);
        chat_body_panel.setVisible(true);
    }


    public void update_default() {
        signin_panel.setVisible(false);
        signup_panel.setVisible(false);
        forgot_password_panel.setVisible(false);
        chat_list_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        setting_panel.setVisible(false);
        update_pwd_panel.setVisible(false);
        admin_panel.setVisible(false);
        group_create_panel.setVisible(false);
        update_panel.setVisible(true);
    }

    public void chatlist_default() {
        signin_panel.setVisible(false);
        signup_panel.setVisible(false);
        forgot_password_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        setting_panel.setVisible(false);
        update_pwd_panel.setVisible(false);
        update_panel.setVisible(false);
        admin_panel.setVisible(false);
        group_create_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        chat_list_panel.setVisible(true);
    }

    public void admin_default() {
        signin_panel.setVisible(false);
        signup_panel.setVisible(false);
        forgot_password_panel.setVisible(false);
        chat_list_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        setting_panel.setVisible(false);
        update_pwd_panel.setVisible(false);
        update_panel.setVisible(false);
        group_create_panel.setVisible(false);
        chat_list_panel.setVisible(false);
        admin_panel.setVisible(true);
    }

    public void group_create_default() {
        signin_panel.setVisible(false);
        signup_panel.setVisible(false);
        forgot_password_panel.setVisible(false);
        chat_list_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        setting_panel.setVisible(false);
        update_pwd_panel.setVisible(false);
        update_panel.setVisible(false);
        admin_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        group_create_panel.setVisible(true);
    }

//    Form validations
    public ArrayList<String> validateform(String email, String username, String nickname, String password) {

        ArrayList<String> errors = new ArrayList<String>();

        if (email.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$") == false) {
            errors.add("Invalid email");
        }

        if ("Username".equals(username) || "".equals(username)) {
            errors.add("Username is requird");
        }

        if ("Password".equals(password) || "".equals(password)) {
            errors.add("Password is requird");
        }

        if (password.length() < 7) {
            errors.add("Password must contain more than 8 characters");
        }

        if ("Nick name".equals(nickname) || "".equals(nickname)) {
            errors.add("Nickname is requird");
        }

        return errors;
    }

//    Login validations
    public ArrayList<String> loginvalidation(String username, String password) {
        ArrayList<String> errors = new ArrayList<String>();

        if ("Username".equals(username) || "".equals(username)) {
            errors.add("Username is requird");
        }

        if ("Password".equals(password) || "".equals(password)) {
            errors.add("Password is requird");
        }

        return errors;
    }

    public BufferedImage ImageIconToBufferedImage(ImageIcon icon) {
        BufferedImage bi = new BufferedImage(
                icon.getIconWidth(),
                icon.getIconHeight(),
                BufferedImage.TYPE_INT_RGB);
        Graphics g = bi.createGraphics();
        icon.paintIcon(null, g, 0, 0);
        g.dispose();
        return bi;
    }
    
    

    public ImageIcon toImageIcon(byte[] img) {
        BufferedImage Imgavatar;
        ImageIcon avatar = null;
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(img);
            Imgavatar = ImageIO.read(bis);
            if (Imgavatar != null) {
                avatar = new ImageIcon(Imgavatar);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return avatar;
    }

    public void start_client() {

        try {
            reg = LocateRegistry.getRegistry("localhost", 2123);
            chat = (Chat) reg.lookup("ChatAdmin");

        } catch (RemoteException | NotBoundException ex) {
            System.out.println(ex);
        }

    }

    int y2 = 210;

    public void recive_msg_handler(Message msg) {

        chatbox.repaint();
        chatbox.revalidate();

        JLabel msg_content = new javax.swing.JLabel();
        msg_content.setForeground(new java.awt.Color(255, 255, 255));
        msg_content.setText("<html>" + msg.getMessage() + "</html>");

        JLabel msg_time = new javax.swing.JLabel();
        msg_time.setForeground(new java.awt.Color(255, 255, 255));
        msg_time.setText(msg.getDate_time());

        JLabel msg_name = new javax.swing.JLabel();
        msg_name.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        msg_name.setForeground(new java.awt.Color(255, 255, 255));
        msg_name.setText(msg.getName());

        JLabel msg_dp = new javax.swing.JLabel();
        msg_dp.setBackground(new java.awt.Color(28, 36, 47));

        List data = DBManager.getDBM().get_avatart(msg.getUserid());
        Iterator i = data.iterator();
        if (i.hasNext()) {
            User user = (User) i.next();
            ImageIcon iconresized = new ImageIcon(toImageIcon(user.getAvatar()).getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
            msg_dp.setIcon(iconresized);
        }

        JPanel msg_layer = new javax.swing.JPanel();

        msg_layer.setBackground(
                new java.awt.Color(54, 63, 77));
        msg_layer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        msg_layer.setLayout(
                new org.netbeans.lib.awtextra.AbsoluteLayout());

        msg_layer.add(msg_content,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 260, 40));
        msg_layer.add(msg_time,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 210, -1));
        msg_layer.add(msg_name,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 210, -1));
        msg_layer.add(msg_dp,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 15, 35, 35));
        
        chatbox.add(msg_layer,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(20, y2, 280, 110));

        chatbox.repaint();
        chatbox.revalidate();

        JScrollBar sb = msgScrollPane.getVerticalScrollBar();
        sb.setValue(sb.getMaximum());

        y2 += 120;

    }

    public void send_msg_handler(Message msg) {

        chatbox.repaint();
        chatbox.revalidate();

        JLabel msg_content = new javax.swing.JLabel();
        msg_content.setForeground(new java.awt.Color(255, 255, 255));
        msg_content.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        msg_content.setText("<html>" + msg.getMessage() + "</html>");

        JLabel msg_time = new javax.swing.JLabel();
        msg_time.setForeground(new java.awt.Color(255, 255, 255));
        msg_time.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        msg_time.setText(msg.getDate_time());

        JLabel msg_name = new javax.swing.JLabel();
        msg_name.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        msg_name.setForeground(new java.awt.Color(255, 255, 255));
        msg_name.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        msg_name.setText(msg.getName());

        JLabel msg_dp = new javax.swing.JLabel();
        msg_dp.setBackground(new java.awt.Color(54, 63, 77));

        List data = DBManager.getDBM().get_avatart(msg.getUserid());
        Iterator i = data.iterator();
        if (i.hasNext()) {
            User user = (User) i.next();
            ImageIcon iconresized = new ImageIcon(toImageIcon(user.getAvatar()).getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
            msg_dp.setIcon(iconresized);
        }

        JPanel msg_layer = new javax.swing.JPanel();
        msg_layer.setBackground(new java.awt.Color(42, 50, 61));
        msg_layer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        msg_layer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        msg_layer.add(msg_content, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 260, 40));
        msg_layer.add(msg_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 210, -1));
        msg_layer.add(msg_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, -1));
        msg_layer.add(msg_dp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 35, 35));

        
        chatbox.add(msg_layer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, y2, 280, 110));

        JScrollBar sb = msgScrollPane.getVerticalScrollBar();
        sb.setValue(sb.getMaximum());

        chatbox.repaint();
        chatbox.revalidate();

        y2 += 120;
    }

    Thread retrivemsg = new Thread() {
        public void run() {

            int preiv = 0;

            while (true) {
                try {

                    Message nmsg = chat.broadcast();
                    if (nmsg != null) {
                        if (preiv != nmsg.getMsgid()) {
                           

                            System.out.println(nmsg.getMsgid() + "-" + me.getId());
                            if (nmsg.getUserid() == me.getId()) {
                                send_msg_handler(nmsg);
                            } else {
                                recive_msg_handler(nmsg);
                            }

                            preiv = nmsg.getMsgid();
                        }
                    }

//                    if(newmsg!=preiv){
//                        System.out.println(chat.broadcast().getMessage());
//                        preiv = newmsg;
//                    }
                    Thread.sleep(100);
                } catch (RemoteException | NullPointerException ex) {
                    System.out.println(ex);
                } catch (InterruptedException ex) {

                }
            }

        }
    };

    public void start_server(int g_id) {
        try {
            Chat chat = new ChatService(g_id);
            Registry reg = LocateRegistry.createRegistry(2123);
            reg.bind("ChatAdmin", chat);

            System.out.println("Chat server is running...");

        } catch (RemoteException | AlreadyBoundException e) {
            System.out.println("Exception ocured : " + e.getMessage());
        }
    }


//    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JPanel admin_panel;
    javax.swing.JPanel available_chats;
    javax.swing.JLabel back1;
    javax.swing.JLabel background;
    javax.swing.JLabel background1;
    javax.swing.JLabel background2;
    javax.swing.JLabel background3;
    javax.swing.JLabel background4;
    javax.swing.JPanel chat_body_panel;
    javax.swing.JPanel chat_list_panel;
    javax.swing.JScrollPane chat_list_scrollPane;
    javax.swing.JPanel chatbox;
    javax.swing.JLabel chatlist_setting;
    javax.swing.JLabel chatlist_setting2;
    javax.swing.JLabel chatlist_title;
    javax.swing.JLabel chatlist_title2;
    javax.swing.JLabel client_logout1;
    javax.swing.JLabel client_logout2;
    javax.swing.JLabel close;
    javax.swing.JLabel close1;
    javax.swing.JLabel create_group_btn;
    javax.swing.JLabel create_new_chat_btn;
    javax.swing.JTextField current_pwd;
    javax.swing.JTextArea desc;
    javax.swing.JTextField email;
    javax.swing.JLabel error;
    javax.swing.JLabel eye_close_icon;
    javax.swing.JLabel eye_open_icon;
    javax.swing.JTextField forgot_password;
    javax.swing.JTextField forgot_password_hover;
    javax.swing.JPanel forgot_password_panel;
    javax.swing.JLabel fp_confirm_btn;
    javax.swing.JLabel fp_description;
    javax.swing.JLabel fp_error;
    javax.swing.JLabel fp_logo;
    javax.swing.JTextField fp_recovery_code;
    javax.swing.JLabel fp_recovery_code_line;
    javax.swing.JLabel fp_resend_code;
    javax.swing.JTextField fp_signin_link;
    javax.swing.JTextField fp_signin_link_hover;
    javax.swing.JPanel group_create_panel;
    javax.swing.JLabel group_creation_state;
    javax.swing.JPanel group_panel;
    javax.swing.JScrollPane group_scrollPane;
    javax.swing.JTextField groupname;
    javax.swing.JTextField inputmsg;
    javax.swing.JButton jButton3;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel11;
    javax.swing.JLabel jLabel13;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel5;
    javax.swing.JLabel jLabel7;
    javax.swing.JScrollPane jScrollPane1;
    java.awt.Label label1;
    java.awt.Label label2;
    java.awt.Label label3;
    javax.swing.JLayeredPane layered_pane;
    javax.swing.JLabel logo;
    javax.swing.JLabel logout1;
    javax.swing.JLabel logout2;
    javax.swing.JLabel minimize;
    javax.swing.JLabel minimize1;
    javax.swing.JScrollPane msgScrollPane;
    javax.swing.JTextField new_pwd;
    javax.swing.JTextField new_pwd2;
    javax.swing.JTextField nickname;
    javax.swing.JPasswordField password;
    javax.swing.JLabel password_icon;
    javax.swing.JPasswordField passwordfield;
    javax.swing.JLabel profilepic;
    javax.swing.JLabel send_btn;
    javax.swing.JLabel setting_lable;
    javax.swing.JPanel setting_panel;
    javax.swing.JLabel setting_previous;
    javax.swing.JTextField sign_up_link;
    javax.swing.JTextField sign_up_link_hover;
    javax.swing.JTextField signin;
    javax.swing.JLabel signin_error;
    javax.swing.JTextField signin_link_hover;
    javax.swing.JTextField signin_link_hover1;
    javax.swing.JPanel signin_panel;
    javax.swing.JLabel signinbtn;
    javax.swing.JLabel signup;
    javax.swing.JLabel signup_copyrights3;
    javax.swing.JLabel signup_email_line;
    javax.swing.JLabel signup_email_line1;
    javax.swing.JLabel signup_email_line2;
    javax.swing.JLabel signup_error1;
    javax.swing.JLabel signup_eye_close_icon;
    javax.swing.JLabel signup_eye_open_icon;
    javax.swing.JLabel signup_nickname_line;
    javax.swing.JLabel signup_nickname_line1;
    javax.swing.JPanel signup_panel;
    javax.swing.JLabel signup_password_line;
    javax.swing.JLabel signup_username_line;
    javax.swing.JLabel signup_username_line1;
    javax.swing.JLabel signup_username_line2;
    javax.swing.JLabel success_msg;
    javax.swing.JLabel success_msg1;
    javax.swing.JLabel success_update_msg;
    javax.swing.JPanel title_panel;
    javax.swing.JLabel titlebar;
    javax.swing.JTextField update_email;
    javax.swing.JTextField update_nickname;
    javax.swing.JPanel update_panel;
    javax.swing.JLabel update_profile_pic1;
    javax.swing.JPanel update_pwd_panel;
    javax.swing.JTextField username;
    javax.swing.JLabel username_icon;
    javax.swing.JLabel username_line1;
    javax.swing.JTextField usernamefield;
    // End of variables declaration//GEN-END:variables
}
