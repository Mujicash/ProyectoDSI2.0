/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;


import controlador.CtrlGuiaRemision;
import javax.swing.ImageIcon;


/**
 *
 * @author USER
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/images/logo.png")).getImage());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelCentral = new javax.swing.JPanel();
        jPanelBotRegistrarOrdenSalida = new javax.swing.JPanel();
        jLabellRegistrarOrdenSalida = new javax.swing.JLabel();
        jPanelBotRegistrarOrdenCompra = new javax.swing.JPanel();
        jLabellRegistrarOrdenCompra = new javax.swing.JLabel();
        jPanelBotRegistrarDatosProveedor = new javax.swing.JPanel();
        jLabellRegistrarDatosProveedor = new javax.swing.JLabel();
        jPanelBotRegistrarDatosProducto = new javax.swing.JPanel();
        jLabellRegistrarDatosProducto = new javax.swing.JLabel();
        jPanelBotRegistrarGuiaRemision = new javax.swing.JPanel();
        jLabellRegistrarGuiaRemision = new javax.swing.JLabel();
        jLabelNomBotica = new javax.swing.JLabel();
        jPanelBotBuscarProducto = new javax.swing.JPanel();
        jLabellRegistrarGuiaRemision1 = new javax.swing.JLabel();
        jPanelBotBuscarOrdenCompra = new javax.swing.JPanel();
        jLabelBuscarOrdenCompra = new javax.swing.JLabel();
        jPanelFranja1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanelInferior = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabelFondoCeleste = new javax.swing.JLabel();
        jLabelFondoImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(228, 241, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelCentral.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBotRegistrarOrdenSalida.setBackground(new java.awt.Color(228, 241, 254));
        jPanelBotRegistrarOrdenSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBotRegistrarOrdenSalidaMouseClicked(evt);
            }
        });
        jPanelBotRegistrarOrdenSalida.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabellRegistrarOrdenSalida.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabellRegistrarOrdenSalida.setForeground(new java.awt.Color(0, 5, 25));
        jLabellRegistrarOrdenSalida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabellRegistrarOrdenSalida.setText("REGISTRAR ORDEN DE SALIDA");
        jPanelBotRegistrarOrdenSalida.add(jLabellRegistrarOrdenSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 340, 20));

        jPanelCentral.add(jPanelBotRegistrarOrdenSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 380, 40));

        jPanelBotRegistrarOrdenCompra.setBackground(new java.awt.Color(228, 241, 254));
        jPanelBotRegistrarOrdenCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBotRegistrarOrdenCompraMouseClicked(evt);
            }
        });
        jPanelBotRegistrarOrdenCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabellRegistrarOrdenCompra.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabellRegistrarOrdenCompra.setForeground(new java.awt.Color(0, 5, 25));
        jLabellRegistrarOrdenCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabellRegistrarOrdenCompra.setText("REGISTRAR ORDEN DE COMPRA");
        jPanelBotRegistrarOrdenCompra.add(jLabellRegistrarOrdenCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 340, 20));

        jPanelCentral.add(jPanelBotRegistrarOrdenCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 380, 40));

        jPanelBotRegistrarDatosProveedor.setBackground(new java.awt.Color(228, 241, 254));
        jPanelBotRegistrarDatosProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBotRegistrarDatosProveedorMouseClicked(evt);
            }
        });
        jPanelBotRegistrarDatosProveedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabellRegistrarDatosProveedor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabellRegistrarDatosProveedor.setForeground(new java.awt.Color(0, 5, 25));
        jLabellRegistrarDatosProveedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabellRegistrarDatosProveedor.setText("REGISTRAR DATOS DEL PROVEEDOR");
        jPanelBotRegistrarDatosProveedor.add(jLabellRegistrarDatosProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 340, 20));

        jPanelCentral.add(jPanelBotRegistrarDatosProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 380, 40));

        jPanelBotRegistrarDatosProducto.setBackground(new java.awt.Color(228, 241, 254));
        jPanelBotRegistrarDatosProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBotRegistrarDatosProductoMouseClicked(evt);
            }
        });
        jPanelBotRegistrarDatosProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabellRegistrarDatosProducto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabellRegistrarDatosProducto.setForeground(new java.awt.Color(0, 5, 25));
        jLabellRegistrarDatosProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabellRegistrarDatosProducto.setText("REGISTRAR DATOS DEL PRODUCTO");
        jPanelBotRegistrarDatosProducto.add(jLabellRegistrarDatosProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 11, 320, 20));

        jPanelCentral.add(jPanelBotRegistrarDatosProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 380, 40));

        jPanelBotRegistrarGuiaRemision.setBackground(new java.awt.Color(228, 241, 254));
        jPanelBotRegistrarGuiaRemision.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBotRegistrarGuiaRemisionMouseClicked(evt);
            }
        });
        jPanelBotRegistrarGuiaRemision.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabellRegistrarGuiaRemision.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabellRegistrarGuiaRemision.setForeground(new java.awt.Color(0, 5, 25));
        jLabellRegistrarGuiaRemision.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabellRegistrarGuiaRemision.setText("REGISTRAR GUÍA DE REMISIÓN");
        jPanelBotRegistrarGuiaRemision.add(jLabellRegistrarGuiaRemision, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 11, 320, 20));

        jPanelCentral.add(jPanelBotRegistrarGuiaRemision, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 380, 40));

        jLabelNomBotica.setBackground(new java.awt.Color(204, 204, 255));
        jLabelNomBotica.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabelNomBotica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNomBotica.setText("CRUZ DE MAYO");
        jPanelCentral.add(jLabelNomBotica, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 410, 40));

        jPanelBotBuscarProducto.setBackground(new java.awt.Color(228, 241, 254));
        jPanelBotBuscarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBotBuscarProductoMouseClicked(evt);
            }
        });
        jPanelBotBuscarProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabellRegistrarGuiaRemision1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabellRegistrarGuiaRemision1.setForeground(new java.awt.Color(0, 5, 25));
        jLabellRegistrarGuiaRemision1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabellRegistrarGuiaRemision1.setText("BUSCAR PRODUCTO");
        jPanelBotBuscarProducto.add(jLabellRegistrarGuiaRemision1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 11, 320, 20));

        jPanelCentral.add(jPanelBotBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 380, 40));

        jPanelBotBuscarOrdenCompra.setBackground(new java.awt.Color(228, 241, 254));
        jPanelBotBuscarOrdenCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBotBuscarOrdenCompraMouseClicked(evt);
            }
        });
        jPanelBotBuscarOrdenCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBuscarOrdenCompra.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelBuscarOrdenCompra.setForeground(new java.awt.Color(0, 5, 25));
        jLabelBuscarOrdenCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBuscarOrdenCompra.setText("BUSCAR ORDEN DE COMPRA");
        jPanelBotBuscarOrdenCompra.add(jLabelBuscarOrdenCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 11, 320, 20));

        jPanelCentral.add(jPanelBotBuscarOrdenCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 380, 40));

        jPanel1.add(jPanelCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 490, 520));

        jPanelFranja1.setBackground(new java.awt.Color(23, 178, 178));

        javax.swing.GroupLayout jPanelFranja1Layout = new javax.swing.GroupLayout(jPanelFranja1);
        jPanelFranja1.setLayout(jPanelFranja1Layout);
        jPanelFranja1Layout.setHorizontalGroup(
            jPanelFranja1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1115, Short.MAX_VALUE)
        );
        jPanelFranja1Layout.setVerticalGroup(
            jPanelFranja1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelFranja1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 515, 1115, -1));

        jPanel3.setBackground(new java.awt.Color(23, 178, 178));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 652, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, 5, 652));

        jPanelInferior.setBackground(new java.awt.Color(0, 5, 25));
        jPanelInferior.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelInferior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelInferiorMouseClicked(evt);
            }
        });
        jPanelInferior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanelInferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 1029, 130));

        jPanel4.setBackground(new java.awt.Color(0, 5, 25));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1029, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1029, 4));

        jLabelFondoCeleste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/celeste.png"))); // NOI18N
        jPanel1.add(jLabelFondoCeleste, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1029, 620));

        jLabelFondoImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Farmaceutico.jpg"))); // NOI18N
        jPanel1.add(jLabelFondoImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1030, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1029, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelBotBuscarOrdenCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBotBuscarOrdenCompraMouseClicked
//        FrmBuscarOrdenCompra ordCompra = new FrmBuscarOrdenCompra();
//        ordCompra.setVisible(true);
//        dispose();
    }//GEN-LAST:event_jPanelBotBuscarOrdenCompraMouseClicked

    private void jPanelBotRegistrarGuiaRemisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBotRegistrarGuiaRemisionMouseClicked

    }//GEN-LAST:event_jPanelBotRegistrarGuiaRemisionMouseClicked

    private void jPanelBotBuscarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBotBuscarProductoMouseClicked
//        FrmBuscarProducto busProducto = new FrmBuscarProducto();
//        busProducto.setVisible(true);
//        dispose();
    }//GEN-LAST:event_jPanelBotBuscarProductoMouseClicked

    private void jPanelBotRegistrarDatosProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBotRegistrarDatosProductoMouseClicked
//        FrmRegistrarDatosProducto regDatProducto = new FrmRegistrarDatosProducto();
//        regDatProducto.setVisible(true);
//        dispose();
    }//GEN-LAST:event_jPanelBotRegistrarDatosProductoMouseClicked

    private void jPanelBotRegistrarDatosProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBotRegistrarDatosProveedorMouseClicked



    }//GEN-LAST:event_jPanelBotRegistrarDatosProveedorMouseClicked

    private void jPanelBotRegistrarOrdenCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBotRegistrarOrdenCompraMouseClicked
//        FrmRegistrarOrdenCompra regOrdCompra = new FrmRegistrarOrdenCompra();
//        regOrdCompra.setVisible(true);
//        dispose();
    }//GEN-LAST:event_jPanelBotRegistrarOrdenCompraMouseClicked

    private void jPanelBotRegistrarOrdenSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBotRegistrarOrdenSalidaMouseClicked
//        FrmRegistrarOrdenSalida regOrdSalida = new FrmRegistrarOrdenSalida();
//        regOrdSalida.setVisible(true);
//        dispose();
    }//GEN-LAST:event_jPanelBotRegistrarOrdenSalidaMouseClicked

    private void jPanelInferiorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelInferiorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelInferiorMouseClicked

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelBuscarOrdenCompra;
    private javax.swing.JLabel jLabelFondoCeleste;
    private javax.swing.JLabel jLabelFondoImagen;
    private javax.swing.JLabel jLabelNomBotica;
    private javax.swing.JLabel jLabellRegistrarDatosProducto;
    private javax.swing.JLabel jLabellRegistrarDatosProveedor;
    private javax.swing.JLabel jLabellRegistrarGuiaRemision;
    private javax.swing.JLabel jLabellRegistrarGuiaRemision1;
    private javax.swing.JLabel jLabellRegistrarOrdenCompra;
    private javax.swing.JLabel jLabellRegistrarOrdenSalida;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JPanel jPanelBotBuscarOrdenCompra;
    public javax.swing.JPanel jPanelBotBuscarProducto;
    public javax.swing.JPanel jPanelBotRegistrarDatosProducto;
    public javax.swing.JPanel jPanelBotRegistrarDatosProveedor;
    public javax.swing.JPanel jPanelBotRegistrarGuiaRemision;
    public javax.swing.JPanel jPanelBotRegistrarOrdenCompra;
    public javax.swing.JPanel jPanelBotRegistrarOrdenSalida;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelFranja1;
    private javax.swing.JPanel jPanelInferior;
    // End of variables declaration//GEN-END:variables
}
