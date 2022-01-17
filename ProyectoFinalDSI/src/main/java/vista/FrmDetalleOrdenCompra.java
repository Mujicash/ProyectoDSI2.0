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
public class FrmDetalleOrdenCompra extends javax.swing.JFrame {
    
    public static DefaultTableModel modelCompra; 

    /**
     * Creates new form FrmDetalleOrdenCompra
     */
    public FrmDetalleOrdenCompra() {
        initComponents();
        setTitle("BOTICA CRUZ DE MAYO - JAUJA");
        setSize(1040, 577);
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

        jPanelBaseDetOrdenCompra = new javax.swing.JPanel();
        jPanelRetBuscarOdenCompra = new javax.swing.JPanel();
        jLabelReturn = new javax.swing.JLabel();
        jScrollPaneDetOrdCompra = new javax.swing.JScrollPane();
        jTableDetOrdCompra = new javax.swing.JTable();
        jLabelDetOrdenCompra = new javax.swing.JLabel();
        jPanelFranjaDerecha = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBaseDetOrdenCompra.setBackground(new java.awt.Color(239, 248, 255));
        jPanelBaseDetOrdenCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelRetBuscarOdenCompra.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRetBuscarOdenCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelRetBuscarOdenCompraMouseClicked(evt);
            }
        });

        jLabelReturn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/return.png"))); // NOI18N

        javax.swing.GroupLayout jPanelRetBuscarOdenCompraLayout = new javax.swing.GroupLayout(jPanelRetBuscarOdenCompra);
        jPanelRetBuscarOdenCompra.setLayout(jPanelRetBuscarOdenCompraLayout);
        jPanelRetBuscarOdenCompraLayout.setHorizontalGroup(
            jPanelRetBuscarOdenCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRetBuscarOdenCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelReturn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelRetBuscarOdenCompraLayout.setVerticalGroup(
            jPanelRetBuscarOdenCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRetBuscarOdenCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelBaseDetOrdenCompra.add(jPanelRetBuscarOdenCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 460, 60, 55));

        jTableDetOrdCompra.setBackground(new java.awt.Color(0, 0, 38));
        jTableDetOrdCompra.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jTableDetOrdCompra.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTableDetOrdCompra.setForeground(new java.awt.Color(255, 255, 255));
        jTableDetOrdCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableDetOrdCompra.setRowHeight(32);
        jTableDetOrdCompra.setSelectionBackground(new java.awt.Color(228, 241, 254));
        jTableDetOrdCompra.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPaneDetOrdCompra.setViewportView(jTableDetOrdCompra);

        jPanelBaseDetOrdenCompra.add(jScrollPaneDetOrdCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 920, 340));

        jLabelDetOrdenCompra.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabelDetOrdenCompra.setForeground(new java.awt.Color(0, 0, 51));
        jLabelDetOrdenCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDetOrdenCompra.setText("DETALLE ORDEN DE COMPRA");
        jPanelBaseDetOrdenCompra.add(jLabelDetOrdenCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

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

        jPanelBaseDetOrdenCompra.add(jPanelFranjaDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 65, 60, 5));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBaseDetOrdenCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBaseDetOrdenCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelRetBuscarOdenCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRetBuscarOdenCompraMouseClicked
//        FrmBuscarOrdenCompra ret8 = new FrmBuscarOrdenCompra();
//        ret8.setVisible(true);
//        dispose();
    }//GEN-LAST:event_jPanelRetBuscarOdenCompraMouseClicked

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
            java.util.logging.Logger.getLogger(FrmDetalleOrdenCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDetalleOrdenCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDetalleOrdenCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDetalleOrdenCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDetalleOrdenCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelDetOrdenCompra;
    private javax.swing.JLabel jLabelReturn;
    private javax.swing.JPanel jPanelBaseDetOrdenCompra;
    private javax.swing.JPanel jPanelFranjaDerecha;
    public javax.swing.JPanel jPanelRetBuscarOdenCompra;
    public javax.swing.JScrollPane jScrollPaneDetOrdCompra;
    public javax.swing.JTable jTableDetOrdCompra;
    // End of variables declaration//GEN-END:variables
}
