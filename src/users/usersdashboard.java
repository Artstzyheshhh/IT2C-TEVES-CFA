/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;


import it2c.teves.cfa.loginform;
import java.awt.Color;

/**
 *
 * @author acer
 */
public class usersdashboard extends javax.swing.JFrame {

    /**
     * Creates new form usersdashboard
     */
    public usersdashboard() {
        initComponents();
        
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
        sidebar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        username2 = new javax.swing.JLabel();
        username1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main.setBackground(new java.awt.Color(255, 255, 255));
        main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        main.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 170, 0));

        sidebar.setBackground(new java.awt.Color(255, 255, 255));
        sidebar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        sidebar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 41, -1, -1));

        jLabel23.setBackground(new java.awt.Color(204, 0, 0));
        jLabel23.setForeground(new java.awt.Color(204, 0, 0));
        jLabel23.setText("  Candidates ");
        sidebar.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 160, 40));

        jLabel20.setBackground(new java.awt.Color(204, 0, 0));
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("  My account");
        jLabel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 2, true));
        jLabel20.setOpaque(true);
        sidebar.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 160, 30));

        jLabel22.setBackground(new java.awt.Color(204, 0, 0));
        jLabel22.setForeground(new java.awt.Color(204, 0, 0));
        jLabel22.setText("  Partylist");
        sidebar.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 160, 40));

        jLabel19.setBackground(new java.awt.Color(204, 0, 0));
        jLabel19.setForeground(new java.awt.Color(204, 0, 0));
        jLabel19.setText("  positions");
        sidebar.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 160, 40));

        logout.setBackground(new java.awt.Color(255, 255, 255));
        logout.setForeground(new java.awt.Color(204, 0, 0));
        logout.setText("  Log out");
        logout.setOpaque(true);
        sidebar.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 150, 40));

        username2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/account-circle-icon (1).png"))); // NOI18N
        sidebar.add(username2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 130, -1));

        main.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 170, 490));

        username1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/account-circle-icon (1).png"))); // NOI18N
        main.add(username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            java.util.logging.Logger.getLogger(usersdashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usersdashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usersdashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usersdashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usersdashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logout;
    public javax.swing.JPanel main;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel username1;
    private javax.swing.JLabel username2;
    // End of variables declaration//GEN-END:variables
}
