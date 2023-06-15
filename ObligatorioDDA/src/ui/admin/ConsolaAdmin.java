package ui.admin;

import controladores.ControladorConsolaAdmin;
import controladores.VistaConsolaAdmin;
import java.text.MessageFormat;
import logica.dominio.Administrador;

public class ConsolaAdmin
    extends javax.swing.JDialog implements VistaConsolaAdmin {

  private Administrador admin;
  private ControladorConsolaAdmin controlador;

  /**
   * Creates new form ConsolaAdmin
   */
  public ConsolaAdmin(java.awt.Frame parent, boolean modal, Administrador a) {
    super(parent, modal);
    initComponents();
    setLocationRelativeTo(null);
    this.admin = a;
    controlador = new ControladorConsolaAdmin(this, admin);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated
  // Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel3 = new javax.swing.JLabel();
    jLabel21 = new javax.swing.JLabel();
    AdminRecargas = new javax.swing.JButton();
    AdminEmularTransito = new javax.swing.JButton();
    AdminBonificacion = new javax.swing.JButton();
    AdminSalir = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    JCedula = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("CONSOLA");
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowClosed(java.awt.event.WindowEvent evt) {
        formWindowClosed(evt);
      }
    });

    jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel3.setText("CONSOLA DE ADMINISTRACIÓN");

    jLabel21.setIcon(new javax.swing.ImageIcon(
        getClass().getResource("/img/cvu-icon.png"))); // NOI18N

    AdminRecargas.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
    AdminRecargas.setText("APROBACIÓN DE RECARGAS");
    AdminRecargas.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        AdminRecargasActionPerformed(evt);
      }
    });

    AdminEmularTransito.setFont(
        new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
    AdminEmularTransito.setText("EMULAR TRÁNSITO");
    AdminEmularTransito.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        AdminEmularTransitoActionPerformed(evt);
      }
    });

    AdminBonificacion.setFont(
        new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
    AdminBonificacion.setText("ASIGNAR BONIFICACIONES");
    AdminBonificacion.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        AdminBonificacionActionPerformed(evt);
      }
    });

    AdminSalir.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
    AdminSalir.setText("SALIR");
    AdminSalir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        AdminSalirActionPerformed(evt);
      }
    });

    jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel1.setText("Administrador: ");

    JCedula.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
    JCedula.setText("1.234.567-8");

    javax.swing.GroupLayout layout =
        new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addContainerGap().addGroup(
                layout
                    .createParallelGroup(
                        javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(
                        javax.swing.GroupLayout.Alignment.TRAILING,
                        layout.createSequentialGroup()
                            .addComponent(jLabel3,
                                          javax.swing.GroupLayout.DEFAULT_SIZE,
                                          437, Short.MAX_VALUE)
                            .addContainerGap())
                    .addGroup(
                        javax.swing.GroupLayout.Alignment.TRAILING,
                        layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(
                                layout
                                    .createParallelGroup(
                                        javax.swing.GroupLayout.Alignment
                                            .TRAILING)
                                    .addComponent(
                                        AdminEmularTransito,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        393,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(
                                        AdminRecargas,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        393,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(
                                        AdminBonificacion,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        393,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(
                                        AdminSalir,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        393,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(26, 26, 26))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                      layout.createSequentialGroup()
                          .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                           Short.MAX_VALUE)
                          .addComponent(jLabel21)
                          .addGap(198, 198, 198))
            .addGroup(
                layout.createSequentialGroup()
                    .addGap(128, 128, 128)
                    .addComponent(jLabel1)
                    .addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(JCedula)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                     Short.MAX_VALUE)));
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(jLabel21)
                    .addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel3)
                    .addGap(18, 18, 18)
                    .addGroup(
                        layout
                            .createParallelGroup(
                                javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(JCedula))
                    .addGap(38, 38, 38)
                    .addComponent(AdminEmularTransito,
                                  javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                  javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(AdminRecargas,
                                  javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                  javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(AdminBonificacion,
                                  javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                  javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11,
                        Short.MAX_VALUE)
                    .addComponent(AdminSalir,
                                  javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                  javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(37, 37, 37)));

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void AdminRecargasActionPerformed(
      java.awt.event
          .ActionEvent evt) { // GEN-FIRST:event_AdminRecargasActionPerformed
    // TODO add your handling code here:
    new RecargasAdmin(null, false, admin).setVisible(true);

  } // GEN-LAST:event_AdminRecargasActionPerformed

  private void AdminEmularTransitoActionPerformed(
      java.awt.event.ActionEvent
          evt) { // GEN-FIRST:event_AdminEmularTransitoActionPerformed
    // TODO add your handling code here:
    new TransitoAdmin(null, false, admin).setVisible(true);

  } // GEN-LAST:event_AdminEmularTransitoActionPerformed

  private void AdminBonificacionActionPerformed(
      java.awt.event.ActionEvent
          evt) { // GEN-FIRST:event_AdminBonificacionActionPerformed
    // TODO add your handling code here:
    new BonificacionesAdmin(null, false, admin).setVisible(true);
  } // GEN-LAST:event_AdminBonificacionActionPerformed

  private void AdminSalirActionPerformed(
      java.awt.event
          .ActionEvent evt) { // GEN-FIRST:event_AdminSalirActionPerformed
    controlador.salir();
    this.dispose();
  } // GEN-LAST:event_AdminSalirActionPerformed

  private void formWindowClosed(
      java.awt.event.WindowEvent evt) { // GEN-FIRST:event_formWindowClosed
    controlador.salir();
  } // GEN-LAST:event_formWindowClosed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton AdminBonificacion;
  private javax.swing.JButton AdminEmularTransito;
  private javax.swing.JButton AdminRecargas;
  private javax.swing.JButton AdminSalir;
  private javax.swing.JLabel JCedula;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel21;
  private javax.swing.JLabel jLabel3;
  // End of variables declaration//GEN-END:variables

  @Override
  public void mostrarAdmin(Administrador admin) {
    String cedulaFormateada =
        formatearCedula(String.valueOf(admin.getCedula()));
    JCedula.setText(cedulaFormateada);
  }

  public static String formatearCedula(String number) {
    String pattern = "{0}.{1}.{2}-{3}";
    long parsedNumber = Long.parseLong(number);
    Object[] arguments = new Object[4];

    arguments[0] = parsedNumber / 10000000;
    arguments[1] = (parsedNumber / 100000) % 1000;
    arguments[2] = (parsedNumber / 1000) % 1000;
    arguments[3] = parsedNumber % 10;

    return MessageFormat.format(pattern, arguments);
  }
}
