/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.comsc_1451_project;

/**
 *
 * @author Christopher
 */
public class EditERoadBike extends javax.swing.JFrame {

    /**
     * Creates new form EditBasicBike
     */
    public EditERoadBike() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        GoBackButtonAddBikesMenu = new javax.swing.JToggleButton();
        bikeNumber_inputBox = new javax.swing.JTextField();
        s_sf_input_box_BasicBike_addMenu = new javax.swing.JTextField();
        submitButton1_adBasicBike_addMenu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        sp_r_input_box_BasicBike_addMenu = new javax.swing.JTextField();
        g_tr_s_input_box_BasicBike_addMenu = new javax.swing.JTextField();
        paint_input_box_BasicBike_addMenu = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        rm_input_box_ERoadBike_addMenu = new javax.swing.JTextField();
        bty_input_box_ERoadBike_addMenu = new javax.swing.JTextField();
        bsz_input_box_ERoadBike_addMenu = new javax.swing.JTextField();
        mp_input_box_ERoadBike_addMenu = new javax.swing.JTextField();
        bvt_input_box_ERoadBike_addMenu = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        hbt_input_box_RoadBike_addMenu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Edit E Road Bike Menu-do not leave properties blank-");

        jLabel2.setText("Enter bike number to edit its properties:");

        GoBackButtonAddBikesMenu.setText("Go Back");
        GoBackButtonAddBikesMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GoBackButtonAddBikesMenuMouseClicked(evt);
            }
        });
        GoBackButtonAddBikesMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoBackButtonAddBikesMenuActionPerformed(evt);
            }
        });

        submitButton1_adBasicBike_addMenu.setText("Submit");
        submitButton1_adBasicBike_addMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButton1_adBasicBike_addMenuActionPerformed(evt);
            }
        });

        jLabel3.setText("Gear Train");

        jLabel4.setText("Paint Scheme");

        jLabel5.setText("Special and Safety Features");

        jLabel7.setText("Speed rating");

        sp_r_input_box_BasicBike_addMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sp_r_input_box_BasicBike_addMenuActionPerformed(evt);
            }
        });

        jLabel9.setText("Range in miles");

        jLabel10.setText("Battery Type");

        jLabel11.setText("Battery Size");

        jLabel14.setText("Motor Power");

        jLabel15.setText("Battery Voltage");

        rm_input_box_ERoadBike_addMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rm_input_box_ERoadBike_addMenuActionPerformed(evt);
            }
        });

        bty_input_box_ERoadBike_addMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bty_input_box_ERoadBike_addMenuActionPerformed(evt);
            }
        });

        bsz_input_box_ERoadBike_addMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsz_input_box_ERoadBike_addMenuActionPerformed(evt);
            }
        });

        mp_input_box_ERoadBike_addMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mp_input_box_ERoadBike_addMenuActionPerformed(evt);
            }
        });

        bvt_input_box_ERoadBike_addMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bvt_input_box_ERoadBike_addMenuActionPerformed(evt);
            }
        });

        jLabel6.setText("Flat Handlebar?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(hbt_input_box_RoadBike_addMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(sp_r_input_box_BasicBike_addMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                                .addComponent(g_tr_s_input_box_BasicBike_addMenu, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(paint_input_box_BasicBike_addMenu, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(s_sf_input_box_BasicBike_addMenu, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(90, 90, 90)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(rm_input_box_ERoadBike_addMenu, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bty_input_box_ERoadBike_addMenu, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bsz_input_box_ERoadBike_addMenu, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mp_input_box_ERoadBike_addMenu, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bvt_input_box_ERoadBike_addMenu, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(386, 386, 386))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(GoBackButtonAddBikesMenu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bikeNumber_inputBox, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(405, 405, 405)
                        .addComponent(submitButton1_adBasicBike_addMenu)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(GoBackButtonAddBikesMenu))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(bikeNumber_inputBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(rm_input_box_ERoadBike_addMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(bty_input_box_ERoadBike_addMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(bsz_input_box_ERoadBike_addMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mp_input_box_ERoadBike_addMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bvt_input_box_ERoadBike_addMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(submitButton1_adBasicBike_addMenu)
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(sp_r_input_box_BasicBike_addMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(g_tr_s_input_box_BasicBike_addMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paint_input_box_BasicBike_addMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(s_sf_input_box_BasicBike_addMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hbt_input_box_RoadBike_addMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GoBackButtonAddBikesMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoBackButtonAddBikesMenuMouseClicked
        this.toBack();
        setVisible(false);
        new EditBikesMenu().toFront();
        new MainMenu().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_GoBackButtonAddBikesMenuMouseClicked

    private void GoBackButtonAddBikesMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoBackButtonAddBikesMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GoBackButtonAddBikesMenuActionPerformed

    private void sp_r_input_box_BasicBike_addMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sp_r_input_box_BasicBike_addMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sp_r_input_box_BasicBike_addMenuActionPerformed

    private void submitButton1_adBasicBike_addMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButton1_adBasicBike_addMenuActionPerformed
        int BikeNumber = Integer.parseInt(bikeNumber_inputBox.getText());
        InventoryControlGUI. sp_r_BasicBike_add_EditMenu = Integer.parseInt(sp_r_input_box_BasicBike_addMenu.getText());
        InventoryControlGUI. gtr_s_BasicBike_add_EditMenu = Integer.parseInt(g_tr_s_input_box_BasicBike_addMenu.getText());
        InventoryControlGUI.paint_BasicBike_add_EditMenu = paint_input_box_BasicBike_addMenu.getText().toString();
        InventoryControlGUI.s_sf_BasicBike_add_EditMenu = s_sf_input_box_BasicBike_addMenu.getText();
        InventoryControlGUI.hbt_RoadBike_add_EditMenu = Boolean.valueOf(hbt_input_box_RoadBike_addMenu.getText());
        InventoryControlGUI.rm_Ebike_add_EditMenu = Integer.parseInt(rm_input_box_ERoadBike_addMenu.getText());
        InventoryControlGUI.bty_EBike_add_EditMenu = bty_input_box_ERoadBike_addMenu.getText();
        InventoryControlGUI.bsz_EBike_add_EditMenu = Integer.parseInt(bsz_input_box_ERoadBike_addMenu.getText());
        InventoryControlGUI.mp_EBike_add_EditMenu  = Double.parseDouble(mp_input_box_ERoadBike_addMenu.getText());
        InventoryControlGUI.bvt_EBike_add_EditMenu = Integer.parseInt(bvt_input_box_ERoadBike_addMenu.getText());
        
        InventoryControlGUI.EditERoadBikeInventory( InventoryControlGUI.myERoadBikeInventory,100,BikeNumber);
    }//GEN-LAST:event_submitButton1_adBasicBike_addMenuActionPerformed

    private void rm_input_box_ERoadBike_addMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rm_input_box_ERoadBike_addMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rm_input_box_ERoadBike_addMenuActionPerformed

    private void bty_input_box_ERoadBike_addMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bty_input_box_ERoadBike_addMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bty_input_box_ERoadBike_addMenuActionPerformed

    private void bsz_input_box_ERoadBike_addMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsz_input_box_ERoadBike_addMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bsz_input_box_ERoadBike_addMenuActionPerformed

    private void mp_input_box_ERoadBike_addMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mp_input_box_ERoadBike_addMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mp_input_box_ERoadBike_addMenuActionPerformed

    private void bvt_input_box_ERoadBike_addMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bvt_input_box_ERoadBike_addMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bvt_input_box_ERoadBike_addMenuActionPerformed

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
            java.util.logging.Logger.getLogger(EditERoadBike.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditERoadBike.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditERoadBike.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditERoadBike.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditERoadBike().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton GoBackButtonAddBikesMenu;
    public static javax.swing.JTextField bikeNumber_inputBox;
    private javax.swing.JTextField bsz_input_box_ERoadBike_addMenu;
    private javax.swing.JTextField bty_input_box_ERoadBike_addMenu;
    private javax.swing.JTextField bvt_input_box_ERoadBike_addMenu;
    private javax.swing.JTextField g_tr_s_input_box_BasicBike_addMenu;
    private javax.swing.JTextField hbt_input_box_RoadBike_addMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mp_input_box_ERoadBike_addMenu;
    private javax.swing.JTextField paint_input_box_BasicBike_addMenu;
    private javax.swing.JTextField rm_input_box_ERoadBike_addMenu;
    private javax.swing.JTextField s_sf_input_box_BasicBike_addMenu;
    private javax.swing.JTextField sp_r_input_box_BasicBike_addMenu;
    private javax.swing.JButton submitButton1_adBasicBike_addMenu;
    // End of variables declaration//GEN-END:variables
}
