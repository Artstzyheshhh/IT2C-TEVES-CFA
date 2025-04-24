
package applications;


import config.PanelPrinter;
import config.dbconnect;
import static User.edituser.getHeightFromWidth;
import java.awt.Color;

import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author acer
 */
public class viewapplication extends javax.swing.JInternalFrame {

    /**
     * Creates new form pcandidate
     */
    public viewapplication() {
        initComponents();
        displayData();
       this.setBorder(javax.swing. BorderFactory.createEmptyBorder(0,0,0,0)); 
       BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
       bi.setNorthPane (null);
        
        applicationtable.getTableHeader().setOpaque(false);
       applicationtable.getTableHeader().setBackground(new java.awt.Color(221,21,21));
       applicationtable.getTableHeader().setForeground(Color.white);
    }

    public void displayData(){
        try{
            dbconnect dbc = new dbconnect();
            
            try (ResultSet rs = dbc.getData(
                "SELECT applications.aid, candidates.lname, candidates.fname, " +
                "positions.position, applications.status FROM applications " +
                "INNER JOIN candidates ON applications.cid = candidates.cid " +
                "INNER JOIN positions ON applications.ppid = positions.pid " +
                "INNER JOIN partylist ON applications.pid = partylist.pid " );) 
            {
                applicationtable.setModel(DbUtils.resultSetToTableModel(rs));
                applicationtable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                TableColumnModel columnModel = applicationtable.getColumnModel();
                
                columnModel.getColumn(0).setHeaderValue("ID");
                columnModel.getColumn(1).setHeaderValue("Lastname");
                columnModel.getColumn(2).setHeaderValue("Firstname");
                columnModel.getColumn(3).setHeaderValue("Position");
                columnModel.getColumn(4).setHeaderValue("Status");
               
               applicationtable.getTableHeader().repaint();
                columnModel.getColumn(0).setPreferredWidth(50);
                columnModel.getColumn(1).setPreferredWidth(115);
                columnModel.getColumn(2).setPreferredWidth(115);
                columnModel.getColumn(3).setPreferredWidth(115);
             
            }
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        partylist = new javax.swing.JLabel();
        coc = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Statement = new javax.swing.JLabel();
        Statement1 = new javax.swing.JLabel();
        Statement2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        cname = new javax.swing.JLabel();
        pname = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        position = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        print = new javax.swing.JLabel();
        clear = new javax.swing.JLabel();
        select = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        applicationtable = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        partylist.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel1.add(partylist);

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

        coc.setBackground(new java.awt.Color(255, 255, 255));
        coc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        coc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REPUBLIC OF THE PHILIPPINES");
        coc.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 10, 350, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CERTIFICATE OF CANDIDACY");
        coc.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 47, 350, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Commission of Elections");
        coc.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 20, 350, -1));
        coc.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 185, 310, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel5.setText("Official Statement:");
        coc.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 205, 330, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel6.setText("Candidate Name: ");
        coc.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 75, 70, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel7.setText("Position Filed for: ");
        coc.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 95, 70, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel8.setText("Political Partylist:");
        coc.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 115, 70, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel9.setText("Date Filed:");
        coc.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 135, 50, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel10.setText("Filing number:");
        coc.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 155, 60, 20));

        Statement.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        Statement.setText("-coming elections.");
        coc.add(Statement, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 265, 330, 20));

        Statement1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        Statement1.setText("      This certifies that the individual named herein has officially filed a valid ");
        coc.add(Statement1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 225, 320, 20));

        Statement2.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        Statement2.setText("Certificate of Candidacy and is recognized as a qualified candidate for the up ");
        coc.add(Statement2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 245, 320, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 6)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("This docuement is system-generated and does not require physical signature");
        coc.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 350, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel11.setText("      The filing has been accepted by the Election Administrator in complia");
        coc.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 295, 320, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel12.setText("-nce with the rules set by the Commission on Elections.");
        coc.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 315, 320, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel13.setText("     This receipt confirms that all required documents have been submitted");
        coc.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 345, 320, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel14.setText(" and that the candidate’s name will appear on the official ballot, subject to ");
        coc.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 365, 320, 20));

        id.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        coc.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 155, 150, 20));

        cname.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        coc.add(cname, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 75, 130, 20));

        pname.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        coc.add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 115, 140, 20));

        date.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        coc.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 135, 160, 20));

        position.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        coc.add(position, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 95, 140, 20));

        jPanel2.setLayout(null);

        image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(image);
        image.setBounds(0, 0, 90, 90);

        coc.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 75, 90, 90));
        coc.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 65, 310, 10));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel15.setText("applicable laws and final verification.");
        coc.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 385, 320, 20));

        getContentPane().add(coc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 350, 450));

        print.setBackground(new java.awt.Color(204, 0, 0));
        print.setForeground(new java.awt.Color(255, 255, 255));
        print.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        print.setText("Print");
        print.setOpaque(true);
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
        });
        getContentPane().add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 90, 20));

        clear.setBackground(new java.awt.Color(204, 0, 0));
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clear.setText("Clear all");
        clear.setOpaque(true);
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, 90, 20));

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
        getContentPane().add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 420, 90, 20));

        jLabel31.setBackground(new java.awt.Color(255, 153, 102));
        jLabel31.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText(" APPLICATION");
        jLabel31.setOpaque(true);
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 420, 40));

        applicationtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(applicationtable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 420, 360));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
           
       
    }//GEN-LAST:event_formInternalFrameActivated

    private void selectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectMouseClicked
       int rowIndex = applicationtable.getSelectedRow();

        if (rowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select an application!");
        }else {
            try {
                
            dbconnect dbc = new dbconnect();
            TableModel tbl = applicationtable.getModel();
            String selectedAid = tbl.getValueAt(rowIndex, 0).toString();
            ResultSet rs = dbc.getData(
    "SELECT applications.aid, candidates.lname, candidates.fname, candidates.mname, " 
                +"positions.position, candidates.cimage,applications.date,partylist.pname FROM applications " 
                +"INNER JOIN candidates ON applications.cid = candidates.cid " 
                +"INNER JOIN positions ON applications.ppid = positions.pid " 
                +"INNER JOIN partylist ON applications.pid = partylist.pid "
               + "WHERE aid = '"+tbl.getValueAt(rowIndex, 0)+"'" );
                if (rs.next()) {
                    String fname = rs.getString("fname");
                    String lname = rs.getString("lname");
                    String mname = rs.getString("mname");
                    id.setText(""+rs.getInt("aid"));
                    cname.setText(""+lname+", "+fname+", "+mname);
                    position.setText(""+rs.getString("position"));
                    date.setText(""+rs.getString("date"));
                    pname.setText(""+rs.getString("pname"));
                   
                   
                     image.setIcon(ResizeImage(rs.getString("cimage"),null,image));
                }

            } catch (SQLException ex) {
                System.out.println("" + ex);
            }
        }
    }//GEN-LAST:event_selectMouseClicked

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
        JPanel myPanel = new JPanel();
        PanelPrinter pprint = new PanelPrinter(coc);
        pprint.printPanel();
    }//GEN-LAST:event_printMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Statement;
    private javax.swing.JLabel Statement1;
    private javax.swing.JLabel Statement2;
    private javax.swing.JTable applicationtable;
    private javax.swing.JLabel clear;
    private javax.swing.JLabel cname;
    private javax.swing.JPanel coc;
    private javax.swing.JLabel date;
    private javax.swing.JLabel id;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel partylist;
    private javax.swing.JLabel pname;
    private javax.swing.JLabel position;
    private javax.swing.JLabel print;
    private javax.swing.JLabel select;
    // End of variables declaration//GEN-END:variables
}
