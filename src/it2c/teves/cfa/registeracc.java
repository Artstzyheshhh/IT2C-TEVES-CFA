/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it2c.teves.cfa;


import config.dbconnect;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


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
        type = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        emaill = new javax.swing.JTextField();
        loginbttn = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        showpass = new javax.swing.JCheckBox();
        sex = new javax.swing.JComboBox<>();
        birthdate = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();

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
        main.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 310, 25));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Password:");
        main.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 120, 25));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Create an account");
        main.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 310, 30));

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
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 50));

        jLabel14.setBackground(new java.awt.Color(204, 0, 0));
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Go back");
        jLabel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 110, 30));

        main.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Username:");
        main.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 120, 25));

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
        main.add(confpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 310, 25));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 0));
        jLabel10.setText("Firstname:");
        main.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 120, 25));
        main.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 310, 25));
        main.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 310, 25));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 0));
        jLabel11.setText("Lastname:");
        main.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 120, 25));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 0));
        jLabel12.setText("Sex:");
        main.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 80, 25));

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        type.setPreferredSize(new java.awt.Dimension(57, 25));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        main.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 100, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 0, 0));
        jLabel13.setText("Birthdate:");
        main.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 80, 25));
        main.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 310, 25));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 0, 0));
        jLabel15.setText("Email:");
        main.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 120, 25));
        main.add(emaill, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 310, 25));

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
        main.add(loginbttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, 110, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 0, 0));
        jLabel16.setText("User-type:");
        main.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 120, 25));

        showpass.setBackground(new java.awt.Color(255, 255, 255));
        showpass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        showpass.setForeground(new java.awt.Color(153, 0, 0));
        showpass.setText("View password");
        showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassActionPerformed(evt);
            }
        });
        main.add(showpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, 140, -1));

        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male", "female", "others" }));
        sex.setPreferredSize(new java.awt.Dimension(57, 25));
        main.add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 100, -1));
        main.add(birthdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 120, 25));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 0, 0));
        jLabel17.setText("Confirm password:");
        main.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 120, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
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
        else if (!uname.getText().equals(emaill.getText())){
     JOptionPane.showMessageDialog(null, "username and email should not match");
     }  
        else if(duplicatecheck()){
        }
         else if(!(password.getText().equals(confpass.getText()))){
      JOptionPane.showMessageDialog(null, "password not match");
     }
         
        else {   
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
      
     loginform lfm = new loginform(); 
     lfm.setVisible(true);
     this.dispose();}
         
        // TODO add your handling code here:
    }//GEN-LAST:event_loginbttnMouseClicked

    private void showpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassActionPerformed
        if(showpass.isSelected()){
            confpass.setEchoChar((char)0);
            password.setEchoChar((char)0);
        }  else {
            confpass.setEchoChar('*');
            password.setEchoChar('*');
        }
    }//GEN-LAST:event_showpassActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

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
    private javax.swing.JFormattedTextField birthdate;
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
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JComboBox<String> sex;
    private javax.swing.JCheckBox showpass;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JTextField uname;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
