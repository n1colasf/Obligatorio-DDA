package ui;

import ui.admin.LoginAdmin;
import ui.prop.LoginProp;

public class TestingApp extends javax.swing.JFrame {

  /**
   * Creates new form TestingApp
   *
   * @param parent
   * @param modal
   */
  public TestingApp(java.awt.Frame parent, boolean modal) {
    initComponents();
    setLocationRelativeTo(null);
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

    LoginPropBtn = new javax.swing.JButton();
    LoginAdmBtn = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jMenuBar1 = new javax.swing.JMenuBar();
    MenuItemAcerca = new javax.swing.JMenu();
    MenuItemSalir = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("OBLIGATORIO DDA");

    LoginPropBtn.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
    LoginPropBtn.setText("PROPIETARIOS");
    LoginPropBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        LoginPropBtnActionPerformed(evt);
      }
    });

    LoginAdmBtn.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
    LoginAdmBtn.setText("ADMINISTRADORES");
    LoginAdmBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        LoginAdmBtnActionPerformed(evt);
      }
    });

    jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("DISEÑO Y DESARROLLO DE APLICACIONES");

    jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 26)); // NOI18N
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setText("OBLIGATORIO");

    jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 75)); // NOI18N
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel3.setText("SISTEMA");

    jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel4.setText("SELECCIONE LA APLICACIÓN QUE DESEA TESTEAR");

    jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 75)); // NOI18N
    jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel5.setText("DE PEAJES");

    jLabel6.setIcon(new javax.swing.ImageIcon(
        getClass().getResource("/img/cvu.png"))); // NOI18N
    jLabel6.setSize(new java.awt.Dimension(30, 16));

    MenuItemAcerca.setText("Info");

    MenuItemSalir.setText("Acerca de");
    MenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        MenuItemSalirActionPerformed(evt);
      }
    });
    MenuItemAcerca.add(MenuItemSalir);

    jMenuBar1.add(MenuItemAcerca);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout =
        new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                layout.createSequentialGroup()
                    .addContainerGap(51, Short.MAX_VALUE)
                    .addGroup(
                        layout
                            .createParallelGroup(
                                javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(
                                javax.swing.GroupLayout.Alignment.TRAILING,
                                layout.createSequentialGroup()
                                    .addComponent(LoginPropBtn)
                                    .addGap(46, 46, 46)
                                    .addComponent(LoginAdmBtn)
                                    .addGap(51, 51, 51))
                            .addGroup(
                                javax.swing.GroupLayout.Alignment.TRAILING,
                                layout.createSequentialGroup()
                                    .addComponent(
                                        jLabel6,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        309,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(94, 94, 94))))
            .addGroup(
                layout.createSequentialGroup()
                    .addGroup(
                        layout
                            .createParallelGroup(
                                javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5,
                                          javax.swing.GroupLayout.DEFAULT_SIZE,
                                          javax.swing.GroupLayout.DEFAULT_SIZE,
                                          Short.MAX_VALUE)
                            .addGroup(
                                layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout
                                                  .createParallelGroup(
                                                      javax.swing.GroupLayout
                                                          .Alignment.LEADING)
                                                  .addComponent(
                                                      jLabel3,
                                                      javax.swing.GroupLayout
                                                          .Alignment.TRAILING,
                                                      javax.swing.GroupLayout
                                                          .DEFAULT_SIZE,
                                                      javax.swing.GroupLayout
                                                          .DEFAULT_SIZE,
                                                      Short.MAX_VALUE)
                                                  .addComponent(
                                                      jLabel2,
                                                      javax.swing.GroupLayout
                                                          .DEFAULT_SIZE,
                                                      javax.swing.GroupLayout
                                                          .DEFAULT_SIZE,
                                                      Short.MAX_VALUE)
                                                  .addComponent(
                                                      jLabel1,
                                                      javax.swing.GroupLayout
                                                          .DEFAULT_SIZE,
                                                      javax.swing.GroupLayout
                                                          .DEFAULT_SIZE,
                                                      Short.MAX_VALUE)))
                            .addComponent(jLabel4,
                                          javax.swing.GroupLayout.DEFAULT_SIZE,
                                          javax.swing.GroupLayout.DEFAULT_SIZE,
                                          Short.MAX_VALUE))
                    .addContainerGap()));
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel1)
                    .addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel2)
                    .addGap(34, 34, 34)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE,
                                  122, Short.MAX_VALUE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel3,
                                  javax.swing.GroupLayout.PREFERRED_SIZE, 63,
                                  javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel5)
                    .addGap(37, 37, 37)
                    .addComponent(jLabel4)
                    .addGap(18, 18, 18)
                    .addGroup(
                        layout
                            .createParallelGroup(
                                javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(
                                LoginAdmBtn,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(
                                LoginPropBtn,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(43, 43, 43)));

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void MenuItemSalirActionPerformed(
      java.awt.event
          .ActionEvent evt) { // GEN-FIRST:event_MenuItemSalirActionPerformed
    // TODO add your handling code here:
    new AcercaDe(this, true).setVisible(true);

  } // GEN-LAST:event_MenuItemSalirActionPerformed

  private void LoginPropBtnActionPerformed(
      java.awt.event
          .ActionEvent evt) { // GEN-FIRST:event_LoginPropBtnActionPerformed
    // TODO add your handling code here:
    new LoginProp(this, false).setVisible(true);
  } // GEN-LAST:event_LoginPropBtnActionPerformed

  private void LoginAdmBtnActionPerformed(
      java.awt.event
          .ActionEvent evt) { // GEN-FIRST:event_LoginAdmBtnActionPerformed
    // TODO add your handling code here:
    new LoginAdmin(this, false).setVisible(true);

  } // GEN-LAST:event_LoginAdmBtnActionPerformed

  /**
   * @param args the command line arguments
   */

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton LoginAdmBtn;
  private javax.swing.JButton LoginPropBtn;
  private javax.swing.JMenu MenuItemAcerca;
  private javax.swing.JMenuItem MenuItemSalir;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JMenuBar jMenuBar1;
  // End of variables declaration//GEN-END:variables
}
