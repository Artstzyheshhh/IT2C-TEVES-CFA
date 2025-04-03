/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admins;

import config.Session;
import account.accdetails;
import candidates.managecandidates;
import internalframes.manageuser;
import it2c.teves.cfa.loginform;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class maindash extends javax.swing.JFrame {

    /**
     * Creates new form maindash
     */
    public maindash() {
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
        jLabel5 = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sidebar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        users = new javax.swing.JLabel();
        myaccount = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        pendings = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        accname = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        candidates = new javax.swing.JLabel();
        editaccc = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        main.setBackground(new java.awt.Color(255, 255, 255));
        main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(204, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("X");
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        main.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 30, 25));

        minimize.setBackground(new java.awt.Color(204, 0, 0));
        minimize.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        minimize.setForeground(new java.awt.Color(255, 255, 255));
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("—");
        minimize.setOpaque(true);
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeMouseExited(evt);
            }
        });
        main.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 30, 25));

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("     ADMINISTRATORS DASHBOARD");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jLabel1.setOpaque(true);
        main.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 810, 40));

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

        myaccount.setBackground(new java.awt.Color(255, 255, 255));
        myaccount.setForeground(new java.awt.Color(204, 0, 0));
        myaccount.setText("  My accouunt");
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
        sidebar.add(accname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, -1));

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

        editaccc.setForeground(new java.awt.Color(204, 0, 0));
        editaccc.setText("  Settings");
        editaccc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editacccMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editacccMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editacccMouseExited(evt);
            }
        });
        sidebar.add(editaccc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 160, 40));

        main.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 170, 560));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(800, 450));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel2.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        main.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 800, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void candidatesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_candidatesMouseExited
        candidates.setBackground(Color.white);
        candidates.setForeground(new java.awt.Color(221,21,21));
        candidates.setOpaque(false);
    }//GEN-LAST:event_candidatesMouseExited

    private void candidatesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_candidatesMouseEntered
        candidates.setOpaque(true);
        candidates.setBackground(new java.awt.Color(221,21,21));
        candidates.setForeground(Color.white);
    }//GEN-LAST:event_candidatesMouseEntered

    private void candidatesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_candidatesMouseClicked
       managecandidates mcd = new managecandidates();
       jDesktopPane1.removeAll();    
        jDesktopPane1.add(mcd).setVisible(true);
    }//GEN-LAST:event_candidatesMouseClicked

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        logout.setBackground(Color.white);
        logout.setForeground(new java.awt.Color(221,21,21));
        logout.setOpaque(false);
    }//GEN-LAST:event_logoutMouseExited

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        logout.setOpaque(true);
        logout.setBackground(new java.awt.Color(221,21,21));
        logout.setForeground(Color.white);
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        loginform lfm = new loginform();
        lfm.setVisible(true);
    }//GEN-LAST:event_logoutMouseClicked

    private void pendingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendingsMouseExited
        pendings.setBackground(Color.white);
        pendings.setForeground(new java.awt.Color(221,21,21));
        pendings.setOpaque(false);
    }//GEN-LAST:event_pendingsMouseExited

    private void pendingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendingsMouseEntered
        pendings.setOpaque(true);
        pendings.setBackground(new java.awt.Color(221,21,21));
        pendings.setForeground(Color.white);
    }//GEN-LAST:event_pendingsMouseEntered

    private void pendingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendingsMouseClicked
       
    }//GEN-LAST:event_pendingsMouseClicked

    private void usersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseExited
        users.setBackground(Color.white);
        users.setForeground(new java.awt.Color(221,21,21));
        users.setOpaque(false);
    }//GEN-LAST:event_usersMouseExited

    private void usersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseEntered
        users.setOpaque(true);
        users.setBackground(new java.awt.Color(221,21,21));
        users.setForeground(Color.white);
    }//GEN-LAST:event_usersMouseEntered

    private void usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseClicked
         jDesktopPane1.removeAll();
     manageuser mu = new manageuser();
       jDesktopPane1.add(mu).setVisible(true);
    }//GEN-LAST:event_usersMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session sess = Session.getInstance();
        if(sess.getId() == 0){
        JOptionPane.showMessageDialog(null,"No account found, login first!");
        loginform lfm = new loginform();
        lfm.setVisible(true);
        this.dispose();
        }else{
        accname.setText(""+sess.getUsername());}
        
      
    }//GEN-LAST:event_formWindowActivated

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        
    }//GEN-LAST:event_jLabel5MouseExited

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        
    }//GEN-LAST:event_minimizeMouseEntered

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        
    }//GEN-LAST:event_minimizeMouseExited

    private void editacccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editacccMouseClicked
        editoption eo = new editoption();
        eo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_editacccMouseClicked

    private void editacccMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editacccMouseEntered
       editaccc.setOpaque(true);
        editaccc.setBackground(new java.awt.Color(221,21,21));
        editaccc.setForeground(Color.white);
    }//GEN-LAST:event_editacccMouseEntered

    private void editacccMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editacccMouseExited
       editaccc.setBackground(Color.white);
        editaccc.setForeground(new java.awt.Color(221,21,21));
        editaccc.setOpaque(false);
    }//GEN-LAST:event_editacccMouseExited

    private void myaccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myaccountMouseClicked
           jDesktopPane1.removeAll();
    accdetails ad = new accdetails();
       jDesktopPane1.add(ad).setVisible(true);
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        jDesktopPane1.removeAll();
     accdetails ad = new accdetails();
     jDesktopPane1.add(ad).setVisible(true);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(maindash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(maindash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(maindash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(maindash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new maindash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accname;
    private javax.swing.JLabel candidates;
    private javax.swing.JLabel editaccc;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logout;
    public javax.swing.JPanel main;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel myaccount;
    private javax.swing.JLabel pendings;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel users;
    // End of variables declaration//GEN-END:variables
}
