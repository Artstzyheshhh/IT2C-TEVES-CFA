/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admins;

import config.Session;
import config.dbconnect;
import config.passwordHasher;
import it2c.teves.cfa.loginform;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class candidate extends javax.swing.JFrame {

    /**
     * Creates new form candidate
     */
    public candidate() {
        initComponents();
    }
        public static String cmail,usname;
    
    public boolean duplicatecheck(){
        
        dbconnect dbc = new dbconnect();
   try {
            String query = "SELECT * FROM candidates WHERE emsil = '"+ email.getText()+"'";
            ResultSet resultSet = dbc.getData(query);
            if(resultSet.next()){
              
                 cmail = resultSet.getString("email");
                if(cmail.equals(email.getText())){
                JOptionPane.showMessageDialog(null,"email already existed");
                email.setText("");
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

        main = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        sidebar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        myaccount = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        pendings = new javax.swing.JLabel();
        accname = new javax.swing.JLabel();
        users = new javax.swing.JLabel();
        userid = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        topbar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        edit = new javax.swing.JLabel();
        delete = new javax.swing.JLabel();
        view = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        middlename = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        sex = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        birthdate = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        savebttn = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fname1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        nationality = new javax.swing.JTextField();
        occupation = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        position = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        main.setBackground(new java.awt.Color(255, 255, 255));
        main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        main.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 170, 0));

        sidebar.setBackground(new java.awt.Color(255, 255, 255));
        sidebar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        sidebar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 41, -1, -1));

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
        sidebar.add(myaccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 160, 40));

        jLabel20.setBackground(new java.awt.Color(204, 0, 0));
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("  Candidates");
        jLabel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 2, true));
        jLabel20.setOpaque(true);
        sidebar.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 160, 40));

        jLabel22.setBackground(new java.awt.Color(204, 0, 0));
        jLabel22.setForeground(new java.awt.Color(204, 0, 0));
        jLabel22.setText("  Partylist");
        sidebar.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 160, 40));

        jLabel19.setBackground(new java.awt.Color(204, 0, 0));
        jLabel19.setForeground(new java.awt.Color(204, 0, 0));
        jLabel19.setText("  positions");
        sidebar.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 160, 40));

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
        sidebar.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 160, 40));

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
        sidebar.add(pendings, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 160, 40));

        accname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/account-circle-icon (1).png"))); // NOI18N
        sidebar.add(accname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, -1));

        users.setBackground(new java.awt.Color(204, 0, 0));
        users.setForeground(new java.awt.Color(204, 0, 0));
        users.setText("   Users");
        users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usersMouseExited(evt);
            }
        });
        sidebar.add(users, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 160, 40));

        userid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userid.setForeground(new java.awt.Color(255, 255, 255));
        userid.setText("user id");
        sidebar.add(userid, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 170, -1));

        main.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 170, 560));

        jLabel3.setBackground(new java.awt.Color(204, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("     ADMINISTRATORS DASHBOARD");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jLabel3.setOpaque(true);
        main.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 810, 40));

        topbar.setBackground(new java.awt.Color(255, 255, 255));
        topbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(204, 0, 0));
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Add");
        topbar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 110, 20));

        edit.setBackground(new java.awt.Color(153, 153, 153));
        edit.setForeground(new java.awt.Color(153, 153, 153));
        edit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        edit.setText("Edit");
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
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

        main.add(topbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, -10, 820, 90));

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

        main.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 45, 110, 40));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        main.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 5, 810, 80));

        jLabel10.setForeground(new java.awt.Color(153, 0, 0));
        jLabel10.setText("Firstname:");
        main.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 110, 20));
        main.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 250, 20));

        jLabel11.setForeground(new java.awt.Color(153, 0, 0));
        jLabel11.setText("Lastname:");
        main.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 110, 20));
        main.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 250, -1));

        jLabel9.setForeground(new java.awt.Color(153, 0, 0));
        jLabel9.setText("Middlename:");
        main.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 110, 20));
        main.add(middlename, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 250, 20));

        jLabel15.setForeground(new java.awt.Color(153, 0, 0));
        jLabel15.setText("Address");
        main.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 110, 20));
        main.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 250, 20));

        jLabel12.setForeground(new java.awt.Color(153, 0, 0));
        jLabel12.setText("Sex:");
        main.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 110, 20));

        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male", "female", "others" }));
        sex.setPreferredSize(new java.awt.Dimension(57, 25));
        main.add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 50, 20));

        jLabel13.setForeground(new java.awt.Color(153, 0, 0));
        jLabel13.setText("Birthdate:");
        main.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 70, 20));
        main.add(birthdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 100, 20));

        jLabel14.setForeground(new java.awt.Color(153, 0, 0));
        jLabel14.setText("Nationality");
        main.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 110, 20));

        jLabel17.setForeground(new java.awt.Color(153, 0, 0));
        jLabel17.setText("Occupation");
        main.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 110, 20));

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
        main.add(savebttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 90, 20));

        jLabel8.setBackground(new java.awt.Color(204, 0, 0));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Clear");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));
        jLabel8.setOpaque(true);
        main.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 90, 20));

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cancel");
        jLabel1.setOpaque(true);
        main.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 90, 20));

        fname1.setEnabled(false);
        main.add(fname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 80, 20));

        jLabel24.setForeground(new java.awt.Color(153, 0, 0));
        jLabel24.setText("Candidates ID:");
        main.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 110, 20));
        main.add(nationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 250, -1));

        occupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                occupationActionPerformed(evt);
            }
        });
        main.add(occupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 250, -1));

        jLabel18.setForeground(new java.awt.Color(153, 0, 0));
        jLabel18.setText("Contact number:");
        main.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 100, 20));

        jLabel21.setForeground(new java.awt.Color(153, 0, 0));
        jLabel21.setText("Position:");
        main.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 100, 20));
        main.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 250, -1));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        main.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 250, -1));

        jLabel23.setForeground(new java.awt.Color(153, 0, 0));
        jLabel23.setText("Email:");
        main.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 100, 20));

        position.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        main.add(position, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 250, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void savebttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebttnMouseClicked
        
         Session sess = Session.getInstance();
        dbconnect dbc = new dbconnect();
         String birthdateText = birthdate.getText();
        if(fname.getText() .isEmpty() || lname.getText().isEmpty()
            ||middlename.getText() .isEmpty()
            || birthdate.getText() .isEmpty()
            || address.getText() .isEmpty()
            ||nationality.getText().isEmpty()
            ||occupation.getText().isEmpty()
            ||contact.getText().isEmpty()
            ||email.getText().isEmpty())

        {JOptionPane.showMessageDialog(null,"all field are required");
        }  else if(duplicatecheck()){
            System.out.println("duplicate exist");

        }   
        else if(duplicatecheck()){
        }
        else if (contact.getText().matches("-?\\d+")) {
               JOptionPane.showMessageDialog(null,"integers only");
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
                userid.setText("User id :"+sess.getId());
                 int db = dbc.insertData("INSERT INTO candidates(fname, lname, mname,address, sex, nationality, birthdate, occupation, email ,contact,position,user_id) VALUES ('"
                + fname.getText() + "', '"
                + lname.getText() + "', '"
                + middlename.getText() + "', '"
                + address.getText() + "', '"
                + sex.getSelectedItem()+ "', '"
                + nationality.getText() + "', '"
                + birthdate.getText() + "', '"
                + occupation.getText() + "' '"
                + email.getText() + "' '"
                + contact.getText() + "' '"
                + position.getSelectedItem() + "' '"
                + userid.getText()+"')");
            JOptionPane.showMessageDialog(null,"Candidate added successfully.");
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

    private void usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseClicked
        viewusers vw = new viewusers();
        vw.setVisible(true);
        
    }//GEN-LAST:event_usersMouseClicked

    private void usersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseEntered
        users.setOpaque(true);
        users.setBackground(new java.awt.Color(221,21,21));
        users.setForeground(Color.white);
    }//GEN-LAST:event_usersMouseEntered

    private void usersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseExited
        users.setBackground(Color.white);
        users.setForeground(new java.awt.Color(221,21,21));
        users.setOpaque(false);
    }//GEN-LAST:event_usersMouseExited

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

    private void occupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_occupationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_occupationActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

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
            java.util.logging.Logger.getLogger(candidate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(candidate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(candidate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(candidate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new candidate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accname;
    private javax.swing.JTextField address;
    private javax.swing.JFormattedTextField birthdate;
    private javax.swing.JTextField contact;
    private javax.swing.JLabel delete;
    private javax.swing.JLabel edit;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField fname1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel logout;
    public javax.swing.JPanel main;
    private javax.swing.JTextField middlename;
    private javax.swing.JLabel myaccount;
    private javax.swing.JTextField nationality;
    private javax.swing.JTextField occupation;
    private javax.swing.JLabel pendings;
    private javax.swing.JComboBox<String> position;
    private javax.swing.JLabel savebttn;
    private javax.swing.JComboBox<String> sex;
    private javax.swing.JPanel sidebar;
    private javax.swing.JPanel topbar;
    private javax.swing.JLabel userid;
    private javax.swing.JLabel users;
    private javax.swing.JLabel view;
    // End of variables declaration//GEN-END:variables
}
