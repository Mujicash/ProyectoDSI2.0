
package dto;

/**
 *
 * @author andre
 */
public class ProductoDTO {
    
    private int idMedicamento;
    private int idTipoProducto;
    private int stock;
    private float precioVenta;

    public ProductoDTO(int idMedicamento, int idTipoProducto, int stock, float precioVenta) {
        this.idMedicamento = idMedicamento;
        this.idTipoProducto = idTipoProducto;
        this.stock = stock;
        this.precioVenta = precioVenta;
    }

    public ProductoDTO(int idMedicamento, int idTipoProducto) {
        this.idMedicamento = idMedicamento;
        this.idTipoProducto = idTipoProducto;
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public int getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(int idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Override
    public String toString() {
        return "ProductoDTO{" + "idMedicamento=" + idMedicamento + ", idTipoProducto=" + idTipoProducto + ", stock=" + stock + ", precioVenta=" + precioVenta + '}';
    }
}
