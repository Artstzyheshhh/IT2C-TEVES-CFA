/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrardashboard;

import account.accdetails;
import applications.manageapplications;
import applications.manageapplicationsuser;
import candidates.managecandidates;
import config.Session;
import config.dbconnect;
import it2c.teves.cfa.loginform;
import java.awt.Color;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import partylist.managepaartylist;
import reports.report;
import rreports.rreport;

/**
 *
 * @author acer
 */
public class usermaindash extends javax.swing.JFrame {

    /**
     * Creates new form usermaindash
     */
    public usermaindash() {
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
        myaccount = new javax.swing.JLabel();
        partylist = new javax.swing.JLabel();
        reports = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        accname = new javax.swing.JLabel();
        application = new javax.swing.JLabel();
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
        jLabel1.setText("     REGISTERS DASHBOARD");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jLabel1.setOpaque(true);
        main.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 810, 40));

        sidebar.setBackground(new java.awt.Color(255, 255, 255));
        sidebar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        sidebar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 41, -1, -1));

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

        partylist.setBackground(new java.awt.Color(204, 0, 0));
        partylist.setForeground(new java.awt.Color(204, 0, 0));
        partylist.setText("  Partylist");
        partylist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                partylistMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                partylistMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                partylistMouseExited(evt);
            }
        });
        sidebar.add(partylist, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 160, 40));

        reports.setBackground(new java.awt.Color(204, 0, 0));
        reports.setForeground(new java.awt.Color(204, 0, 0));
        reports.setText("  Reports");
        reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportsMouseExited(evt);
            }
        });
        sidebar.add(reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 160, 40));

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

        application.setBackground(new java.awt.Color(204, 0, 0));
        application.setForeground(new java.awt.Color(204, 0, 0));
        application.setText("  Applications");
        application.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                applicationMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                applicationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                applicationMouseExited(evt);
            }
        });
        sidebar.add(application, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 160, 40));

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
        sidebar.add(candidates, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 160, 40));

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

        main.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 170, 580));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(800, 450));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        jPanel2.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 530));

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
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        Session sess = Session.getInstance();
        dbconnect dbc = new dbconnect();
        String action = "User with ID "+sess.getId()+" logged out";
         dbc.insertData("INSERT INTO logged(userid, action, date) VALUES ('" + +sess.getId() + "', '" + action + "', '" + LocalDateTime.now() + "')");
        System.exit(0);
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

    private void myaccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myaccountMouseClicked
    //current button
    myaccount.setOpaque(true);
    myaccount.setBackground(new java.awt.Color(221,21,21));
    myaccount.setForeground(Color.white);
    
    //other button  
    candidates.setBackground(Color.white);
    candidates.setForeground(new java.awt.Color(221,21,21));
    candidates.setOpaque(false);
    partylist.setBackground(Color.white);
    partylist.setForeground(new java.awt.Color(221,21,21));
    partylist.setOpaque(false);
    application.setBackground(Color.white);
    application.setForeground(new java.awt.Color(221,21,21));
    application.setOpaque(false);
    reports.setBackground(Color.white);
    reports.setForeground(new java.awt.Color(221,21,21));
    reports.setOpaque(false);
    editaccc.setBackground(Color.white);
    editaccc.setForeground(new java.awt.Color(221,21,21));
    editaccc.setOpaque(false);     
        
        jDesktopPane1.removeAll();
        accdetails ad = new accdetails();
        jDesktopPane1.add(ad).setVisible(true);
    }//GEN-LAST:event_myaccountMouseClicked

    private void myaccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myaccountMouseEntered
       
    }//GEN-LAST:event_myaccountMouseEntered

    private void myaccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myaccountMouseExited
       
    }//GEN-LAST:event_myaccountMouseExited

    private void reportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseClicked
         //current button
    reports.setOpaque(true);
    reports.setBackground(new java.awt.Color(221,21,21));
    reports.setForeground(Color.white);
    
    //other button
    myaccount.setBackground(Color.white);
    myaccount.setForeground(new java.awt.Color(221,21,21));
    myaccount.setOpaque(false);
    
    partylist.setBackground(Color.white);
    partylist.setForeground(new java.awt.Color(221,21,21));
    partylist.setOpaque(false);
    application.setBackground(Color.white);
    application.setForeground(new java.awt.Color(221,21,21));
    application.setOpaque(false);
    candidates.setBackground(Color.white);
    candidates.setForeground(new java.awt.Color(221,21,21));
    candidates.setOpaque(false);
    editaccc.setBackground(Color.white);
    editaccc.setForeground(new java.awt.Color(221,21,21));
    editaccc.setOpaque(false);           
        
        jDesktopPane1.removeAll();
        rreport rp = new rreport();
        jDesktopPane1.add(rp).setVisible(true);
    }//GEN-LAST:event_reportsMouseClicked

    private void reportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseEntered
        
    }//GEN-LAST:event_reportsMouseEntered

    private void reportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseExited
        
    }//GEN-LAST:event_reportsMouseExited

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        Session sess = Session.getInstance();
        dbconnect dbc = new dbconnect();
        String action = "User with ID "+sess.getId()+" logged out";
         dbc.insertData("INSERT INTO logged(userid, action, date) VALUES ('" + +sess.getId() + "', '" + action + "', '" + LocalDateTime.now() + "')");
        System.exit(0);
        loginform lfm = new loginform();
        lfm.setVisible(true);
    }//GEN-LAST:event_logoutMouseClicked

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        
    }//GEN-LAST:event_logoutMouseExited

    private void candidatesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_candidatesMouseClicked
          //current button
    candidates.setOpaque(true);
    candidates.setBackground(new java.awt.Color(221,21,21));
    candidates.setForeground(Color.white);
    
    //other button
    myaccount.setBackground(Color.white);
    myaccount.setForeground(new java.awt.Color(221,21,21));
    myaccount.setOpaque(false);
    
    partylist.setBackground(Color.white);
    partylist.setForeground(new java.awt.Color(221,21,21));
    partylist.setOpaque(false);
    application.setBackground(Color.white);
    application.setForeground(new java.awt.Color(221,21,21));
    application.setOpaque(false);
    reports.setBackground(Color.white);
    reports.setForeground(new java.awt.Color(221,21,21));
    reports.setOpaque(false);
    editaccc.setBackground(Color.white);
    editaccc.setForeground(new java.awt.Color(221,21,21));
    editaccc.setOpaque(false);     
        
        managecandidates mcd = new managecandidates();
       jDesktopPane1.removeAll();    
        jDesktopPane1.add(mcd).setVisible(true);
    }//GEN-LAST:event_candidatesMouseClicked

    private void candidatesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_candidatesMouseEntered
        
    }//GEN-LAST:event_candidatesMouseEntered

    private void candidatesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_candidatesMouseExited
        
    }//GEN-LAST:event_candidatesMouseExited

    private void editacccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editacccMouseClicked
        userditop eo = new userditop();
        eo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_editacccMouseClicked

    private void editacccMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editacccMouseEntered
        
    }//GEN-LAST:event_editacccMouseEntered

    private void editacccMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editacccMouseExited
        
    }//GEN-LAST:event_editacccMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     myaccount.setOpaque(true);
    myaccount.setBackground(new java.awt.Color(221,21,21));
    myaccount.setForeground(Color.white); 
        
        jDesktopPane1.removeAll();
     accdetails ad = new accdetails();
     jDesktopPane1.add(ad).setVisible(true);
    }//GEN-LAST:event_formWindowOpened

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

    private void applicationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applicationMouseClicked
     //current button
    application.setOpaque(true);
    application.setBackground(new java.awt.Color(221,21,21));
    application.setForeground(Color.white);
    
    //other button
    
    candidates.setBackground(Color.white);
    candidates.setForeground(new java.awt.Color(221,21,21));
    candidates.setOpaque(false);
    partylist.setBackground(Color.white);
    partylist.setForeground(new java.awt.Color(221,21,21));
    partylist.setOpaque(false);
    myaccount.setBackground(Color.white);
    myaccount.setForeground(new java.awt.Color(221,21,21));
    myaccount.setOpaque(false);
    reports.setBackground(Color.white);
    reports.setForeground(new java.awt.Color(221,21,21));
    reports.setOpaque(false);
    editaccc.setBackground(Color.white);
    editaccc.setForeground(new java.awt.Color(221,21,21));
    editaccc.setOpaque(false);   
     jDesktopPane1.removeAll();
     manageapplicationsuser ma = new manageapplicationsuser();
     jDesktopPane1.add(ma).setVisible(true);
    }//GEN-LAST:event_applicationMouseClicked

    private void applicationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applicationMouseEntered
         
    }//GEN-LAST:event_applicationMouseEntered

    private void applicationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applicationMouseExited
       
    }//GEN-LAST:event_applicationMouseExited

    private void partylistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_partylistMouseClicked
        //current button
    partylist.setOpaque(true);
    partylist.setBackground(new java.awt.Color(221,21,21));
    partylist.setForeground(Color.white);
    
    //other button
    myaccount.setBackground(Color.white);
    myaccount.setForeground(new java.awt.Color(221,21,21));
    myaccount.setOpaque(false);
    
    candidates.setBackground(Color.white);
    candidates.setForeground(new java.awt.Color(221,21,21));
    candidates.setOpaque(false);
    application.setBackground(Color.white);
    application.setForeground(new java.awt.Color(221,21,21));
    application.setOpaque(false);
    reports.setBackground(Color.white);
    reports.setForeground(new java.awt.Color(221,21,21));
    reports.setOpaque(false);
    editaccc.setBackground(Color.white);
    editaccc.setForeground(new java.awt.Color(221,21,21));
    editaccc.setOpaque(false);     
        
     jDesktopPane1.removeAll();
     managepaartylist ma = new managepaartylist();
     jDesktopPane1.add(ma).setVisible(true);
    }//GEN-LAST:event_partylistMouseClicked

    private void partylistMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_partylistMouseEntered
         
    }//GEN-LAST:event_partylistMouseEntered

    private void partylistMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_partylistMouseExited
        
    }//GEN-LAST:event_partylistMouseExited

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
            java.util.logging.Logger.getLogger(usermaindash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usermaindash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usermaindash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usermaindash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usermaindash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accname;
    private javax.swing.JLabel application;
    private javax.swing.JLabel candidates;
    private javax.swing.JLabel editaccc;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logout;
    public javax.swing.JPanel main;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel myaccount;
    private javax.swing.JLabel partylist;
    private javax.swing.JLabel reports;
    private javax.swing.JPanel sidebar;
    // End of variables declaration//GEN-END:variables
}
