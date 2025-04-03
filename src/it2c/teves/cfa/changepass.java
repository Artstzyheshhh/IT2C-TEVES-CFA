/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it2c.teves.cfa;

import config.Session;
import config.dbconnect;
import config.passwordHasher;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author acer
 */
public class changepass extends javax.swing.JFrame {

    /**
     * Creates new form changepass
     */
    public changepass() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        confpass = new javax.swing.JPasswordField();
        password = new javax.swing.JPasswordField();
        showpass = new javax.swing.JCheckBox();
        loginbttn = new javax.swing.JLabel();
        cancel = new javax.swing.JLabel();
        caution = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 40, 30));

        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("confirm password:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 120, 25));

        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("New password:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 120, 25));

        confpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confpassActionPerformed(evt);
            }
        });
        jPanel1.add(confpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 240, 25));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 240, 25));

        showpass.setBackground(new java.awt.Color(255, 255, 255));
        showpass.setForeground(new java.awt.Color(153, 0, 0));
        showpass.setText("View password");
        showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassActionPerformed(evt);
            }
        });
        jPanel1.add(showpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        loginbttn.setBackground(new java.awt.Color(204, 0, 0));
        loginbttn.setForeground(new java.awt.Color(255, 255, 255));
        loginbttn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginbttn.setText("Save");
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
        jPanel1.add(loginbttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 110, 25));

        cancel.setBackground(new java.awt.Color(204, 0, 0));
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancel.setText("Cancel");
        cancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        cancel.setOpaque(true);
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelMouseExited(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 110, 25));

        caution.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(caution, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 240, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
      System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jLabel5.setBackground(new java.awt.Color(240,240,240));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setBackground(Color.white);
    }//GEN-LAST:event_jLabel5MouseExited

    private void confpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confpassActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void showpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassActionPerformed
        confpass.setEchoChar('*');
        password.setEchoChar('*');
        if(showpass.isSelected()){
            confpass.setEchoChar((char)0);
            password.setEchoChar((char)0);
        }  else {
            confpass.setEchoChar('*');
            password.setEchoChar('*');
        }
    }//GEN-LAST:event_showpassActionPerformed

    private void loginbttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbttnMouseClicked
           dbconnect dbc = new dbconnect();
            Session sess = Session.getInstance();
            
            try{
            int uid = sess.getId();
        if(confpass.getText().isEmpty()||password.getText().isEmpty()){
            caution.setText("Fill all field");
            } else if(!(confpass.getText().equals(password.getText()))){
            caution.setText("password & confirm password should match");
            } else{
                 String pass = passwordHasher.hashPassword(password.getText());
            dbc.insertData("UPDATE users SET password ='"+pass+"'WHERE uid ='"+uid+"'");
            System.out.println("updated successfully!");
            this.dispose();
            loginform lfm = new loginform();
            lfm.setVisible(true);
            
            }
      }catch(NoSuchAlgorithmException ex){
                    System.out.println(""+ex);}
    }//GEN-LAST:event_loginbttnMouseClicked

    private void loginbttnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbttnMouseEntered
        loginbttn.setBackground(Color.white);
        loginbttn.setForeground(new java.awt.Color(204, 0, 0));
    }//GEN-LAST:event_loginbttnMouseEntered

    private void loginbttnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbttnMouseExited
        loginbttn.setBackground(new java.awt.Color(204, 0, 0));
        loginbttn.setForeground(Color.white);
    }//GEN-LAST:event_loginbttnMouseExited

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        recovery rv = new recovery();
        rv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelMouseClicked

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelMouseEntered

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelMouseExited

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
       
    }//GEN-LAST:event_formWindowDeactivated

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
            java.util.logging.Logger.getLogger(changepass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(changepass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(changepass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(changepass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new changepass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancel;
    private javax.swing.JLabel caution;
    private javax.swing.JPasswordField confpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loginbttn;
    private javax.swing.JPasswordField password;
    private javax.swing.JCheckBox showpass;
    // End of variables declaration//GEN-END:variables
}
