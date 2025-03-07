/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admins;


import config.Session;
import it2c.teves.cfa.loginform;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class adminsdashboard extends javax.swing.JFrame {

    /**
     * Creates new form adminsdashboard
     */
    public adminsdashboard() {
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
        jLabel1 = new javax.swing.JLabel();
        sidebar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        users = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        pendings = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        accname = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        candidates = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        fullname = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        accountid = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fname = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        sexx = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        usertype = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        birthdate = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        main.setBackground(new java.awt.Color(255, 255, 255));
        main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        main.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 170, 0));

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("     ADMINISTRATORS DASHBOARD");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jLabel1.setOpaque(true);
        main.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 730, 40));

        sidebar.setBackground(new java.awt.Color(255, 255, 255));
        sidebar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        sidebar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 41, -1, -1));

        users.setBackground(new java.awt.Color(221, 21, 21));
        users.setForeground(new java.awt.Color(204, 0, 0));
        users.setText("  Users");
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
        sidebar.add(users, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 160, 40));

        jLabel20.setBackground(new java.awt.Color(204, 0, 0));
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("  My accouunt");
        jLabel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 2, true));
        jLabel20.setOpaque(true);
        sidebar.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 160, 40));

        jLabel22.setBackground(new java.awt.Color(204, 0, 0));
        jLabel22.setForeground(new java.awt.Color(204, 0, 0));
        jLabel22.setText("  Partylist");
        sidebar.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 160, 40));

        pendings.setBackground(new java.awt.Color(204, 0, 0));
        pendings.setForeground(new java.awt.Color(204, 0, 0));
        pendings.setText("  Pendings");
        pendings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pendingsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pendingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pendingsMouseExited(evt);
            }
        });
        sidebar.add(pendings, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 160, 40));

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

        jLabel21.setBackground(new java.awt.Color(204, 0, 0));
        jLabel21.setForeground(new java.awt.Color(204, 0, 0));
        jLabel21.setText("  Positions");
        sidebar.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 160, 40));

        candidates.setBackground(new java.awt.Color(221, 21, 21));
        candidates.setForeground(new java.awt.Color(204, 0, 0));
        candidates.setText("  Candidates");
        candidates.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                candidatesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                candidatesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                candidatesMouseExited(evt);
            }
        });
        sidebar.add(candidates, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 160, 40));

        main.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 170, 550));

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fullname.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        fullname.setForeground(new java.awt.Color(255, 255, 255));
        fullname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconnn.jpg"))); // NOI18N
        fullname.setText("   firstname, lastname ");
        jPanel2.add(fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 650, 90));

        main.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 670, 110));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("  Account information:");
        main.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 670, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Account ID:");
        main.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 100, 30));

        accountid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        accountid.setForeground(new java.awt.Color(204, 0, 0));
        accountid.setText("Account ID:");
        main.add(accountid, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 240, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("Username:");
        main.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 100, 30));

        username.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        username.setForeground(new java.awt.Color(204, 0, 0));
        username.setText("username");
        main.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 240, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Firstname:");
        main.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 100, 30));

        fname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fname.setForeground(new java.awt.Color(204, 0, 0));
        fname.setText("Fname");
        main.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 240, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("Lastname:");
        main.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 100, 30));

        lname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lname.setForeground(new java.awt.Color(204, 0, 0));
        lname.setText("Lname");
        main.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 240, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("Email:");
        main.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 100, 30));

        email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        email.setForeground(new java.awt.Color(204, 0, 0));
        email.setText("Email");
        main.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 240, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("Sex:");
        main.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 100, 30));

        sexx.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sexx.setForeground(new java.awt.Color(204, 0, 0));
        sexx.setText("Sex");
        main.add(sexx, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 130, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 0));
        jLabel10.setText("User type:");
        main.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 100, 30));

        usertype.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        usertype.setForeground(new java.awt.Color(204, 0, 0));
        usertype.setText("User type");
        main.add(usertype, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 130, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setText("birthdate:");
        main.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 100, 30));

        birthdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        birthdate.setForeground(new java.awt.Color(204, 0, 0));
        birthdate.setText("birthdate");
        main.add(birthdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 130, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setText("status:");
        main.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 100, 30));

        status.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        status.setForeground(new java.awt.Color(204, 0, 0));
        status.setText("status");
        main.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 130, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 0));
        jLabel12.setText("Edit account info");
        main.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 460, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
        viewusers vwusr = new viewusers();
        vwusr.setVisible(true);
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

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session sess = Session.getInstance();
        if(sess.getId() == 0){
        JOptionPane.showMessageDialog(null,"No account found, login first!");
        loginform lfm = new loginform();
        lfm.setVisible(true);
        this.dispose();
        }else{
        accname.setText(""+sess.getUsername());
        fullname.setText("  "+sess.getLname()+",  "+sess.getFname());
        accountid.setText(""+sess.getId());
        fname.setText(""+sess.getFname());
        lname.setText(""+sess.getLname());
        email.setText(""+sess.getEmail());
        birthdate.setText(""+sess.getBirthdate());
        sexx.setText(""+sess.getSex());
        usertype.setText(""+sess.getType());
        status.setText(""+sess.getStatus());
        username.setText(""+sess.getUsername());
        }
    }//GEN-LAST:event_formWindowActivated

    private void pendingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendingsMouseClicked
        pendings pnding = new pendings();
        pnding.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pendingsMouseClicked

    private void pendingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendingsMouseEntered
        pendings.setOpaque(true);
        pendings.setBackground(new java.awt.Color(221,21,21));
        pendings.setForeground(Color.white);
    }//GEN-LAST:event_pendingsMouseEntered

    private void pendingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendingsMouseExited
        pendings.setBackground(Color.white);
        pendings.setForeground(new java.awt.Color(221,21,21));
        pendings.setOpaque(false);
    }//GEN-LAST:event_pendingsMouseExited

    private void candidatesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_candidatesMouseClicked
        candidate cnddte = new candidate();
        cnddte.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_candidatesMouseClicked

    private void candidatesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_candidatesMouseEntered
        candidates.setOpaque(true);
        candidates.setBackground(new java.awt.Color(221,21,21));
        candidates.setForeground(Color.white);
    }//GEN-LAST:event_candidatesMouseEntered

    private void candidatesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_candidatesMouseExited
        candidates.setBackground(Color.white);
        candidates.setForeground(new java.awt.Color(221,21,21));
        candidates.setOpaque(false);
    }//GEN-LAST:event_candidatesMouseExited

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
            java.util.logging.Logger.getLogger(adminsdashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminsdashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminsdashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminsdashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminsdashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accname;
    private javax.swing.JLabel accountid;
    private javax.swing.JLabel birthdate;
    private javax.swing.JLabel candidates;
    private javax.swing.JLabel email;
    private javax.swing.JLabel fname;
    private javax.swing.JLabel fullname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lname;
    private javax.swing.JLabel logout;
    public javax.swing.JPanel main;
    private javax.swing.JLabel pendings;
    private javax.swing.JLabel sexx;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel status;
    private javax.swing.JLabel username;
    private javax.swing.JLabel users;
    private javax.swing.JLabel usertype;
    // End of variables declaration//GEN-END:variables
}
