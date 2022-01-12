
package dto;

import dao.DetalleCompraDAO;
import java.util.Date;
import interfaces.Orden;

/**
 *
 * @author andre
 */
public class OrdenCompraDTO implements Orden {
    
    private int idOrdenCompra;
    private int idProveedor;
    private Date fechaCompra;
    private Date fechaEntrega;
    private boolean estado;

    public OrdenCompraDTO() {
    }

    public OrdenCompraDTO(int idOrdenCompra) {
        this.idOrdenCompra = idOrdenCompra;
    }

    public OrdenCompraDTO(int idOrdenCompra, int idProveedor, Date fechaCompra, Date fechaEntrega, boolean estado) {
        this.idOrdenCompra = idOrdenCompra;
        this.idProveedor = idProveedor;
        this.fechaCompra = fechaCompra;
        this.fechaEntrega = fechaEntrega;
        this.estado = estado;
    }

    public OrdenCompraDTO(int idProveedor, Date fechaCompra, Date fechaEntrega) {
        this.idProveedor = idProveedor;
        this.fechaCompra = fechaCompra;
        this.fechaEntrega = fechaEntrega;
    }

    public int getIdOrdenCompra() {
        return idOrdenCompra;
    }

    public void setIdOrdenCompra(int idOrdenCompra) {
        this.idOrdenCompra = idOrdenCompra;
    }

    public int getProveedor() {
        return idProveedor;
    }

    public void setProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "OrdenCompraDTO{" + "idOrdenCompra=" + idOrdenCompra + ", fechaCompra=" + fechaCompra + ", fechaEntrega=" + fechaEntrega + ", estado=" + estado + '}';
    }

    @Override
    public String generarDetalle(Object[][] datos) {
        boolean insert = false;
        
        for (Object[] dato : datos) {
            DetalleCompraDTO detalle = new DetalleCompraDTO(this.idOrdenCompra, (Integer) dato[0], (Integer) dato[1], (Double) dato[2]);
            insert = DetalleCompraDAO.insertar(detalle);
        }
        
        if(insert){
            return "Detalle Orden de Compra generado correctamente.";
        }
        else{
            return "Error al generar el Detalle Orden de Compra.";
        }

    }
    
}
