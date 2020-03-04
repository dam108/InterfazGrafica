package dam108t2_interfacesgraficas;

public class dam108t2e503 extends javax.swing.JFrame {

    public dam108t2e503() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTop = new javax.swing.JLabel();
        jLabelBottom = new javax.swing.JLabel();
        jSliderConvertir = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor Temperaturas");

        jLabelTop.setText("Temperatura Celsius:");

        jLabelBottom.setText("Temperatura Fahrenheit:");

        jSliderConvertir.setMajorTickSpacing(20);
        jSliderConvertir.setMaximum(60);
        jSliderConvertir.setMinimum(-60);
        jSliderConvertir.setMinorTickSpacing(10);
        jSliderConvertir.setPaintLabels(true);
        jSliderConvertir.setPaintTicks(true);
        jSliderConvertir.setSnapToTicks(true);
        jSliderConvertir.setToolTipText("");
        jSliderConvertir.setValue(0);
        jSliderConvertir.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderConvertirStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBottom)
                    .addComponent(jLabelTop))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jSliderConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabelTop)
                .addGap(56, 56, 56)
                .addComponent(jSliderConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jLabelBottom)
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSliderConvertirStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderConvertirStateChanged
        jLabelTop.setText("Temperatura Celsius : "+jSliderConvertir.getValue() );
        jLabelBottom.setText("Temperatura Fahrenheit: "+ Conversor.convertirCelToFar(jSliderConvertir.getValue()));
    }//GEN-LAST:event_jSliderConvertirStateChanged

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
            java.util.logging.Logger.getLogger(dam108t2e503.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dam108t2e503.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dam108t2e503.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dam108t2e503.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dam108t2e503().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelBottom;
    private javax.swing.JLabel jLabelTop;
    private javax.swing.JSlider jSliderConvertir;
    // End of variables declaration//GEN-END:variables
}
