/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

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
public class edituser extends javax.swing.JInternalFrame {

    /**
     * Creates new form edituser
     */
    public edituser() {
        initComponents();
        displayData();
        
       this.setBorder(javax.swing. BorderFactory.createEmptyBorder(0,0,0,0)); 
       BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
       bi.setNorthPane (null);
       
       userstable.getTableHeader().setOpaque(false);
       userstable.getTableHeader().setBackground(new java.awt.Color(221,21,21));
       userstable.getTableHeader().setForeground(Color.white);
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
    
            public void displayData(){
        try{
            dbconnect dbc = new dbconnect();
            ResultSet rs = dbc.getData("SELECT uid, lname,fname FROM users");
            userstable.setModel(DbUtils.resultSetToTableModel(rs));
             userstable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
               TableColumnModel columnModel = userstable.getColumnModel();     
               
               columnModel.getColumn(0).setHeaderValue("ID");
               columnModel.getColumn(1).setHeaderValue("Lastname");
               columnModel.getColumn(2).setHeaderValue("Firstname");

        // Apply header changes
              userstable.getTableHeader().repaint();
                columnModel.getColumn(0).setPreferredWidth(50); 
                columnModel.getColumn(1).setPreferredWidth(145); 
                columnModel.getColumn(2).setPreferredWidth(145); 
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editpanel = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
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
        jLabel16 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        remove = new javax.swing.JLabel();
        savebttn = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userstable = new javax.swing.JTable();
        editinfo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editpanel.setBackground(new java.awt.Color(255, 255, 255));
        editpanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        editpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setForeground(new java.awt.Color(204, 0, 0));
        jLabel24.setText("User ID:");
        editpanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 60, 20));

        id.setEnabled(false);
        editpanel.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 170, -1));

        jLabel25.setForeground(new java.awt.Color(204, 0, 0));
        jLabel25.setText("User-type:");
        editpanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 60, 20));

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        type.setPreferredSize(new java.awt.Dimension(57, 25));
        editpanel.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 170, 20));

        jLabel10.setForeground(new java.awt.Color(204, 0, 0));
        jLabel10.setText("Firstname:");
        editpanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 60, 20));
        editpanel.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 170, 20));

        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setText("Lastname:");
        editpanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 60, 20));
        editpanel.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 170, -1));

        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("Username:");
        editpanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 60, 20));
        editpanel.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 170, 20));

        jLabel15.setForeground(new java.awt.Color(204, 0, 0));
        jLabel15.setText("Email:");
        editpanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 60, 20));
        editpanel.add(emaill, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 320, 20));

        jLabel12.setForeground(new java.awt.Color(204, 0, 0));
        jLabel12.setText("Sex:");
        editpanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 60, 20));

        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male", "female", "others" }));
        sex.setPreferredSize(new java.awt.Dimension(57, 25));
        sex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexActionPerformed(evt);
            }
        });
        editpanel.add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 90, 20));

        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setText("Birthdate:");
        editpanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 70, 20));
        editpanel.add(birthdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 150, 20));

        jLabel16.setForeground(new java.awt.Color(204, 0, 0));
        jLabel16.setText("Status:");
        editpanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 60, 20));

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        status.setPreferredSize(new java.awt.Dimension(57, 25));
        editpanel.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 90, 20));

        jLabel26.setBackground(new java.awt.Color(255, 153, 102));
        jLabel26.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText(" UPDATE USER INFO");
        jLabel26.setOpaque(true);
        editpanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 40));

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

        editpanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 140, 130));

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
        editpanel.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, 20));

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
        });
        editpanel.add(savebttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 90, 20));

        jLabel8.setBackground(new java.awt.Color(204, 0, 0));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Clear all");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));
        jLabel8.setOpaque(true);
        editpanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 90, 20));

        getContentPane().add(editpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 420, 420));

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

        userstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        userstable.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(userstable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 350, 380));

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
        getContentPane().add(editinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 90, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void savebttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebttnMouseClicked
        dbconnect dbc = new dbconnect();
         Session sess = Session.getInstance();
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
                + "sex ='"+sex.getSelectedItem()+"',utype ='"+type.getSelectedItem()+"',"
                + "stats ='"+status.getSelectedItem()+"',"
                + "birthdate ='"+birthdate.getText()+"',Uimage = '"+destination+"' WHERE uid ='"+id.getText()+"'");
            displayData();
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
                    fname.setText("");
                    lname.setText("");
                    uname.setText("");
                    emaill.setText("");
                    birthdate.setText("");
                    image.setIcon(null);
        }
    }//GEN-LAST:event_savebttnMouseClicked

    private void editinfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editinfoMouseClicked
        int rowIndex = userstable.getSelectedRow();

        if (rowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select an item!");
        } else {
            try {
                dbconnect dbc = new dbconnect();
                TableModel tbl = userstable.getModel();
                ResultSet rs = dbc.getData("SELECT * FROM users WHERE uid = '" + tbl.getValueAt(rowIndex, 0) + "'");

                if (rs.next()) {

                    editpanel.setVisible(true);
                    id.setText(""+rs.getInt("uid"));
                    fname.setText(""+rs.getString("fname"));
                    lname.setText(""+rs.getString("lname"));
                    uname.setText(""+rs.getString("ussername"));
                    emaill.setText(""+rs.getString("useremail"));

                    sex.setSelectedItem(""+rs.getString("sex"));
                    status.setSelectedItem(""+rs.getString("stats"));
                    type.setSelectedItem(""+rs.getString("utype"));
                    birthdate.setText(""+rs.getString("birthdate"));
                    image.setIcon(ResizeImage(rs.getString("Uimage"),null,image));
                    oldpath = rs.getString("Uimage");
                    path = rs.getString("Uimage");
                    destination = rs.getString("Uimage");
                    
                    
                    
                }

            } catch (SQLException ex) {
                System.out.println("" + ex);
            }
        }
    }//GEN-LAST:event_editinfoMouseClicked

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

    private void sexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField birthdate;
    private javax.swing.JLabel editinfo;
    private javax.swing.JPanel editpanel;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel remove;
    private javax.swing.JLabel savebttn;
    private javax.swing.JComboBox<String> sex;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JTextField uname;
    private javax.swing.JTable userstable;
    // End of variables declaration//GEN-END:variables
}
