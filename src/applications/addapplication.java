/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applications;

import com.mysql.jdbc.Statement;
import config.Session;
import config.dbconnect;
import User.adduser;
import static User.edituser.getHeightFromWidth;
import java.awt.Color;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
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
public class addapplication extends javax.swing.JInternalFrame {

    /**
     * Creates new form addapplication
     */
    public addapplication() {
        initComponents();
              this.setBorder(javax.swing. BorderFactory.createEmptyBorder(0,0,0,0)); 
       BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
       bi.setNorthPane (null);
       displayData();
        candidatestable.getTableHeader().setOpaque(false);
       candidatestable.getTableHeader().setBackground(new java.awt.Color(221,21,21));
       candidatestable.getTableHeader().setForeground(Color.white);
    }
        public void loadPositions() {
    try {
         dbconnect dbc = new dbconnect();
        String sql = "SELECT  position FROM positions";
        PreparedStatement pst = dbc.connect.prepareStatement(sql);
        ResultSet rss = pst.executeQuery();

        
        positionn.removeAllItems();
 

        while (rss.next()) {
            String position = rss.getString("position");
            positionn.addItem(position);
        }

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error loading positions: " + ex.getMessage());
    }
}   
    public void loadPartylist() {
    try {
         dbconnect dbc = new dbconnect();
        String sql = "SELECT pid, pname FROM partylist";
        PreparedStatement pst = dbc.connect.prepareStatement(sql);
        ResultSet Rss = pst.executeQuery();
        
        
        partylist.removeAllItems();
        
        while (Rss.next()) {
            String position = Rss.getString("pname");
            partylist.addItem(position);
        }

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error loading positions: " + ex.getMessage());
    }
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
        
   
     public static int pid,ppid, Age;
    
     public boolean getids(){ 
       dbconnect dbc = new dbconnect();
     try {    
             
        String queryPartylist = "SELECT * FROM partylist WHERE pname = '" + partylist.getSelectedItem().toString() + "'";
        String queryPosition = "SELECT * FROM positions WHERE position = '" + positionn.getSelectedItem().toString() + "'";
        String queryCandidate = "SELECT * FROM candidates WHERE cid = '" + cid.getText() + "'";

        ResultSet rsPartylist = dbc.getData(queryPartylist);
        ResultSet rsPosition = dbc.getData(queryPosition);
        ResultSet rsCandidate = dbc.getData(queryCandidate);

        boolean valid = true;

        if (rsPartylist.next()) {
            pid = rsPartylist.getInt("pid");
        } else {
            System.out.println(""+pid);
            valid = false;
        }

        if (rsPosition.next()) {
            ppid = rsPosition.getInt("pid");
        } else {
            
            valid = false;
        }

        if (rsCandidate.next()) {
            Age = rsCandidate.getInt("age");
           
        } else {
            
            valid = false;
        }

        return valid;
        } catch (SQLException ex) {
            System.out.println(""+ex);
            return false;
        }    
    }      
    
        public void displayData(){
        try{
            dbconnect dbc = new dbconnect();
            String stats = "Incomplete";
            try (ResultSet rs = dbc.getData("SELECT cid, lname, fname,age FROM candidates WHERE status = '"+stats+"'")) {
                candidatestable.setModel(DbUtils.resultSetToTableModel(rs));
                candidatestable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                TableColumnModel columnModel = candidatestable.getColumnModel();
                
                columnModel.getColumn(0).setHeaderValue("ID");
                columnModel.getColumn(1).setHeaderValue("Lastname");
                columnModel.getColumn(2).setHeaderValue("Firstname");
                columnModel.getColumn(3).setHeaderValue("Age");
                
                candidatestable.getTableHeader().repaint();
                columnModel.getColumn(0).setPreferredWidth(50);
                columnModel.getColumn(1).setPreferredWidth(130);
                columnModel.getColumn(2).setPreferredWidth(130);
                columnModel.getColumn(3).setPreferredWidth(50);
            }
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

        }

    }
        
        public void addapplication(){
         try{
         
         Session sess = Session.getInstance();   
         dbconnect dbc = new dbconnect(); 
         if (getids()){
             System.out.println("add"+pid+""+Age);
           
          int lastInsertedId = -1;
            String sql = "INSERT INTO applications(uid,cid,pid,ppid,status,date) VALUES (?,?,?,?,?,?)";
                PreparedStatement pst = dbc.connect.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                pst.setInt(1, sess.getId());
                pst.setString(2,cid.getText());
                pst.setInt(3,pid );
                pst.setInt(4, ppid);
                pst.setString(5, "Qualified");
                pst.setString(6, LocalDateTime.now().toString());
                
              int affectedRows = pst.executeUpdate();
    
          if (affectedRows > 0) {
        // Now retrieve the generated key
        try (ResultSet generatedKeys = pst.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                lastInsertedId = generatedKeys.getInt(1);
            }
        } 
        String stats = "Completed";
        dbc.updateData("UPDATE candidates SET status = '"+stats+"' WHERE cid = '"+cid.getText()+"'");
        String actionn = "Added COC application with ID No.: " + lastInsertedId;
        dbc.insertData("INSERT INTO logs(user_id, action, date) VALUES ('" + sess.getId() + "', '" + actionn + "', '" + LocalDateTime.now() + "')");

        lname.setText("");
        lname.setText("");
        fname.setText("");
        cid.setText("");
        age.setText("");
        image.setIcon(null);
    } else {
        JOptionPane.showMessageDialog(null, "Adding application failed, no rows affected.");
    }}
                   } catch (SQLException ex) {
                    Logger.getLogger(adduser.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel10 = new javax.swing.JLabel();
        mname = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        savebttn = new javax.swing.JLabel();
        clearr = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        fname = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cid = new javax.swing.JLabel();
        select = new javax.swing.JLabel();
        partylist = new javax.swing.JComboBox<>();
        positionn = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        candidatestable = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

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
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setForeground(new java.awt.Color(204, 0, 0));
        jLabel10.setText("Firstname:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 80, 20));

        mname.setForeground(new java.awt.Color(204, 0, 0));
        mname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jPanel2.add(mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 240, 20));

        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("partylist");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 80, 20));

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
        image.setBounds(0, 0, 100, 100);

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 100, 100));

        jLabel26.setBackground(new java.awt.Color(255, 153, 102));
        jLabel26.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("  ADD APPLICATION");
        jLabel26.setOpaque(true);
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 40));

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
        jPanel2.add(savebttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 90, 20));

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
        jPanel2.add(clearr, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 90, 20));

        jLabel16.setForeground(new java.awt.Color(204, 0, 0));
        jLabel16.setText("Lastname:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 80, 20));

        lname.setForeground(new java.awt.Color(204, 0, 0));
        lname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jPanel2.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 240, 20));

        fname.setForeground(new java.awt.Color(204, 0, 0));
        fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jPanel2.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 240, 20));

        jLabel17.setForeground(new java.awt.Color(204, 0, 0));
        jLabel17.setText("ID:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 70, 20));

        cid.setForeground(new java.awt.Color(204, 0, 0));
        cid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jPanel2.add(cid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 210, 20));

        select.setBackground(new java.awt.Color(204, 0, 0));
        select.setForeground(new java.awt.Color(255, 255, 255));
        select.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        select.setText("Select");
        select.setOpaque(true);
        select.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectMouseClicked(evt);
            }
        });
        jPanel2.add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 90, 20));

        jPanel2.add(partylist, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 240, 20));

        jPanel2.add(positionn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 240, 20));

        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setText("Position:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 80, 20));

        jLabel12.setForeground(new java.awt.Color(204, 0, 0));
        jLabel12.setText("Middlename:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 80, 20));

        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setText("age");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 80, 20));

        age.setForeground(new java.awt.Color(204, 0, 0));
        age.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jPanel2.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 240, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 390, 430));

        candidatestable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        candidatestable.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(candidatestable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 380, 390));

        jLabel27.setBackground(new java.awt.Color(255, 153, 102));
        jLabel27.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText(" SELECT CANDIDATE");
        jLabel27.setOpaque(true);
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 380, 40));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMouseClicked
        
    }//GEN-LAST:event_imageMouseClicked

    private void imageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMouseEntered

    }//GEN-LAST:event_imageMouseEntered

    private void savebttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebttnMouseClicked
         
        String position = positionn.getSelectedItem().toString();
        
    if (getids()) {
    // Check if candidate's age is valid (between 16 and 59)
    if(cid.getText().isEmpty()){
     JOptionPane.showMessageDialog(null, "No candidate selected yet!");
    }
    if (Age < 16 || Age >= 60) {
        JOptionPane.showMessageDialog(null, "Candidate must be between 16 and 59 years old.");
        return;
    }
    
    // Check if candidate is below 21 years old
    if (Age < 24) {
        if (!position.equals("SK chairman") && !position.equals("SK councilor")) {
            JOptionPane.showMessageDialog(null, "Candidates aged 24 and below can only run as SK chairman or SK councilor.");
        } else {
            addapplication();  // Valid case for SK chairman or SK councilor
        }
        return; // Exit after check
    }

    // Check if candidate is 21 or above
    if (Age >= 24) {
        if (position.equals("SK chairman") || position.equals("SK councilor")) {
            JOptionPane.showMessageDialog(null, "Candidates aged 24 and above cannot run as SK chairman or SK councilor.");
        } else {
            addapplication();  // Valid case for other positions
        }
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

    private void clearrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearrMouseClicked
        lname.setText("");
        lname.setText("");
        fname.setText("");
        cid.setText("");
        age.setText("");
        image.setIcon(null);
    }//GEN-LAST:event_clearrMouseClicked

    private void selectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectMouseClicked
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
                    age.setText(""+rs.getString("age"));

                    image.setIcon(ResizeImage(rs.getString("cimage"),null,image));
                    
                }

            } catch (SQLException ex) {
                System.out.println("" + ex);
            }
        }
    }//GEN-LAST:event_selectMouseClicked

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        loadPositions();
       loadPartylist();
    }//GEN-LAST:event_formInternalFrameActivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JTable candidatestable;
    private javax.swing.JLabel cid;
    private javax.swing.JLabel clearr;
    private javax.swing.JLabel fname;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lname;
    private javax.swing.JLabel mname;
    private javax.swing.JComboBox<String> partylist;
    private javax.swing.JComboBox<String> positionn;
    private javax.swing.JLabel savebttn;
    private javax.swing.JLabel select;
    // End of variables declaration//GEN-END:variables
}
