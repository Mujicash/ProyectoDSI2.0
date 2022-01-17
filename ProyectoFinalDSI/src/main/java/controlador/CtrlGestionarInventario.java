/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.DetalleCompraDAO;
import dao.FabricanteDAO;
import dao.MedicamentoDAO;
import dao.ProveedorDAO;
import dto.DetalleCompraDTO;
import dto.MedicamentoDTO;
import interfaces.ControlStrategy;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import vista.FrmBotGestionar;
import vista.FrmGestionarInventario;

/**
 *
 * @author Usuario
 */
public class CtrlGestionarInventario implements MouseListener,ControlStrategy {
    
    private FrmGestionarInventario vent;
    private CtrlGuiaRemision padre;
    private final List<DetalleCompraDTO> compra;
    private CtrlMaster ctrl;
    
    public CtrlGestionarInventario(CtrlGuiaRemision c,CtrlMaster ctrl){
        this.vent = new FrmGestionarInventario();
        this.padre = c;
        this.compra = DetalleCompraDAO.detalle(padre.getOrden().getIdOrdenCompra());
        this.ctrl = ctrl;
        
      
    }

     private void inicializarTabla(){
        String[] colums = {"MEDICAMENTO", "CANTIDAD", "GESTIONAR"};
        MedicamentoDTO med;
        FrmGestionarInventario.modelCompra = new DefaultTableModel(null,colums);        
        vent.tblDetalle.setModel( FrmGestionarInventario.modelCompra);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        String c = "GESTIONAR";
        String nombre;
        
        for(DetalleCompraDTO i : compra){
            med = MedicamentoDAO.buscar(i.getIdMedicamento());
            nombre = med.getNombre() + " " + med.getMedida()+" "+ FabricanteDAO.buscar(med.getIdFabricante()).getNombre();
            Object[] fila = { nombre, i.getUnidades(), c};
            FrmGestionarInventario.modelCompra.addRow(fila);
        }
        
       vent.tblDetalle.setModel(FrmGestionarInventario.modelCompra);
        for(int i = 0; i < vent.tblDetalle.getColumnCount(); i++){
            vent.tblDetalle.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }
    

     private boolean validarGestion(){
         boolean resp = true;
         
         for(DetalleCompraDTO i : compra){
             if(i.isGestionado()){
                 resp = true;
             }else{
                 resp = false;
                 break;
             }
         }
         
         return resp;
     }
  
     
    @Override
    public void mouseClicked(MouseEvent e) {
        
        int fila = this.vent.tblDetalle.rowAtPoint(e.getPoint());
        int columna = this.vent.tblDetalle.columnAtPoint(e.getPoint());

        if(columna==2){
            if(!compra.get(fila).isGestionado()){
                //CtrlGestionarDetalle cd = new CtrlGestionarDetalle(compra.get(fila),this.ctrl); 
                this.ctrl.emergente(new CtrlGestionarDetalle(compra.get(fila),this.ctrl));
            }else{
                JOptionPane.showMessageDialog(null, "Este campo ya esta gestionado");
            }        
        }
        
        if(e.getSource()==this.vent.btnAceptar){
            if(this.validarGestion()){
                padre.setGestion(true);
                DetalleCompraDAO.actulizarOrden(padre.getOrden().getIdOrdenCompra());
                this.cerrar();
            }else{
                JOptionPane.showMessageDialog(null, "Por favor, termine de gestionar el inventario");
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void iniciar() {
        
        this.vent.setTitle("BOTICA CRUZ DE MAYO - JAUJA");
        this.vent.setSize(1000, 670);
        this.vent.setResizable(false);
        this.vent.setLocationRelativeTo(null);
        this.vent.setIconImage(new ImageIcon(getClass().getResource("/images/logo.png")).getImage());
        
        
        this.vent.setVisible(true);
        this.vent.textOrden.setText(String.valueOf(padre.getOrden().getIdOrdenCompra()));
        String prov = ProveedorDAO.buscar(padre.getOrden().getProveedor()).getNombre();
        this.vent.textProveedor.setText(prov);
        this.vent.btnAceptar.addMouseListener(this);
        this.vent.tblDetalle.addMouseListener(this);
        
        this.inicializarTabla();
    }

    @Override
    public void cerrar() {
        this.vent.dispose();
       // this.ctrl = null;
    }
    
}
