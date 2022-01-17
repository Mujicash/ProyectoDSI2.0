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
import interfaces.ControlStrategy;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import vista.FrmBotGestionar;

/**
 *
 * @author Usuario
 */
public class CtrlGestionarDetalle implements MouseListener, ControlStrategy {
    
    private final FrmBotGestionar vent;
    private final DetalleCompraDTO padre;
    private final MedicamentoDTO med;
    private CtrlMaster ctrl;

    public CtrlGestionarDetalle( DetalleCompraDTO padre,CtrlMaster ctrl) {
        this.vent = new FrmBotGestionar();
        this.padre = padre;
        this.ctrl = ctrl;
        
        med = MedicamentoDAO.buscar(this.padre.getIdMedicamento());
        
    }
    

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == this.vent.btnAceptar){
            
            try{
                int cajas = Integer.parseInt(this.vent.textCaja.getText());
                int blister = Integer.parseInt(this.vent.textBlister.getText());
            
                if(cajas <=0 || blister <= 0){
                    JOptionPane.showMessageDialog(null, "LAS CANTIDADES DEBEN SER POSITIVAS", "ERROR", JOptionPane.ERROR_MESSAGE);
                }else{
                    int factor = cajas + blister;
            
                    if(factor == padre.getUnidades()){
                        ProductoDAO.aumentarStock(med.getIdMedicamento(),1, cajas);
                        ProductoDAO.aumentarStock(med.getIdMedicamento(),2, blister*med.getNum_blister());
                
                        padre.setGestionado(true);
                
                        JOptionPane.showMessageDialog(null, "Stock Actualizado");
          
                        this.cerrar();
                
                    }else if(factor <=  padre.getUnidades() ){
                
                        JOptionPane.showMessageDialog(null, "Aun le sobran unidades, porfavor revise sus valores ");
                
                    }else{
                        JOptionPane.showMessageDialog(null, "Se ha excedido en las unidades, porfavor revise sus valores ");
                    }
                }
            } catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "LAS CANTIDADES DEBEN SER NUMEROS", "ERROR", JOptionPane.ERROR_MESSAGE);
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
        this.vent.setVisible(true);
        this.vent.btnAceptar.addMouseListener(this);
        this.vent.textMedicamento.setText(med.getNombre() + " " + med.getMedida() + " " + FabricanteDAO.buscar(med.getIdFabricante()).getNombre());
        this.vent.textEncabezado.setText("1 caja = "+ med.getNum_blister() +" blisters");
    }

    @Override
    public void cerrar() {
        this.vent.dispose();
        //this.ctrl = null;
    }
    
}
