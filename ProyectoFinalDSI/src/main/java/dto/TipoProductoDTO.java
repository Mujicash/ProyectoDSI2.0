
package dto;

/**
 *
 * @author andre
 */
public class TipoProductoDTO {
    
    private int idTipo;
    private String formato; //tipo

    public TipoProductoDTO(int idTipo, String formato) {
        this.idTipo = idTipo;
        this.formato = formato;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "TipoProductoDTO{" + "idTipo=" + idTipo + ", formato=" + formato + '}';
    }
    
}
