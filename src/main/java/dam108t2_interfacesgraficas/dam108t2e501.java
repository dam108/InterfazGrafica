package dam108t2_interfacesgraficas;

import javax.swing.JOptionPane;

public class dam108t2e501 extends javax.swing.JFrame {

    public dam108t2e501() {
        initComponents();
        JTextFahren.setText(Double.toString(0.0));
        JTextCelsius.setText(Double.toString(0.0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        celsiusTempText = new javax.swing.JLabel();
        fahrenheitTempText = new javax.swing.JLabel();
        convertir = new javax.swing.JButton();
        JTextCelsius = new javax.swing.JTextField();
        JTextFahren = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de temperaturas");

        celsiusTempText.setText("Temperatura Celsius");

        fahrenheitTempText.setText("Temperatura Fahrenheit");

        convertir.setText("Convertir");
        convertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertirActionPerformed(evt);
            }
        });

        JTextCelsius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextCelsiusActionPerformed(evt);
            }
        });

        JTextFahren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFahrenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(convertir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(celsiusTempText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fahrenheitTempText))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTextCelsius)
                            .addComponent(JTextFahren, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JTextCelsius)
                    .addComponent(celsiusTempText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addComponent(convertir)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JTextFahren)
                    .addComponent(fahrenheitTempText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void convertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertirActionPerformed
        double res;
            double far = Double.parseDouble(JTextFahren.getText());
            double cel = Double.parseDouble(JTextCelsius.getText());
            if (far != 0 && cel == 0){
                res = Conversor.convertirFarToCel(far);
                JTextCelsius.setText(Double.toString(res));
            }
            else if(cel != 0 && far == 0){
               res = Conversor.convertirCelToFar(cel);
                JTextFahren.setText(Double.toString(res)); 
            } else JOptionPane.showMessageDialog(this, "Algo ha salido mal!");
        
    }//GEN-LAST:event_convertirActionPerformed

    private void JTextCelsiusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextCelsiusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextCelsiusActionPerformed

    private void JTextFahrenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFahrenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFahrenActionPerformed

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
            java.util.logging.Logger.getLogger(dam108t2e501.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dam108t2e501.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dam108t2e501.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dam108t2e501.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dam108t2e501().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTextCelsius;
    private javax.swing.JTextField JTextFahren;
    private javax.swing.JLabel celsiusTempText;
    private javax.swing.JButton convertir;
    private javax.swing.JLabel fahrenheitTempText;
    // End of variables declaration//GEN-END:variables
}
