package dto;

/**
 *
 * @author andre
 */
public class DetalleSalidaDTO {

    private int idOrdenSalida;
    //private OrdenSalidaDTO orden;
    //private ProductoDTO producto;
    private int idTipoProducto;
    private int idMedicamento;
    private int cantidad;

    public DetalleSalidaDTO() {
    }

    public DetalleSalidaDTO(int idOrdenSalida, int idTipoProducto, int idMedicamento, int cantidad) {
        this.idOrdenSalida = idOrdenSalida;
        this.idTipoProducto = idTipoProducto;
        this.idMedicamento = idMedicamento;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdOrdenSalida() {
        return idOrdenSalida;
    }

    public void setIdOrdenSalida(int idOrdenSalida) {
        this.idOrdenSalida = idOrdenSalida;
    }

    public int getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(int idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

}
