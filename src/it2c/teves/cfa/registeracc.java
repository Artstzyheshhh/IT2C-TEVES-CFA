/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it2c.teves.cfa;


import config.dbconnect;
import config.passwordHasher;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
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
   
    public boolean isValidEmail(String email) {
    // Simple regex for email validation
    String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

    if (email == null || !email.matches(emailRegex)) {
        JOptionPane.showMessageDialog(null, 
            "Invalid email format.\nPlease enter a valid \nemail address (e.g., user@example.com).",
            "Invalid Email",
            JOptionPane.ERROR_MESSAGE);
        return false;
    }

    return true;
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        username = new javax.swing.JTextField();
        mainlgf = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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
        goback = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainlgf.setBackground(new java.awt.Color(255, 255, 255));
        mainlgf.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        mainlgf.add(jPanel1);
        jPanel1.setBounds(90, 260, 170, 0);

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        mainlgf.add(password);
        password.setBounds(610, 290, 310, 25);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Password:");
        mainlgf.add(jLabel2);
        jLabel2.setBounds(490, 290, 120, 25);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Create an account");
        mainlgf.add(jLabel3);
        jLabel3.setBounds(600, 100, 310, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Username:");
        mainlgf.add(jLabel6);
        jLabel6.setBounds(490, 200, 120, 25);

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

        mainlgf.add(jPanel4);
        jPanel4.setBounds(450, 10, 0, 20);

        confpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confpassActionPerformed(evt);
            }
        });
        mainlgf.add(confpass);
        confpass.setBounds(610, 320, 310, 25);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 0));
        jLabel10.setText("Firstname:");
        mainlgf.add(jLabel10);
        jLabel10.setBounds(490, 140, 120, 25);
        mainlgf.add(fname);
        fname.setBounds(610, 140, 310, 25);
        mainlgf.add(lname);
        lname.setBounds(610, 170, 310, 25);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 0));
        jLabel11.setText("Lastname:");
        mainlgf.add(jLabel11);
        jLabel11.setBounds(490, 170, 120, 25);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 0));
        jLabel12.setText("Sex:");
        mainlgf.add(jLabel12);
        jLabel12.setBounds(490, 260, 80, 25);

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        type.setPreferredSize(new java.awt.Dimension(57, 25));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        mainlgf.add(type);
        type.setBounds(610, 350, 100, 25);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 0, 0));
        jLabel13.setText("Birthdate:");
        mainlgf.add(jLabel13);
        jLabel13.setBounds(730, 260, 80, 25);
        mainlgf.add(uname);
        uname.setBounds(610, 200, 310, 25);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 0, 0));
        jLabel15.setText("Email:");
        mainlgf.add(jLabel15);
        jLabel15.setBounds(490, 230, 120, 25);
        mainlgf.add(emaill);
        emaill.setBounds(610, 230, 310, 25);

        loginbttn.setBackground(new java.awt.Color(204, 0, 0));
        loginbttn.setForeground(new java.awt.Color(255, 255, 255));
        loginbttn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginbttn.setText("Create");
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
        mainlgf.add(loginbttn);
        loginbttn.setBounds(780, 390, 140, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 0, 0));
        jLabel16.setText("User-type:");
        mainlgf.add(jLabel16);
        jLabel16.setBounds(490, 350, 120, 25);

        showpass.setBackground(new java.awt.Color(255, 255, 255));
        showpass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        showpass.setForeground(new java.awt.Color(153, 0, 0));
        showpass.setText("View password");
        showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassActionPerformed(evt);
            }
        });
        mainlgf.add(showpass);
        showpass.setBounds(780, 350, 140, 23);

        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male", "female", "others" }));
        sex.setPreferredSize(new java.awt.Dimension(57, 25));
        mainlgf.add(sex);
        sex.setBounds(610, 260, 100, 25);
        mainlgf.add(birthdate);
        birthdate.setBounds(800, 260, 120, 25);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 0, 0));
        jLabel17.setText("Confirm password:");
        mainlgf.add(jLabel17);
        jLabel17.setBounds(490, 320, 120, 25);

        goback.setBackground(new java.awt.Color(204, 0, 0));
        goback.setForeground(new java.awt.Color(255, 255, 255));
        goback.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        goback.setText("Go back");
        goback.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        goback.setOpaque(true);
        goback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gobackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gobackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gobackMouseExited(evt);
            }
        });
        mainlgf.add(goback);
        goback.setBounds(610, 390, 140, 30);

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

        mainlgf.add(jPanel3);
        jPanel3.setBounds(0, 0, 460, 590);

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
        mainlgf.add(jLabel5);
        jLabel5.setBounds(930, 10, 30, 25);

        minimize.setBackground(new java.awt.Color(255, 255, 255));
        minimize.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        minimize.setForeground(new java.awt.Color(204, 0, 0));
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("—");
        minimize.setOpaque(true);
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
        mainlgf.add(minimize);
        minimize.setBounds(890, 10, 30, 25);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(mainlgf, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(mainlgf, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void loginbttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbttnMouseClicked
    dbconnect dbc = new dbconnect();
    String birthdateText = birthdate.getText();
    String emailInput = emaill.getText();
        if(fname.getText() .isEmpty() || lname.getText().isEmpty()
     ||uname.getText() .isEmpty() 
     || birthdate.getText() .isEmpty() 
     || emaill.getText() .isEmpty()
     ||password.getText().isEmpty()
     ||confpass.getText().isEmpty() )
            
     {JOptionPane.showMessageDialog(null,"all field are required");     
     }
     else if (!isValidEmail(emailInput)) {
           // Stop submission or return early

        } 
        
     else if(duplicatecheck()){
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
          else if (!birthdate.getText().matches("\\d{4}-\\d{2}-\\d{2}")) { 
            JOptionPane.showMessageDialog(null,"wrong birthdate format(yyyy/mm/dd)");        
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
                
                try{
                String pass = passwordHasher.hashPassword(password.getText());
                int db = dbc.insertData("INSERT INTO users(fname, lname, ussername,useremail, sex,utype, birthdate, password, Uimage,stats) VALUES ('"
        + fname.getText() + "', '"
        + lname.getText() + "', '"
        + uname.getText() + "', '"
        + emaill.getText() + "', '"
        + sex.getSelectedItem()+ "', '"
        + type.getSelectedItem() + "', '"
        + birthdate.getText() + "', '"
        + pass + "',' ','pending')");
      JOptionPane.showMessageDialog(null,"users account created successfully."); 
                }catch(NoSuchAlgorithmException ex){
                    System.out.println(""+ex);}
     loginform lfm = new loginform(); 
     lfm.setVisible(true);
     this.dispose();}
            
     }
        
         
        // TODO add your handling code here:
    }//GEN-LAST:event_loginbttnMouseClicked

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

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

    private void gobackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gobackMouseClicked
      
        loginform lfm = new loginform();
        lfm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_gobackMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jLabel5.setBackground(new java.awt.Color(240,240,240));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setBackground(Color.white);
    }//GEN-LAST:event_jLabel5MouseExited

    private void loginbttnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbttnMouseEntered
         loginbttn.setBackground(Color.white);
        loginbttn.setForeground(new java.awt.Color(204, 0, 0));
    }//GEN-LAST:event_loginbttnMouseEntered

    private void loginbttnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbttnMouseExited
        loginbttn.setBackground(new java.awt.Color(204, 0, 0));
        loginbttn.setForeground(Color.white);
    }//GEN-LAST:event_loginbttnMouseExited

    private void gobackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gobackMouseEntered
         goback.setBackground(Color.white);
        goback.setForeground(new java.awt.Color(204, 0, 0));
    }//GEN-LAST:event_gobackMouseEntered

    private void gobackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gobackMouseExited
       goback.setBackground(new java.awt.Color(240, 0, 0));
        goback.setForeground(Color.white);
    }//GEN-LAST:event_gobackMouseExited

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
    private javax.swing.JLabel goback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel loginbttn;
    public javax.swing.JPanel mainlgf;
    private javax.swing.JLabel minimize;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox<String> sex;
    private javax.swing.JCheckBox showpass;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JTextField uname;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
