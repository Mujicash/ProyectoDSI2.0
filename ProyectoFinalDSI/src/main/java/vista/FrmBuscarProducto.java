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
public class FrmBuscarProducto extends javax.swing.JFrame {

    /**
     * Creates new form FrmBuscarProducto
     */
    public FrmBuscarProducto() {
        initComponents();
        setTitle("BOTICA CRUZ DE MAYO - JAUJA");
        setSize(1180, 666);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBaseBusProducto = new javax.swing.JPanel();
        jPanelRetPrincipal2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelRegDatProducto = new javax.swing.JLabel();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldNomProducto = new javax.swing.JTextField();
        jLabelNomProducto = new javax.swing.JLabel();
        jButtonBusNomProducto = new javax.swing.JButton();
        jButtonBusCodProducto = new javax.swing.JButton();
        jScrollPaneBusProducto = new javax.swing.JScrollPane();
        jTableBusProducto = new javax.swing.JTable();
        jPanelLinea1 = new javax.swing.JPanel();
        jPanelLinea2 = new javax.swing.JPanel();
        jPanelFranjaDerecha = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBaseBusProducto.setBackground(new java.awt.Color(239, 248, 255));
        jPanelBaseBusProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelRetPrincipal2.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRetPrincipal2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelRetPrincipal2MouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Dropbox\\Mi PC (LAPTOP-ML2VI351)\\Documents\\CICLOS UNMSM\\CICLO VI\\DISEÑO DE SISTEMAS DE INFORMACIÓN\\ProyectoFinal\\SistemaBotica\\ProyectoDSI2.0\\ProyectoFinalDSI\\src\\main\\java\\imagenes\\return.png")); // NOI18N

        javax.swing.GroupLayout jPanelRetPrincipal2Layout = new javax.swing.GroupLayout(jPanelRetPrincipal2);
        jPanelRetPrincipal2.setLayout(jPanelRetPrincipal2Layout);
        jPanelRetPrincipal2Layout.setHorizontalGroup(
            jPanelRetPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRetPrincipal2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelRetPrincipal2Layout.setVerticalGroup(
            jPanelRetPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRetPrincipal2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelBaseBusProducto.add(jPanelRetPrincipal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 550, 60, 50));

        jLabelRegDatProducto.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabelRegDatProducto.setForeground(new java.awt.Color(0, 0, 51));
        jLabelRegDatProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelRegDatProducto.setText("BUSCAR PRODUCTO");
        jPanelBaseBusProducto.add(jLabelRegDatProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 400, -1));

        jLabelCodigo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelCodigo.setForeground(new java.awt.Color(0, 0, 51));
        jLabelCodigo.setText("CÓDIGO PRODUCTO:");
        jPanelBaseBusProducto.add(jLabelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 260, -1));

        jTextFieldCodigo.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCodigo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextFieldCodigo.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCodigo.setBorder(null);
        jTextFieldCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanelBaseBusProducto.add(jTextFieldCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 190, 40));

        jTextFieldNomProducto.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomProducto.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextFieldNomProducto.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomProducto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNomProducto.setBorder(null);
        jTextFieldNomProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanelBaseBusProducto.add(jTextFieldNomProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 320, 40));

        jLabelNomProducto.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelNomProducto.setForeground(new java.awt.Color(0, 0, 51));
        jLabelNomProducto.setText("NOMBRE PRODUCTO:");
        jPanelBaseBusProducto.add(jLabelNomProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 260, -1));

        jButtonBusNomProducto.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButtonBusNomProducto.setText("BUSCAR");
        jPanelBaseBusProducto.add(jButtonBusNomProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, 110, 40));

        jButtonBusCodProducto.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButtonBusCodProducto.setText("BUSCAR");
        jPanelBaseBusProducto.add(jButtonBusCodProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 110, 40));

        jTableBusProducto.setBackground(new java.awt.Color(0, 0, 38));
        jTableBusProducto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jTableBusProducto.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTableBusProducto.setForeground(new java.awt.Color(255, 255, 255));
        jTableBusProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "N° ORDEN", "FECHA COMPRA", "FECHA ENTREGA", "RUC PROVEEDOR", "COSTO TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableBusProducto.setRowHeight(30);
        jTableBusProducto.setSelectionBackground(new java.awt.Color(228, 241, 254));
        jTableBusProducto.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPaneBusProducto.setViewportView(jTableBusProducto);

        jPanelBaseBusProducto.add(jScrollPaneBusProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 1070, 320));

        jPanelLinea1.setBackground(new java.awt.Color(0, 5, 25));

        javax.swing.GroupLayout jPanelLinea1Layout = new javax.swing.GroupLayout(jPanelLinea1);
        jPanelLinea1.setLayout(jPanelLinea1Layout);
        jPanelLinea1Layout.setHorizontalGroup(
            jPanelLinea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanelLinea1Layout.setVerticalGroup(
            jPanelLinea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanelBaseBusProducto.add(jPanelLinea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 190, 3));

        jPanelLinea2.setBackground(new java.awt.Color(0, 5, 25));

        javax.swing.GroupLayout jPanelLinea2Layout = new javax.swing.GroupLayout(jPanelLinea2);
        jPanelLinea2.setLayout(jPanelLinea2Layout);
        jPanelLinea2Layout.setHorizontalGroup(
            jPanelLinea2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanelLinea2Layout.setVerticalGroup(
            jPanelLinea2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanelBaseBusProducto.add(jPanelLinea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 320, 3));

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

        jPanelBaseBusProducto.add(jPanelFranjaDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 65, 60, 5));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBaseBusProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 1165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBaseBusProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelRetPrincipal2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRetPrincipal2MouseClicked
//        FrmPrincipal ret2 = new FrmPrincipal();
//        ret2.setVisible(true);
//        dispose();
    }//GEN-LAST:event_jPanelRetPrincipal2MouseClicked

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
            java.util.logging.Logger.getLogger(FrmBuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBuscarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBusCodProducto;
    private javax.swing.JButton jButtonBusNomProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelNomProducto;
    private javax.swing.JLabel jLabelRegDatProducto;
    private javax.swing.JPanel jPanelBaseBusProducto;
    private javax.swing.JPanel jPanelFranjaDerecha;
    private javax.swing.JPanel jPanelLinea1;
    private javax.swing.JPanel jPanelLinea2;
    private javax.swing.JPanel jPanelRetPrincipal2;
    public javax.swing.JScrollPane jScrollPaneBusProducto;
    public javax.swing.JTable jTableBusProducto;
    public javax.swing.JTextField jTextFieldCodigo;
    public javax.swing.JTextField jTextFieldNomProducto;
    // End of variables declaration//GEN-END:variables
}
