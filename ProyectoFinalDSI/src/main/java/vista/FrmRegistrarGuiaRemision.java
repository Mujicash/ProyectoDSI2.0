/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.UIManager;


/**
 *
 * @author USER
 */
public class FrmRegistrarGuiaRemision extends javax.swing.JFrame {

    /**
     * Creates new form FrmRegistrarGuiaRemision
     */
    public FrmRegistrarGuiaRemision() {
        initComponents();
        setTitle("BOTICA CRUZ DE MAYO - JAUJA");
        setSize(1068, 569);
        setResizable(false);
        setLocationRelativeTo(null);
        exploradorColor();
        
    }
    
    public void exploradorColor(){//para color formato Windows10
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarGuiaRemision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarGuiaRemision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarGuiaRemision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarGuiaRemision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBaseRegGuiaRemision = new javax.swing.JPanel();
        btnRetro = new javax.swing.JPanel();
        jPanelRetPrincipal5 = new javax.swing.JPanel();
        jLabelReturn = new javax.swing.JLabel();
        jLabelRegGuiaRemision = new javax.swing.JLabel();
        jLabelNumOrdCompra = new javax.swing.JLabel();
        textOrden = new javax.swing.JTextField();
        botonArchivo = new javax.swing.JButton();
        jLabelProveedor = new javax.swing.JLabel();
        textPartida = new javax.swing.JTextField();
        jLabelPunPartida = new javax.swing.JLabel();
        jLabelNombreArchivo = new javax.swing.JLabel();
        textNumero = new javax.swing.JTextField();
        jLabelMotTraslado = new javax.swing.JLabel();
        textProveedor = new javax.swing.JTextField();
        jLabelFechaIniTraslado = new javax.swing.JLabel();
        textAnio = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        panelArchivo = new javax.swing.JPanel();
        botonGestionar = new javax.swing.JButton();
        textArchivo = new javax.swing.JTextField();
        jLabelNumGuiaRemision = new javax.swing.JLabel();
        textMotivo = new javax.swing.JTextField();
        textDia = new javax.swing.JTextField();
        textMes = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        jPanelLinea1 = new javax.swing.JPanel();
        jPanelLinea2 = new javax.swing.JPanel();
        jPanelLinea3 = new javax.swing.JPanel();
        jPanelLinea4 = new javax.swing.JPanel();
        jPanelLinea5 = new javax.swing.JPanel();
        jPanelLinea6 = new javax.swing.JPanel();
        jPanelLinea7 = new javax.swing.JPanel();
        jPanelLinea8 = new javax.swing.JPanel();
        jPanelLinea9 = new javax.swing.JPanel();
        jPanelFranjaDerecha = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBaseRegGuiaRemision.setBackground(new java.awt.Color(239, 248, 255));
        jPanelBaseRegGuiaRemision.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());


        btnRetro.setBackground(new java.awt.Color(0, 0, 51));
        btnRetro.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRetroMouseClicked(evt);
            }
        });


        jLabelReturn.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Dropbox\\Mi PC (LAPTOP-ML2VI351)\\Documents\\CICLOS UNMSM\\CICLO VI\\DISEÑO DE SISTEMAS DE INFORMACIÓN\\ProyectoFinal\\SistemaBotica\\ProyectoDSI2.0\\ProyectoFinalDSI\\src\\main\\java\\imagenes\\return.png")); // NOI18N

        javax.swing.GroupLayout jPanelRetPrincipal5Layout = new javax.swing.GroupLayout(jPanelRetPrincipal5);
        jPanelRetPrincipal5.setLayout(jPanelRetPrincipal5Layout);
        jPanelRetPrincipal5Layout.setHorizontalGroup(
            jPanelRetPrincipal5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRetPrincipal5Layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jLabelReturn))
        );
        jPanelRetPrincipal5Layout.setVerticalGroup(
            jPanelRetPrincipal5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRetPrincipal5Layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jLabelReturn))
        );

        jPanelBaseRegGuiaRemision.add(jPanelRetPrincipal5, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 455, 50, 50));


        jLabelRegGuiaRemision.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabelRegGuiaRemision.setForeground(new java.awt.Color(0, 0, 51));
        jLabelRegGuiaRemision.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelRegGuiaRemision.setText("REGISTRAR GUÍA DE REMISIÓN");
        jPanelBaseRegGuiaRemision.add(jLabelRegGuiaRemision, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 440, -1));

        jLabelNumOrdCompra.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelNumOrdCompra.setForeground(new java.awt.Color(0, 0, 51));
        jLabelNumOrdCompra.setText("N° ORDEN COMPRA");
        jPanelBaseRegGuiaRemision.add(jLabelNumOrdCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 260, -1));

        textOrden.setBackground(new java.awt.Color(255, 255, 255));
        textOrden.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textOrden.setForeground(new java.awt.Color(0, 0, 0));
        textOrden.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textOrden.setBorder(null);
        textOrden.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanelBaseRegGuiaRemision.add(textOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 180, 40));

        botonArchivo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        botonArchivo.setText("SUBIR GUÍA REMISIÓN");
        botonArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArchivoActionPerformed(evt);
            }
        });
        jPanelBaseRegGuiaRemision.add(botonArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, 330, 40));

        jLabelProveedor.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelProveedor.setForeground(new java.awt.Color(0, 0, 51));
        jLabelProveedor.setText("PROVEEDOR");
        jPanelBaseRegGuiaRemision.add(jLabelProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 260, -1));

        textPartida.setBackground(new java.awt.Color(255, 255, 255));
        textPartida.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textPartida.setForeground(new java.awt.Color(0, 0, 0));
        textPartida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textPartida.setBorder(null);
        textPartida.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanelBaseRegGuiaRemision.add(textPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 180, 40));

        jLabelPunPartida.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelPunPartida.setForeground(new java.awt.Color(0, 0, 51));
        jLabelPunPartida.setText("PUNTO PARTIDA");
        jPanelBaseRegGuiaRemision.add(jLabelPunPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 160, -1));

        jLabelNombreArchivo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelNombreArchivo.setForeground(new java.awt.Color(0, 0, 51));
        jLabelNombreArchivo.setText("NOMBRE:");
        jPanelBaseRegGuiaRemision.add(jLabelNombreArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 80, 30));

        textNumero.setBackground(new java.awt.Color(255, 255, 255));
        textNumero.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textNumero.setForeground(new java.awt.Color(0, 0, 0));
        textNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textNumero.setBorder(null);
        textNumero.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanelBaseRegGuiaRemision.add(textNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 180, 40));

        jLabelMotTraslado.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelMotTraslado.setForeground(new java.awt.Color(0, 0, 51));
        jLabelMotTraslado.setText("MOTIVO TRASLADO");
        jPanelBaseRegGuiaRemision.add(jLabelMotTraslado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 200, -1));

        textProveedor.setBackground(new java.awt.Color(255, 255, 255));
        textProveedor.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textProveedor.setForeground(new java.awt.Color(0, 0, 0));
        textProveedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textProveedor.setBorder(null);
        textProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanelBaseRegGuiaRemision.add(textProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 320, 40));

        jLabelFechaIniTraslado.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelFechaIniTraslado.setForeground(new java.awt.Color(0, 0, 51));
        jLabelFechaIniTraslado.setText("FECHA INICIO TRASLADO");
        jPanelBaseRegGuiaRemision.add(jLabelFechaIniTraslado, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 240, -1));

        textAnio.setBackground(new java.awt.Color(255, 255, 255));
        textAnio.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textAnio.setForeground(new java.awt.Color(0, 0, 0));
        textAnio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textAnio.setBorder(null);
        textAnio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanelBaseRegGuiaRemision.add(textAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 50, 40));

        botonBuscar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        botonBuscar.setText("BUSCAR");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        jPanelBaseRegGuiaRemision.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 110, 40));

        javax.swing.GroupLayout panelArchivoLayout = new javax.swing.GroupLayout(panelArchivo);
        panelArchivo.setLayout(panelArchivoLayout);
        panelArchivoLayout.setHorizontalGroup(
            panelArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        panelArchivoLayout.setVerticalGroup(
            panelArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        jPanelBaseRegGuiaRemision.add(panelArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 330, 240));

        botonGestionar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        botonGestionar.setText("GESTIONAR");
        botonGestionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGestionarActionPerformed(evt);
            }
        });
        jPanelBaseRegGuiaRemision.add(botonGestionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, 130, 40));

        textArchivo.setEditable(false);
        textArchivo.setBackground(new java.awt.Color(255, 255, 255));
        textArchivo.setFont(new java.awt.Font("Sitka Text", 1, 20)); // NOI18N
        textArchivo.setForeground(new java.awt.Color(0, 0, 0));
        textArchivo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textArchivo.setBorder(null);
        textArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textArchivoActionPerformed(evt);
            }
        });
        jPanelBaseRegGuiaRemision.add(textArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 240, 40));

        jLabelNumGuiaRemision.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelNumGuiaRemision.setForeground(new java.awt.Color(0, 0, 51));
        jLabelNumGuiaRemision.setText("N° GUÍA REMISIÓN");
        jPanelBaseRegGuiaRemision.add(jLabelNumGuiaRemision, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 190, -1));

        textMotivo.setBackground(new java.awt.Color(255, 255, 255));
        textMotivo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textMotivo.setForeground(new java.awt.Color(0, 0, 0));
        textMotivo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textMotivo.setBorder(null);
        textMotivo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanelBaseRegGuiaRemision.add(textMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 320, 40));

        textDia.setBackground(new java.awt.Color(255, 255, 255));
        textDia.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textDia.setForeground(new java.awt.Color(0, 0, 0));
        textDia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textDia.setBorder(null);
        textDia.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanelBaseRegGuiaRemision.add(textDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 50, 40));

        textMes.setBackground(new java.awt.Color(255, 255, 255));
        textMes.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textMes.setForeground(new java.awt.Color(0, 0, 0));
        textMes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textMes.setBorder(null);
        textMes.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanelBaseRegGuiaRemision.add(textMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 50, 40));

        botonGuardar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        botonGuardar.setText("GUARDAR");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        jPanelBaseRegGuiaRemision.add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 460, 110, 40));

        jPanelLinea1.setBackground(new java.awt.Color(0, 5, 25));

        javax.swing.GroupLayout jPanelLinea1Layout = new javax.swing.GroupLayout(jPanelLinea1);
        jPanelLinea1.setLayout(jPanelLinea1Layout);
        jPanelLinea1Layout.setHorizontalGroup(
            jPanelLinea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanelLinea1Layout.setVerticalGroup(
            jPanelLinea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanelBaseRegGuiaRemision.add(jPanelLinea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 180, 3));

        jPanelLinea2.setBackground(new java.awt.Color(0, 5, 25));

        javax.swing.GroupLayout jPanelLinea2Layout = new javax.swing.GroupLayout(jPanelLinea2);
        jPanelLinea2.setLayout(jPanelLinea2Layout);
        jPanelLinea2Layout.setHorizontalGroup(
            jPanelLinea2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanelLinea2Layout.setVerticalGroup(
            jPanelLinea2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanelBaseRegGuiaRemision.add(jPanelLinea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 180, 3));

        jPanelLinea3.setBackground(new java.awt.Color(0, 5, 25));

        javax.swing.GroupLayout jPanelLinea3Layout = new javax.swing.GroupLayout(jPanelLinea3);
        jPanelLinea3.setLayout(jPanelLinea3Layout);
        jPanelLinea3Layout.setHorizontalGroup(
            jPanelLinea3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanelLinea3Layout.setVerticalGroup(
            jPanelLinea3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanelBaseRegGuiaRemision.add(jPanelLinea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 320, 3));

        jPanelLinea4.setBackground(new java.awt.Color(0, 5, 25));

        javax.swing.GroupLayout jPanelLinea4Layout = new javax.swing.GroupLayout(jPanelLinea4);
        jPanelLinea4.setLayout(jPanelLinea4Layout);
        jPanelLinea4Layout.setHorizontalGroup(
            jPanelLinea4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanelLinea4Layout.setVerticalGroup(
            jPanelLinea4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanelBaseRegGuiaRemision.add(jPanelLinea4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 320, 3));

        jPanelLinea5.setBackground(new java.awt.Color(0, 5, 25));

        javax.swing.GroupLayout jPanelLinea5Layout = new javax.swing.GroupLayout(jPanelLinea5);
        jPanelLinea5.setLayout(jPanelLinea5Layout);
        jPanelLinea5Layout.setHorizontalGroup(
            jPanelLinea5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanelLinea5Layout.setVerticalGroup(
            jPanelLinea5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanelBaseRegGuiaRemision.add(jPanelLinea5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 180, 3));

        jPanelLinea6.setBackground(new java.awt.Color(0, 5, 25));

        javax.swing.GroupLayout jPanelLinea6Layout = new javax.swing.GroupLayout(jPanelLinea6);
        jPanelLinea6.setLayout(jPanelLinea6Layout);
        jPanelLinea6Layout.setHorizontalGroup(
            jPanelLinea6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanelLinea6Layout.setVerticalGroup(
            jPanelLinea6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanelBaseRegGuiaRemision.add(jPanelLinea6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 50, 3));

        jPanelLinea7.setBackground(new java.awt.Color(0, 5, 25));

        javax.swing.GroupLayout jPanelLinea7Layout = new javax.swing.GroupLayout(jPanelLinea7);
        jPanelLinea7.setLayout(jPanelLinea7Layout);
        jPanelLinea7Layout.setHorizontalGroup(
            jPanelLinea7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanelLinea7Layout.setVerticalGroup(
            jPanelLinea7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanelBaseRegGuiaRemision.add(jPanelLinea7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 50, 3));

        jPanelLinea8.setBackground(new java.awt.Color(0, 5, 25));

        javax.swing.GroupLayout jPanelLinea8Layout = new javax.swing.GroupLayout(jPanelLinea8);
        jPanelLinea8.setLayout(jPanelLinea8Layout);
        jPanelLinea8Layout.setHorizontalGroup(
            jPanelLinea8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanelLinea8Layout.setVerticalGroup(
            jPanelLinea8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanelBaseRegGuiaRemision.add(jPanelLinea8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, 50, 3));

        jPanelLinea9.setBackground(new java.awt.Color(0, 5, 25));

        javax.swing.GroupLayout jPanelLinea9Layout = new javax.swing.GroupLayout(jPanelLinea9);
        jPanelLinea9.setLayout(jPanelLinea9Layout);
        jPanelLinea9Layout.setHorizontalGroup(
            jPanelLinea9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanelLinea9Layout.setVerticalGroup(
            jPanelLinea9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanelBaseRegGuiaRemision.add(jPanelLinea9, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 110, 240, 3));

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

        jPanelBaseRegGuiaRemision.add(jPanelFranjaDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 65, 60, 5));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBaseRegGuiaRemision, javax.swing.GroupLayout.DEFAULT_SIZE, 1033, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBaseRegGuiaRemision, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetroMouseClicked
//        FrmPrincipal ret5 = new FrmPrincipal();
//        ret5.setVisible(true);
//        dispose();
    }//GEN-LAST:event_btnRetroMouseClicked

    private void botonArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArchivoActionPerformed
        
    }//GEN-LAST:event_botonArchivoActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonGestionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGestionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonGestionarActionPerformed

    private void textArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textArchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textArchivoActionPerformed

    private void jButtonGuardarGuiaRemisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGuardarGuiaRemisionMouseClicked
        FrmGestionarInventario guardar = new FrmGestionarInventario();
        guardar.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonGuardarGuiaRemisionMouseClicked

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRegistrarGuiaRemision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarGuiaRemision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarGuiaRemision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarGuiaRemision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistrarGuiaRemision().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonArchivo;
    public javax.swing.JButton botonBuscar;
    public javax.swing.JButton botonGestionar;
    public javax.swing.JButton botonGuardar;
    public javax.swing.JPanel btnRetro;
    private javax.swing.JLabel jLabelFechaIniTraslado;
    private javax.swing.JLabel jLabelMotTraslado;
    private javax.swing.JLabel jLabelNombreArchivo;
    private javax.swing.JLabel jLabelNumGuiaRemision;
    private javax.swing.JLabel jLabelNumOrdCompra;
    private javax.swing.JLabel jLabelProveedor;
    private javax.swing.JLabel jLabelPunPartida;
    private javax.swing.JLabel jLabelRegGuiaRemision;
    private javax.swing.JLabel jLabelReturn;
    private javax.swing.JPanel jPanelBaseRegGuiaRemision;

    private javax.swing.JPanel jPanelFranjaDerecha;
    private javax.swing.JPanel jPanelLinea1;
    private javax.swing.JPanel jPanelLinea2;
    private javax.swing.JPanel jPanelLinea3;
    private javax.swing.JPanel jPanelLinea4;
    private javax.swing.JPanel jPanelLinea5;
    private javax.swing.JPanel jPanelLinea6;
    private javax.swing.JPanel jPanelLinea7;
    private javax.swing.JPanel jPanelLinea8;
    private javax.swing.JPanel jPanelLinea9;
    private javax.swing.JPanel jPanelRetPrincipal5;

    public javax.swing.JPanel panelArchivo;
    public javax.swing.JTextField textAnio;
    public javax.swing.JTextField textArchivo;
    public javax.swing.JTextField textDia;
    public javax.swing.JTextField textMes;
    public javax.swing.JTextField textMotivo;
    public javax.swing.JTextField textNumero;
    public javax.swing.JTextField textOrden;
    public javax.swing.JTextField textPartida;
    public javax.swing.JTextField textProveedor;
    // End of variables declaration//GEN-END:variables
}
