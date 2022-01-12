package vista;

import conexion.Conexion;
import javax.swing.JOptionPane;

/**
 *
 * @author André Mujica
 */
public class FrmLogin extends javax.swing.JFrame {

    public FrmLogin() {
        initComponents();
        /*
        setTitle("BOTICA CRUZ DE MAYO - JAUJA");
        this.setSize(920, 615);
        setResizable(false);
        
        
       setLocationRelativeTo(null);
       
       Conexion.getInstance();
         */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBase = new javax.swing.JPanel();
        jPanelCentral = new javax.swing.JPanel();
        jLabelNomBotica = new javax.swing.JLabel();
        jLabelNomContraseña = new javax.swing.JLabel();
        jLabelNomUsuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldContraseña = new javax.swing.JPasswordField();
        jPanelBotonIngresar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBase.setBackground(new java.awt.Color(228, 241, 254));
        jPanelBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelCentral.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNomBotica.setBackground(new java.awt.Color(204, 204, 255));
        jLabelNomBotica.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabelNomBotica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNomBotica.setText("CRUZ DE MAYO");
        jPanelCentral.add(jLabelNomBotica, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 380, 40));

        jLabelNomContraseña.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabelNomContraseña.setText("CONTRASEÑA:");
        jPanelCentral.add(jLabelNomContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 160, 30));

        jLabelNomUsuario.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabelNomUsuario.setText("USUARIO:");
        jPanelCentral.add(jLabelNomUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 160, 30));

        jTextFieldUsuario.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextFieldUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanelCentral.add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 330, 40));

        jPasswordFieldContraseña.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jPasswordFieldContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanelCentral.add(jPasswordFieldContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 330, 40));

        jPanelBotonIngresar.setBackground(new java.awt.Color(0, 5, 25));
        jPanelBotonIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBotonIngresarMouseClicked(evt);
            }
        });
        jPanelBotonIngresar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INGRESAR");
        jPanelBotonIngresar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 6, 142, 28));

        jPanelCentral.add(jPanelBotonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 180, 40));

        jPanelBase.add(jPanelCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 400, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBase, javax.swing.GroupLayout.DEFAULT_SIZE, 907, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBase, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelBotonIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBotonIngresarMouseClicked
//        String usuario = "POR DEFINIR";
//        String contraseña = "POR DEFINIR";
//        
//        String Pass = new String(jPasswordFieldContraseña.getPassword());
//        
//        if(jTextFieldUsuario.getText().equals(usuario)&& Pass.equals(contra)){
//            FrmPrincipal principal = new FrmPrincipal(); 
//            principal.setVisible(true); 
//            dispose(); 
//        }
//        else{
//            
//            JOptionPane.showMessageDialog(this, "Usuario / Contraseña incorrecta"); 
//        }
    }//GEN-LAST:event_jPanelBotonIngresarMouseClicked

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNomBotica;
    private javax.swing.JLabel jLabelNomContraseña;
    private javax.swing.JLabel jLabelNomUsuario;
    private javax.swing.JPanel jPanelBase;
    public javax.swing.JPanel jPanelBotonIngresar;
    private javax.swing.JPanel jPanelCentral;
    public javax.swing.JPasswordField jPasswordFieldContraseña;
    public javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
