
package dto;

import dao.DetalleSalidaDAO;
import dao.ProductoDAO;
import java.util.Date;
import interfaces.Orden;

/**
 *
 * @author andre
 */
public class OrdenSalidaDTO implements Orden{
    
    private int idOrdenSalida;
    private Date fecha;
    private String motivo;
    private int idUsuario;

    public OrdenSalidaDTO() {
    }

    public OrdenSalidaDTO(int idOrdenSalida, Date fecha, String motivo, int idUsuario) {
        this.idOrdenSalida = idOrdenSalida;
        this.fecha = fecha;
        this.motivo = motivo;
        this.idUsuario = idUsuario;
    }

    public OrdenSalidaDTO(int idOrdenSalida) {
        this.idOrdenSalida = idOrdenSalida;
    }

    public int getIdOrdenSalida() {
        return idOrdenSalida;
    }

    public void setIdOrdenSalida(int idOrdenSalida) {
        this.idOrdenSalida = idOrdenSalida;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "OrdenSalidaDTO{" + "idOrdenSalida=" + idOrdenSalida + ", fecha=" + fecha + ", motivo=" + motivo + '}';
    }

    @Override
    public String generarDetalle(Object[][] datos) {
        boolean insert = false;
        
        for(Object[] dato : datos){
            DetalleSalidaDTO detalle = new DetalleSalidaDTO(this.idOrdenSalida, (Integer) dato[0], (Integer) dato[1], (Integer) dato[2]);
            insert = DetalleSalidaDAO.insertar(detalle);
            ProductoDAO.aumentarStock((Integer) dato[1], (Integer) dato[0], (Integer) dato[2]);
        }

        if(insert){
            return "Detalle Orden de Salida generado correctamente.";
        }
        else{
            return "Error al generar el Detalle Orden de Salida.";
        }
    }
}
