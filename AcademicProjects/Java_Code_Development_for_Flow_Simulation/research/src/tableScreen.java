import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 124ch
 */
public class tableScreen extends javax.swing.JFrame {

    DefaultTableModel model;


    /**
     * Creates new form tableScreen
     */
    public tableScreen() {
        String[][] tempStr = MainMenu.MatrixSolve.TableStringGUI;  // TODO TAKE EACH ELEMENT OF ROW i and put them in this var, then pass this var onto the insertRow method. Then overwrite the vars' value
        initComponents();
        int tempI = 0;
        model = (DefaultTableModel) jTable1.getModel();


        String tempK = String.valueOf(tempI);
        String tempY_j = String.valueOf(MainMenu.MatrixSolve.H);
        String tempSolution = String.valueOf(0);//TODO i+1 or i ?
        String tempEV = String.valueOf(0);
        String tempABS_ERR = String.valueOf(0);
        String tempREL_ERR = String.valueOf(0);

        model.insertRow(model.getRowCount(), new String[]{tempK,tempY_j,tempSolution,tempEV,tempABS_ERR,tempREL_ERR});



        for(int i = 0;i < MainMenu.MatrixSolve.n;){

            //TODO skip names of columns, put bounday conditions at the beginning, then inner points, then boundary conditions

            //TODO x only has inner points
            tempI++;

            tempK = String.valueOf(tempI);
            tempY_j = String.valueOf(MainMenu.MatrixSolve.Y_j_array[i+1]); //TODO IT IS N+1
            tempSolution = String.valueOf(MainMenu.MatrixSolve.x[i]);//
            tempEV = String.valueOf(MainMenu.MatrixSolve.EV[i+1]);//TODO EV IS N+1
            tempABS_ERR = String.valueOf(MainMenu.MatrixSolve.AbsoluteError[i]);
            tempREL_ERR = String.valueOf(MainMenu.MatrixSolve.RelativeError[i]);

            model.insertRow(model.getRowCount(), new String[]{tempK,tempY_j,tempSolution,tempEV,tempABS_ERR,tempREL_ERR});
            i = i + 1;
        }

        tempK = String.valueOf(tempI+1);
        tempY_j = String.valueOf(MainMenu.MatrixSolve.H*-1);
        tempSolution = String.valueOf(0);//TODO i+1 or i ?
        tempEV = String.valueOf(0);
        tempABS_ERR = String.valueOf(0);
        tempREL_ERR = String.valueOf(0);

        model.insertRow(model.getRowCount(), new String[]{tempK,tempY_j,tempSolution,tempEV,tempABS_ERR,tempREL_ERR});


    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "k", "Y_j", "Solution", "Exact Solution", "Absolute Error", "Relative Error"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
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
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1264, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:

        MainMenu screen1 = new MainMenu();
        screen1.toFront();
        screen1.setState(java.awt.Frame.NORMAL);
        screen1.setVisible(true);
        this.toBack();
            this.setVisible(false);

    }

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
            java.util.logging.Logger.getLogger(tableScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tableScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tableScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tableScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tableScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration
}
