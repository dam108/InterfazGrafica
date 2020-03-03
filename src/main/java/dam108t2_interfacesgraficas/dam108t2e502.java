package dam108t2_interfacesgraficas;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class dam108t2e502 extends javax.swing.JFrame {

    public dam108t2e502() {
        initComponents();
        buttonGroup1.add(JRadioCelsiusToFar);
        buttonGroup1.add(JRadioFarToCelsius);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        JRadioCelsiusToFar = new javax.swing.JRadioButton();
        JRadioFarToCelsius = new javax.swing.JRadioButton();
        jBConvertir = new javax.swing.JButton();
        JTextTop = new javax.swing.JTextField();
        jLabelTop = new javax.swing.JLabel();
        jLabelBottom = new javax.swing.JLabel();
        JTextBottom = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de Temperaturas");

        JRadioCelsiusToFar.setText("Celsius a Fahrenheit");
        JRadioCelsiusToFar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRadioCelsiusToFarActionPerformed(evt);
            }
        });

        JRadioFarToCelsius.setText("Fahrenheit a Celsius");
        JRadioFarToCelsius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRadioFarToCelsiusActionPerformed(evt);
            }
        });

        jBConvertir.setText("Convertir");
        jBConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConvertirActionPerformed(evt);
            }
        });

        JTextTop.setText("0.0");

        jLabelTop.setText("Temperatura Celsisus");

        jLabelBottom.setText("Temperatura Fahrenheit");

        JTextBottom.setText("0.0");
        JTextBottom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextBottomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JRadioCelsiusToFar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JRadioFarToCelsius, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelTop)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JTextTop, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBConvertir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabelBottom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                                .addComponent(JTextBottom, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(JRadioCelsiusToFar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JRadioFarToCelsius)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTop, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JTextTop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jBConvertir)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JTextBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBottom))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JRadioCelsiusToFarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRadioCelsiusToFarActionPerformed
        jLabelTop.setText("Temperatura Celsius");
        jLabelBottom.setText("Temperatura Fahrenheit");
        JTextBottom.setText(Double.toString(0.0));
        JTextTop.setText(Double.toString(0.0));
    }//GEN-LAST:event_JRadioCelsiusToFarActionPerformed

    private void JTextBottomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextBottomActionPerformed

    }//GEN-LAST:event_JTextBottomActionPerformed

    private void jBConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConvertirActionPerformed
        double res;
        if( JRadioCelsiusToFar.isSelected() ){
            cel = Double.parseDouble(JTextTop.getText());
            if(cel == 0.0){
                JOptionPane.showMessageDialog(this, "Introduce un valor distinto de cero!");
            }
            else {
                res = Conversor.convertirCelToFar(cel);
                JTextBottom.setText(Double.toString(res));
            }
        } 
        else if(JRadioFarToCelsius.isSelected()){
            far = Double.parseDouble(JTextTop.getText());
            if(far == 0.0){
                JOptionPane.showMessageDialog(this, "Introduce un valor distinto de cero!");
            }
            else {
                res = Conversor.convertirFarToCel(far);
                JTextBottom.setText(Double.toString(res));
            }
        }
        else JOptionPane.showMessageDialog(this, "No has seleccionado ninguna opcion!");
    }//GEN-LAST:event_jBConvertirActionPerformed

    private void JRadioFarToCelsiusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRadioFarToCelsiusActionPerformed
            jLabelTop.setText("Temperatura Fahrenheit ");
            jLabelBottom.setText("Temperatura Celsius ");
            JTextBottom.setText(Double.toString(0.0));
            JTextTop.setText(Double.toString(0.0));
    }//GEN-LAST:event_JRadioFarToCelsiusActionPerformed

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
            java.util.logging.Logger.getLogger(dam108t2e502.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dam108t2e502.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dam108t2e502.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dam108t2e502.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dam108t2e502().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton JRadioCelsiusToFar;
    private javax.swing.JRadioButton JRadioFarToCelsius;
    private javax.swing.JTextField JTextBottom;
    private javax.swing.JTextField JTextTop;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBConvertir;
    private javax.swing.JLabel jLabelBottom;
    private javax.swing.JLabel jLabelTop;
    // End of variables declaration//GEN-END:variables
    double far;
    double cel;
}

