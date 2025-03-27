/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it2c.teves.cfa;

import admins.adminsdashboard;
import config.Session;
import config.dbconnect;
import config.passwordHasher;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import users.usersdashboard;


/**
 *
 * @author acer
 */
public class loginform extends javax.swing.JFrame {

    
    public loginform() {
        initComponents();
    }
         
    
    
    static String hashedpassword, rehashedpassword, usname,status,typee;    
    public boolean loginAcc(String username, String password){
    dbconnect dbc = new dbconnect();
    
        try {
                String query = "SELECT * FROM users WHERE ussername = '"+username+"'";
                ResultSet resultSet = dbc.getData(query);
            if(resultSet.next()){
                   hashedpassword = resultSet.getString("password");
                   rehashedpassword = passwordHasher.hashPassword(password);
                    
                   System.out.println(""+rehashedpassword);
                   System.out.println(""+hashedpassword);
                   usname = resultSet.getString("ussername");
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
            }catch (SQLException | NoSuchAlgorithmException ex) {
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

        loginFrame = new javax.swing.JPanel();
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
        signup = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        loginFrame.setBackground(new java.awt.Color(255, 255, 255));
        loginFrame.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        loginFrame.add(jPanel1);
        jPanel1.setBounds(90, 260, 170, 0);

        upass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upassActionPerformed(evt);
            }
        });
        loginFrame.add(upass);
        upass.setBounds(600, 270, 310, 30);

        warningpass.setBackground(new java.awt.Color(255, 255, 255));
        warningpass.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        warningpass.setForeground(new java.awt.Color(153, 0, 0));
        warningpass.setOpaque(true);
        loginFrame.add(warningpass);
        warningpass.setBounds(600, 250, 310, 20);

        usern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernActionPerformed(evt);
            }
        });
        loginFrame.add(usern);
        usern.setBounds(600, 220, 310, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Password:");
        loginFrame.add(jLabel2);
        jLabel2.setBounds(500, 270, 100, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Login form");
        loginFrame.add(jLabel3);
        jLabel3.setBounds(600, 180, 310, 30);

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

        loginFrame.add(jPanel4);
        jPanel4.setBounds(450, 10, 0, 20);

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
        loginFrame.add(loginbttn);
        loginbttn.setBounds(770, 330, 140, 30);

        showpass.setBackground(new java.awt.Color(255, 255, 255));
        showpass.setForeground(new java.awt.Color(153, 0, 0));
        showpass.setText("View password");
        showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassActionPerformed(evt);
            }
        });
        loginFrame.add(showpass);
        showpass.setBounds(600, 300, 310, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 0));
        jLabel10.setText("Username:");
        loginFrame.add(jLabel10);
        jLabel10.setBounds(500, 220, 100, 30);

        warningusername.setBackground(new java.awt.Color(255, 255, 255));
        warningusername.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        warningusername.setForeground(new java.awt.Color(153, 0, 0));
        warningusername.setOpaque(true);
        loginFrame.add(warningusername);
        warningusername.setBounds(600, 200, 310, 20);

        signup.setBackground(new java.awt.Color(204, 0, 0));
        signup.setForeground(new java.awt.Color(255, 255, 255));
        signup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signup.setText("Sign up");
        signup.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        signup.setOpaque(true);
        signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signupMouseExited(evt);
            }
        });
        loginFrame.add(signup);
        signup.setBounds(610, 330, 140, 30);

        minimize.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        minimize.setForeground(new java.awt.Color(204, 0, 0));
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("—");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeMouseExited(evt);
            }
        });
        loginFrame.add(minimize);
        minimize.setBounds(890, 10, 30, 25);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("X");
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        loginFrame.add(jLabel5);
        jLabel5.setBounds(930, 10, 30, 25);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginFrame.add(jLabel6);
        jLabel6.setBounds(910, 0, 25, 25);

        jPanel3.setBackground(new java.awt.Color(204, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("COMELEC ");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 170, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("FILING APPLICATION");
        jLabel7.setPreferredSize(new java.awt.Dimension(163, 17));
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        loginFrame.add(jPanel3);
        jPanel3.setBounds(0, 0, 460, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginFrame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        loginFrame.getAccessibleContext().setAccessibleName("");

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

        if(loginAcc(usern.getText(),upass.getText())){
            if(! hashedpassword.equals(rehashedpassword)){
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
            else{
            
            if(typee.equals("Admin")){
                adminsdashboard admdash = new adminsdashboard();
                admdash.setVisible(true);
               
            }else if(typee.equals("User")){
                usersdashboard usrdash = new usersdashboard();
                usrdash.setVisible(true);
                
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

    private void signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseClicked
        
        registeracc racc = new registeracc();
        racc.setVisible(true);
       this.dispose();
        
    }//GEN-LAST:event_signupMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void signupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseEntered
         signup.setBackground(Color.white);
          signup.setForeground(new java.awt.Color(204, 0, 0));
    }//GEN-LAST:event_signupMouseEntered

    private void signupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseExited
          signup.setBackground(new java.awt.Color(204, 0, 0));
          signup.setForeground(Color.white);
    }//GEN-LAST:event_signupMouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
       jLabel5.setBackground(new java.awt.Color(240,240,240));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
         jLabel5.setBackground(Color.white);
    }//GEN-LAST:event_jLabel5MouseExited

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
       setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
         minimize.setBackground(new java.awt.Color(240,240,240));
    }//GEN-LAST:event_minimizeMouseEntered

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
            minimize.setBackground(Color.white);
    }//GEN-LAST:event_minimizeMouseExited

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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JPanel loginFrame;
    private javax.swing.JLabel loginbttn;
    private javax.swing.JLabel minimize;
    private javax.swing.JCheckBox showpass;
    private javax.swing.JLabel signup;
    private javax.swing.JPasswordField upass;
    private javax.swing.JTextField usern;
    private javax.swing.JLabel warningpass;
    private javax.swing.JLabel warningusername;
    // End of variables declaration//GEN-END:variables
}
