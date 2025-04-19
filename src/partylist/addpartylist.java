/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partylist;


import com.mysql.jdbc.Statement;
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
import java.nio.file.StandardCopyOption;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableColumnModel;
import net.proteanit.sql.DbUtils;

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
       
       tablereps.getTableHeader().setOpaque(false);
       tablereps.getTableHeader().setBackground(new java.awt.Color(221,21,21));
       tablereps.getTableHeader().setForeground(Color.white);
       
       displayData();
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
    
    public void loadreps() {
    try {
         dbconnect dbc = new dbconnect();
         String pos = "Representative";
         
        String sql = "SELECT cid FROM candidates WHERE p_id = '"+ 0 +"' AND position = '"+ pos +"'";
        PreparedStatement pst = dbc.connect.prepareStatement(sql);
        ResultSet rss = pst.executeQuery();

        // Optional: clear previous items
        representative1.removeAllItems();
        representative2.removeAllItems();
        representative3.removeAllItems();
        representative4.removeAllItems(); 
        representative5.removeAllItems();
          
        // Optional: add default item
        

        while (rss.next()) {
            String reps = rss.getString("cid");
            
            representative1.addItem(reps);     
            representative2.addItem(reps);     
            representative3.addItem(reps);          
            representative4.addItem(reps);
            representative5.addItem(reps);
            
        }

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error loading positions: " + ex.getMessage());
    }
}
      public void displayData(){
        try{
            String pos = "Representative";
            dbconnect dbc = new dbconnect();
            ResultSet rs = dbc.getData("SELECT cid, lname,fname FROM candidates WHERE p_id = '"+ 0 +"' AND position = '"+ pos +"'");
            tablereps.setModel(DbUtils.resultSetToTableModel(rs));
             tablereps.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
               TableColumnModel columnModel = tablereps.getColumnModel();     
               
               columnModel.getColumn(0).setHeaderValue("ID");
               columnModel.getColumn(1).setHeaderValue("Lastname");
               columnModel.getColumn(2).setHeaderValue("Firstname");

        // Apply header changes
              tablereps.getTableHeader().repaint();
                columnModel.getColumn(0).setPreferredWidth(50); 
                columnModel.getColumn(1).setPreferredWidth(160); 
                columnModel.getColumn(2).setPreferredWidth(160); 
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

        }

    }
      
    public boolean repcheck() {
    JComboBox[] reps = {representative1, representative2, representative3, representative4, representative5};
    Set<Object> used = new HashSet<>();
    boolean changed = false;

    for (int i = 0; i < reps.length; i++) {
        Object selected = reps[i].getSelectedItem();

        if (used.contains(selected)) {
            // Find a new item not used yet
            ComboBoxModel model = reps[i].getModel();
            for (int j = 0; j < model.getSize(); j++) {
                Object candidate = model.getElementAt(j);
                if (!used.contains(candidate)) {
                    reps[i].setSelectedItem(candidate);
                    selected = candidate;
                    changed = true;
                    JOptionPane.showMessageDialog(null, 
                        "Representative " + (i + 1) + " selection was already used.\n" +
                        "Automatically changed to an available ID: " + candidate);
                    break;
                }
            }
        }

        used.add(selected);
    }

    return changed;
}
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
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
        representative4 = new javax.swing.JComboBox<>();
        remove = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        savebttn = new javax.swing.JLabel();
        clear = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        representative1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        representative2 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        representative3 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        representative5 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablereps = new javax.swing.JTable();
        refresh = new javax.swing.JLabel();

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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Platform:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 180, 20));

        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Partylist name:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 130, 20));

        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Shortname:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 130, 20));

        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Representative 4:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 120, 20));

        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Contact no :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 90, 20));

        platform.setColumns(20);
        platform.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        platform.setRows(5);
        jScrollPane1.setViewportView(platform);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 220, 190));
        jPanel3.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 230, -1));

        acronym.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acronymActionPerformed(evt);
            }
        });
        jPanel3.add(acronym, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 230, -1));

        pname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnameActionPerformed(evt);
            }
        });
        jPanel3.add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 230, -1));

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
        image.setBounds(0, 0, 110, 100);

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 110, 100));

        representative4.setOpaque(false);
        representative4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                representative4ItemStateChanged(evt);
            }
        });
        representative4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                representative4MouseClicked(evt);
            }
        });
        representative4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                representative4ActionPerformed(evt);
            }
        });
        jPanel3.add(representative4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 120, 20));

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
        jPanel3.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 110, 20));

        jLabel31.setBackground(new java.awt.Color(255, 153, 102));
        jLabel31.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText(" ADD PARTYLIST");
        jLabel31.setOpaque(true);
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 40));

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
        jPanel3.add(savebttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 90, 20));

        clear.setBackground(new java.awt.Color(204, 0, 0));
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clear.setText("Clear all");
        clear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));
        clear.setOpaque(true);
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });
        jPanel3.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 90, 20));

        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("Representative 2:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 120, 20));

        representative1.setOpaque(false);
        representative1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                representative1ItemStateChanged(evt);
            }
        });
        representative1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                representative1MouseClicked(evt);
            }
        });
        representative1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                representative1ActionPerformed(evt);
            }
        });
        jPanel3.add(representative1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 120, 20));

        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("Representative 1:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 120, 20));

        representative2.setOpaque(false);
        representative2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                representative2ItemStateChanged(evt);
            }
        });
        representative2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                representative2MouseClicked(evt);
            }
        });
        representative2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                representative2ActionPerformed(evt);
            }
        });
        jPanel3.add(representative2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 120, 20));

        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("Representative 3:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 120, 20));

        representative3.setOpaque(false);
        representative3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                representative3ItemStateChanged(evt);
            }
        });
        representative3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                representative3MouseClicked(evt);
            }
        });
        representative3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                representative3ActionPerformed(evt);
            }
        });
        jPanel3.add(representative3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 120, 20));

        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("Representative 5:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 120, 20));

        representative5.setOpaque(false);
        representative5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                representative5ItemStateChanged(evt);
            }
        });
        representative5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                representative5MouseClicked(evt);
            }
        });
        representative5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                representative5ActionPerformed(evt);
            }
        });
        jPanel3.add(representative5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 120, -1));

        tablereps.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablereps);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 380, 330));

        refresh.setBackground(new java.awt.Color(204, 0, 0));
        refresh.setForeground(new java.awt.Color(255, 255, 255));
        refresh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        refresh.setText("Refresh");
        refresh.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));
        refresh.setOpaque(true);
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
        });
        jPanel3.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 90, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void savebttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebttnMouseClicked
        dbconnect dbc = new dbconnect();
        Session sess = Session.getInstance();
       if(pname.getText().isEmpty()||contact.getText().isEmpty()||platform.getText().isEmpty()|| acronym.getText().isEmpty()){
       JOptionPane.showMessageDialog(null,"all field are required");
       } 
       else if (!contact.getText().matches("-?\\d+")) {
                JOptionPane.showMessageDialog(null,"Contact should be integers only");
                contact.setText("");
       } else if (!(contact.getText().length() <= 11)){ 
                JOptionPane.showMessageDialog(null,"contact should exceed 11 digits");
                contact.setText("");
       } else if(repcheck()){}
       
       else{
       try{
                   
               int lastInsertedId = -1;
               String sql = "INSERT INTO partylist(pname,shortname, contact, platform, logo, rep1, rep2, rep3, rep4, rep5, date, user_id)"
                       + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

                PreparedStatement pst = dbc.connect.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

                // Use prepared statements properly with parameters
                pst.setString(1, pname.getText());
                pst.setString(2, acronym.getText());
                pst.setString(3, contact.getText());
                pst.setString(4, platform.getText());
                pst.setString(5, destination);
                pst.setString(6, representative1.getSelectedItem().toString());
                pst.setString(7, representative2.getSelectedItem().toString());
                pst.setString(8, representative3.getSelectedItem().toString());
                pst.setString(9, representative4.getSelectedItem().toString());
                pst.setString(10, representative5.getSelectedItem().toString());
                pst.setString(11, LocalDateTime.now().toString());
                pst.setInt(12, sess.getId());
              int affectedRows = pst.executeUpdate();
    
          if (affectedRows > 0) {
        // Now retrieve the generated key
        try (ResultSet generatedKeys = pst.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                lastInsertedId = generatedKeys.getInt(1);
                
                dbc.insertData("UPDATE candidates SET p_id = '"+lastInsertedId+"' WHERE cid = '"+representative1.getSelectedItem()+"'");
                dbc.insertData("UPDATE candidates SET p_id = '"+lastInsertedId+"' WHERE cid = '"+representative2.getSelectedItem()+"'");
                dbc.insertData("UPDATE candidates SET p_id = '"+lastInsertedId+"' WHERE cid = '"+representative3.getSelectedItem()+"'");
                dbc.insertData("UPDATE candidates SET p_id = '"+lastInsertedId+"' WHERE cid = '"+representative4.getSelectedItem()+"'");
                dbc.insertData("UPDATE candidates SET p_id = '"+lastInsertedId+"' WHERE cid = '"+representative5.getSelectedItem()+"'");
            }
        }
        
        
        String actionn = "Added partylist with ID no.: " + lastInsertedId;
        dbc.insertData("INSERT INTO logs(user_id, action, date) VALUES ('" + sess.getId() + "', '" + actionn + "', '" + LocalDateTime.now() + "')");
        
        JOptionPane.showMessageDialog(null, "partylist added successfully.");
        
        pname.setText("");
        acronym.setText("");
        contact.setText("");
        platform.setText("");
        image.setIcon(null);
         
    } else {
        JOptionPane.showMessageDialog(null, "Creating user failed, no rows affected.");
    }} catch (SQLException ex) {
                    Logger.getLogger(adduser.class.getName()).log(Level.SEVERE, null, ex);
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

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
         pname.setText("");
        acronym.setText("");
        contact.setText("");
        platform.setText("");
        image.setIcon(null);
    }//GEN-LAST:event_clearMouseClicked

    private void removeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeMouseClicked
       image.setIcon(null);
    }//GEN-LAST:event_removeMouseClicked

    private void representative4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_representative4ActionPerformed
        
    }//GEN-LAST:event_representative4ActionPerformed

    private void representative1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_representative1ActionPerformed
        
    }//GEN-LAST:event_representative1ActionPerformed

    private void representative2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_representative2ActionPerformed
        
    }//GEN-LAST:event_representative2ActionPerformed

    private void representative3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_representative3ActionPerformed
        
    }//GEN-LAST:event_representative3ActionPerformed

    private void representative5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_representative5ActionPerformed
        
    }//GEN-LAST:event_representative5ActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        loadreps();
    }//GEN-LAST:event_formInternalFrameActivated

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
       
        
      
       
    }//GEN-LAST:event_refreshMouseClicked

    private void representative1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_representative1MouseClicked
        
    }//GEN-LAST:event_representative1MouseClicked

    private void representative2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_representative2MouseClicked
        
    }//GEN-LAST:event_representative2MouseClicked

    private void representative3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_representative3MouseClicked
       
    }//GEN-LAST:event_representative3MouseClicked

    private void representative4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_representative4MouseClicked
        
    }//GEN-LAST:event_representative4MouseClicked

    private void representative5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_representative5MouseClicked
         
    }//GEN-LAST:event_representative5MouseClicked

    private void representative1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_representative1ItemStateChanged

    }//GEN-LAST:event_representative1ItemStateChanged

    private void representative2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_representative2ItemStateChanged
        
    }//GEN-LAST:event_representative2ItemStateChanged

    private void representative3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_representative3ItemStateChanged
        
    }//GEN-LAST:event_representative3ItemStateChanged

    private void representative4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_representative4ItemStateChanged
        
    }//GEN-LAST:event_representative4ItemStateChanged

    private void representative5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_representative5ItemStateChanged
        
    }//GEN-LAST:event_representative5ItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField acronym;
    private javax.swing.JLabel clear;
    private javax.swing.JTextField contact;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea platform;
    private javax.swing.JTextField pname;
    private javax.swing.JLabel refresh;
    private javax.swing.JLabel remove;
    private javax.swing.JComboBox<String> representative1;
    private javax.swing.JComboBox<String> representative2;
    private javax.swing.JComboBox<String> representative3;
    private javax.swing.JComboBox<String> representative4;
    private javax.swing.JComboBox<String> representative5;
    private javax.swing.JLabel savebttn;
    private javax.swing.JTable tablereps;
    // End of variables declaration//GEN-END:variables
}
