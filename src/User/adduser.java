/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import com.mysql.jdbc.Statement;
import config.Session;
import config.dbconnect;
import config.passwordHasher;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author acer
 */
public class adduser extends javax.swing.JInternalFrame {

    /**
     * Creates new form adduser
     */
    public adduser() {
        initComponents();
          this.setBorder(javax.swing. BorderFactory.createEmptyBorder(0,0,0,0)); 
       BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
       bi.setNorthPane (null);
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
    
     public String destination = "";
    File selectedFile;
    public String oldpath;
    public String path;
    public int FileExistenceChecker(String path){
        File file = new File(path);
        String fileName = file.getName();
        
        Path filePath = Paths.get("src/images", fileName);
        boolean fileExists = Files.exists(filePath);
        
        if (fileExists) {
            return 1;
        } else {
            return 0;
        }
    
    }
    
    public static int getHeightFromWidth(String imagePath, int desiredWidth) {
        try {
            // Read the image file
            File imageFile = new File(imagePath);
            BufferedImage image = ImageIO.read(imageFile);
            
            // Get the original width and height of the image
            int originalWidth = image.getWidth();
            int originalHeight = image.getHeight();
            
            // Calculate the new height based on the desired width and the aspect ratio
            int newHeight = (int) ((double) desiredWidth / originalWidth * originalHeight);
            
            return newHeight;
        } catch (IOException ex) {
            System.out.println("No image found!");
        }
        
        return -1;
    }
    
    public  ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
    ImageIcon MyImage = null;
        if(ImagePath !=null){
            MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
        
    int newHeight = getHeightFromWidth(ImagePath, label.getWidth());

    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
}
     public boolean isValidEmail(String email) {

        String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

        if (email == null || !email.matches(emailRegex)) {
            JOptionPane.showMessageDialog(null, 
                "Invalid email format.\nPlease enter a valid email address (e.g., user@example.com).",
                "Invalid Email",
                JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        confpass = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        showpass = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        uname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        birthdate = new javax.swing.JFormattedTextField();
        remove = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        emaill = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        savebttn = new javax.swing.JLabel();
        sex = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(800, 430));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -30, 110, 35));

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 800, 35));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setBackground(new java.awt.Color(255, 153, 102));
        jLabel26.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText(" ADD USER");
        jLabel26.setOpaque(true);
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 40));
        jPanel3.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 230, -1));

        jLabel14.setForeground(new java.awt.Color(153, 0, 0));
        jLabel14.setText("Password:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 120, 20));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel3.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 260, -1));

        jLabel17.setForeground(new java.awt.Color(153, 0, 0));
        jLabel17.setText("Confirm password:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 120, 20));

        confpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confpassActionPerformed(evt);
            }
        });
        jPanel3.add(confpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 260, -1));

        jPanel4.setLayout(null);

        image.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        image.setForeground(new java.awt.Color(153, 153, 153));
        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imageMouseEntered(evt);
            }
        });
        jPanel4.add(image);
        image.setBounds(0, 0, 140, 130);

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 140, 130));

        showpass.setBackground(new java.awt.Color(255, 255, 255));
        showpass.setForeground(new java.awt.Color(153, 0, 0));
        showpass.setText("View password");
        showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassActionPerformed(evt);
            }
        });
        jPanel3.add(showpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 140, 20));

        jLabel10.setForeground(new java.awt.Color(153, 0, 0));
        jLabel10.setText("Firstname:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 110, 20));

        jLabel11.setForeground(new java.awt.Color(153, 0, 0));
        jLabel11.setText("Lastname:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 110, 20));
        jPanel3.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 230, -1));
        jPanel3.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 230, -1));

        jLabel9.setForeground(new java.awt.Color(153, 0, 0));
        jLabel9.setText("Username:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 100, 20));
        jPanel3.add(birthdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 230, -1));

        remove.setBackground(new java.awt.Color(204, 0, 0));
        remove.setForeground(new java.awt.Color(204, 0, 0));
        remove.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        remove.setText("Remove Image");
        remove.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        remove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeMouseClicked(evt);
            }
        });
        jPanel3.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 140, 20));

        jLabel13.setForeground(new java.awt.Color(153, 0, 0));
        jLabel13.setText("Birthdate(yyyy-MM-dd):");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 200, 20));

        jLabel25.setForeground(new java.awt.Color(153, 0, 0));
        jLabel25.setText("User-type:");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 70, 20));

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        type.setPreferredSize(new java.awt.Dimension(57, 25));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        jPanel3.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 120, 20));

        jLabel16.setForeground(new java.awt.Color(153, 0, 0));
        jLabel16.setText("Status:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 50, 20));

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        status.setPreferredSize(new java.awt.Dimension(57, 25));
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });
        jPanel3.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 130, 20));

        jLabel15.setForeground(new java.awt.Color(153, 0, 0));
        jLabel15.setText("Email:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 70, 20));

        emaill.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        emaill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emaillActionPerformed(evt);
            }
        });
        jPanel3.add(emaill, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 180, 20));

        jLabel12.setForeground(new java.awt.Color(153, 0, 0));
        jLabel12.setText("Sex:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 40, 20));

        jLabel8.setBackground(new java.awt.Color(204, 0, 0));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Clear all");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));
        jLabel8.setOpaque(true);
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 90, 20));

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
        jPanel3.add(savebttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 90, 20));

        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male", "female", "others" }));
        sex.setPreferredSize(new java.awt.Dimension(57, 25));
        jPanel3.add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 90, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 420, 420));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("FILING APPLICATION");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 140, 30));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 0, 0));
        jLabel27.setText("COMELEC");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, -1, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        Session sess = Session.getInstance();
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
        } else if(!(birthdate.getText().matches("\\d{4}-\\d{2}-\\d{2}"))){
            JOptionPane.showMessageDialog(null, "birthdate: invalid input");
        }
        
        else if (birthdate.getText().matches("\\d{4}-\\d{2}-\\d{2}")) {
            int year = Integer.parseInt(birthdateText.substring(0, 4));
            int month = Integer.parseInt(birthdateText.substring(5, 7));
            int day = Integer.parseInt(birthdateText.substring(8, 10));

            if (!(month >= 1 && month <= 12)) {
                JOptionPane.showMessageDialog(null, "Invalid month! Must not exceed 12.");
                return;
            } if (!(day > 1 || day < 31)) {
                JOptionPane.showMessageDialog(null, "Invalid day! must not exceed 31");
                return;
            } if (!(year > 1966 )) {
                JOptionPane.showMessageDialog(null, "Invalid year! too old.");
                return;
            }if (!(year < 2006 )) {
                JOptionPane.showMessageDialog(null, "Invalid year! Must not exceed 2006.");
                
            }else {
                
                 try{
                   
                    int lastInsertedId = -1;
                     
                  String pass = passwordHasher.hashPassword(password.getText());
               String sql = "INSERT INTO users(fname, lname, ussername, useremail, sex, utype, birthdate, password, stats,Uimage) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?,?)";

                PreparedStatement pst = dbc.connect.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

                // Use prepared statements properly with parameters
                pst.setString(1, fname.getText());
                pst.setString(2, lname.getText());
                pst.setString(3, uname.getText());
                pst.setString(4, emaill.getText());
                pst.setString(5, sex.getSelectedItem().toString());
                pst.setString(6, type.getSelectedItem().toString());
                pst.setString(7, birthdate.getText());
                pst.setString(8, pass);
                pst.setString(9, "pending");
                pst.setString(10, destination);
              int affectedRows = pst.executeUpdate();
    
          if (affectedRows > 0) {
        // Now retrieve the generated key
        try (ResultSet generatedKeys = pst.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                lastInsertedId = generatedKeys.getInt(1);
            }
        }
        Files.copy(selectedFile.toPath(), new File(destination).toPath(),StandardCopyOption.REPLACE_EXISTING);
        String actionn = "Created user account ID: " + lastInsertedId;
        dbc.insertData("INSERT INTO logs(user_id, action, date) VALUES ('" + sess.getId() + "', '" + actionn + "', '" + LocalDateTime.now() + "')");

        JOptionPane.showMessageDialog(null, "User account created successfully.");
        fname.setText("");
        lname.setText("");
        uname.setText("");
        emaill.setText("");
        birthdate.setText("");
        password.setText("");
        confpass.setText("");
        image.setIcon(null);
    } else {
        JOptionPane.showMessageDialog(null, "Creating user failed, no rows affected.");
    }}catch(NoSuchAlgorithmException ex){
                    System.out.println(""+ex);} catch (SQLException ex) {
                    Logger.getLogger(adduser.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(adduser.class.getName()).log(Level.SEVERE, null, ex);
                }
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

    private void imageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            try {
                selectedFile = fileChooser.getSelectedFile();
                destination = "src/images/" + selectedFile.getName();
                path  = selectedFile.getAbsolutePath();

                if(FileExistenceChecker(path) == 1){

                    JOptionPane.showMessageDialog(null, "File Already Exist, Rename or Choose another!");
                    destination = "";
                    path="";
                }else{
                    image.setText("image here!");
                    image.setIcon(ResizeImage(path, null, image));
                }
            } catch (Exception ex) {
                System.out.println("File Error!");
            }
        }
    }//GEN-LAST:event_imageMouseClicked

    private void imageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMouseEntered

    }//GEN-LAST:event_imageMouseEntered

    private void removeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeMouseClicked
        image.setIcon(null);
        destination = "";
        path = "";
    }//GEN-LAST:event_removeMouseClicked

    private void emaillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emaillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emaillActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField birthdate;
    private javax.swing.JPasswordField confpass;
    private javax.swing.JTextField emaill;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField lname;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel remove;
    private javax.swing.JLabel savebttn;
    private javax.swing.JComboBox<String> sex;
    private javax.swing.JCheckBox showpass;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
