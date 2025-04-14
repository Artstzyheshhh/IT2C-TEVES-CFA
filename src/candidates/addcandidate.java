/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidates;

import com.mysql.jdbc.Statement;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import config.Session;
import config.dbconnect;

import internalframes.adduser;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author acer
 */
public class addcandidate extends javax.swing.JInternalFrame {

    /**
     * Creates new form addcandidate
     */
    public addcandidate() {
        initComponents();
       this.setBorder(javax.swing. BorderFactory.createEmptyBorder(0,0,0,0)); 
       BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
       bi.setNorthPane (null);
       yearr.setText("yyyy");
       day.setText("dd");
    }
    
         public static String cmail,usname;
         public static int termm;
    
    public boolean duplicatecheck(){
        
        dbconnect dbc = new dbconnect();
   try {
            String query = "SELECT * FROM candidates WHERE email = '"+ email.getText()+"'";
        
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
    
    public boolean positionss(){    
        dbconnect dbc = new dbconnect();
   try {          
             String queryy = "SELECT * FROM positions WHERE pname = '"+ positionn.getSelectedItem()+"'";
            ResultSet resultSet = dbc.getData(queryy);
            if(resultSet.next()){             
                 termm = resultSet.getInt("term"); 
                
                return true;
            }
            else{
                return false;
            }
            
        } catch (SQLException ex) {
            System.out.println(""+ex);
            return false;
        }}
    
    public void loadPositionsToComboBox() {
    try {
         dbconnect dbc = new dbconnect();
        String sql = "SELECT pname FROM positions";
        PreparedStatement pst = dbc.connect.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        // Optional: clear previous items
        positionn.removeAllItems();

        // Optional: add default item
        positionn.addItem("Select position");

        while (rs.next()) {
            String position = rs.getString("pname");
            positionn.addItem(position);
        }

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error loading positions: " + ex.getMessage());
    }
}
    
    public void addcandidate(){
        
        if(positionss()){  
            try{
           int curryear =  LocalDate.now().getYear();
            int birthYear = Integer.parseInt(yearr.getText());
            int age = curryear - birthYear;
          Session sess = Session.getInstance();   
         dbconnect dbc = new dbconnect();          
                    int lastInsertedId = -1;
                      String sql = "INSERT INTO candidates(fname, lname, mname, address, sex, nationality, occupation, email ,age,contact,position,term, year, month, day, date ,user_id,cimage)"
                               + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement pst = dbc.connect.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

                // Use prepared statements properly with parameters
                pst.setString(1, fname.getText());
                pst.setString(2, lname.getText());
                pst.setString(3, mname.getText());
                pst.setString(4, address.getText());   
                pst.setString(5, sex.getSelectedItem().toString());
                pst.setString(6, nationality.getText());
                pst.setString(7, occupation.getText());
                pst.setString(8, email.getText());
                pst.setInt(9,age);
                pst.setString(10, contact.getText());
                pst.setString(11, positionn.getSelectedItem().toString());
                pst.setInt(12, termm);
                pst.setString(13, yearr.getText());
                pst.setString(14, month.getSelectedItem().toString());
                pst.setString(15, day.getText());
                pst.setString(16,LocalDateTime.now().toString());
                pst.setInt(17,  sess.getId());
                pst.setString(18, destination);
              int affectedRows = pst.executeUpdate();
    
          if (affectedRows > 0) {
        // Now retrieve the generated key
        try (ResultSet generatedKeys = pst.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                lastInsertedId = generatedKeys.getInt(1);
            }
        }

        String actionn = "Added candidate with ID No.: " + lastInsertedId;
        dbc.insertData("INSERT INTO logs(user_id, action, date) VALUES ('" + sess.getId() + "', '" + actionn + "', '" + LocalDateTime.now() + "')");

        JOptionPane.showMessageDialog(null, "Candidate added successfully.");    
            fname.setText("");
            lname.setText("");
            mname.setText("");
            address.setText("");
            sex.setSelectedItem("");
            nationality.setText("");
            occupation.setText("");
            contact.setText("");
            email.setText("");
            image.setIcon(null);
    } else {
        JOptionPane.showMessageDialog(null, "Adding candidate failed, no rows affected.");
    }} catch (SQLException ex) {
                    Logger.getLogger(adduser.class.getName()).log(Level.SEVERE, null, ex);
                }
    
            
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        mname = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        nationality = new javax.swing.JTextField();
        occupation = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        positionn = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        sex = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        yearr = new javax.swing.JFormattedTextField();
        day = new javax.swing.JTextField();
        month = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        remove = new javax.swing.JLabel();
        savebttn = new javax.swing.JLabel();
        clearr = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

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
                formInternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setForeground(new java.awt.Color(153, 0, 0));
        jLabel10.setText("Firstname:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 70, 20));
        jPanel2.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 170, -1));

        jLabel11.setForeground(new java.awt.Color(153, 0, 0));
        jLabel11.setText("Lastname:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 70, 20));
        jPanel2.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 170, -1));

        jLabel9.setForeground(new java.awt.Color(153, 0, 0));
        jLabel9.setText("Middlename:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 70, 20));
        jPanel2.add(mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 170, -1));

        jLabel15.setForeground(new java.awt.Color(153, 0, 0));
        jLabel15.setText("Address");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 70, 20));
        jPanel2.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 170, -1));

        jLabel14.setForeground(new java.awt.Color(153, 0, 0));
        jLabel14.setText("Nationality");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 70, 20));

        jLabel17.setForeground(new java.awt.Color(153, 0, 0));
        jLabel17.setText("Occupation");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 110, 20));
        jPanel2.add(nationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 170, -1));

        occupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                occupationActionPerformed(evt);
            }
        });
        jPanel2.add(occupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 280, -1));

        jLabel18.setForeground(new java.awt.Color(153, 0, 0));
        jLabel18.setText("Contact number:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 100, 20));

        jLabel21.setForeground(new java.awt.Color(153, 0, 0));
        jLabel21.setText("Position:");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 100, 20));
        jPanel2.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 280, -1));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 280, -1));

        jLabel23.setForeground(new java.awt.Color(153, 0, 0));
        jLabel23.setText("Email:");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 100, 20));

        positionn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionnActionPerformed(evt);
            }
        });
        jPanel2.add(positionn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 140, -1));

        jLabel12.setForeground(new java.awt.Color(153, 0, 0));
        jLabel12.setText("Sex:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 50, 20));

        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male", "female", "others" }));
        sex.setPreferredSize(new java.awt.Dimension(57, 25));
        jPanel2.add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 80, 20));

        jLabel13.setForeground(new java.awt.Color(153, 0, 0));
        jLabel13.setText("Birthdate:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 70, 20));
        jPanel2.add(yearr, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 80, -1));
        jPanel2.add(day, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 70, -1));

        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel2.add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 80, -1));

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

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 140, 130));

        jLabel26.setBackground(new java.awt.Color(255, 153, 102));
        jLabel26.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText(" ADD CANDIDATE");
        jLabel26.setOpaque(true);
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 40));

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
        jPanel2.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 140, 20));

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
        jPanel2.add(savebttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 90, 20));

        clearr.setBackground(new java.awt.Color(204, 0, 0));
        clearr.setForeground(new java.awt.Color(255, 255, 255));
        clearr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clearr.setText("Clear all");
        clearr.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));
        clearr.setOpaque(true);
        clearr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearrMouseClicked(evt);
            }
        });
        jPanel2.add(clearr, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 90, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 430, 420));

        jPanel6.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -30, 110, 35));

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

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
     
    }//GEN-LAST:event_formInternalFrameOpened

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
         loadPositionsToComboBox();
    }//GEN-LAST:event_formInternalFrameActivated

    private void savebttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebttnMouseClicked

        Session sess = Session.getInstance();
        dbconnect dbc = new dbconnect();

        if(fname.getText() .isEmpty() || lname.getText().isEmpty()
            ||mname.getText() .isEmpty()
            || yearr.getText() .isEmpty()
            || address.getText() .isEmpty()
            ||nationality.getText().isEmpty()
            ||occupation.getText().isEmpty()
            ||contact.getText().isEmpty()
            ||email.getText().isEmpty())

        {JOptionPane.showMessageDialog(null,"all field are required");
        } else{
            int curryear =  LocalDate.now().getYear();
            int birthYear = Integer.parseInt(yearr.getText());
            int age = curryear - birthYear;

            if(duplicatecheck()){

            }
            else if(duplicatecheck()){
            }
            else if (!contact.getText().matches("-?\\d+")) {
                JOptionPane.showMessageDialog(null,"Contact should be integers only");
            }
            else if (!yearr.getText().matches("-?\\d+")) {
                JOptionPane.showMessageDialog(null,"year should be integers only");
            }else if (!day.getText().matches("-?\\d+")) {
                JOptionPane.showMessageDialog(null,"day should be integers only");
            }
            else if(age>15 && age <60){

                String position = positionn.getSelectedItem().toString();
                if (age < 21) {

                    if (!position.equals("SK chairman") && !position.equals("SK councilor")) {
                        JOptionPane.showMessageDialog(null, "Candidates aged 20 and below can only run as SK chairman or SK councilor.");
                        return;
                    }
                    if(positionss()) {
                    addcandidate();
                    
                    }

                } else {

                    if (position.equals("SK chairman") || position.equals("SK councilor")) {
                        JOptionPane.showMessageDialog(null, "Candidates aged 21 and above cannot run as SK chairman or SK councilor.");
                        return;
                    }
                    if(positionss()){
                      addcandidate();  
                   
                    }
                    
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

    private void occupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_occupationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_occupationActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void positionnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_positionnActionPerformed

    private void removeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeMouseClicked
        image.setIcon(null);
    }//GEN-LAST:event_removeMouseClicked

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

    private void clearrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearrMouseClicked
            fname.setText("");
            lname.setText("");
            mname.setText("");
            address.setText("");
            sex.setSelectedItem("");
            nationality.setText("");
            occupation.setText("");
            contact.setText("");
            email.setText("");
            image.setIcon(null);
    }//GEN-LAST:event_clearrMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JLabel clearr;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField day;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField mname;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JTextField nationality;
    private javax.swing.JTextField occupation;
    private javax.swing.JComboBox<String> positionn;
    private javax.swing.JLabel remove;
    private javax.swing.JLabel savebttn;
    private javax.swing.JComboBox<String> sex;
    private javax.swing.JFormattedTextField yearr;
    // End of variables declaration//GEN-END:variables
}
