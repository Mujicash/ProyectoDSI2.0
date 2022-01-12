
package Test;

import dao.OrdenCompraDAO;
import dto.JefeAlmacenDTO;
import dto.OrdenCompraDTO;
import interfaces.CreadorOrden;
import interfaces.Orden;
import java.util.Calendar;

/**
 *
 * @author Andre Mujica
 */
public class PruebaFactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        CreadorOrden usuario = new JefeAlmacenDTO("andre", "Andre");
        Object[] datosOrden = new Object[]{100,Calendar.getInstance().getTime(), Calendar.getInstance().getTime()};
        Object[][] datosDetalle = new Object[][]{{1, 10, 5.4}, {2, 20, 40}, {3, 50, 7.5}};
        int codigo[] = {1,2,3};
        int cantidad[] = {10,20,50};
        double precios[] = {5.4, 40, 7.5};
        
        for(int i = 0; i < 3; i++){
            Object[] dato = new Object[]{codigo[i], cantidad[i], precios[i]};
            datosDetalle[i] = dato;
        }
        
        
        Orden ordenCompra = usuario.crearOrden(datosOrden);
        OrdenCompraDAO.insertar((OrdenCompraDTO) ordenCompra);
        System.out.println(ordenCompra.generarDetalle(datosDetalle));
        */
    }
    
}
