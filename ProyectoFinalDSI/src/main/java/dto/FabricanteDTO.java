
package dto;

/**
 *
 * @author andre
 */
public class FabricanteDTO {
    
    private int idFabricante;
    private String nombre;

    public FabricanteDTO(int idFabricante, String nombre) {
        this.idFabricante = idFabricante;
        this.nombre = nombre;
    }

    public int getIdFabricante() {
        return idFabricante;
    }

    public void setIdFabricante(int idFabricante) {
        this.idFabricante = idFabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "FabricanteDTO{" + "idFabricante=" + idFabricante + ", nombre=" + nombre + '}';
    }
    
}
