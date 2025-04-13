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
import config.passwordHasher;
import internalframes.adduser;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
                      String sql = "INSERT INTO candidates(fname, lname, mname, address, sex, nationality, occupation, email ,age,contact,position,term, year, month, day, date ,user_id)"
                               + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
      
    } else {
        JOptionPane.showMessageDialog(null, "Adding candidate failed, no rows affected.");
    }} catch (SQLException ex) {
                    Logger.getLogger(adduser.class.getName()).log(Level.SEVERE, null, ex);
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
        savebttn = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fname1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        nationality = new javax.swing.JTextField();
        occupation = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        positionn = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        sex = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        yearr = new javax.swing.JFormattedTextField();
        day = new javax.swing.JTextField();
        month = new javax.swing.JComboBox<>();

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

        jLabel10.setForeground(new java.awt.Color(153, 0, 0));
        jLabel10.setText("Firstname:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 110, 20));
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 290, 20));

        jLabel11.setForeground(new java.awt.Color(153, 0, 0));
        jLabel11.setText("Lastname:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 110, 20));
        getContentPane().add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 290, -1));

        jLabel9.setForeground(new java.awt.Color(153, 0, 0));
        jLabel9.setText("Middlename:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 110, 20));
        getContentPane().add(mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 290, 20));

        jLabel15.setForeground(new java.awt.Color(153, 0, 0));
        jLabel15.setText("Address");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 110, 20));
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 290, 20));

        jLabel14.setForeground(new java.awt.Color(153, 0, 0));
        jLabel14.setText("Nationality");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 110, 20));

        jLabel17.setForeground(new java.awt.Color(153, 0, 0));
        jLabel17.setText("Occupation");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 110, 20));

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

        fname1.setEnabled(false);
        getContentPane().add(fname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 80, 20));

        jLabel24.setForeground(new java.awt.Color(153, 0, 0));
        jLabel24.setText("Candidates ID:");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 110, 20));
        getContentPane().add(nationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 290, -1));

        occupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                occupationActionPerformed(evt);
            }
        });
        getContentPane().add(occupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 290, -1));

        jLabel18.setForeground(new java.awt.Color(153, 0, 0));
        jLabel18.setText("Contact number:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 100, 20));

        jLabel21.setForeground(new java.awt.Color(153, 0, 0));
        jLabel21.setText("Position:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 100, 20));
        getContentPane().add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 290, -1));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 290, -1));

        jLabel23.setForeground(new java.awt.Color(153, 0, 0));
        jLabel23.setText("Email:");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 100, 20));

        positionn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionnActionPerformed(evt);
            }
        });
        getContentPane().add(positionn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 140, -1));

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

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("FILING APPLICATION");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 140, 30));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 0, 0));
        jLabel26.setText("COMELEC");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, -1, 50));

        jLabel12.setForeground(new java.awt.Color(153, 0, 0));
        jLabel12.setText("Sex:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 50, 20));

        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male", "female", "others" }));
        sex.setPreferredSize(new java.awt.Dimension(57, 25));
        getContentPane().add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 80, 20));

        jLabel13.setForeground(new java.awt.Color(153, 0, 0));
        jLabel13.setText("Birthdate:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 70, 20));
        getContentPane().add(yearr, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 80, 20));
        getContentPane().add(day, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 70, -1));

        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        getContentPane().add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 80, -1));

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField day;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField fname1;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField mname;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JTextField nationality;
    private javax.swing.JTextField occupation;
    private javax.swing.JComboBox<String> positionn;
    private javax.swing.JLabel savebttn;
    private javax.swing.JComboBox<String> sex;
    private javax.swing.JFormattedTextField yearr;
    // End of variables declaration//GEN-END:variables
}
