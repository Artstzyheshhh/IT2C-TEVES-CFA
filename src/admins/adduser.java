/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admins;



import config.Session;
import config.dbconnect;
import it2c.teves.cfa.loginform;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class adduser extends javax.swing.JFrame {

    /**
     * Creates new form adduser
     */
    public adduser() {
        initComponents();
    }
         public static String uemail,usname;
    
    public boolean duplicatecheck(){
        
        dbconnect dbc = new dbconnect();
   try {
            String query = "SELECT * FROM users WHERE ussername = '"+ uname.getText()+"'OR useremail ='"+emaill.getText() +"'";
            ResultSet resultSet = dbc.getData(query);
            if(resultSet.next()){
                uemail= resultSet.getString("useremail");
                if(uemail.equals(emaill.getText())){
                JOptionPane.showMessageDialog(null,"email already existed");
                emaill.setText("");
                }
                 usname= resultSet.getString("ussername");
                if(usname.equals(uname.getText())){
                JOptionPane.showMessageDialog(null,"username already existed");
                uname.setText("");
                }
                return true;
            }
            else{
                return false;
            }
            
        } catch (SQLException ex) {
            System.out.println(""+ex);
            return false;
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        sidebar2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        myaccount = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        pendings = new javax.swing.JLabel();
        accname = new javax.swing.JLabel();
        candidates = new javax.swing.JLabel();
        usersss = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        topbar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        edit = new javax.swing.JLabel();
        delete = new javax.swing.JLabel();
        view = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        emaill = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        sex = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        birthdate = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        confpass = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        showpass = new javax.swing.JCheckBox();
        savebttn = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        fname1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        main2.setBackground(new java.awt.Color(255, 255, 255));
        main2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        main2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 170, 0));

        sidebar2.setBackground(new java.awt.Color(255, 255, 255));
        sidebar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        sidebar2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        sidebar2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 41, -1, -1));

        myaccount.setBackground(new java.awt.Color(204, 0, 0));
        myaccount.setForeground(new java.awt.Color(204, 0, 0));
        myaccount.setText("   My account");
        myaccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myaccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                myaccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                myaccountMouseExited(evt);
            }
        });
        sidebar2.add(myaccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 160, 40));

        jLabel22.setBackground(new java.awt.Color(204, 0, 0));
        jLabel22.setForeground(new java.awt.Color(204, 0, 0));
        jLabel22.setText("  Partylist");
        sidebar2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 160, 40));

        jLabel19.setBackground(new java.awt.Color(204, 0, 0));
        jLabel19.setForeground(new java.awt.Color(204, 0, 0));
        jLabel19.setText("  positions");
        sidebar2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 160, 40));

        logout.setBackground(new java.awt.Color(255, 255, 255));
        logout.setForeground(new java.awt.Color(204, 0, 0));
        logout.setText("  Log out");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        sidebar2.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 160, 40));

        pendings.setBackground(new java.awt.Color(204, 0, 0));
        pendings.setForeground(new java.awt.Color(204, 0, 0));
        pendings.setText("  Pendings");
        pendings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pendingsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pendingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pendingsMouseExited(evt);
            }
        });
        sidebar2.add(pendings, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 160, 40));

        accname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/account-circle-icon (1).png"))); // NOI18N
        sidebar2.add(accname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, -1));

        candidates.setBackground(new java.awt.Color(221, 21, 21));
        candidates.setForeground(new java.awt.Color(204, 0, 0));
        candidates.setText("  Candidates");
        candidates.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                candidatesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                candidatesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                candidatesMouseExited(evt);
            }
        });
        sidebar2.add(candidates, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 160, 40));

        usersss.setBackground(new java.awt.Color(204, 0, 0));
        usersss.setForeground(new java.awt.Color(255, 255, 255));
        usersss.setText("  Users");
        usersss.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 2, true));
        usersss.setOpaque(true);
        usersss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersssMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usersssMouseEntered(evt);
            }
        });
        sidebar2.add(usersss, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 160, 40));

        main2.add(sidebar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 170, 560));

        jLabel5.setBackground(new java.awt.Color(204, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("     ADMINISTRATORS DASHBOARD");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jLabel5.setOpaque(true);
        main2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 810, 40));

        topbar.setBackground(new java.awt.Color(255, 255, 255));
        topbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(204, 0, 0));
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Add");
        topbar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 110, 20));

        edit.setBackground(new java.awt.Color(153, 153, 153));
        edit.setForeground(new java.awt.Color(153, 153, 153));
        edit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        edit.setText("Edit");
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMouseExited(evt);
            }
        });
        topbar.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 110, 20));

        delete.setForeground(new java.awt.Color(153, 153, 153));
        delete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delete.setText("Delete");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        topbar.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 110, 20));

        view.setForeground(new java.awt.Color(153, 153, 153));
        view.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        view.setText("View");
        view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewMouseExited(evt);
            }
        });
        topbar.add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 110, 20));

        main2.add(topbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, -10, 820, 90));

        jPanel4.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        main2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 45, 110, 40));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        main2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 5, 810, 80));

        jLabel10.setForeground(new java.awt.Color(153, 0, 0));
        jLabel10.setText("Firstname:");
        main2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 110, 20));
        main2.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 270, 20));

        jLabel11.setForeground(new java.awt.Color(153, 0, 0));
        jLabel11.setText("Lastname:");
        main2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 110, 20));
        main2.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 270, -1));

        jLabel9.setForeground(new java.awt.Color(153, 0, 0));
        jLabel9.setText("Username:");
        main2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 110, 20));
        main2.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 270, 20));

        jLabel15.setForeground(new java.awt.Color(153, 0, 0));
        jLabel15.setText("Email:");
        main2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 110, 20));
        main2.add(emaill, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 270, 20));

        jLabel12.setForeground(new java.awt.Color(153, 0, 0));
        jLabel12.setText("Sex:");
        main2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 110, 20));

        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male", "female", "others" }));
        sex.setPreferredSize(new java.awt.Dimension(57, 25));
        main2.add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 70, 20));

        jLabel13.setForeground(new java.awt.Color(153, 0, 0));
        jLabel13.setText("Birthdate:");
        main2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 60, 20));
        main2.add(birthdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 120, 20));

        jLabel14.setForeground(new java.awt.Color(153, 0, 0));
        jLabel14.setText("Password:");
        main2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 110, 20));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        main2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 270, 20));

        jLabel17.setForeground(new java.awt.Color(153, 0, 0));
        jLabel17.setText("Confirm password:");
        main2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 110, 20));

        confpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confpassActionPerformed(evt);
            }
        });
        main2.add(confpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 270, 20));

        jLabel16.setForeground(new java.awt.Color(153, 0, 0));
        jLabel16.setText("User status:");
        main2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 110, 20));

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        type.setPreferredSize(new java.awt.Dimension(57, 25));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        main2.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 110, 20));

        showpass.setBackground(new java.awt.Color(255, 255, 255));
        showpass.setForeground(new java.awt.Color(153, 0, 0));
        showpass.setText("View password");
        showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassActionPerformed(evt);
            }
        });
        main2.add(showpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 140, 20));

        savebttn.setBackground(new java.awt.Color(204, 0, 0));
        savebttn.setForeground(new java.awt.Color(255, 255, 255));
        savebttn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        savebttn.setText("save");
        savebttn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));
        savebttn.setOpaque(true);
        savebttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                savebttnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                savebttnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                savebttnMouseExited(evt);
            }
        });
        main2.add(savebttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 90, 20));

        jLabel8.setBackground(new java.awt.Color(204, 0, 0));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Clear");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));
        jLabel8.setOpaque(true);
        main2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 90, 20));

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cancel");
        jLabel1.setOpaque(true);
        main2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 90, 20));

        jLabel18.setBackground(new java.awt.Color(204, 0, 0));
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Cancel");
        jLabel18.setOpaque(true);
        main2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 90, 20));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("FILING APPLICATION");
        main2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, 140, 30));

        fname1.setEnabled(false);
        main2.add(fname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 80, 20));

        jLabel24.setForeground(new java.awt.Color(153, 0, 0));
        jLabel24.setText("User ID:");
        main2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 110, 20));

        jLabel25.setForeground(new java.awt.Color(153, 0, 0));
        jLabel25.setText("User-type:");
        main2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 70, 20));

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        status.setPreferredSize(new java.awt.Dimension(57, 25));
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });
        main2.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 110, 20));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 0, 0));
        jLabel26.setText("COMELEC");
        main2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, -1, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(main2, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(main2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void myaccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myaccountMouseClicked
        adminsdashboard adm = new adminsdashboard();
        adm.setVisible(true);
        
    }//GEN-LAST:event_myaccountMouseClicked

    private void myaccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myaccountMouseEntered
        myaccount.setOpaque(true);
        myaccount.setBackground(new java.awt.Color(221,21,21));
        myaccount.setForeground(Color.white);
    }//GEN-LAST:event_myaccountMouseEntered

    private void myaccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myaccountMouseExited
        myaccount.setBackground(Color.white);
        myaccount.setForeground(new java.awt.Color(221,21,21));
        myaccount.setOpaque(false);
    }//GEN-LAST:event_myaccountMouseExited

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        loginform lfm = new loginform();
        lfm.setVisible(true);
      
    }//GEN-LAST:event_logoutMouseClicked

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        logout.setOpaque(true);
        logout.setBackground(new java.awt.Color(221,21,21));
        logout.setForeground(Color.white);
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        logout.setBackground(Color.white);
        logout.setForeground(new java.awt.Color(221,21,21));
        logout.setOpaque(false);
    }//GEN-LAST:event_logoutMouseExited

    private void pendingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendingsMouseClicked
        pendings pnding = new pendings();
        pnding.setVisible(true);
        
    }//GEN-LAST:event_pendingsMouseClicked

    private void pendingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendingsMouseEntered
        pendings.setOpaque(true);
        pendings.setBackground(new java.awt.Color(221,21,21));
        pendings.setForeground(Color.white);
    }//GEN-LAST:event_pendingsMouseEntered

    private void pendingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendingsMouseExited
        pendings.setBackground(Color.white);
        pendings.setForeground(new java.awt.Color(221,21,21));
        pendings.setOpaque(false);
    }//GEN-LAST:event_pendingsMouseExited

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        edit.setOpaque(true);
        edit.setBackground(new java.awt.Color(204,204,204));
        edit.setForeground(Color.white);
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        edit.setBackground(Color.white);
        edit.setForeground(new java.awt.Color(153,153,153));
        edit.setOpaque(false);
    }//GEN-LAST:event_editMouseExited

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteMouseClicked

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setOpaque(true);
        delete.setBackground(new java.awt.Color(204,204,204));
        delete.setForeground(Color.white);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setForeground(new java.awt.Color(153,153,153));
        delete.setBackground(Color.white);
        delete.setOpaque(false);
    }//GEN-LAST:event_deleteMouseExited

    private void viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseClicked
        viewusers vw = new viewusers();
        vw.setVisible(true);
       
    }//GEN-LAST:event_viewMouseClicked

    private void viewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseEntered
        view.setOpaque(true);
        view.setBackground(new java.awt.Color(204,204,204));
        view.setForeground(Color.white);
    }//GEN-LAST:event_viewMouseEntered

    private void viewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseExited
        view.setForeground(new java.awt.Color(153,153,153));
        view.setBackground(Color.white);
        view.setOpaque(false);
    }//GEN-LAST:event_viewMouseExited

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void confpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confpassActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

    private void showpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassActionPerformed
        if(showpass.isSelected()){
            confpass.setEchoChar((char)0);
            password.setEchoChar((char)0);
        }  else {
            confpass.setEchoChar('*');
            password.setEchoChar('*');
        }
    }//GEN-LAST:event_showpassActionPerformed

    private void savebttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebttnMouseClicked
        dbconnect dbc = new dbconnect();
        String birthdateText = birthdate.getText();
        if(fname.getText() .isEmpty() || lname.getText().isEmpty()
            ||uname.getText() .isEmpty()
            || birthdate.getText() .isEmpty()
            || emaill.getText() .isEmpty()
            ||password.getText().isEmpty()
            ||confpass.getText().isEmpty() )

        {JOptionPane.showMessageDialog(null,"all field are required");
        }  else if(duplicatecheck()){
            System.out.println("duplicate exist");

        }
        else if (!(password.getText().length() >= 8)){
            JOptionPane.showMessageDialog(null,"password should have 8 characters and above");
        }
        else if (uname.getText().equals(emaill.getText())){
            JOptionPane.showMessageDialog(null, "username and email should not match");
        }
        else if(duplicatecheck()){
        }
        else if(!(password.getText().equals(confpass.getText()))){
            JOptionPane.showMessageDialog(null, "password not match");
        }

       else if (birthdate.getText().matches("\\d{4}-\\d{2}-\\d{2}")) { 
            int year = Integer.parseInt(birthdateText.substring(0, 4)); 
            int month = Integer.parseInt(birthdateText.substring(5, 7));
            int day = Integer.parseInt(birthdateText.substring(8, 10));  
            
            if (!(month >= 1 && month <= 12)) {
             JOptionPane.showMessageDialog(null, "Invalid month! Must not exceed 12.");  
            } else if (!(day > 1 || day < 31)) {
            JOptionPane.showMessageDialog(null, "Invalid day! must not exceed 31");
            }else if (!(year > 1966 )) {
            JOptionPane.showMessageDialog(null, "Invalid year! too old.");
            }else if (!(year < 2006 )) {
            JOptionPane.showMessageDialog(null, "Invalid year! Must not exceed 2006.");
            }else {   
                int db = dbc.insertData("INSERT INTO users(fname, lname, ussername,useremail, sex,utype, birthdate, password,stats) VALUES ('"
        + fname.getText() + "', '"
        + lname.getText() + "', '"
        + uname.getText() + "', '"
        + emaill.getText() + "', '"
        + sex.getSelectedItem()+ "', '"
        + type.getSelectedItem() + "', '"
        + birthdate.getText() + "', '"
        + password.getText() + "','pending')");
      JOptionPane.showMessageDialog(null,"users account created successfully."); 
      viewusers vs = new viewusers();
      vs.setVisible(true);
    }
            
     }

        // TODO add your handling code here:
    }//GEN-LAST:event_savebttnMouseClicked

    private void savebttnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebttnMouseEntered
        savebttn.setBackground(Color.white);
        savebttn.setForeground(new java.awt.Color(204,0,0));
    }//GEN-LAST:event_savebttnMouseEntered

    private void savebttnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebttnMouseExited

        savebttn.setBackground(new java.awt.Color(204,0,0));
        savebttn.setForeground(Color.white);
    }//GEN-LAST:event_savebttnMouseExited

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void candidatesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_candidatesMouseClicked
        candidate cnddte = new candidate();
        cnddte.setVisible(true);
        
    }//GEN-LAST:event_candidatesMouseClicked

    private void candidatesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_candidatesMouseEntered
        candidates.setOpaque(true);
        candidates.setBackground(new java.awt.Color(221,21,21));
        candidates.setForeground(Color.white);
    }//GEN-LAST:event_candidatesMouseEntered

    private void candidatesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_candidatesMouseExited
        candidates.setBackground(Color.white);
        candidates.setForeground(new java.awt.Color(221,21,21));
        candidates.setOpaque(false);
    }//GEN-LAST:event_candidatesMouseExited

    private void usersssMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersssMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_usersssMouseClicked

    private void usersssMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersssMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_usersssMouseEntered

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        edituser edt = new edituser();
        edt.setVisible(true);
        
    }//GEN-LAST:event_editMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
         Session sess = Session.getInstance();
        if(sess.getId() == 0){
        JOptionPane.showMessageDialog(null,"No account found, login first!");
        loginform lfm = new loginform();
        lfm.setVisible(true);
        this.dispose();
        }else{
        accname.setText(""+sess.getUsername());
        }
    }//GEN-LAST:event_formWindowActivated

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(adduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adduser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accname;
    private javax.swing.JFormattedTextField birthdate;
    private javax.swing.JLabel candidates;
    private javax.swing.JPasswordField confpass;
    private javax.swing.JLabel delete;
    private javax.swing.JLabel edit;
    private javax.swing.JTextField emaill;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField fname1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel logout;
    public javax.swing.JPanel main2;
    private javax.swing.JLabel myaccount;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel pendings;
    private javax.swing.JLabel savebttn;
    private javax.swing.JComboBox<String> sex;
    private javax.swing.JCheckBox showpass;
    private javax.swing.JPanel sidebar2;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JPanel topbar;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JTextField uname;
    private javax.swing.JLabel usersss;
    private javax.swing.JLabel view;
    // End of variables declaration//GEN-END:variables
}
