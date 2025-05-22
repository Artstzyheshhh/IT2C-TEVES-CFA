/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reports;

import config.dbconnect;
import static User.edituser.getHeightFromWidth;
import java.awt.Color;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableColumnModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author acer
 */
public class tables extends javax.swing.JInternalFrame {

    /**
     * Creates new form pendinggs
     */
    public tables() {
        initComponents();

          
       this.setBorder(javax.swing. BorderFactory.createEmptyBorder(0,0,0,0)); 
       BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
       bi.setNorthPane (null);
       
       tables.getTableHeader().setOpaque(false);
       tables.getTableHeader().setBackground(new java.awt.Color(221,21,21));
       tables.getTableHeader().setForeground(Color.white);
    }
        
        public void displayUsers(){
       
        try{
            dbconnect dbc = new dbconnect();
            try (ResultSet rs = dbc.getData("SELECT * FROM users")) {
                tables.setModel(DbUtils.resultSetToTableModel(rs));
                tables.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            }
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

        }

    }
        public void displaycandidates(){
       
        try{
            dbconnect dbc = new dbconnect();
            try (ResultSet rs = dbc.getData("SELECT * FROM candidates")) {
                tables.setModel(DbUtils.resultSetToTableModel(rs));
                tables.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            }
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

        }

    }
        public void displaypartylist(){
       
        try{
            dbconnect dbc = new dbconnect();
            try (ResultSet rs = dbc.getData("SELECT * FROM partylist WHERE pid != 15;")) {
                tables.setModel(DbUtils.resultSetToTableModel(rs));
                tables.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                 tables.getTableHeader().repaint();
               TableColumnModel columnModel = tables.getColumnModel();
                columnModel.getColumn(0).setPreferredWidth(50);
                columnModel.getColumn(1).setPreferredWidth(101);
                columnModel.getColumn(2).setPreferredWidth(101);
                columnModel.getColumn(3).setPreferredWidth(101);
                columnModel.getColumn(4).setPreferredWidth(101);
                columnModel.getColumn(5).setPreferredWidth(101);
                columnModel.getColumn(6).setPreferredWidth(101);
                columnModel.getColumn(7).setPreferredWidth(101);
            }
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

        }

    }
        public void displayapplication(){
          try{
            dbconnect dbc = new dbconnect();
            
            try (ResultSet rs = dbc.getData(
                "SELECT applications.aid, candidates.lname, candidates.fname, " +
                "positions.position, partylist.pname,applications.status FROM applications " +
                "INNER JOIN candidates ON applications.cid = candidates.cid " +
                "INNER JOIN positions ON applications.ppid = positions.pid " +
                "INNER JOIN partylist ON applications.pid = partylist.pid " );) 
            {
                tables.setModel(DbUtils.resultSetToTableModel(rs));
                tables.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                TableColumnModel columnModel = tables.getColumnModel();
                
                columnModel.getColumn(0).setHeaderValue("ID");
                columnModel.getColumn(1).setHeaderValue("Lastname");
                columnModel.getColumn(2).setHeaderValue("Firstname");
                columnModel.getColumn(3).setHeaderValue("Position");
                columnModel.getColumn(4).setHeaderValue("pname");
                columnModel.getColumn(5).setHeaderValue("Status");
                tables.getTableHeader().repaint();
                columnModel.getColumn(0).setPreferredWidth(100);
                columnModel.getColumn(1).setPreferredWidth(142);
                columnModel.getColumn(2).setPreferredWidth(142);
                columnModel.getColumn(3).setPreferredWidth(142);
                columnModel.getColumn(4).setPreferredWidth(142);
                columnModel.getColumn(5).setPreferredWidth(142);
            }
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

        }
          
    } 
       public int pid;
public String pnme;
public boolean getids() {
    dbconnect dbc = new dbconnect();
    try {
        if (partylists.getSelectedItem() == null) {
            return false;
        }

        String selectedPartylist = partylists.getSelectedItem().toString();
        if (selectedPartylist.trim().isEmpty()) {
            return false;
        }

        String queryPartylist = "SELECT * FROM partylist WHERE pname = '" + selectedPartylist + "'";
        ResultSet rsPartylist = dbc.getData(queryPartylist);
        boolean valid = false;
        if (rsPartylist != null && rsPartylist.next()) {
            pid = rsPartylist.getInt("pid");
            pnme = rsPartylist.getString("pname");  // fix this, earlier you had pnme but queried pnme column?
            valid = true;
        } else {
        }
        return valid;
    } catch (SQLException ex) {
        System.out.println("SQL Error: " + ex);
        return false;
    }
}
public void displaypartymems() {

    if (getids()) {
        try {
            dbconnect dbc = new dbconnect();
            String sql = "SELECT applications.aid, candidates.lname, candidates.fname, "
                       + "positions.position, partylist.pname, applications.status "
                       + "FROM applications "
                       + "INNER JOIN candidates ON applications.cid = candidates.cid "
                       + "INNER JOIN positions ON applications.ppid = positions.pid "
                       + "INNER JOIN partylist ON applications.pid = partylist.pid "
                       + "WHERE partylist.pid = " + pid;  // compare by pid (int)

            ResultSet rs = dbc.getData(sql);
            tables.setModel(DbUtils.resultSetToTableModel(rs));
            tables.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            TableColumnModel columnModel = tables.getColumnModel();

            columnModel.getColumn(0).setHeaderValue("ID");
            columnModel.getColumn(1).setHeaderValue("Lastname");
            columnModel.getColumn(2).setHeaderValue("Firstname");
            columnModel.getColumn(3).setHeaderValue("Position");
            columnModel.getColumn(4).setHeaderValue("Partylist");
            columnModel.getColumn(5).setHeaderValue("Status");
            tables.getTableHeader().repaint();

            columnModel.getColumn(0).setPreferredWidth(100);
            columnModel.getColumn(1).setPreferredWidth(142);
            columnModel.getColumn(2).setPreferredWidth(142);
            columnModel.getColumn(3).setPreferredWidth(142);
            columnModel.getColumn(4).setPreferredWidth(142);
            columnModel.getColumn(5).setPreferredWidth(142);

            rs.close();

        } catch (SQLException ex) {
            System.out.println("Errors in displaypartymems(): " + ex.getMessage());
        }
    } else {
        System.out.println("Invalid partylist selected or no partylist found.");
    }
}   
          
       public void loadPartylist() {
    try {
         dbconnect dbc = new dbconnect();
        String sql = "SELECT pid, pname FROM partylist";
        PreparedStatement pst = dbc.connect.prepareStatement(sql);
        ResultSet Rss = pst.executeQuery();

        partylists.removeAllItems(); 
        while (Rss.next()) {
            String position = Rss.getString("pname");
            partylists.addItem(position);
        }

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error loading positions: " + ex.getMessage());
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

        jLabel26 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tables = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        tablechoice = new javax.swing.JComboBox<>();
        partylists = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

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

        jLabel26.setBackground(new java.awt.Color(255, 153, 102));
        jLabel26.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("  TABLES");
        jLabel26.setOpaque(true);
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 780, 40));

        tables.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tables);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 780, 350));

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

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, -30, 110, 35));

        jPanel4.setPreferredSize(new java.awt.Dimension(800, 30));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 800, 35));

        tablechoice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Users", "Candidates", "Partylist", "Applications" }));
        tablechoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tablechoiceActionPerformed(evt);
            }
        });
        getContentPane().add(tablechoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 170, 20));

        partylists.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        partylists.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partylistsActionPerformed(evt);
            }
        });
        getContentPane().add(partylists, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 150, -1));

        jLabel1.setText("Partylist");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 50, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablechoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tablechoiceActionPerformed
        if(tablechoice.getSelectedItem().toString().equals("Users")){
        displayUsers();
         partylists.setVisible(false);
         jLabel1.setVisible(false);
        return;
        } if(tablechoice.getSelectedItem().toString().equals("Candidates")){
        displaycandidates();
         partylists.setVisible(false);
         jLabel1.setVisible(false);
        return;
        }if(tablechoice.getSelectedItem().toString().equals("Partylist")){
        displaypartylist();
         partylists.setVisible(false);
         jLabel1.setVisible(false);
        return;
        }if(tablechoice.getSelectedItem().toString().equals("Applications")){
        loadPartylist();
        displayapplication();

        partylists.setVisible(true);
        jLabel1.setVisible(true);
        }
    }//GEN-LAST:event_tablechoiceActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
         displayUsers();
         partylists.setVisible(false);
         jLabel1.setVisible(false);
    }//GEN-LAST:event_formInternalFrameOpened

    private void partylistsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partylistsActionPerformed
        displaypartymems();
    }//GEN-LAST:event_partylistsActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        displayUsers();
        
    }//GEN-LAST:event_formInternalFrameActivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> partylists;
    private javax.swing.JComboBox<String> tablechoice;
    private javax.swing.JTable tables;
    // End of variables declaration//GEN-END:variables
}
