/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it2c.teves.cfa;

import admins.adminsdashboard;
import config.Session;
import config.dbconnect;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import users.usersdashboard;


/**
 *
 * @author acer
 */
public class loginform extends javax.swing.JFrame {

    /**
     * Creates new form loginform
     */
    public loginform() {
        initComponents();
    }
         
    
    
    static String upss,usname,status,typee;    
    public boolean loginAcc(){
    dbconnect dbc = new dbconnect();
    
        try {
                String query = "SELECT * FROM users WHERE ussername = '"+ usern.getText()+"'OR password ='"+upass.getText() +"'";
                ResultSet resultSet = dbc.getData(query);
            if(resultSet.next()){
                    upss= resultSet.getString("password");              
                    usname= resultSet.getString("ussername");                 
                    status= resultSet.getString("stats");
                    typee = resultSet.getString("utype");
                    Session sess = Session.getInstance();
                    sess.setId(resultSet.getInt("uid"));
                    sess.setFname(resultSet.getString("fname"));
                    sess.setLname(resultSet.getString("lname"));
                    sess.setEmail(resultSet.getString("useremail"));
                    sess.setUsername(resultSet.getString("ussername"));
                    sess.setSex(resultSet.getString("sex"));
                    sess.setType(resultSet.getString("utype"));
                    sess.setStatus(resultSet.getString("stats"));
                    sess.setBirthdate(resultSet.getString("birthdate"));
                    sess.setPassword(resultSet.getString("password"));
                     return true;
            }else{
                    return false;
            }            
            }catch (SQLException ex) {
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
        upass = new javax.swing.JPasswordField();
        warningpass = new javax.swing.JLabel();
        usern = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        loginbttn = new javax.swing.JLabel();
        showpass = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        warningusername = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main.setBackground(new java.awt.Color(255, 255, 255));
        main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        main.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 170, 0));

        upass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upassActionPerformed(evt);
            }
        });
        main.add(upass, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 310, 30));

        warningpass.setBackground(new java.awt.Color(255, 255, 255));
        warningpass.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        warningpass.setForeground(new java.awt.Color(153, 0, 0));
        warningpass.setOpaque(true);
        main.add(warningpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 310, 20));

        usern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernActionPerformed(evt);
            }
        });
        main.add(usern, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 310, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Password:");
        main.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 80, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Login form");
        main.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 310, 30));

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

        main.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, 20));

        loginbttn.setBackground(new java.awt.Color(204, 0, 0));
        loginbttn.setForeground(new java.awt.Color(255, 255, 255));
        loginbttn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginbttn.setText("Login");
        loginbttn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        loginbttn.setOpaque(true);
        loginbttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginbttnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginbttnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginbttnMouseExited(evt);
            }
        });
        main.add(loginbttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, 140, 30));

        showpass.setBackground(new java.awt.Color(255, 255, 255));
        showpass.setForeground(new java.awt.Color(153, 0, 0));
        showpass.setText("View password");
        showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassActionPerformed(evt);
            }
        });
        main.add(showpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 310, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 0));
        jLabel10.setText("Username:");
        main.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 80, 30));

        warningusername.setBackground(new java.awt.Color(255, 255, 255));
        warningusername.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        warningusername.setForeground(new java.awt.Color(153, 0, 0));
        warningusername.setOpaque(true);
        main.add(warningusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 310, 20));

        jLabel9.setBackground(new java.awt.Color(204, 0, 0));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Sign up");
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        main.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 320, 140, 30));

        jPanel3.setBackground(new java.awt.Color(204, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("COMELEC ");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 170, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("FILING APPLICATION");
        jLabel7.setPreferredSize(new java.awt.Dimension(163, 17));
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        main.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        main.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernActionPerformed

    private void upassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upassActionPerformed

    private void loginbttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbttnMouseClicked

        if(loginAcc()){
            if(!upss.equals(upass.getText())){
                     warningpass.setText("incorrect password");
                     upass.setText("");
                } 
            else if(!usname.equals(usern.getText())){
                     warningusername.setText("Incorrect username");
                     usern.setText("");
                }
            else if(!status.equalsIgnoreCase("active")){
                JOptionPane.showMessageDialog(null,"account in-active, contact the admin!");
                }
            else{JOptionPane.showMessageDialog(null,"login success!");
            
            if(typee.equals("Admin")){
                adminsdashboard admdash = new adminsdashboard();
                admdash.setVisible(true);
                this.dispose();
            }else if(typee.equals("User")){
                usersdashboard usrdash = new usersdashboard();
                usrdash.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null,"No account type found!!");
            }
            }

        }else{JOptionPane.showMessageDialog(null,"login failed!");}
    }//GEN-LAST:event_loginbttnMouseClicked

    private void loginbttnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbttnMouseEntered
        loginbttn.setBackground(Color.white);
        loginbttn.setForeground(new java.awt.Color(204, 0, 0));
    }//GEN-LAST:event_loginbttnMouseEntered

    private void loginbttnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbttnMouseExited
        loginbttn.setBackground(new java.awt.Color(204, 0, 0));
        loginbttn.setForeground(Color.white);
    }//GEN-LAST:event_loginbttnMouseExited

    private void showpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassActionPerformed
        if(showpass.isSelected()){
            upass.setEchoChar((char)0);
        }  else {
            upass.setEchoChar('*');
        }
    }//GEN-LAST:event_showpassActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        this.dispose();
        registeracc racc = new registeracc();
        racc.setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel loginbttn;
    public javax.swing.JPanel main;
    private javax.swing.JCheckBox showpass;
    private javax.swing.JPasswordField upass;
    private javax.swing.JTextField usern;
    private javax.swing.JLabel warningpass;
    private javax.swing.JLabel warningusername;
    // End of variables declaration//GEN-END:variables
}
