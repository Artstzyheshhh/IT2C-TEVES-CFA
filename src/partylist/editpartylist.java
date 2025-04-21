/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partylist;

import config.Session;
import config.dbconnect;
import java.awt.Color;
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

import java.time.LocalDateTime;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author acer
 */
public class editpartylist extends javax.swing.JInternalFrame {

    /**
     * Creates new form editpartylist
     */
    public editpartylist() {
        initComponents();
            this.setBorder(javax.swing. BorderFactory.createEmptyBorder(0,0,0,0)); 
       BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
       bi.setNorthPane (null);
       partylisttable.getTableHeader().setOpaque(false);
       partylisttable.getTableHeader().setBackground(new java.awt.Color(221,21,21));
       partylisttable.getTableHeader().setForeground(Color.white);
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
    
    public void displayData(){
        try{
            dbconnect dbc = new dbconnect();
            try (ResultSet rs = dbc.getData("SELECT pid, pname, contact FROM partylist")) {
                partylisttable.setModel(DbUtils.resultSetToTableModel(rs));
                partylisttable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                TableColumnModel columnModel = partylisttable.getColumnModel();
                
                columnModel.getColumn(0).setHeaderValue("ID");
                columnModel.getColumn(1).setHeaderValue("Partylist");
                columnModel.getColumn(2).setHeaderValue("Contact");
                
                // Apply header changes
                partylisttable.getTableHeader().repaint();
                columnModel.getColumn(0).setPreferredWidth(50);
                columnModel.getColumn(1).setPreferredWidth(140);
                columnModel.getColumn(2).setPreferredWidth(140);
            }
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

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

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        platform = new javax.swing.JTextArea();
        contact = new javax.swing.JTextField();
        acronym = new javax.swing.JTextField();
        pname = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        remove = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        savebttn = new javax.swing.JLabel();
        clear = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        editinfo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        partylisttable = new javax.swing.JTable();

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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Platform:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 390, 20));

        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("ID:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 20, 20));

        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Shortname:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 130, 20));

        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Contact no :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 110, 20));

        platform.setColumns(20);
        platform.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        platform.setRows(5);
        jScrollPane1.setViewportView(platform);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 390, 120));
        jPanel3.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 240, -1));

        acronym.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acronymActionPerformed(evt);
            }
        });
        jPanel3.add(acronym, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 240, -1));

        pname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnameActionPerformed(evt);
            }
        });
        jPanel3.add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 240, -1));

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

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 140, 130));

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
        jPanel3.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, 20));

        jLabel31.setBackground(new java.awt.Color(255, 153, 102));
        jLabel31.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText(" UPDATE PARTYLIST");
        jLabel31.setOpaque(true);
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 40));

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
        jPanel3.add(savebttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 90, 20));

        clear.setBackground(new java.awt.Color(204, 0, 0));
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clear.setText("Clear");
        clear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));
        clear.setOpaque(true);
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });
        jPanel3.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 90, 20));

        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("Partylist name:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 130, 20));

        id.setEnabled(false);
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel3.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 70, -1));

        editinfo.setBackground(new java.awt.Color(204, 0, 0));
        editinfo.setForeground(new java.awt.Color(255, 255, 255));
        editinfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editinfo.setText("Edit");
        editinfo.setOpaque(true);
        editinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editinfoMouseClicked(evt);
            }
        });
        jPanel3.add(editinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 90, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 430, 420));

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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, -30, 110, 35));

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

        partylisttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(partylisttable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 340, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void removeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeMouseClicked
        image.setIcon(null);
    }//GEN-LAST:event_removeMouseClicked

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
            
            dbc.insertData("UPDATE partylist SET pname = '"+pname.getText()+"',shortname ='"+acronym.getText()+"',"
            + " contact = '"+contact.getText()+"' platform = '"+platform.getText()+"', logo = '"+destination+"' WHERE pid = '"+id.getText()+"'");
            
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
            String actionn = "Updated user with ID No.: " + id.getText();
        dbc.insertData("INSERT INTO logs(user_id, action, date) VALUES ('" + sess.getId() + "', '" + actionn + "', '" + LocalDateTime.now() + "')");
            JOptionPane.showMessageDialog(null,"account updated successfully.");
            
            id.setText("");
            pname.setText("");
            acronym.setText("");
            contact.setText("");
            platform.setText("");
            image.setIcon(null);
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

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        pname.setText("");
        acronym.setText("");
        contact.setText("");
        platform.setText("");
        image.setIcon(null);
    }//GEN-LAST:event_clearMouseClicked

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void editinfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editinfoMouseClicked
        int rowIndex = partylisttable.getSelectedRow();

        if (rowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select an item!");
        } else {
            try {
                dbconnect dbc = new dbconnect();
                TableModel tbl = partylisttable.getModel();
                ResultSet rs = dbc.getData("SELECT * FROM partylist WHERE pid = '" + tbl.getValueAt(rowIndex, 0) + "'");

                if (rs.next()) {

                    
                    id.setText(""+rs.getInt("pid"));
                    pname.setText(""+rs.getString("pname"));
                    acronym.setText(""+rs.getString("shortname"));
                    contact.setText(""+rs.getString("contact"));
                    platform.setText(""+rs.getString("platform"));
                    image.setIcon(ResizeImage(rs.getString("logo"),null,image));
                    oldpath = rs.getString("logo");
                    path = rs.getString("logo");
                    destination = rs.getString("logo");

                }

            } catch (SQLException ex) {
                System.out.println("" + ex);
            }
        }
    }//GEN-LAST:event_editinfoMouseClicked

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
         displayData();
    }//GEN-LAST:event_formInternalFrameActivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField acronym;
    private javax.swing.JLabel clear;
    private javax.swing.JTextField contact;
    private javax.swing.JLabel editinfo;
    private javax.swing.JTextField id;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable partylisttable;
    private javax.swing.JTextArea platform;
    private javax.swing.JTextField pname;
    private javax.swing.JLabel remove;
    private javax.swing.JLabel savebttn;
    // End of variables declaration//GEN-END:variables
}
