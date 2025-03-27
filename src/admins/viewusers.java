/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admins;

import config.Session;
import config.dbconnect;
import it2c.teves.cfa.loginform;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author acer
 */
public class viewusers extends javax.swing.JFrame {

    /**
     * Creates new form viewusers
     */
    public viewusers() {
        initComponents();
        displayData();
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

        main = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userstable = new javax.swing.JTable();
        sidebar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        myaccount = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        accname = new javax.swing.JLabel();
        pendings = new javax.swing.JLabel();
        candidates = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        topbar = new javax.swing.JPanel();
        view = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
        delete = new javax.swing.JLabel();
        edit = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
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

        userstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        userstable.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(userstable);

        main.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 420, 370));

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
        jLabel20.setText("  Users");
        jLabel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 2, true));
        jLabel20.setOpaque(true);
        sidebar.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 160, 40));

        jLabel22.setBackground(new java.awt.Color(204, 0, 0));
        jLabel22.setForeground(new java.awt.Color(204, 0, 0));
        jLabel22.setText("  Partylist");
        sidebar.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 160, 40));

        jLabel19.setBackground(new java.awt.Color(204, 0, 0));
        jLabel19.setForeground(new java.awt.Color(204, 0, 0));
        jLabel19.setText("  positions");
        sidebar.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 160, 40));

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

        main.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 170, 560));

        jLabel3.setBackground(new java.awt.Color(204, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("     ADMINISTRATORS DASHBOARD");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jLabel3.setOpaque(true);
        main.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 820, 40));

        topbar.setBackground(new java.awt.Color(255, 255, 255));
        topbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        view.setForeground(new java.awt.Color(204, 0, 0));
        view.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        view.setText("View");
        topbar.add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 110, 20));

        add.setBackground(new java.awt.Color(153, 153, 153));
        add.setForeground(new java.awt.Color(153, 153, 153));
        add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add.setText("Add");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        topbar.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 110, 20));

        delete.setForeground(new java.awt.Color(153, 153, 153));
        delete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delete.setText("Delete");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        topbar.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 110, 20));

        edit.setBackground(new java.awt.Color(153, 153, 153));
        edit.setForeground(new java.awt.Color(153, 153, 153));
        edit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        edit.setText("Edit");
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMouseExited(evt);
            }
        });
        topbar.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 110, 20));

        main.add(topbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, -10, 830, 90));

        jPanel4.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(350, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(350, 350, 350))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        main.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 55, 810, 30));

        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("  search");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        main.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 170, -1));

        infopanel.setBackground(new java.awt.Color(255, 102, 102));
        infopanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fname.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        fname.setForeground(new java.awt.Color(255, 255, 255));
        fname.setText("Fname");
        infopanel.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 170, 20));

        username.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("username");
        infopanel.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 170, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Username:");
        infopanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 70, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Account ID:");
        infopanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 70, 20));

        email.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setText("Email");
        infopanel.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 170, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Firstname:");
        infopanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Lastname:");
        infopanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 70, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email:");
        infopanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 70, 20));

        accountid.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        accountid.setForeground(new java.awt.Color(255, 255, 255));
        accountid.setText("Account ID:");
        infopanel.add(accountid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 170, 20));

        lname.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lname.setForeground(new java.awt.Color(255, 255, 255));
        lname.setText("Lname");
        infopanel.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 170, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Sex:");
        infopanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 70, 20));

        sexx.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        sexx.setForeground(new java.awt.Color(255, 255, 255));
        sexx.setText("Sex");
        infopanel.add(sexx, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 170, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("User type:");
        infopanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 70, 20));

        usertype.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        usertype.setForeground(new java.awt.Color(255, 255, 255));
        usertype.setText("User type");
        infopanel.add(usertype, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 170, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("birthdate:");
        infopanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 70, 20));

        birthdate.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        birthdate.setForeground(new java.awt.Color(255, 255, 255));
        birthdate.setText("birthdate");
        infopanel.add(birthdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 170, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("status:");
        infopanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 70, 20));

        status.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        status.setForeground(new java.awt.Color(255, 255, 255));
        status.setText("status");
        infopanel.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 170, 20));

        main.add(infopanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 310, 370));

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
        main.add(viewdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 90, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void myaccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myaccountMouseClicked
        adminsdashboard adm = new adminsdashboard();
        adm.setVisible(true);
       
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

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setOpaque(true);
        add.setBackground(new java.awt.Color(204,204,204));
        add.setForeground(Color.white);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setBackground(Color.white);
        add.setForeground(new java.awt.Color(153,153,153));
        add.setOpaque(false);
    }//GEN-LAST:event_addMouseExited

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteMouseClicked

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setOpaque(true);
        delete.setBackground(new java.awt.Color(204,204,204));
        delete.setForeground(Color.white);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setForeground(new java.awt.Color(153,153,153));
        delete.setBackground(Color.white);
        delete.setOpaque(false);
    }//GEN-LAST:event_deleteMouseExited

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        edit.setOpaque(true);
        edit.setBackground(new java.awt.Color(204,204,204));
        edit.setForeground(Color.white);
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        edit.setBackground(Color.white);
        edit.setForeground(new java.awt.Color(153,153,153));
        edit.setOpaque(false);
    }//GEN-LAST:event_editMouseExited

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        adduser adu = new adduser();
        adu.setVisible(true);
      
    }//GEN-LAST:event_addMouseClicked

    private void pendingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendingsMouseClicked
        pendings pnding = new pendings();
        pnding.setVisible(true);
        
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

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
         Session sess = Session.getInstance();
        if(sess.getId() == 0){
        JOptionPane.showMessageDialog(null,"No account found, login first!");
        loginform lfm = new loginform();
        lfm.setVisible(true);
       
        }else{
        accname.setText(""+sess.getUsername());
        
        }
    }//GEN-LAST:event_formWindowActivated

    private void candidatesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_candidatesMouseClicked
        candidate cnddte = new candidate();
        cnddte.setVisible(true);
        
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

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
       edituser edt = new edituser();
       edt.setVisible(true);
     
    }//GEN-LAST:event_editMouseClicked

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
            java.util.logging.Logger.getLogger(viewusers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewusers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewusers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewusers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewusers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accname;
    private javax.swing.JLabel accountid;
    private javax.swing.JLabel add;
    private javax.swing.JLabel birthdate;
    private javax.swing.JLabel candidates;
    private javax.swing.JLabel delete;
    private javax.swing.JLabel edit;
    private javax.swing.JLabel email;
    private javax.swing.JLabel fname;
    private javax.swing.JPanel infopanel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lname;
    private javax.swing.JLabel logout;
    public javax.swing.JPanel main;
    private javax.swing.JLabel myaccount;
    private javax.swing.JLabel pendings;
    private javax.swing.JLabel sexx;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel status;
    private javax.swing.JPanel topbar;
    private javax.swing.JLabel username;
    private javax.swing.JTable userstable;
    private javax.swing.JLabel usertype;
    private javax.swing.JLabel view;
    private javax.swing.JLabel viewdetails;
    // End of variables declaration//GEN-END:variables
}
