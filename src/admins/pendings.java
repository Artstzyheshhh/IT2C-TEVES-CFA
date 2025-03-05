/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admins;

import config.dbconnect;
import it2c.teves.cfa.loginform;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author acer
 */
public class pendings extends javax.swing.JFrame {

    /**
     * Creates new form pendings
     */
    public pendings() {
        initComponents();
        displayData();
    }

    
    public void displayData(){
        String status = "pending";
        try{
            dbconnect dbc = new dbconnect();
            ResultSet rs = dbc.getData("SELECT uid, fname, lname, stats FROM users WHERE stats = '"+status+"'");
            pendingstable.setModel(DbUtils.resultSetToTableModel(rs));
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

        main = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pendingstable = new javax.swing.JTable();
        sidebar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        myaccount = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        accname = new javax.swing.JLabel();
        users = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main.setBackground(new java.awt.Color(255, 255, 255));
        main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        main.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 170, 0));

        pendingstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        pendingstable.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(pendingstable);

        main.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 660, 330));

        sidebar.setBackground(new java.awt.Color(255, 255, 255));
        sidebar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        sidebar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 41, -1, -1));

        myaccount.setBackground(new java.awt.Color(204, 0, 0));
        myaccount.setForeground(new java.awt.Color(204, 0, 0));
        myaccount.setText("   My account");
        myaccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myaccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                myaccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                myaccountMouseExited(evt);
            }
        });
        sidebar.add(myaccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 160, 40));

        jLabel20.setBackground(new java.awt.Color(204, 0, 0));
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("  Pendings");
        jLabel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 2, true));
        jLabel20.setOpaque(true);
        sidebar.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 160, 40));

        jLabel22.setBackground(new java.awt.Color(204, 0, 0));
        jLabel22.setForeground(new java.awt.Color(204, 0, 0));
        jLabel22.setText("  Partylist");
        sidebar.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 160, 40));

        jLabel19.setBackground(new java.awt.Color(204, 0, 0));
        jLabel19.setForeground(new java.awt.Color(204, 0, 0));
        jLabel19.setText("  positions");
        sidebar.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 160, 40));

        logout.setBackground(new java.awt.Color(255, 255, 255));
        logout.setForeground(new java.awt.Color(204, 0, 0));
        logout.setText("  Log out");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        sidebar.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 160, 40));

        accname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/account-circle-icon (1).png"))); // NOI18N
        sidebar.add(accname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, -1));

        users.setBackground(new java.awt.Color(204, 0, 0));
        users.setForeground(new java.awt.Color(204, 0, 0));
        users.setText("   Users");
        users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usersMouseExited(evt);
            }
        });
        sidebar.add(users, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 160, 40));

        main.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 170, 490));

        jLabel3.setBackground(new java.awt.Color(204, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("     ADMINISTRATORS DASHBOARD");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jLabel3.setOpaque(true);
        main.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 690, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 714, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );

        main.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, -10, 720, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void myaccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myaccountMouseClicked
        adminsdashboard adm = new adminsdashboard();
        adm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_myaccountMouseClicked

    private void myaccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myaccountMouseEntered
        myaccount.setOpaque(true);
        myaccount.setBackground(new java.awt.Color(221,21,21));
        myaccount.setForeground(Color.white);
    }//GEN-LAST:event_myaccountMouseEntered

    private void myaccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myaccountMouseExited
        myaccount.setBackground(Color.white);
        myaccount.setForeground(new java.awt.Color(221,21,21));
        myaccount.setOpaque(false);
    }//GEN-LAST:event_myaccountMouseExited

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        loginform lfm = new loginform();
        lfm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        logout.setOpaque(true);
        logout.setBackground(new java.awt.Color(221,21,21));
        logout.setForeground(Color.white);
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        logout.setBackground(Color.white);
        logout.setForeground(new java.awt.Color(221,21,21));
        logout.setOpaque(false);
    }//GEN-LAST:event_logoutMouseExited

    private void usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseClicked
       manageuser mnusr = new manageuser();
       mnusr.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_usersMouseClicked

    private void usersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseEntered
        users.setOpaque(true);
        users.setBackground(new java.awt.Color(221,21,21));
        users.setForeground(Color.white);
    }//GEN-LAST:event_usersMouseEntered

    private void usersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseExited
        users.setBackground(Color.white);
        users.setForeground(new java.awt.Color(221,21,21));
        users.setOpaque(false);
    }//GEN-LAST:event_usersMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pendings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pendings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pendings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pendings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pendings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accname;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logout;
    public javax.swing.JPanel main;
    private javax.swing.JLabel myaccount;
    private javax.swing.JTable pendingstable;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel users;
    // End of variables declaration//GEN-END:variables
}
