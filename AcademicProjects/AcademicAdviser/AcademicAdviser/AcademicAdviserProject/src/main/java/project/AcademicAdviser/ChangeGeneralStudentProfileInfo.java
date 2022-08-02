/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project.AcademicAdviser;

import java.util.TreeSet;
import javax.swing.JOptionPane;

/**
 *
 * @author 124ch
 */
public class ChangeGeneralStudentProfileInfo extends javax.swing.JFrame {

    /**
     * Creates new form ChangeGeneralStudentProfileInfo
     */
    public ChangeGeneralStudentProfileInfo() {
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

        MinorTextBox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        StudentName_changeProfileInfo_TextBox = new javax.swing.JTextField();
        major_changeProfileInfo_TextBox = new javax.swing.JTextField();
        TargetGrad_changeProfileInfo_TextBox = new javax.swing.JTextField();
        Minor_changeProfileInfo_TextBox = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        SubmitButton_changeProfileInfo_Button = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        IdTextBox = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        MinorTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinorTextBoxActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Change general student profile information screen");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("1. Enter new Student name:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("2. Enter new Major(s) :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("3. Enter new Minor(s) :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("4. Enter new  target graduation:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel11.setText("If more than one Major, kindly separate it with comma");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel12.setText("If more than one Minor, kindly separate it with comma");

        StudentName_changeProfileInfo_TextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentName_changeProfileInfo_TextBoxActionPerformed(evt);
            }
        });

        major_changeProfileInfo_TextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                major_changeProfileInfo_TextBoxActionPerformed(evt);
            }
        });

        TargetGrad_changeProfileInfo_TextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TargetGrad_changeProfileInfo_TextBoxActionPerformed(evt);
            }
        });

        Minor_changeProfileInfo_TextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Minor_changeProfileInfo_TextBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("Values in textboxes will overwrite previously recorded values");

        SubmitButton_changeProfileInfo_Button.setText("Change student profile information");
        SubmitButton_changeProfileInfo_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmitButton_changeProfileInfo_ButtonMouseClicked(evt);
            }
        });
        SubmitButton_changeProfileInfo_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButton_changeProfileInfo_ButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Enter Student ID:");

        IdTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdTextBoxActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel8.setText("Leave textbox empty if no change is to made to that student profile information");

        jButton1.setText("Go back");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(235, 235, 235))
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(273, 273, 273))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Minor_changeProfileInfo_TextBox)
                                    .addComponent(major_changeProfileInfo_TextBox)
                                    .addComponent(TargetGrad_changeProfileInfo_TextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(SubmitButton_changeProfileInfo_Button)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(StudentName_changeProfileInfo_TextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IdTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addGap(57, 57, 57))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(IdTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(StudentName_changeProfileInfo_TextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(major_changeProfileInfo_TextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Minor_changeProfileInfo_TextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TargetGrad_changeProfileInfo_TextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(SubmitButton_changeProfileInfo_Button)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StudentName_changeProfileInfo_TextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentName_changeProfileInfo_TextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentName_changeProfileInfo_TextBoxActionPerformed

    private void major_changeProfileInfo_TextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_major_changeProfileInfo_TextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_major_changeProfileInfo_TextBoxActionPerformed

    private void MinorTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinorTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MinorTextBoxActionPerformed

    private void TargetGrad_changeProfileInfo_TextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TargetGrad_changeProfileInfo_TextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TargetGrad_changeProfileInfo_TextBoxActionPerformed

    private void Minor_changeProfileInfo_TextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Minor_changeProfileInfo_TextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Minor_changeProfileInfo_TextBoxActionPerformed

    private void IdTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdTextBoxActionPerformed

    private void SubmitButton_changeProfileInfo_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitButton_changeProfileInfo_ButtonMouseClicked
        // TODO add your handling code here:
        Student tempProfile = MainMenu.StudentIndex.get(Integer.parseInt(IdTextBox.getText()));
        TreeSet<String> tempMajor = new TreeSet<String>();
        TreeSet<String> tempMinor = new TreeSet<String>();

        if (MainMenu.StudentIndex.containsKey(Integer.parseInt(IdTextBox.getText()))){
        
            String name, Major,Minor, TargetGrad;
            
            if (!StudentName_changeProfileInfo_TextBox.getText().equals("")){
                
                tempProfile.Name = StudentName_changeProfileInfo_TextBox.getText();
            
            }
            
            if (!major_changeProfileInfo_TextBox.getText().equals("")){
                
                 for(String elem: major_changeProfileInfo_TextBox.getText().split(",")) tempMajor.add(elem);
                 
                 tempProfile.Major = tempMajor;
            
            }
            
            if (!Minor_changeProfileInfo_TextBox.getText().equals("")){
                
                 for(String elem: Minor_changeProfileInfo_TextBox.getText().split(",")) tempMinor.add(elem);
                tempProfile.Minor = tempMinor;

            
            }
            
            if (! TargetGrad_changeProfileInfo_TextBox.getText().equals("")){
            
                tempProfile.TermGraduating = TargetGrad_changeProfileInfo_TextBox.getText();
            
            }
            
            MainMenu.StudentIndex.replace(Integer.parseInt(IdTextBox.getText())  , tempProfile);
            Student.SaveToCSV(MainMenu.StudentIndex.get(Integer.parseInt(IdTextBox.getText())),Integer.parseInt(IdTextBox.getText()), "CSV_FILE.txt");

            JOptionPane.showMessageDialog(null, "Successfully updated student profile");
       
        }
        
        else{
        
            JOptionPane.showMessageDialog(null, "Could not find student: Invalid ID");
            
        }// throw textbox saying that no ID was found
    }//GEN-LAST:event_SubmitButton_changeProfileInfo_ButtonMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        
        EditExistingProfile screen4 = new EditExistingProfile();
        screen4.toFront();
        screen4.setState(java.awt.Frame.NORMAL);
        screen4.setVisible(true);
        
        this.toBack();
        setVisible(false);
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void SubmitButton_changeProfileInfo_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButton_changeProfileInfo_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubmitButton_changeProfileInfo_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ChangeGeneralStudentProfileInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeGeneralStudentProfileInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeGeneralStudentProfileInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeGeneralStudentProfileInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeGeneralStudentProfileInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IdTextBox;
    private javax.swing.JTextField MinorTextBox;
    private javax.swing.JTextField Minor_changeProfileInfo_TextBox;
    private javax.swing.JTextField StudentName_changeProfileInfo_TextBox;
    private javax.swing.JButton SubmitButton_changeProfileInfo_Button;
    private javax.swing.JTextField TargetGrad_changeProfileInfo_TextBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField major_changeProfileInfo_TextBox;
    // End of variables declaration//GEN-END:variables
}
