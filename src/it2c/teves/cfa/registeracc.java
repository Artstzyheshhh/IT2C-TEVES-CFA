/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it2c.teves.cfa;

import admins.adminslogin;
import config.dbconnect;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import users.loginform;

/**
 *
 * @author acer
 */
public class registeracc extends javax.swing.JFrame {

    /**
     * Creates new form registeracc
     */
    public registeracc() {
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

        username = new javax.swing.JTextField();
        main = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        confpass = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        sex = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        emaill = new javax.swing.JTextField();
        loginbttn = new javax.swing.JLabel();
        regadmin = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        showpass = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main.setBackground(new java.awt.Color(255, 255, 255));
        main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        main.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 170, 0));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        main.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 310, 25));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Password:");
        main.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 120, 25));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Create an account");
        main.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 310, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("COMELEC ");
        main.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("COMELEC ");
        main.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("COMELEC ");
        main.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 170, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("FILING APPLICATION");
        jLabel7.setPreferredSize(new java.awt.Dimension(163, 17));
        main.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("COMELEC ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Go back");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, -1, 50));

        main.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Username:");
        main.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 120, 25));

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

        confpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confpassActionPerformed(evt);
            }
        });
        main.add(confpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 310, 25));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 0));
        jLabel10.setText("firstname:");
        main.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 120, 25));
        main.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 310, 25));
        main.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 310, 25));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 0));
        jLabel11.setText("lastname:");
        main.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 120, 25));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 0));
        jLabel12.setText("sex:");
        main.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 40, 25));

        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male", "female", "others" }));
        sex.setPreferredSize(new java.awt.Dimension(57, 25));
        main.add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 100, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 0, 0));
        jLabel13.setText("Age:");
        main.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 40, 25));
        main.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 310, 25));
        main.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 110, 25));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 0, 0));
        jLabel15.setText("email:");
        main.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 120, 25));
        main.add(emaill, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 310, 25));

        loginbttn.setBackground(new java.awt.Color(204, 0, 0));
        loginbttn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loginbttn.setForeground(new java.awt.Color(255, 255, 255));
        loginbttn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginbttn.setText("Login");
        loginbttn.setOpaque(true);
        loginbttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginbttnMouseClicked(evt);
            }
        });
        main.add(loginbttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 110, 30));

        regadmin.setBackground(new java.awt.Color(255, 255, 255));
        regadmin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        regadmin.setForeground(new java.awt.Color(153, 0, 0));
        regadmin.setText("Register as admin");
        regadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regadminActionPerformed(evt);
            }
        });
        main.add(regadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, 160, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 0, 0));
        jLabel16.setText("Confirm password:");
        main.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 120, 25));

        showpass.setBackground(new java.awt.Color(255, 255, 255));
        showpass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        showpass.setForeground(new java.awt.Color(153, 0, 0));
        showpass.setText("View password");
        showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassActionPerformed(evt);
            }
        });
        main.add(showpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void confpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confpassActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        loginform lfm = new loginform();
        lfm.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

    private void loginbttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbttnMouseClicked
    dbconnect dbc = new dbconnect();
     
        if(fname.getText() .isEmpty() || lname.getText().isEmpty()
     ||uname.getText() .isEmpty() 
     || age.getText() .isEmpty() 
     || emaill.getText() .isEmpty()
     ||password.getText().isEmpty()
     ||confpass.getText().isEmpty() )
            
     {JOptionPane.showMessageDialog(null,"all field are required");
     }
        else if (!(password.getText().length() >= 8)){
     JOptionPane.showMessageDialog(null,"password should have 8 characters and above");
     }
        else if (!(age.getText().matches("\\d+"))){
     JOptionPane.showMessageDialog(null, "please input an integer");
     }  
        else if(duplicatecheck()){
        }
         else if(!(password.getText().equals(confpass.getText()))){
      JOptionPane.showMessageDialog(null, "password not match");
     }
         
        else {   
                 if(regadmin.isSelected()){
         int db = dbc.insertData("INSERT INTO admin(fname, lname, admname,admemail, sex, age, password) VALUES ('"
        + fname.getText() + "', '"
        + lname.getText() + "', '"
        + uname.getText() + "', '"
        + emaill.getText() + "', '"
        + sex.getSelectedItem() + "', '"
        + age.getText() + "', '"
        + password.getText() + "')");
      JOptionPane.showMessageDialog(null,"admins account created successfully."); 
      
     adminslogin alfm = new adminslogin();
     alfm.setVisible(true);
     this.dispose();
        }
        else {int db = dbc.insertData("INSERT INTO users(fname, lname, ussername,useremail, sex, age, password,stats) VALUES ('"
        + fname.getText() + "', '"
        + lname.getText() + "', '"
        + uname.getText() + "', '"
        + emaill.getText() + "', '"
        + sex.getSelectedItem() + "', '"
        + age.getText() + "', '"
        + password.getText() + "','pending')");
      JOptionPane.showMessageDialog(null,"users account created successfully."); 
      
     loginform lfm = new loginform(); 
     lfm.setVisible(true);
     this.dispose();}
         }
        // TODO add your handling code here:
    }//GEN-LAST:event_loginbttnMouseClicked

    private void regadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regadminActionPerformed
        
   
    }//GEN-LAST:event_regadminActionPerformed

    private void showpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassActionPerformed
        if(showpass.isSelected()){
            confpass.setEchoChar((char)0);
            password.setEchoChar((char)0);
        }  else {
            confpass.setEchoChar('*');
            password.setEchoChar('*');
        }
    }//GEN-LAST:event_showpassActionPerformed

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
            java.util.logging.Logger.getLogger(registeracc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registeracc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registeracc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registeracc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registeracc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JPasswordField confpass;
    private javax.swing.JTextField emaill;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel loginbttn;
    public javax.swing.JPanel main;
    private javax.swing.JPasswordField password;
    private javax.swing.JCheckBox regadmin;
    private javax.swing.JComboBox<String> sex;
    private javax.swing.JCheckBox showpass;
    private javax.swing.JTextField uname;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
