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
public class FrmGestionarInventario extends javax.swing.JFrame {

    
    public static DefaultTableModel modelCompra;
    
    /**
     * Creates new form FrmGestionarInventario
     */
    public FrmGestionarInventario() {
        initComponents();
        setTitle("BOTICA CRUZ DE MAYO - JAUJA");
        setSize(1000, 670);
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

        jPanelBaseGestionInventario = new javax.swing.JPanel();
        jLabelRegDatProducto = new javax.swing.JLabel();
        textOrden = new javax.swing.JLabel();
        textProveedor = new javax.swing.JLabel();
        jScrollPaneBusProducto = new javax.swing.JScrollPane();
        tblDetalle = new javax.swing.JTable();
        btnRetro = new javax.swing.JPanel();
        jLabelReturn = new javax.swing.JLabel();
        jLabelNumOrdenCompra1 = new javax.swing.JLabel();
        jLabelProveedor1 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        jPanelFranjaDerecha = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBaseGestionInventario.setBackground(new java.awt.Color(239, 248, 255));
        jPanelBaseGestionInventario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelRegDatProducto.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabelRegDatProducto.setForeground(new java.awt.Color(0, 0, 51));
        jLabelRegDatProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelRegDatProducto.setText("GESTIONAR INVENTARIO");
        jPanelBaseGestionInventario.add(jLabelRegDatProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 390, -1));

        textOrden.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        textOrden.setForeground(new java.awt.Color(0, 0, 51));
        textOrden.setText("Aqui va el numero");
        jPanelBaseGestionInventario.add(textOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 260, -1));

        textProveedor.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        textProveedor.setForeground(new java.awt.Color(0, 0, 51));
        textProveedor.setText("Aqui va el proveedor");
        jPanelBaseGestionInventario.add(textProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 260, -1));

        tblDetalle.setBackground(new java.awt.Color(0, 0, 38));
        tblDetalle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        tblDetalle.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        tblDetalle.setForeground(new java.awt.Color(255, 255, 255));
        tblDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "PRODUCTO", "CANTIDAD", "GESTIONAR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDetalle.setRowHeight(30);
        tblDetalle.setSelectionBackground(new java.awt.Color(228, 241, 254));
        tblDetalle.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPaneBusProducto.setViewportView(tblDetalle);

        jPanelBaseGestionInventario.add(jScrollPaneBusProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 890, 240));

        btnRetro.setBackground(new java.awt.Color(255, 255, 255));
        btnRetro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRetroMouseClicked(evt);
            }
        });

        jLabelReturn.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Dropbox\\Mi PC (LAPTOP-ML2VI351)\\Documents\\CICLOS UNMSM\\CICLO VI\\DISEÑO DE SISTEMAS DE INFORMACIÓN\\ProyectoFinal\\SistemaBotica\\ProyectoDSI2.0\\ProyectoFinalDSI\\src\\main\\java\\imagenes\\return.png")); // NOI18N

        javax.swing.GroupLayout btnRetroLayout = new javax.swing.GroupLayout(btnRetro);
        btnRetro.setLayout(btnRetroLayout);
        btnRetroLayout.setHorizontalGroup(
            btnRetroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRetroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelReturn)
                .addContainerGap())
        );
        btnRetroLayout.setVerticalGroup(
            btnRetroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelReturn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, Short.MAX_VALUE)
        );

        jPanelBaseGestionInventario.add(btnRetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 570, 60, 45));

        jLabelNumOrdenCompra1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelNumOrdenCompra1.setForeground(new java.awt.Color(0, 0, 51));
        jLabelNumOrdenCompra1.setText("N° ORDEN COMPRA:");
        jPanelBaseGestionInventario.add(jLabelNumOrdenCompra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 260, -1));

        jLabelProveedor1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelProveedor1.setForeground(new java.awt.Color(0, 0, 51));
        jLabelProveedor1.setText("PROVEEDOR:");
        jPanelBaseGestionInventario.add(jLabelProveedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 260, -1));

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanelBaseGestionInventario.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 570, 130, 40));

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

        jPanelBaseGestionInventario.add(jPanelFranjaDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 65, 60, 5));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBaseGestionInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 989, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBaseGestionInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetroMouseClicked
//        FrmRegistrarGuiaRemision ret8 = new FrmRegistrarGuiaRemision();
//        ret8.setVisible(true);
//        dispose();
    }//GEN-LAST:event_btnRetroMouseClicked

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmGestionarInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGestionarInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGestionarInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGestionarInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGestionarInventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAceptar;
    public javax.swing.JPanel btnRetro;
    private javax.swing.JLabel jLabelNumOrdenCompra1;
    private javax.swing.JLabel jLabelProveedor1;
    private javax.swing.JLabel jLabelRegDatProducto;
    private javax.swing.JLabel jLabelReturn;
    private javax.swing.JPanel jPanelBaseGestionInventario;
    private javax.swing.JPanel jPanelFranjaDerecha;
    public javax.swing.JScrollPane jScrollPaneBusProducto;
    public javax.swing.JTable tblDetalle;
    public javax.swing.JLabel textOrden;
    public javax.swing.JLabel textProveedor;
    // End of variables declaration//GEN-END:variables
}
