
package controlador;

import dao.FabricanteDAO;
import dao.MedicamentoDAO;
import dto.DetalleCompraDTO;
import dto.MedicamentoDTO;
import interfaces.ControlStrategy;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import vista.FrmDetalleOrdenCompra;

/**
 *
 * @author Andre Mujica
 */
public class CtrlDetalleOrdeCompra implements ControlStrategy {
    
    private final FrmDetalleOrdenCompra vista;
    private CtrlMaster ctrl;
    private final List<DetalleCompraDTO> compra;

    public CtrlDetalleOrdeCompra(CtrlMaster ctrl, List<DetalleCompraDTO> compra) {
        this.ctrl = ctrl;
        this.compra = compra;
        this.vista = new FrmDetalleOrdenCompra();
    }

    
    
    

    @Override
    public void iniciar() {
        this.vista.setTitle("BOTICA CRUZ DE MAYO - JAUJA");
        this.vista.setSize(1010, 580);
        this.vista.setResizable(false);
        this.vista.setLocationRelativeTo(null);
        this.vista.setIconImage(new ImageIcon(getClass().getResource("/images/logo.png")).getImage());
        
        
        this.vista.jPanelRetBuscarOdenCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retroceder(evt);
            }
        });
        //vista.jButtonGuardar.addActionListener(this);
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        inicializarTabla();
    }
    
    private void inicializarTabla(){
        String[] colums = {"ID", "NOMBRE","CANTIDAD", "COSTO UNITARIO", "TOTAL"};
        FrmDetalleOrdenCompra.modelCompra = new DefaultTableModel(null,colums);        
        vista.jTableDetOrdCompra.setModel(FrmDetalleOrdenCompra.modelCompra);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        MedicamentoDTO medicamento;
        String nombre;
        for(DetalleCompraDTO i : compra){
            medicamento = MedicamentoDAO.buscar(i.getIdMedicamento());
            nombre = medicamento.getNombre() + " " + medicamento.getMedida() + " " + FabricanteDAO.buscar(medicamento.getIdFabricante()).getNombre();
            Object[] fila = {i.getIdMedicamento(), nombre, i.getUnidades(), i.getPrecio(), (i.getUnidades()*i.getPrecio())};
            FrmDetalleOrdenCompra.modelCompra.addRow(fila);
        }
        
        vista.jTableDetOrdCompra.setModel(FrmDetalleOrdenCompra.modelCompra);
        for(int i = 0; i < vista.jTableDetOrdCompra.getColumnCount(); i++){
            vista.jTableDetOrdCompra.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }
    
    private void retroceder(MouseEvent e){
        if (e.getSource() == this.vista.jPanelRetBuscarOdenCompra) {
            this.ctrl.visualizar(new CtrlBuscarOrdenCompra(this.ctrl));
        } 
    }

    @Override
    public void cerrar() {
        this.vista.dispose();
        this.ctrl = null;
    }
    
}
