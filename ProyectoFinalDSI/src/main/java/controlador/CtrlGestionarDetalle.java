/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.FabricanteDAO;
import dao.MedicamentoDAO;
import dao.ProductoDAO;
import dto.DetalleCompraDTO;
import dto.MedicamentoDTO;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import vista.FrmBotGestionar;

/**
 *
 * @author Usuario
 */
public class CtrlGestionarDetalle implements MouseListener {
    
    private final FrmBotGestionar vent;
    private final DetalleCompraDTO padre;
    private final MedicamentoDTO med;

    public CtrlGestionarDetalle(FrmBotGestionar vent, DetalleCompraDTO padre) {
        this.vent = vent;
        this.padre = padre;
        
        this.vent.setVisible(true);
        this.vent.btnAceptar.addMouseListener(this);
        
        med = MedicamentoDAO.buscar(this.padre.getIdMedicamento());
        
        this.vent.textMedicamento.setText(med.getNombre() + " " + med.getMedida() + " " + FabricanteDAO.buscar(med.getIdFabricante()).getNombre());
        this.vent.textEncabezado.setText("1 caja = "+ med.getNum_blister() +" blisters");
    }
    

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == this.vent.btnAceptar){
            int cajas = Integer.parseInt(this.vent.textCaja.getText());
            int blister = Integer.parseInt(this.vent.textBlister.getText());
            int factor = cajas*med.getNum_blister() + blister;
            
            if(factor == padre.getUnidades()*med.getNum_blister()){
                ProductoDAO.aumentarStock(med.getIdMedicamento(),1, cajas);
                ProductoDAO.aumentarStock(med.getIdMedicamento(),2, blister);
                
                padre.setGestionado(true);
                
                JOptionPane.showMessageDialog(null, "Stock Actualizado");
                
                
                
                this.vent.setVisible(false);
                this.vent.dispose();
                
            }else if(factor <=  padre.getUnidades()*med.getNum_blister() ){
                
                JOptionPane.showMessageDialog(null, "Aun le sobran unidades, porfavor revise sus valores ");
                
            }else{
                JOptionPane.showMessageDialog(null, "Se ha excedido en las unidades, porfavor revise sus valores ");
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
    
}
