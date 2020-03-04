package dam108t2_interfacesgraficas;
import java.time.LocalDate;
import java.util.*;
import java.time.LocalTime;
import static java.time.temporal.ChronoUnit.*;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;

public class dam108t2e505 extends javax.swing.JFrame {

    public dam108t2e505() {
        initComponents();
        movil = new cMovilPrepago_v3(635294544, 1f, 0.15f, 0.10f, 100.0f);
        float saldo = movil.consultarSaldo();
        String txt = Float.toString(saldo);
        TextFieldSaldo.setText(txt);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        llamar = new javax.swing.JButton();
        colgar = new javax.swing.JButton();
        LabelSaldo = new javax.swing.JLabel();
        TextFieldSaldo = new javax.swing.JTextField();
        recargar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        llamar.setText("Llamar");
        llamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llamarActionPerformed(evt);
            }
        });

        colgar.setText("Colgar");
        colgar.setEnabled(false);
        colgar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colgarActionPerformed(evt);
            }
        });

        LabelSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelSaldo.setText("Saldo:");

        recargar.setText("Recargar");
        recargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(recargar)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(llamar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(LabelSaldo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TextFieldSaldo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(colgar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(llamar)
                .addGap(18, 18, 18)
                .addComponent(colgar)
                .addGap(18, 18, 18)
                .addComponent(LabelSaldo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recargar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void llamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llamarActionPerformed
        float saldo = movil.consultarSaldo();
        if (saldo == 0 ) JOptionPane.showMessageDialog(this,"El saldo es 0 no se pueden efectuar llamadas");
        else {
            localDateTime = LocalDateTime.now();
            horaInicio = localDateTime.toLocalTime();

            llamar.setEnabled(false);
            colgar.setEnabled(true);
        }
    }//GEN-LAST:event_llamarActionPerformed

    private void colgarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colgarActionPerformed
        
        llamar.setEnabled(true);
        colgar.setEnabled(false);

        localDateTime = LocalDateTime.now();
        horaFin = localDateTime.toLocalTime();
        long segundosLlamada = Math.abs(SECONDS.between(horaFin, horaInicio));
        int segs = (int) segundosLlamada;

        movil.efectuarLlamada(segs);
        float saldo = movil.consultarSaldo();
        String txt = Float.toString(saldo);
        TextFieldSaldo.setText(txt);

    }//GEN-LAST:event_colgarActionPerformed

    private void recargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recargarActionPerformed
        String cantidadCadena = JOptionPane.showInputDialog(" ¿ Cuanto quieres recargar ? ");
        int cantidad = Integer.valueOf(cantidadCadena);
        movil.recargar(cantidad);
        float saldo = movil.consultarSaldo();
        String txt = Float.toString(saldo);
        TextFieldSaldo.setText(txt);
    }//GEN-LAST:event_recargarActionPerformed

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
            java.util.logging.Logger.getLogger(dam108t2e505.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dam108t2e505.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dam108t2e505.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dam108t2e505.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dam108t2e505().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelSaldo;
    private javax.swing.JTextField TextFieldSaldo;
    private javax.swing.JButton colgar;
    private javax.swing.JButton llamar;
    private javax.swing.JButton recargar;
    // End of variables declaration//GEN-END:variables
    cMovilPrepago_v3 movil;
    LocalDateTime localDateTime;
    LocalTime horaInicio;
    LocalTime horaFin;
}
