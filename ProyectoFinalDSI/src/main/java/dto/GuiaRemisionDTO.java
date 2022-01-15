
package dto;

import extra.Foto;
import extra.ImagenMySQL;
import java.util.Date;
import java.util.Calendar;

/**
 *
 * @author andre
 */
public class GuiaRemisionDTO {
    
    private int idGuia;
    private String numGuia;
    private String puntoPartida;
    private String motivo;
    private Date fechaInicio;
    private Date fechaEntrega;
    private Foto guia;
    private boolean gestionado;
    private ImagenMySQL img;

    public GuiaRemisionDTO(int idGuia, String numGuia, String puntoPartida, String motivo, Date fechaInicio, boolean gestionado, ImagenMySQL img) {
        this.idGuia = idGuia;
        this.numGuia = numGuia;
        this.puntoPartida = puntoPartida;
        this.motivo = motivo;
        this.fechaInicio = fechaInicio;
        this.gestionado = gestionado;
        this.img = img;
    }

    
    
    
    public ImagenMySQL getImg() {
        return img;
    }

    public void setImg(ImagenMySQL img) {
        this.img = img;
    }


    public Foto getGuia() {
        return guia;
    }

    public void setGuia(Foto guia) {
        this.guia = guia;
    }



    public boolean isGestionado() {
        return gestionado;
    }

    public void setGestionado(boolean gestionado) {
        this.gestionado = gestionado;
    }
    

    public GuiaRemisionDTO() {
    }

    public GuiaRemisionDTO(int idGuia) {
        this.idGuia = idGuia;
    }
    
    public GuiaRemisionDTO(int idGuia, String numGuia, String puntoPartida, String motivo, Date fechaInicio, Date fechaEntrega) {
        this.idGuia = idGuia;
        this.numGuia = numGuia;
        this.puntoPartida = puntoPartida;
        this.motivo = motivo;
        this.fechaInicio = fechaInicio;
        this.fechaEntrega = fechaEntrega;
    }
    
    public GuiaRemisionDTO(int idGuia, String numGuia, String puntoPartida, String motivo, Date fechaInicio, Date fechaEntrega, boolean gestionado) {
        this.idGuia = idGuia;
        this.numGuia = numGuia;
        this.puntoPartida = puntoPartida;
        this.motivo = motivo;
        this.fechaInicio = fechaInicio;
        this.fechaEntrega = fechaEntrega;
        this.gestionado = gestionado;
    }


    public int getIdGuia() {
        return idGuia;
    }

    public void setIdGuia(int idGuia) {
        this.idGuia = idGuia;
    }

    public String getNumGuia() {
        return numGuia;
    }

    public void setNumGuia(String numGuia) {
        this.numGuia = numGuia;
    }

    public String getPuntoPartida() {
        return puntoPartida;
    }

    public void setPuntoPartida(String puntoPartida) {
        this.puntoPartida = puntoPartida;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public void setFoto(Foto f){
        this.guia = f;
    }
    
    public Foto getFoto(){
        return this.guia;
    }
    
    @Override
    public String toString() {
        return "GuiaRemisionDTO{" + "idGuia=" + idGuia + ", numGuia=" + numGuia + '}';
    }
    
}
