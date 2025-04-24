/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

import config.Session;
import config.dbconnect;
import it2c.teves.cfa.loginform;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author acer
 */
public class editmyaccount extends javax.swing.JInternalFrame {

    /**
     * Creates new form editmyaccount
     */
    public editmyaccount() {
        initComponents();
               this.setBorder(javax.swing. BorderFactory.createEmptyBorder(0,0,0,0)); 
       BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
       bi.setNorthPane (null);
    }
    
     public static String uemail,usname;
      
    public boolean updatecheck(){
        
        dbconnect dbc = new dbconnect();
   try {
            String query = "SELECT * FROM users WHERE(ussername = '"+ uname.getText()+"'OR useremail ='"+emaill.getText() +"')AND uid != '"+id.getText()+"'";
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
    // Improved regex pattern for email validation
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
    
    public void imageUpdater(String existingFilePath, String newFilePath){
        File existingFile = new File(existingFilePath);
        if (existingFile.exists()) {
            String parentDirectory = existingFile.getParent();
            File newFile = new File(newFilePath);
            String newFileName = newFile.getName();
            File updatedFile = new File(parentDirectory, newFileName);
            existingFile.delete();
            try {
                Files.copy(newFile.toPath(), updatedFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Image updated successfully.");
            } catch (IOException e) {
                System.out.println("Error occurred while updating the image: "+e);
            }
        } else {
            try{
                Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
            }catch(IOException e){
                System.out.println("Error on update!");
            }
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

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        id = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
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
        jLabel3 = new javax.swing.JLabel();
        savebttn = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        remove = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id.setEnabled(false);
        jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 80, -1));

        jLabel24.setForeground(new java.awt.Color(204, 0, 0));
        jLabel24.setText("User ID:");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 100, 20));

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        type.setEnabled(false);
        type.setPreferredSize(new java.awt.Dimension(57, 25));
        jPanel2.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 130, 20));

        jLabel25.setForeground(new java.awt.Color(204, 0, 0));
        jLabel25.setText("User-type:");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 100, 20));

        jLabel10.setForeground(new java.awt.Color(204, 0, 0));
        jLabel10.setText("Firstname:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 100, 20));
        jPanel2.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 270, 20));

        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setText("Lastname:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 100, 20));
        jPanel2.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 270, 20));

        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("Username:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 100, 20));
        jPanel2.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 270, 20));

        jLabel15.setForeground(new java.awt.Color(204, 0, 0));
        jLabel15.setText("Email:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 100, 20));
        jPanel2.add(emaill, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 270, 20));

        jLabel12.setForeground(new java.awt.Color(204, 0, 0));
        jLabel12.setText("Sex:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 50, 20));

        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male", "female", "others" }));
        sex.setPreferredSize(new java.awt.Dimension(57, 25));
        jPanel2.add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 100, 20));

        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setText("Birthdate:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 100, 20));
        jPanel2.add(birthdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 100, 20));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Clear all");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 110, 20));

        savebttn.setBackground(new java.awt.Color(255, 255, 255));
        savebttn.setForeground(new java.awt.Color(204, 0, 0));
        savebttn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        savebttn.setText("save");
        savebttn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        savebttn.setOpaque(true);
        savebttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                savebttnMouseClicked(evt);
            }
        });
        jPanel2.add(savebttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 110, 20));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 0, 0));
        jLabel26.setText("COMELEC");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, -1, 50));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("FILING APPLICATION");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 140, 30));

        jLabel16.setForeground(new java.awt.Color(204, 0, 0));
        jLabel16.setText("User status:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 100, 20));

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        status.setEnabled(false);
        status.setPreferredSize(new java.awt.Dimension(57, 25));
        jPanel2.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 130, 20));

        jPanel5.setLayout(null);

        image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(image);
        image.setBounds(0, 0, 130, 110);

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, 110));

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
        jPanel2.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 130, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 910, 360));

        jPanel6.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -30, 120, 35));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 980, 35));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
            fname.setText("");
            lname.setText("");
            uname.setText("");
            emaill.setText("");                                            
            birthdate.setText("");
            
    }//GEN-LAST:event_jLabel3MouseClicked

    private void savebttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebttnMouseClicked
        dbconnect dbc = new dbconnect();
        String emailInput = emaill.getText();
        if(fname.getText() .isEmpty() || lname.getText().isEmpty()
            ||uname.getText() .isEmpty()
            || birthdate.getText() .isEmpty()
            || emaill.getText() .isEmpty()
        )

        {JOptionPane.showMessageDialog(null,"all field are required");
        }

        else if (!isValidEmail(emailInput)) {            
        }
        else if(updatecheck()){
        }

        else if (uname.getText().equals(emaill.getText())){
            JOptionPane.showMessageDialog(null, "username and email should not match");
        }

        else{
            dbc.insertData("UPDATE users SET fname ='"+fname.getText()+"',lname ='"+lname.getText()+"',"
                + "ussername ='"+uname.getText()+"',useremail ='"+emaill.getText()+"',"
                + "sex ='"+sex.getSelectedItem()+"',"               
                + "birthdate ='"+birthdate.getText()+"',Uimage = '"+destination+"' WHERE uid ='"+id.getText()+"'");
            JOptionPane.showMessageDialog(null,"account updated successfully.");
            if(destination.isEmpty()){
            File existingFile = new File(oldpath);
            if(existingFile.exists()){
            existingFile.delete();
            }
            }else{
            if(!(oldpath.equals(path))){
            imageUpdater(oldpath,path);
            }
            }
        }
    }//GEN-LAST:event_savebttnMouseClicked

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        Session sess = Session.getInstance();
        if(sess.getId() == 0){
        JOptionPane.showMessageDialog(null,"No account found, login first!");
        loginform lfm = new loginform();
        lfm.setVisible(true);
        this.dispose();
        }else{
            id.setText(""+sess.getId());
            fname.setText(""+sess.getFname());
            lname.setText(""+sess.getLname());
            uname.setText(""+sess.getUsername());
            emaill.setText(""+sess.getEmail());                               
            sex.setSelectedItem(""+sess.getSex());           
            type.setSelectedItem(""+sess.getType());
            birthdate.setText(""+sess.getBirthdate());
             status.setSelectedItem(""+sess.getStatus());
             image.setIcon(ResizeImage(""+sess.getUimage(),null,image));
             oldpath = sess.getUimage();
             path = sess.getUimage();
             destination = sess.getUimage();
             
        }
    }//GEN-LAST:event_formInternalFrameActivated

    private void removeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeMouseClicked
       image.setIcon(null);
        destination = "";
        path = "";
    }//GEN-LAST:event_removeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField birthdate;
    private javax.swing.JTextField emaill;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField id;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel remove;
    private javax.swing.JLabel savebttn;
    private javax.swing.JComboBox<String> sex;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
