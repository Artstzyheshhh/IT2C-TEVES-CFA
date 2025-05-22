
package positions;


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
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author acer
 */
public class viewposition extends javax.swing.JInternalFrame {

    /**
     * Creates new form pcandidate
     */
    public viewposition() {
        initComponents();
        displayData();
       this.setBorder(javax.swing. BorderFactory.createEmptyBorder(0,0,0,0)); 
       BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
       bi.setNorthPane (null);
        
        postable.getTableHeader().setOpaque(false);
       postable.getTableHeader().setBackground(new java.awt.Color(221,21,21));
       postable.getTableHeader().setForeground(Color.white);
    }

   public void displayData(){
        try{
            dbconnect dbc = new dbconnect();
            ResultSet rs = dbc.getData("SELECT * FROM positions");
            postable.setModel(DbUtils.resultSetToTableModel(rs));
           
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

        }

    }
        

        
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        partylist = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        postable = new javax.swing.JTable();
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

        jLabel31.setBackground(new java.awt.Color(255, 153, 102));
        jLabel31.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText(" VIEW POSITION");
        jLabel31.setOpaque(true);
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, 40));

        postable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(postable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 780, 400));

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel partylist;
    private javax.swing.JTable postable;
    // End of variables declaration//GEN-END:variables
}
