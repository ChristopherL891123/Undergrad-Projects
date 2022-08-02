/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.comsc_1451_project;

import static com.mycompany.comsc_1451_project.InventoryControlGUI.gtr_s_RoadBike_add;
import static com.mycompany.comsc_1451_project.InventoryControlGUI.hbt_RoadBike_add;
import static com.mycompany.comsc_1451_project.InventoryControlGUI.paint_RoadBike_add;
import static com.mycompany.comsc_1451_project.InventoryControlGUI.s_sf_RoadBike_add;
import static com.mycompany.comsc_1451_project.InventoryControlGUI.sp_r_RoadBike_add;

/**
 *
 * @author Christopher
 */
public class Add_Road_Bike extends javax.swing.JFrame {
    static boolean submitButton_RoadBike_clicked;

    /**
     * Creates new form Add_Road_Bike
     */
    public Add_Road_Bike() {
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

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sp_r_input_box_RoadBike_addMenu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        g_tr_s_input_box_RoadBike_addMenu = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        paint_input_box_RoadBike_addMenu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        s_sf_input_box_RoadBike_addMenu = new javax.swing.JTextField();
        submitButton_RoadBike_AddMenu = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        hbt_input_box_RoadBike_addMenu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("Go Back");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Add Road Bike Menu");

        jLabel2.setText("Speed rating");

        jLabel3.setText("Gear Train");

        jLabel4.setText("Paint Scheme");

        jLabel5.setText("Special and Safety Features");

        submitButton_RoadBike_AddMenu.setText("Submit");
        submitButton_RoadBike_AddMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButton_RoadBike_AddMenuActionPerformed(evt);
            }
        });

        jLabel6.setText("Flat Handlebar?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(g_tr_s_input_box_RoadBike_addMenu, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sp_r_input_box_RoadBike_addMenu)
                            .addComponent(paint_input_box_RoadBike_addMenu, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(s_sf_input_box_RoadBike_addMenu)
                            .addComponent(hbt_input_box_RoadBike_addMenu)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addGap(238, 238, 238)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(0, 228, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(submitButton_RoadBike_AddMenu)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)))
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(sp_r_input_box_RoadBike_addMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(g_tr_s_input_box_RoadBike_addMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paint_input_box_RoadBike_addMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(s_sf_input_box_RoadBike_addMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hbt_input_box_RoadBike_addMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(submitButton_RoadBike_AddMenu)
                .addGap(89, 89, 89))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.toBack();
        setVisible(false);
        new Add_Bike_Menu().toFront();
        new Add_Bike_Menu().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_jButton2MouseClicked

    private void submitButton_RoadBike_AddMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButton_RoadBike_AddMenuActionPerformed
    submitButton_RoadBike_clicked = true; 

    sp_r_RoadBike_add = Integer.parseInt(sp_r_input_box_RoadBike_addMenu.getText());
    gtr_s_RoadBike_add = Integer.parseInt(g_tr_s_input_box_RoadBike_addMenu.getText());
    paint_RoadBike_add = paint_input_box_RoadBike_addMenu.getText().toString();
    s_sf_RoadBike_add = s_sf_input_box_RoadBike_addMenu.getText();
    hbt_RoadBike_add = Boolean.parseBoolean(hbt_input_box_RoadBike_addMenu.getText());
    InventoryControlGUI.addToRoadBikeInventory( InventoryControlGUI.myRoadBikeInventory,true,100);

    }//GEN-LAST:event_submitButton_RoadBike_AddMenuActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.toBack();
        setVisible(false);
        new Add_Bike_Menu().toFront();
        new Add_Bike_Menu().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Road_Bike.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Road_Bike.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Road_Bike.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Road_Bike.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Road_Bike().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField g_tr_s_input_box_RoadBike_addMenu;
    private javax.swing.JTextField hbt_input_box_RoadBike_addMenu;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField paint_input_box_RoadBike_addMenu;
    private javax.swing.JTextField s_sf_input_box_RoadBike_addMenu;
    private javax.swing.JTextField sp_r_input_box_RoadBike_addMenu;
    private javax.swing.JButton submitButton_RoadBike_AddMenu;
    // End of variables declaration//GEN-END:variables
}
