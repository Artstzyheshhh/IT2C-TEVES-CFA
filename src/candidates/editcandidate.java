/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidates;


import static candidates.addcandidate.cmail;
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
public class editcandidate extends javax.swing.JInternalFrame {

    /**
     * Creates new form editcandidate
     */
    public editcandidate() {
        initComponents();
        displayData();
        
          this.setBorder(javax.swing. BorderFactory.createEmptyBorder(0,0,0,0)); 
       BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
       bi.setNorthPane (null);
       
       candidatestable.getTableHeader().setOpaque(false);
       candidatestable.getTableHeader().setBackground(new java.awt.Color(221,21,21));
       candidatestable.getTableHeader().setForeground(Color.white);
     
    }
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
      
      public void displayData(){
        try{
            dbconnect dbc = new dbconnect();
            try (ResultSet rs = dbc.getData("SELECT cid, lname, fname FROM candidates")) {
                candidatestable.setModel(DbUtils.resultSetToTableModel(rs));
                candidatestable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                TableColumnModel columnModel = candidatestable.getColumnModel();
                
                columnModel.getColumn(0).setHeaderValue("ID");
                columnModel.getColumn(1).setHeaderValue("Lastname");
                columnModel.getColumn(2).setHeaderValue("Firstname");
                
                // Apply header changes
                candidatestable.getTableHeader().repaint();
                columnModel.getColumn(0).setPreferredWidth(50);
                columnModel.getColumn(1).setPreferredWidth(160);
                columnModel.getColumn(2).setPreferredWidth(160);
            }
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        mname = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        sex = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cid = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        nationality = new javax.swing.JTextField();
        occupation = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        remove = new javax.swing.JLabel();
        savebttn = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        editinfo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        candidatestable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, -30, 110, 35));

        jPanel3.setPreferredSize(new java.awt.Dimension(800, 30));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 800, 35));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setForeground(new java.awt.Color(153, 0, 0));
        jLabel10.setText("Firstname:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 220, 20));
        jPanel4.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 210, 20));

        jLabel11.setForeground(new java.awt.Color(153, 0, 0));
        jLabel11.setText("Lastname:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 220, 20));
        jPanel4.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 210, -1));

        jLabel9.setForeground(new java.awt.Color(153, 0, 0));
        jLabel9.setText("Middlename:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 220, 20));
        jPanel4.add(mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 210, 20));

        jLabel15.setForeground(new java.awt.Color(153, 0, 0));
        jLabel15.setText("Address");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 80, 20));
        jPanel4.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 270, 20));

        jLabel12.setForeground(new java.awt.Color(153, 0, 0));
        jLabel12.setText("Sex:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 60, 20));

        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male", "female", "others" }));
        sex.setPreferredSize(new java.awt.Dimension(57, 25));
        jPanel4.add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 90, 20));

        jLabel14.setForeground(new java.awt.Color(153, 0, 0));
        jLabel14.setText("Nationality");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 80, 20));

        jLabel17.setForeground(new java.awt.Color(153, 0, 0));
        jLabel17.setText("Occupation");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 80, 20));

        cid.setEnabled(false);
        cid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidActionPerformed(evt);
            }
        });
        jPanel4.add(cid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 100, 20));

        jLabel24.setForeground(new java.awt.Color(153, 0, 0));
        jLabel24.setText(" ID:");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 70, 20));
        jPanel4.add(nationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 270, -1));
        jPanel4.add(occupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 270, -1));

        jLabel18.setForeground(new java.awt.Color(153, 0, 0));
        jLabel18.setText("Contact No.:");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 80, 20));
        jPanel4.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 270, -1));
        jPanel4.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 270, -1));

        jLabel23.setForeground(new java.awt.Color(153, 0, 0));
        jLabel23.setText("Email:");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 80, 20));

        jLabel26.setBackground(new java.awt.Color(255, 153, 102));
        jLabel26.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText(" UPDATE CANDIDATE INFO");
        jLabel26.setOpaque(true);
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 40));

        jPanel6.setLayout(null);

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
        jPanel6.add(image);
        image.setBounds(0, 0, 140, 130);

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 140, 130));

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
        jPanel4.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 140, 20));

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
        jPanel4.add(savebttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 90, 20));

        jLabel8.setBackground(new java.awt.Color(204, 0, 0));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Clear all");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));
        jLabel8.setOpaque(true);
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 90, 20));

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
        jPanel4.add(editinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 90, 20));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 430));

        candidatestable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        candidatestable.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(candidatestable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 380, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editinfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editinfoMouseClicked
        int rowIndex = candidatestable.getSelectedRow();

        if (rowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select an item!");
        } else {
            try {
                dbconnect dbc = new dbconnect();
                TableModel tbl = candidatestable.getModel();
                ResultSet rs = dbc.getData("SELECT * FROM candidates WHERE cid = '" + tbl.getValueAt(rowIndex, 0) + "'");

                if (rs.next()) {

                    cid.setText(""+rs.getInt("cid"));
                    fname.setText(""+rs.getString("lname"));
                    lname.setText(""+rs.getString("lname"));
                    mname.setText(""+rs.getString("mname"));
                    address.setText(""+rs.getString("address"));
                    sex.setSelectedItem(""+rs.getString("sex"));
                    nationality.setText(""+rs.getString("nationality"));
                    occupation.setText(""+rs.getString("occupation"));
                    contact.setText(""+rs.getString("contact"));
                    email.setText(""+rs.getString("email"));
                    
                    image.setIcon(ResizeImage(rs.getString("cimage"),null,image));
                    oldpath = rs.getString("cimage");
                    path = rs.getString("cimage");
                    destination = rs.getString("cimage");
                }

            } catch (SQLException ex) {
                System.out.println("" + ex);
            }
        }
    }//GEN-LAST:event_editinfoMouseClicked

    private void savebttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebttnMouseClicked

        Session sess = Session.getInstance();
        dbconnect dbc = new dbconnect();
        String emailInput = email.getText();
        if(fname.getText() .isEmpty() || lname.getText().isEmpty()
            ||mname.getText() .isEmpty()
            || address.getText() .isEmpty()
            ||nationality.getText().isEmpty()
            ||occupation.getText().isEmpty()
            ||contact.getText().isEmpty()
            ||email.getText().isEmpty())

        {JOptionPane.showMessageDialog(null,"all field are required");
        }   
        else if (!isValidEmail(emailInput)) {
            
        }
        
        else if(duplicatecheck()){
            System.out.println("duplicate exist");

        }
        else if(duplicatecheck()){
        }
        else if (!contact.getText().matches("-?\\d+")) {
            JOptionPane.showMessageDialog(null,"integers only");
        }
        else {

            dbc.updateData("UPDATE candidates SET fname ='"+fname.getText()+"',lname ='"+lname.getText()+"',"
                + "mname ='"+mname.getText()+"',address ='"+address.getText()+"',email = '"+email.getText()+"',"
                + "sex ='"+sex.getSelectedItem()+"',nationality ='"+nationality.getText()+"',"
                + "contact ='"+contact.getText()+"',occupation = '"+occupation.getText()+"',"
                +"cimage = '"+destination+"' "
                + " WHERE cid ='"+cid.getText()+"'");
            
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
             
            String actionn = "Updated candidate with ID No.: " + cid.getText();
            dbc.insertData("INSERT INTO logs(user_id, action, date) VALUES ('" + sess.getId() + "', '" + actionn + "', '" + LocalDateTime.now() + "')");
            JOptionPane.showMessageDialog(null,"Candidate updated successfully.");
                cid.setText("");
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

    private void cidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTable candidatestable;
    private javax.swing.JTextField cid;
    private javax.swing.JTextField contact;
    private javax.swing.JLabel editinfo;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField mname;
    private javax.swing.JTextField nationality;
    private javax.swing.JTextField occupation;
    private javax.swing.JLabel remove;
    private javax.swing.JLabel savebttn;
    private javax.swing.JComboBox<String> sex;
    // End of variables declaration//GEN-END:variables

    
}
