/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author USER
 */
public class FrmRegistrarDatosProveedor extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarDatosProveedor
     */
    public FrmRegistrarDatosProveedor() {
        initComponents();
//        setTitle("BOTICA CRUZ DE MAYO - JAUJA");
//        setSize(835, 584);
//        setResizable(false);       
//        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBaseRegDatosProveedor = new javax.swing.JPanel();
        jPanelRetPrincipal4 = new javax.swing.JPanel();
        jLabelReturn = new javax.swing.JLabel();
        jLabelRegDatProveedor = new javax.swing.JLabel();
        jLabelRUC = new javax.swing.JLabel();
        jTextFieldRUC = new javax.swing.JTextField();
        jLabelDireccion = new javax.swing.JLabel();
        jTextFieldDireccion = new javax.swing.JTextField();
        jLabelEmpresa = new javax.swing.JLabel();
        jTextFieldEmpresa = new javax.swing.JTextField();
        jButtonBuscarRUC = new javax.swing.JButton();
        jButtonGuardarDatProveedor1 = new javax.swing.JButton();
        jLabelTelefono = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jPanelLinea1 = new javax.swing.JPanel();
        jPanelLinea2 = new javax.swing.JPanel();
        jPanelLinea3 = new javax.swing.JPanel();
        jPanelLinea4 = new javax.swing.JPanel();
        jPanelFranjaDerecha = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBaseRegDatosProveedor.setBackground(new java.awt.Color(239, 248, 255));
        jPanelBaseRegDatosProveedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelRetPrincipal4.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRetPrincipal4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelRetPrincipal4MouseClicked(evt);
            }
        });

        jLabelReturn.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Dropbox\\Mi PC (LAPTOP-ML2VI351)\\Documents\\CICLOS UNMSM\\CICLO VI\\DISEÑO DE SISTEMAS DE INFORMACIÓN\\ProyectoFinal\\SistemaBotica\\ProyectoDSI2.0\\ProyectoFinalDSI\\src\\main\\java\\imagenes\\return.png")); // NOI18N

        javax.swing.GroupLayout jPanelRetPrincipal4Layout = new javax.swing.GroupLayout(jPanelRetPrincipal4);
        jPanelRetPrincipal4.setLayout(jPanelRetPrincipal4Layout);
        jPanelRetPrincipal4Layout.setHorizontalGroup(
            jPanelRetPrincipal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRetPrincipal4Layout.createSequentialGroup()
                .addComponent(jLabelReturn)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanelRetPrincipal4Layout.setVerticalGroup(
            jPanelRetPrincipal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRetPrincipal4Layout.createSequentialGroup()
                .addComponent(jLabelReturn)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jPanelBaseRegDatosProveedor.add(jPanelRetPrincipal4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 470, 50, 50));

        jLabelRegDatProveedor.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabelRegDatProveedor.setForeground(new java.awt.Color(0, 0, 51));
        jLabelRegDatProveedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegDatProveedor.setText("REGISTRAR DATOS DEL PROVEEDOR");
        jPanelBaseRegDatosProveedor.add(jLabelRegDatProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 520, 50));

        jLabelRUC.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabelRUC.setForeground(new java.awt.Color(0, 0, 51));
        jLabelRUC.setText("RUC:");
        jPanelBaseRegDatosProveedor.add(jLabelRUC, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 90, 20));

        jTextFieldRUC.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldRUC.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextFieldRUC.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldRUC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldRUC.setBorder(null);
        jTextFieldRUC.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanelBaseRegDatosProveedor.add(jTextFieldRUC, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 240, 40));

        jLabelDireccion.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabelDireccion.setForeground(new java.awt.Color(0, 0, 51));
        jLabelDireccion.setText("DIRECCIÓN:");
        jPanelBaseRegDatosProveedor.add(jLabelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 150, 20));

        jTextFieldDireccion.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDireccion.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextFieldDireccion.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldDireccion.setBorder(null);
        jTextFieldDireccion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanelBaseRegDatosProveedor.add(jTextFieldDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 560, 40));

        jLabelEmpresa.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabelEmpresa.setForeground(new java.awt.Color(0, 0, 51));
        jLabelEmpresa.setText("EMPRESA:");
        jPanelBaseRegDatosProveedor.add(jLabelEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 100, 20));

        jTextFieldEmpresa.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEmpresa.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextFieldEmpresa.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldEmpresa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldEmpresa.setBorder(null);
        jTextFieldEmpresa.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanelBaseRegDatosProveedor.add(jTextFieldEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 560, 40));

        jButtonBuscarRUC.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButtonBuscarRUC.setText("BUSCAR");
        jPanelBaseRegDatosProveedor.add(jButtonBuscarRUC, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 110, 40));

        jButtonGuardarDatProveedor1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButtonGuardarDatProveedor1.setText("GUARDAR");
        jPanelBaseRegDatosProveedor.add(jButtonGuardarDatProveedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 110, 40));

        jLabelTelefono.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabelTelefono.setForeground(new java.awt.Color(0, 0, 51));
        jLabelTelefono.setText("TELEFONO:");
        jPanelBaseRegDatosProveedor.add(jLabelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 150, 20));

        jTextFieldTelefono.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTelefono.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextFieldTelefono.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTelefono.setBorder(null);
        jTextFieldTelefono.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanelBaseRegDatosProveedor.add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 560, 40));

        jPanelLinea1.setBackground(new java.awt.Color(0, 5, 25));

        javax.swing.GroupLayout jPanelLinea1Layout = new javax.swing.GroupLayout(jPanelLinea1);
        jPanelLinea1.setLayout(jPanelLinea1Layout);
        jPanelLinea1Layout.setHorizontalGroup(
            jPanelLinea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanelLinea1Layout.setVerticalGroup(
            jPanelLinea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanelBaseRegDatosProveedor.add(jPanelLinea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 240, 3));

        jPanelLinea2.setBackground(new java.awt.Color(0, 5, 25));

        javax.swing.GroupLayout jPanelLinea2Layout = new javax.swing.GroupLayout(jPanelLinea2);
        jPanelLinea2.setLayout(jPanelLinea2Layout);
        jPanelLinea2Layout.setHorizontalGroup(
            jPanelLinea2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        jPanelLinea2Layout.setVerticalGroup(
            jPanelLinea2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanelBaseRegDatosProveedor.add(jPanelLinea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 560, 3));

        jPanelLinea3.setBackground(new java.awt.Color(0, 5, 25));

        javax.swing.GroupLayout jPanelLinea3Layout = new javax.swing.GroupLayout(jPanelLinea3);
        jPanelLinea3.setLayout(jPanelLinea3Layout);
        jPanelLinea3Layout.setHorizontalGroup(
            jPanelLinea3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        jPanelLinea3Layout.setVerticalGroup(
            jPanelLinea3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanelBaseRegDatosProveedor.add(jPanelLinea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 560, 3));

        jPanelLinea4.setBackground(new java.awt.Color(0, 5, 25));

        javax.swing.GroupLayout jPanelLinea4Layout = new javax.swing.GroupLayout(jPanelLinea4);
        jPanelLinea4.setLayout(jPanelLinea4Layout);
        jPanelLinea4Layout.setHorizontalGroup(
            jPanelLinea4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        jPanelLinea4Layout.setVerticalGroup(
            jPanelLinea4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanelBaseRegDatosProveedor.add(jPanelLinea4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 560, 3));

        jPanelFranjaDerecha.setBackground(new java.awt.Color(23, 178, 178));

        javax.swing.GroupLayout jPanelFranjaDerechaLayout = new javax.swing.GroupLayout(jPanelFranjaDerecha);
        jPanelFranjaDerecha.setLayout(jPanelFranjaDerechaLayout);
        jPanelFranjaDerechaLayout.setHorizontalGroup(
            jPanelFranjaDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanelFranjaDerechaLayout.setVerticalGroup(
            jPanelFranjaDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanelBaseRegDatosProveedor.add(jPanelFranjaDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 65, 60, 5));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBaseRegDatosProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBaseRegDatosProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelRetPrincipal4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRetPrincipal4MouseClicked
//        FrmPrincipal ret4 = new FrmPrincipal();
//        ret4.setVisible(true);
//        dispose();
    }//GEN-LAST:event_jPanelRetPrincipal4MouseClicked

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
            java.util.logging.Logger.getLogger(FrmRegistrarDatosProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarDatosProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarDatosProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarDatosProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistrarDatosProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonBuscarRUC;
    public javax.swing.JButton jButtonGuardarDatProveedor1;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelEmpresa;
    private javax.swing.JLabel jLabelRUC;
    private javax.swing.JLabel jLabelRegDatProveedor;
    private javax.swing.JLabel jLabelReturn;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JPanel jPanelBaseRegDatosProveedor;
    private javax.swing.JPanel jPanelFranjaDerecha;
    private javax.swing.JPanel jPanelLinea1;
    private javax.swing.JPanel jPanelLinea2;
    private javax.swing.JPanel jPanelLinea3;
    private javax.swing.JPanel jPanelLinea4;
    public javax.swing.JPanel jPanelRetPrincipal4;
    public javax.swing.JTextField jTextFieldDireccion;
    public javax.swing.JTextField jTextFieldEmpresa;
    public javax.swing.JTextField jTextFieldRUC;
    public javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
