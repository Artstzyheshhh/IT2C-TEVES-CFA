/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidates;

import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author acer
 */
public class managecandidates extends javax.swing.JInternalFrame {

    /**
     * Creates new form managecandidates
     */
    public managecandidates() {
        initComponents();
          this.setBorder(javax.swing. BorderFactory.createEmptyBorder(0,0,0,0)); 
       BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
       bi.setNorthPane (null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topbar = new javax.swing.JPanel();
        view = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
        edit = new javax.swing.JLabel();
        delete = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topbar.setBackground(new java.awt.Color(255, 255, 255));
        topbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        view.setForeground(new java.awt.Color(204, 0, 0));
        view.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        view.setText("View");
        view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewMouseExited(evt);
            }
        });
        topbar.add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 110, 20));

        add.setBackground(new java.awt.Color(204, 0, 0));
        add.setForeground(new java.awt.Color(204, 0, 0));
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
        topbar.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 110, 20));

        edit.setBackground(new java.awt.Color(153, 153, 153));
        edit.setForeground(new java.awt.Color(204, 0, 0));
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
        topbar.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 110, 20));

        delete.setForeground(new java.awt.Color(204, 0, 0));
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
        topbar.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 110, 20));

        getContentPane().add(topbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 820, 100));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 800, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseClicked
        jDesktopPane1.removeAll();
        viewcandidates vw = new viewcandidates();
        jDesktopPane1.add(vw).setVisible(true);
    }//GEN-LAST:event_viewMouseClicked

    private void viewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseEntered
        view.setOpaque(true);
        view.setBackground(new java.awt.Color(204,204,204));
        view.setForeground(Color.white);
    }//GEN-LAST:event_viewMouseEntered

    private void viewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseExited
        view.setBackground(Color.white);
        view.setForeground(new java.awt.Color(204,0,0));
        view.setOpaque(false);
    }//GEN-LAST:event_viewMouseExited

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        jDesktopPane1.removeAll();
       addcandidate ad = new addcandidate();
        jDesktopPane1.add(ad).setVisible(true);

    }//GEN-LAST:event_addMouseClicked

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setOpaque(true);
        add.setBackground(new java.awt.Color(204,204,204));
        add.setForeground(Color.white);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setBackground(Color.white);
        add.setForeground(new java.awt.Color(204,0,0));
    }//GEN-LAST:event_addMouseExited

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        jDesktopPane1.removeAll();
        editcandidate ed = new editcandidate();
        jDesktopPane1.add(ed).setVisible(true);
    }//GEN-LAST:event_editMouseClicked

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        edit.setOpaque(true);
        edit.setBackground(new java.awt.Color(204,204,204));
        edit.setForeground(Color.white);
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        edit.setBackground(Color.white);
        edit.setForeground(new java.awt.Color(204,0,0));
        edit.setOpaque(false);
    }//GEN-LAST:event_editMouseExited

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteMouseClicked

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setOpaque(true);
        delete.setBackground(new java.awt.Color(204,204,204));
        delete.setForeground(Color.white);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setBackground(Color.white);
        delete.setForeground(new java.awt.Color(204,0,0));
        delete.setOpaque(false);
    }//GEN-LAST:event_deleteMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JLabel delete;
    private javax.swing.JLabel edit;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel topbar;
    private javax.swing.JLabel view;
    // End of variables declaration//GEN-END:variables
}
