/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project.AcademicAdviser;

import javax.swing.JOptionPane;

/**
 *
 * @author 124ch
 */
public class ViewStudentProfile extends javax.swing.JFrame {

    /**
     * Creates new form ViewStudentProfile
     */
    public ViewStudentProfile() {
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
        SearchMenu_searchButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        SearchMenu_IdTextBox = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        AcademicHistoryTextArea = new javax.swing.JTextArea();
        AcademicHistoryNameTextBox = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        GoBackCreateStudentProfile1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setText("View Student Profiles Screen");

        SearchMenu_searchButton.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        SearchMenu_searchButton.setText("View specific student profile");
        SearchMenu_searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMenu_searchButtonMouseClicked(evt);
            }
        });
        SearchMenu_searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchMenu_searchButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Enter Student ID:");

        SearchMenu_IdTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchMenu_IdTextBoxActionPerformed(evt);
            }
        });

        AcademicHistoryTextArea.setColumns(20);
        AcademicHistoryTextArea.setRows(5);
        jScrollPane1.setViewportView(AcademicHistoryTextArea);

        AcademicHistoryNameTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcademicHistoryNameTextBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("Academic History for ");

        GoBackCreateStudentProfile1.setText("Go back");
        GoBackCreateStudentProfile1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GoBackCreateStudentProfile1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(GoBackCreateStudentProfile1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SearchMenu_IdTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchMenu_searchButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AcademicHistoryNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(GoBackCreateStudentProfile1))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(SearchMenu_IdTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchMenu_searchButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(AcademicHistoryNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchMenu_IdTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchMenu_IdTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchMenu_IdTextBoxActionPerformed

    private void AcademicHistoryNameTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcademicHistoryNameTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AcademicHistoryNameTextBoxActionPerformed

    private void SearchMenu_searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMenu_searchButtonMouseClicked
        // TODO add your handling code here:
        
        AcademicHistoryTextArea.setText(null);
        
        if(MainMenu.StudentIndex.containsKey(Integer.parseInt(SearchMenu_IdTextBox.getText()))){
            
            AcademicHistoryNameTextBox.setText(MainMenu.StudentIndex.get(Integer.parseInt(SearchMenu_IdTextBox.getText())).Name);
        
            for (String elem:MainMenu.StudentIndex.get(Integer.parseInt(SearchMenu_IdTextBox.getText())).getData()) AcademicHistoryTextArea.append(elem + System.lineSeparator());     
        
            
        
            JOptionPane.showMessageDialog(null, "Successfully displayed data");
        }
        else{
        
             JOptionPane.showMessageDialog(null, "Could not find student: Invalid ID");
        
        }
    }//GEN-LAST:event_SearchMenu_searchButtonMouseClicked

    private void GoBackCreateStudentProfile1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoBackCreateStudentProfile1MouseClicked
        // TODO add your handling code here:
        
        MainMenu screen8 = new MainMenu();
        screen8.toFront();
        screen8.setState(java.awt.Frame.NORMAL);
        screen8.setVisible(true);
        this.toBack();
        setVisible(false);
        
        
    }//GEN-LAST:event_GoBackCreateStudentProfile1MouseClicked

    private void SearchMenu_searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchMenu_searchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchMenu_searchButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ViewStudentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewStudentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewStudentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewStudentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewStudentProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AcademicHistoryNameTextBox;
    private javax.swing.JTextArea AcademicHistoryTextArea;
    private javax.swing.JButton GoBackCreateStudentProfile1;
    private javax.swing.JTextField SearchMenu_IdTextBox;
    private javax.swing.JButton SearchMenu_searchButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
