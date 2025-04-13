/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partylist;

import com.mysql.jdbc.Statement;
import config.Session;
import config.dbconnect;
import config.passwordHasher;
import internalframes.adduser;
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
public class addpartylist extends javax.swing.JInternalFrame {

    /**
     * Creates new form addpartylist
     */
    public addpartylist() {
        initComponents();
            this.setBorder(javax.swing. BorderFactory.createEmptyBorder(0,0,0,0)); 
       BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
       bi.setNorthPane (null);
       
       image.setText("image here!");
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        savebttn = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        platform = new javax.swing.JTextArea();
        contact = new javax.swing.JTextField();
        acronym = new javax.swing.JTextField();
        pname = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        representative = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
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

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));

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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -30, 110, 35));

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 800, 35));

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
        getContentPane().add(savebttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 20));

        jLabel8.setBackground(new java.awt.Color(204, 0, 0));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Clear");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 90, 20));

        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Platform:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 190, 20));

        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Partylist name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 130, 20));

        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Shortname:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 130, 20));

        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Representative:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 120, 20));

        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Contact no :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 190, 20));

        platform.setColumns(20);
        platform.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        platform.setRows(5);
        jScrollPane1.setViewportView(platform);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 400, 130));
        getContentPane().add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 400, -1));

        acronym.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acronymActionPerformed(evt);
            }
        });
        getContentPane().add(acronym, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 240, -1));

        pname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnameActionPerformed(evt);
            }
        });
        getContentPane().add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 240, -1));

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

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 140, 130));

        representative.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        representative.setOpaque(false);
        getContentPane().add(representative, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 240, 25));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void savebttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebttnMouseClicked
        dbconnect dbc = new dbconnect();
        Session sess = Session.getInstance();
       if(pname.getText().isEmpty()||contact.getText().isEmpty()||platform.getText().isEmpty()|| acronym.getText().isEmpty()){
       JOptionPane.showMessageDialog(null,"all field are required");
       } else if (!contact.getText().matches("-?\\d+")) {
                JOptionPane.showMessageDialog(null,"Contact should be integers only");
                contact.setText("");
       } else if (!(contact.getText().length() <= 11)){ 
                JOptionPane.showMessageDialog(null,"contact should exceed 11 digits");
                contact.setText("");
       } else{
       try{
                   
               int lastInsertedId = -1;
               String sql = "INSERT INTO partylist(pname,shortname, representative, contact, platform, cid, logo, date) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

                PreparedStatement pst = dbc.connect.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

                // Use prepared statements properly with parameters
                pst.setString(1, pname.getText());
                pst.setString(2, acronym.getText());
                pst.setString(3, representative.getSelectedItem().toString());
                pst.setString(4, contact.getText());
                pst.setString(5, platform.getText());
                pst.setInt(6, sess.getId());
                pst.setString(7, destination);
                pst.setString(8, LocalDateTime.now().toString());
              int affectedRows = pst.executeUpdate();
    
          if (affectedRows > 0) {
        // Now retrieve the generated key
        try (ResultSet generatedKeys = pst.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                lastInsertedId = generatedKeys.getInt(1);
            }
        }

        String actionn = "Added partylist with ID no.: " + lastInsertedId;
        dbc.insertData("INSERT INTO logs(user_id, action, date) VALUES ('" + sess.getId() + "', '" + actionn + "', '" + LocalDateTime.now() + "')");
        Files.copy(selectedFile.toPath(), new File(destination).toPath(),StandardCopyOption.REPLACE_EXISTING);
        JOptionPane.showMessageDialog(null, "partylist added successfully.");
        
        pname.setText("");
        acronym.setText("");
        contact.setText("");
        platform.setText("");
        destination = "";
       
    } else {
        JOptionPane.showMessageDialog(null, "Creating user failed, no rows affected.");
    }} catch (SQLException ex) {
                    Logger.getLogger(adduser.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                Logger.getLogger(addpartylist.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
    }//GEN-LAST:event_savebttnMouseClicked

    private void savebttnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebttnMouseEntered
        savebttn.setBackground(Color.white);
        savebttn.setForeground(new java.awt.Color(204,0,0));
    }//GEN-LAST:event_savebttnMouseEntered

    private void savebttnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebttnMouseExited

        savebttn.setBackground(new java.awt.Color(204,0,0));
        savebttn.setForeground(Color.white);
    }//GEN-LAST:event_savebttnMouseExited

    private void acronymActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acronymActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acronymActionPerformed

    private void pnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnameActionPerformed

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

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
       
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField acronym;
    private javax.swing.JTextField contact;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea platform;
    private javax.swing.JTextField pname;
    private javax.swing.JComboBox<String> representative;
    private javax.swing.JLabel savebttn;
    // End of variables declaration//GEN-END:variables
}
