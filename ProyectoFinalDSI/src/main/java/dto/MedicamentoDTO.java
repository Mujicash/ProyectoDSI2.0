
package dto;

/**
 *
 * @author andre
 */
public class MedicamentoDTO {
    
    private int idMedicamento;
    private int idFabricante;
    private String nombre;
    private String medida;

    public MedicamentoDTO(int idMedicamento, int idFabricante, String nombre, String medida) {
        this.idMedicamento = idMedicamento;
        this.idFabricante = idFabricante;
        this.nombre = nombre;
        this.medida = medida;
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
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

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    @Override
    public String toString() {
        return "MedicamentoDTO{" + "idMedicamento=" + idMedicamento + ", nombre=" + nombre + ", medida=" + medida + '}';
    }
    
}
