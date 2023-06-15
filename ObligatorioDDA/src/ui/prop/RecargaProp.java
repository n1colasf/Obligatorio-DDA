package ui.prop;

import controladores.ControladorSolicitarRecargas;
import controladores.VistaSolicitarRecargas;
import javax.swing.JOptionPane;
import logica.dominio.Propietario;

public class RecargaProp
        extends javax.swing.JDialog implements VistaSolicitarRecargas {

    private ControladorSolicitarRecargas controlador;

    /**
     * Creates new form RecargaProp
     */
    public RecargaProp(java.awt.Frame parent, boolean modal, Propietario p) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.controlador = new ControladorSolicitarRecargas(this, p);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JSaldo = new javax.swing.JLabel();
        JimgMonto = new javax.swing.JLabel();
        JNombre = new javax.swing.JLabel();
        JImgProp = new javax.swing.JLabel();
        JLabelMonto = new javax.swing.JLabel();
        JImputMonto = new javax.swing.JTextField();
        JRecargar = new javax.swing.JButton();
        Simbolo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RECARGAR");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        JSaldo.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        JSaldo.setText("0");

        JimgMonto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/money.png"))); // NOI18N

        JNombre.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        JNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JNombre.setText("Darío Campalans");

        JImgProp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N

        JLabelMonto.setText("Monto a recargar: ");

        JImputMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JImputMontoActionPerformed(evt);
            }
        });

        JRecargar.setText("Recargar");
        JRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRecargarActionPerformed(evt);
            }
        });

        Simbolo.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        Simbolo.setText("$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(JLabelMonto)
                        .addGap(18, 18, 18)
                        .addComponent(JImputMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(JimgMonto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Simbolo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JSaldo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JImgProp)
                        .addGap(18, 18, 18)
                        .addComponent(JNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JRecargar, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JimgMonto)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JNombre)
                            .addComponent(JImgProp))
                        .addGap(6, 6, 6))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JSaldo)
                        .addComponent(Simbolo)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabelMonto)
                    .addComponent(JImputMonto, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(JRecargar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        controlador.salir();
    }//GEN-LAST:event_formWindowClosed

    private void JImputMontoActionPerformed(
            java.awt.event.ActionEvent evt) { // GEN-FIRST:event_JImputMontoActionPerformed
        // TODO add your handling code here:
    } // GEN-LAST:event_JImputMontoActionPerformed

    private void JRecargarActionPerformed(
            java.awt.event.ActionEvent evt) { // GEN-FIRST:event_JRecargarActionPerformed
        // TODO add your handling code here:
        int monto = Integer.parseInt(JImputMonto.getText());

        solicitarRecarga(monto);
        // JOptionPane.showMessageDialog(null, "Se solicito la recarga.");

        JImputMonto.setText("");

    } // GEN-LAST:event_JRecargarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JImgProp;
    private javax.swing.JTextField JImputMonto;
    private javax.swing.JLabel JLabelMonto;
    private javax.swing.JLabel JNombre;
    private javax.swing.JButton JRecargar;
    private javax.swing.JLabel JSaldo;
    private javax.swing.JLabel JimgMonto;
    private javax.swing.JLabel Simbolo;
    // End of variables declaration//GEN-END:variables

    public void solicitarRecarga(int monto) {
        controlador.solicitarRecarga(monto);
    }

    @Override
    public void mostrar(Propietario p) {
        if (p != null) {
            JNombre.setText(p.getNombreCompleto());
            JSaldo.setText(String.valueOf(p.getSaldo()));

        } else {
            JNombre.setText("");
            JSaldo.setText("");
        }
    }

    @Override
    public void error(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
}
