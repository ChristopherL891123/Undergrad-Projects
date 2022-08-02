/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.comsc_1451_project;

/**
 *
 * @author Christopher
 */
public class DeleteBasicBike extends javax.swing.JFrame {

    /**
     * Creates new form DeleteBasicBike
     */
    public DeleteBasicBike() {
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

        fbgjLabel1 = new javax.swing.JLabel();
        GoBackButtonDeleteBikesMenu = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        targetDelete_input_box_DeleteBasicBike = new javax.swing.JTextField();
        SubmitTargetDeleteButton_DeleteBasicBike = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        DeleteBikeConfirm_DeleteBasicBike = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        DELETEbike_finalConfirm_DeleteBasicBike = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fbgjLabel1.setText("Delete Basic Bike Menu");

        GoBackButtonDeleteBikesMenu.setText("Go Back");
        GoBackButtonDeleteBikesMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GoBackButtonDeleteBikesMenuMouseClicked(evt);
            }
        });
        GoBackButtonDeleteBikesMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoBackButtonDeleteBikesMenuActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter Bike number to delete");

        targetDelete_input_box_DeleteBasicBike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                targetDelete_input_box_DeleteBasicBikeActionPerformed(evt);
            }
        });

        SubmitTargetDeleteButton_DeleteBasicBike.setText("Submit");
        SubmitTargetDeleteButton_DeleteBasicBike.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmitTargetDeleteButton_DeleteBasicBikeMouseClicked(evt);
            }
        });
        SubmitTargetDeleteButton_DeleteBasicBike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitTargetDeleteButton_DeleteBasicBikeActionPerformed(evt);
            }
        });

        jLabel2.setText("Are you absolutely sure that you want to delete this bike? :");

        jLabel3.setText("Y/N:");

        DELETEbike_finalConfirm_DeleteBasicBike.setText("DELETE THIS BIKE");
        DELETEbike_finalConfirm_DeleteBasicBike.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DELETEbike_finalConfirm_DeleteBasicBikeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GoBackButtonDeleteBikesMenu)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(targetDelete_input_box_DeleteBasicBike, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SubmitTargetDeleteButton_DeleteBasicBike)
                            .addComponent(fbgjLabel1)))
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteBikeConfirm_DeleteBasicBike, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DELETEbike_finalConfirm_DeleteBasicBike)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fbgjLabel1)
                    .addComponent(GoBackButtonDeleteBikesMenu))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(targetDelete_input_box_DeleteBasicBike, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SubmitTargetDeleteButton_DeleteBasicBike))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteBikeConfirm_DeleteBasicBike, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(DELETEbike_finalConfirm_DeleteBasicBike))
                .addContainerGap(343, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GoBackButtonDeleteBikesMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoBackButtonDeleteBikesMenuMouseClicked
        this.toBack();
        setVisible(false);
        new DeleteBikesMenu().toFront();
        new DeleteBikesMenu().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_GoBackButtonDeleteBikesMenuMouseClicked

    private void GoBackButtonDeleteBikesMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoBackButtonDeleteBikesMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GoBackButtonDeleteBikesMenuActionPerformed

    private void targetDelete_input_box_DeleteBasicBikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_targetDelete_input_box_DeleteBasicBikeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_targetDelete_input_box_DeleteBasicBikeActionPerformed

    private void SubmitTargetDeleteButton_DeleteBasicBikeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitTargetDeleteButton_DeleteBasicBikeMouseClicked

    InventoryControlGUI.targetDelete_basicBike = Integer.parseInt(DeleteBasicBike.targetDelete_input_box_DeleteBasicBike.getText());





        // TODO add your handling code here:
    }//GEN-LAST:event_SubmitTargetDeleteButton_DeleteBasicBikeMouseClicked

    private void SubmitTargetDeleteButton_DeleteBasicBikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitTargetDeleteButton_DeleteBasicBikeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubmitTargetDeleteButton_DeleteBasicBikeActionPerformed

    private void DELETEbike_finalConfirm_DeleteBasicBikeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DELETEbike_finalConfirm_DeleteBasicBikeMouseClicked
InventoryControlGUI.removeFromBasicBikeInventory(InventoryControlGUI.myBasicBikeInventory,true,100);



        // TODO add your handling code here:
    }//GEN-LAST:event_DELETEbike_finalConfirm_DeleteBasicBikeMouseClicked

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
            java.util.logging.Logger.getLogger(DeleteBasicBike.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteBasicBike.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteBasicBike.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteBasicBike.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteBasicBike().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DELETEbike_finalConfirm_DeleteBasicBike;
    public static javax.swing.JTextField DeleteBikeConfirm_DeleteBasicBike;
    private javax.swing.JToggleButton GoBackButtonDeleteBikesMenu;
    private javax.swing.JButton SubmitTargetDeleteButton_DeleteBasicBike;
    private javax.swing.JLabel fbgjLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JTextField targetDelete_input_box_DeleteBasicBike;
    // End of variables declaration//GEN-END:variables
}
