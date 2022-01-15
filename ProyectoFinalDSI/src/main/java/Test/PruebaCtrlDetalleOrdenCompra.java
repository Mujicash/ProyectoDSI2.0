
package Test;

import controlador.CtrlDetalleOrdeCompra;
import controlador.CtrlLogin;
import controlador.CtrlMaster;
import dao.DetalleCompraDAO;
import dto.DetalleCompraDTO;
import java.util.List;

/**
 *
 * @author Andre Mujica
 */
public class PruebaCtrlDetalleOrdenCompra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<DetalleCompraDTO> compra = DetalleCompraDAO.detalle(2);
        CtrlMaster controlador = new CtrlMaster();
        controlador.setCtrl(new CtrlDetalleOrdeCompra(controlador, compra));
        controlador.visualizar();
    }
    
}
