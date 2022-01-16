/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class FrmRegistrarOrdenSalida extends javax.swing.JFrame {
    
    public static DefaultTableModel modelSalida; 

    /**
     * Creates new form FrmRegistrarOrdenSalida
     */
    public FrmRegistrarOrdenSalida() {
        initComponents();
        setTitle("BOTICA CRUZ DE MAYO - JAUJA");
        setSize(1020, 660);
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

        jPanelBaseRegOrdenSalida = new javax.swing.JPanel();
        jPanelRetPrincipal7 = new javax.swing.JPanel();
        jLabelReturn = new javax.swing.JLabel();
        jLabelRegDatProducto = new javax.swing.JLabel();
        jLabelCodProducto = new javax.swing.JLabel();
        jLabelCantProducto = new javax.swing.JLabel();
        jTextFieldCantProducto = new javax.swing.JTextField();
        jButtonCrearOrden = new javax.swing.JButton();
        jLabelMotSalida = new javax.swing.JLabel();
        jTextFieldMotSalida = new javax.swing.JTextField();
        jButtonDescartarProducto = new javax.swing.JButton();
        jButtonDescartar = new javax.swing.JButton();
        jbtnAgregarProducto = new javax.swing.JButton();
        jScrollRegOrdSalida = new javax.swing.JScrollPane();
        jTableRegOrdSalida = new javax.swing.JTable();
        jcbMedicamentos = new javax.swing.JComboBox<>();
        jLabelCodProducto1 = new javax.swing.JLabel();
        jcbTipo = new javax.swing.JComboBox<>();
        jPanelLinea1 = new javax.swing.JPanel();
        jPanelLinea2 = new javax.swing.JPanel();
        jPanelFranjaDerecha = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 660));

        jPanelBaseRegOrdenSalida.setBackground(new java.awt.Color(228, 241, 254));
        jPanelBaseRegOrdenSalida.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelRetPrincipal7.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRetPrincipal7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelRetPrincipal7MouseClicked(evt);
            }
        });

        jLabelReturn.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Dropbox\\Mi PC (LAPTOP-ML2VI351)\\Documents\\CICLOS UNMSM\\CICLO VI\\DISEÑO DE SISTEMAS DE INFORMACIÓN\\ProyectoFinal\\SistemaBotica\\ProyectoDSI2.0\\ProyectoFinalDSI\\src\\main\\java\\imagenes\\return.png")); // NOI18N

        javax.swing.GroupLayout jPanelRetPrincipal7Layout = new javax.swing.GroupLayout(jPanelRetPrincipal7);
        jPanelRetPrincipal7.setLayout(jPanelRetPrincipal7Layout);
        jPanelRetPrincipal7Layout.setHorizontalGroup(
            jPanelRetPrincipal7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRetPrincipal7Layout.createSequentialGroup()
                .addComponent(jLabelReturn)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanelRetPrincipal7Layout.setVerticalGroup(
            jPanelRetPrincipal7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRetPrincipal7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelBaseRegOrdenSalida.add(jPanelRetPrincipal7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 540, 50, 50));

        jLabelRegDatProducto.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabelRegDatProducto.setForeground(new java.awt.Color(0, 0, 51));
        jLabelRegDatProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelRegDatProducto.setText("REGISTRAR ORDEN DE SALIDA");
        jPanelBaseRegOrdenSalida.add(jLabelRegDatProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 440, -1));

        jLabelCodProducto.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelCodProducto.setForeground(new java.awt.Color(0, 0, 51));
        jLabelCodProducto.setText("TIPO PRODUCTO");
        jPanelBaseRegOrdenSalida.add(jLabelCodProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 190, -1));

        jLabelCantProducto.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelCantProducto.setForeground(new java.awt.Color(0, 0, 51));
        jLabelCantProducto.setText("CANTIDAD PRODUCTO");
        jPanelBaseRegOrdenSalida.add(jLabelCantProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 190, -1));

        jTextFieldCantProducto.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCantProducto.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextFieldCantProducto.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCantProducto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCantProducto.setBorder(null);
        jTextFieldCantProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextFieldCantProducto.setPreferredSize(new java.awt.Dimension(23, 30));
        jPanelBaseRegOrdenSalida.add(jTextFieldCantProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 190, 40));

        jButtonCrearOrden.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButtonCrearOrden.setText("CREAR ORDEN");
        jPanelBaseRegOrdenSalida.add(jButtonCrearOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 550, 130, 40));

        jLabelMotSalida.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelMotSalida.setForeground(new java.awt.Color(0, 0, 51));
        jLabelMotSalida.setText("MOTIVO SALIDA");
        jPanelBaseRegOrdenSalida.add(jLabelMotSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 150, -1));

        jTextFieldMotSalida.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldMotSalida.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextFieldMotSalida.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldMotSalida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldMotSalida.setBorder(null);
        jTextFieldMotSalida.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelBaseRegOrdenSalida.add(jTextFieldMotSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 860, 40));

        jButtonDescartarProducto.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButtonDescartarProducto.setText("DESCARTAR PRODUCTO");
        jPanelBaseRegOrdenSalida.add(jButtonDescartarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, 200, 40));

        jButtonDescartar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButtonDescartar.setText("DESCARTAR");
        jPanelBaseRegOrdenSalida.add(jButtonDescartar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 550, 120, 40));

        jbtnAgregarProducto.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jbtnAgregarProducto.setText("AÑADIR");
        jbtnAgregarProducto.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanelBaseRegOrdenSalida.add(jbtnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 220, 110, 40));

        jTableRegOrdSalida.setBackground(new java.awt.Color(0, 0, 38));
        jTableRegOrdSalida.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jTableRegOrdSalida.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTableRegOrdSalida.setForeground(new java.awt.Color(255, 255, 255));
        jTableRegOrdSalida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableRegOrdSalida.setRowHeight(30);
        jTableRegOrdSalida.setSelectionBackground(new java.awt.Color(228, 241, 254));
        jTableRegOrdSalida.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollRegOrdSalida.setViewportView(jTableRegOrdSalida);

        jPanelBaseRegOrdenSalida.add(jScrollRegOrdSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 870, 220));

        jPanelBaseRegOrdenSalida.add(jcbMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 180, 30));

        jLabelCodProducto1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelCodProducto1.setForeground(new java.awt.Color(0, 0, 51));
        jLabelCodProducto1.setText("CÓDIGO MEDICAMENTO");
        jPanelBaseRegOrdenSalida.add(jLabelCodProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 200, -1));

        jcbTipo.setPreferredSize(new java.awt.Dimension(23, 35));
        jPanelBaseRegOrdenSalida.add(jcbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 190, -1));

        jPanelLinea1.setBackground(new java.awt.Color(0, 5, 25));

        javax.swing.GroupLayout jPanelLinea1Layout = new javax.swing.GroupLayout(jPanelLinea1);
        jPanelLinea1.setLayout(jPanelLinea1Layout);
        jPanelLinea1Layout.setHorizontalGroup(
            jPanelLinea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        jPanelLinea1Layout.setVerticalGroup(
            jPanelLinea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanelBaseRegOrdenSalida.add(jPanelLinea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 860, 3));

        jPanelLinea2.setBackground(new java.awt.Color(0, 5, 25));

        javax.swing.GroupLayout jPanelLinea2Layout = new javax.swing.GroupLayout(jPanelLinea2);
        jPanelLinea2.setLayout(jPanelLinea2Layout);
        jPanelLinea2Layout.setHorizontalGroup(
            jPanelLinea2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanelLinea2Layout.setVerticalGroup(
            jPanelLinea2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanelBaseRegOrdenSalida.add(jPanelLinea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 190, 3));

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

        jPanelBaseRegOrdenSalida.add(jPanelFranjaDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 65, 60, 5));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBaseRegOrdenSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBaseRegOrdenSalida, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelRetPrincipal7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRetPrincipal7MouseClicked
//        FrmPrincipal ret7 = new FrmPrincipal();
//        ret7.setVisible(true);
//        dispose();
    }//GEN-LAST:event_jPanelRetPrincipal7MouseClicked

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
            java.util.logging.Logger.getLogger(FrmRegistrarOrdenSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarOrdenSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarOrdenSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarOrdenSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistrarOrdenSalida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonCrearOrden;
    public javax.swing.JButton jButtonDescartar;
    public javax.swing.JButton jButtonDescartarProducto;
    private javax.swing.JLabel jLabelCantProducto;
    private javax.swing.JLabel jLabelCodProducto;
    private javax.swing.JLabel jLabelCodProducto1;
    private javax.swing.JLabel jLabelMotSalida;
    private javax.swing.JLabel jLabelRegDatProducto;
    private javax.swing.JLabel jLabelReturn;
    private javax.swing.JPanel jPanelBaseRegOrdenSalida;
    private javax.swing.JPanel jPanelFranjaDerecha;
    private javax.swing.JPanel jPanelLinea1;
    private javax.swing.JPanel jPanelLinea2;
    public javax.swing.JPanel jPanelRetPrincipal7;
    public javax.swing.JScrollPane jScrollRegOrdSalida;
    public javax.swing.JTable jTableRegOrdSalida;
    public javax.swing.JTextField jTextFieldCantProducto;
    public javax.swing.JTextField jTextFieldMotSalida;
    public javax.swing.JButton jbtnAgregarProducto;
    public javax.swing.JComboBox<String> jcbMedicamentos;
    public javax.swing.JComboBox<String> jcbTipo;
    // End of variables declaration//GEN-END:variables
}
