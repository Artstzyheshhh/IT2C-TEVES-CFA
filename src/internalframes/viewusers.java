/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalframes;

import config.Session;
import config.dbconnect;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author acer
 */
public class viewusers extends javax.swing.JInternalFrame {

    /**
     * Creates new form viewusers
     */
    public viewusers() {
        initComponents();
        
        displayData();
        
       this.setBorder(javax.swing. BorderFactory.createEmptyBorder(0,0,0,0)); 
       BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
       bi.setNorthPane (null);
       
       userstable.getTableHeader().setOpaque(false);
       userstable.getTableHeader().setBackground(new java.awt.Color(221,21,21));
       userstable.getTableHeader().setForeground(Color.white);
    }
public void displayData(){
        try{
            dbconnect dbc = new dbconnect();
            ResultSet rs = dbc.getData("SELECT uid, lname, utype FROM users");
            userstable.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        userstable = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        infopanel = new javax.swing.JPanel();
        fname = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        accountid = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        sexx = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        usertype = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        birthdate = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        viewdetails = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        userstable.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(userstable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 420, 340));

        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("  search");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 190, -1));

        infopanel.setBackground(new java.awt.Color(255, 255, 255));
        infopanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        infopanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fname.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        fname.setForeground(new java.awt.Color(204, 0, 0));
        fname.setText("Fname");
        infopanel.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 170, 20));

        username.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        username.setForeground(new java.awt.Color(204, 0, 0));
        username.setText("username");
        infopanel.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 170, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("Username:");
        infopanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 70, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Account ID:");
        infopanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 70, 20));

        email.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        email.setForeground(new java.awt.Color(204, 0, 0));
        email.setText("Email");
        infopanel.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 170, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Firstname:");
        infopanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("Lastname:");
        infopanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 70, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("Email:");
        infopanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 70, 20));

        accountid.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        accountid.setForeground(new java.awt.Color(204, 0, 0));
        accountid.setText("Account ID:");
        infopanel.add(accountid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 170, 20));

        lname.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lname.setForeground(new java.awt.Color(204, 0, 0));
        lname.setText("Lname");
        infopanel.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 170, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("Sex:");
        infopanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 70, 20));

        sexx.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        sexx.setForeground(new java.awt.Color(204, 0, 0));
        sexx.setText("Sex");
        infopanel.add(sexx, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 170, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 0));
        jLabel10.setText("User type:");
        infopanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 70, 20));

        usertype.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        usertype.setForeground(new java.awt.Color(204, 0, 0));
        usertype.setText("User type");
        infopanel.add(usertype, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 170, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setText("birthdate:");
        infopanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 70, 20));

        birthdate.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        birthdate.setForeground(new java.awt.Color(204, 0, 0));
        birthdate.setText("birthdate");
        infopanel.add(birthdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 170, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setText("status:");
        infopanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 70, 20));

        status.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        status.setForeground(new java.awt.Color(204, 0, 0));
        status.setText("status");
        infopanel.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 170, 20));

        getContentPane().add(infopanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 340, 340));

        viewdetails.setBackground(new java.awt.Color(204, 0, 0));
        viewdetails.setForeground(new java.awt.Color(255, 255, 255));
        viewdetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewdetails.setText("view details");
        viewdetails.setOpaque(true);
        viewdetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewdetailsMouseClicked(evt);
            }
        });
        getContentPane().add(viewdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 90, 20));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void viewdetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewdetailsMouseClicked
        Session sess = Session.getInstance();
        int rowIndex = userstable.getSelectedRow();

        if (rowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select an item!");
        }else {
            try {
                dbconnect dbc = new dbconnect();
                TableModel tbl = userstable.getModel();
                ResultSet rs = dbc.getData("SELECT * FROM users WHERE uid = '" + tbl.getValueAt(rowIndex, 0) + "'");

                if (rs.next()) {
                    accountid.setText(""+rs.getInt("uid"));
                    fname.setText(""+rs.getString("fname"));
                    lname.setText(""+rs.getString("lname"));
                    email.setText(""+rs.getString("useremail"));
                    sexx.setText(""+rs.getString("sex"));
                    usertype.setText(""+rs.getString("utype"));
                    status.setText(""+rs.getString("stats"));
                    username.setText(""+rs.getString("ussername"));
                    birthdate.setText(""+rs.getString("birthdate"));
                }

            } catch (SQLException ex) {
                System.out.println("" + ex);
            }
        }
    }//GEN-LAST:event_viewdetailsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountid;
    private javax.swing.JLabel birthdate;
    private javax.swing.JLabel email;
    private javax.swing.JLabel fname;
    private javax.swing.JPanel infopanel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lname;
    private javax.swing.JLabel sexx;
    private javax.swing.JLabel status;
    private javax.swing.JLabel username;
    private javax.swing.JTable userstable;
    private javax.swing.JLabel usertype;
    private javax.swing.JLabel viewdetails;
    // End of variables declaration//GEN-END:variables
}
