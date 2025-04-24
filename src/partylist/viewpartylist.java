/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partylist;

import config.PanelPrinter;
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
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author acer
 */
public class viewpartylist extends javax.swing.JInternalFrame {

    /**
     * Creates new form editpartylist
     */
    public viewpartylist() {
        initComponents();
            this.setBorder(javax.swing. BorderFactory.createEmptyBorder(0,0,0,0)); 
       BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
       bi.setNorthPane (null);
       displayData();
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
            try (ResultSet rs = dbc.getData("SELECT pid, pname, status, contact FROM partylist WHERE pid != 15")) {
                partylisttable.setModel(DbUtils.resultSetToTableModel(rs));
                partylisttable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                TableColumnModel columnModel = partylisttable.getColumnModel();
                
                columnModel.getColumn(0).setHeaderValue("ID");
                columnModel.getColumn(1).setHeaderValue("Partylist");
                columnModel.getColumn(2).setHeaderValue("status");
                columnModel.getColumn(3).setHeaderValue("Contact");
                // Apply header changes
                partylisttable.getTableHeader().repaint();
                columnModel.getColumn(0).setPreferredWidth(60);
                columnModel.getColumn(1).setPreferredWidth(116);
                columnModel.getColumn(2).setPreferredWidth(116);
                columnModel.getColumn(3).setPreferredWidth(116);
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        partylisttable = new javax.swing.JTable();
        editinfo = new javax.swing.JLabel();
        coc = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Statement = new javax.swing.JLabel();
        Statement1 = new javax.swing.JLabel();
        Statement2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pname = new javax.swing.JLabel();
        stats = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Statement3 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, -30, 110, 35));

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

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 420, 380));

        editinfo.setBackground(new java.awt.Color(204, 0, 0));
        editinfo.setForeground(new java.awt.Color(255, 255, 255));
        editinfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editinfo.setText("View details");
        editinfo.setOpaque(true);
        editinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editinfoMouseClicked(evt);
            }
        });
        getContentPane().add(editinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 90, 20));

        coc.setBackground(new java.awt.Color(255, 255, 255));
        coc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        coc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REPUBLIC OF THE PHILIPPINES");
        coc.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 10, 350, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CERTIFICATE OF CANDIDACY");
        coc.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 47, 350, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Commission of Elections");
        coc.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 20, 350, -1));
        coc.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 310, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel5.setText("Official Statement:");
        coc.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 320, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel6.setText("Partylist Name: ");
        coc.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 70, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel7.setText("Application ID: ");
        coc.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 70, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel8.setText("Filing status:");
        coc.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 70, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel9.setText("Date Filed:");
        coc.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 50, 20));

        Statement.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        Statement.setText("-ectoral regulations");
        coc.add(Statement, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 320, 20));

        Statement1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        Statement1.setText("      This certifies that the above-mentioned partylist has successfully filed its");
        coc.add(Statement1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 320, 20));

        Statement2.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        Statement2.setText("Certificate of Candidacy and compeleted all necessary requirements for the up");
        coc.add(Statement2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 320, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 6)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("This docuement is system-generated and does not require physical signature");
        coc.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 350, 20));

        pname.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        coc.add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 220, 20));

        stats.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        coc.add(stats, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 220, 20));

        date.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        coc.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 240, 20));

        id.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        coc.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 220, 20));

        jPanel5.setLayout(null);

        image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(image);
        image.setBounds(0, 0, 90, 90);

        coc.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 75, 90, 90));
        coc.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 65, 310, 10));

        Statement3.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        Statement3.setText("-coming elections. This document serves as a proof of compliance with the el");
        coc.add(Statement3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 320, 20));

        getContentPane().add(coc, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 350, 450));

        jLabel31.setBackground(new java.awt.Color(255, 153, 102));
        jLabel31.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText(" VIEW PARTYLIST");
        jLabel31.setOpaque(true);
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 420, 40));

        jLabel10.setBackground(new java.awt.Color(204, 0, 0));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Print");
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 80, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                    stats.setText(""+rs.getString("status"));
                    date.setText(""+rs.getString("date"));
                    image.setIcon(ResizeImage(rs.getString("logo"),null,image));
                   

                }

            } catch (SQLException ex) {
                System.out.println("" + ex);
            }
        }
    }//GEN-LAST:event_editinfoMouseClicked

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
      
    }//GEN-LAST:event_formInternalFrameActivated

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        JPanel myPanel = new JPanel();
        PanelPrinter pprint = new PanelPrinter(coc);
        pprint.printPanel();
    }//GEN-LAST:event_jLabel10MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Statement;
    private javax.swing.JLabel Statement1;
    private javax.swing.JLabel Statement2;
    private javax.swing.JLabel Statement3;
    private javax.swing.JPanel coc;
    private javax.swing.JLabel date;
    private javax.swing.JLabel editinfo;
    private javax.swing.JLabel id;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable partylisttable;
    private javax.swing.JLabel pname;
    private javax.swing.JLabel stats;
    // End of variables declaration//GEN-END:variables
}
