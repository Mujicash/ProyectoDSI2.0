
package controlador;

import dao.DetalleCompraDAO;
import dao.OrdenCompraDAO;
import dao.ProveedorDAO;
import dto.DetalleCompraDTO;
import dto.OrdenCompraDTO;
import dto.ProveedorDTO;
import interfaces.ControlStrategy;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import vista.FrmBuscarOrdenCompra;

/**
 *
 * @author Andre Mujica
 */
public class CtrlBuscarOrdenCompra implements ActionListener, ControlStrategy {
    
    private final FrmBuscarOrdenCompra vista;
    private CtrlMaster ctrl;
    private final List<ProveedorDTO> cbProveedores;
    private List<OrdenCompraDTO> ordenes;

    public CtrlBuscarOrdenCompra(CtrlMaster ctrl) {
        this.ctrl = ctrl;
        vista = new FrmBuscarOrdenCompra();
        cbProveedores = ProveedorDAO.mostrar();
        ordenes = OrdenCompraDAO.mostrar();
    }
    
    @Override
    public void iniciar() {
        this.vista.setTitle("BOTICA CRUZ DE MAYO - JAUJA");
        this.vista.setSize(1193, 660);
        //this.vista.setSize(1160, 620);
        this.vista.jPanelRetPrincipal2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retroceder(evt);
            }
        });
        this.vista.jButtonBusOrdenCompra.addActionListener(this);
        this.vista.jbtnDetalle.addActionListener(this);
        
        this.cbProveedores.forEach(item -> this.vista.jcbProveedores.addItem(item.getNombre()));
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        cargarTabla();
    }
    
    private void cargarTabla(){
        Object[][] matriz = new Object[ordenes.size()][];
        
        for(int i = 0; i < ordenes.size(); i++){
            String costoTotal = "S/." + DetalleCompraDAO.costoTotal(ordenes.get(i).getIdOrdenCompra());
            matriz[i] = new Object[]{ordenes.get(i).getIdOrdenCompra(), ordenes.get(i).getFechaCompra(), ordenes.get(i).getFechaEntrega(), ordenes.get(i).getProveedor(), costoTotal};
        }
        
        inicializarTabla(matriz);
    }
    
    private void inicializarTabla(Object[][] datos){
        String[] colums = {"N° ORDEN", "FECHA COMPRA", "FECHA ENTREGA", "RUC PROVEEDOR", "COSTO TOTAL"};
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        FrmBuscarOrdenCompra.modelCompra = new DefaultTableModel(null,colums);
        
        for(Object[] fila : datos){
            if(fila != null)
                FrmBuscarOrdenCompra.modelCompra.addRow(fila);
        }
        
        vista.jTableBusOrdCompra.setModel(FrmBuscarOrdenCompra.modelCompra);
        
        for(int i = 0; i < vista.jTableBusOrdCompra.getColumnCount(); i++){
            vista.jTableBusOrdCompra.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }
    
    private void retroceder(MouseEvent e){
        if (e.getSource() == this.vista.jPanelRetPrincipal2) {
            this.ctrl.visualizar(new CtrlPrincipal(this.ctrl));
        } 
    }

    @Override
    public void cerrar() {
        
        this.vista.dispose();
        this.ctrl = null;

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == vista.jButtonBusOrdenCompra){
            
            int idProveedor = cbProveedores.get(vista.jcbProveedores.getSelectedIndex()).getIdProveedor();
            Object[][] matriz = new Object[ordenes.size()][];
            
            for(int i = 0; i < ordenes.size(); i++){
                if(ordenes.get(i).getProveedor() == idProveedor){
                    String costoTotal = "S/." + DetalleCompraDAO.costoTotal(ordenes.get(i).getIdOrdenCompra());
                    matriz[i] = new Object[]{ordenes.get(i).getIdOrdenCompra(), ordenes.get(i).getFechaCompra(), ordenes.get(i).getFechaEntrega(), ordenes.get(i).getProveedor(), costoTotal};
                }
            }
            
            inicializarTabla(matriz);            
        }
        
        if(e.getSource() == vista.jbtnDetalle){
            
            int filaSelec = vista.jTableBusOrdCompra.getSelectedRow();
            if(filaSelec < 0){
                JOptionPane.showMessageDialog(null, "SELECCIONE EL CODIGO DE UNA ORDEN DE COMPRA DE LA TABLA", "¡ERROR!", JOptionPane.ERROR_MESSAGE); 
            }
            else{
                int filaModelo = vista.jTableBusOrdCompra.convertRowIndexToModel(filaSelec);
                List<DetalleCompraDTO> compra = DetalleCompraDAO.detalle((int) FrmBuscarOrdenCompra.modelCompra.getValueAt(filaModelo, 0));
                this.ctrl.visualizar(new CtrlDetalleOrdeCompra(this.ctrl, compra));
                
                //vista.setVisible(false);
            }
        }

    }
    
}
