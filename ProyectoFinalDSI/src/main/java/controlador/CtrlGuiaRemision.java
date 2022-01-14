/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.GuiaRemisionDAO;
import dao.OrdenCompraDAO;
import dao.ProveedorDAO;
import dto.GuiaRemisionDTO;
import dto.OrdenCompraDTO;
import dto.ProveedorDTO;
import extra.Foto;
import extra.Imagen;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import vista.FrmGestionarInventario;
import vista.FrmRegistrarGuiaRemision;

/**
 *
 * @author Usuario
 */
public class CtrlGuiaRemision implements MouseListener {
    
    private final FrmRegistrarGuiaRemision vista;
    private OrdenCompraDTO compraDTO = new OrdenCompraDTO();
    private final GuiaRemisionDTO model;
    private Foto imagenCargada;
    private boolean gestionado;
    
    
    
    public CtrlGuiaRemision(FrmRegistrarGuiaRemision v){
        this.vista = v;
        this.model = new GuiaRemisionDTO();
        this.vista.setVisible(true);
        this.vista.botonArchivo.addMouseListener(this);
        this.vista.botonBuscar.addMouseListener(this);
        this.vista.botonGestionar.addMouseListener(this);
        this.vista.botonGuardar.addMouseListener(this);
        this.gestionado = false;
    }
    
    public void setGestion(boolean g){
        this.gestionado = g;
    }
    
    public OrdenCompraDTO getOrden(){
        return compraDTO;
    }
    
    private void limpiar(){
        this.vista.panelArchivo.removeAll();
        this.vista.textAnio.setText(null);
        this.vista.textDia.setText(null);
        this.vista.textMes.setText(null);
        this.vista.textOrden.setText(null);
        this.vista.textMotivo.setText(null);
        this.vista.textProveedor.setText(null);
        this.vista.textPartida.setText(null);
        this.vista.textNumero.setText(null);
        this.vista.textArchivo.setText(null);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(this.vista.botonBuscar == e.getSource()){
            System.out.println("boton buscar presionado");
            if("".equals(vista.textOrden.getText())){
                 JOptionPane.showMessageDialog(null, "LLene la casilla de numero de orden para buscar");
            }else{
               compraDTO = OrdenCompraDAO.buscar(Integer.parseInt(vista.textOrden.getText()));
               if(compraDTO != null){
                   ProveedorDTO provDTO = new ProveedorDTO(compraDTO.getProveedor());
                   provDTO = ProveedorDAO.buscar(compraDTO.getProveedor());
                   this.vista.textProveedor.setText(provDTO.getNombre());
                   
               }else{
                   JOptionPane.showMessageDialog(null, "No se encuentra la orden de compra");
               }
            }   
        }
        
        if(this.vista.botonArchivo == e.getSource()){
                JFileChooser fc = new JFileChooser();
                fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
                FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.PNG","png","jpg");
                fc.setFileFilter(filtro);
        
                int selec = fc.showOpenDialog(this.vista);
                if(selec == JFileChooser.APPROVE_OPTION){
            
                     this.vista.panelArchivo.removeAll();
            
                        File fichero = fc.getSelectedFile();
                        String ruta = fichero.getAbsolutePath();
                        String nombre = fichero.getName();
            
                        Imagen guia = new Imagen(ruta,this.vista.panelArchivo.getWidth(),this.vista.panelArchivo.getHeight());
                        this.vista.panelArchivo.add(guia);
                        this.vista.panelArchivo.repaint();
            
                        this.vista.textArchivo.setText(nombre);
            
                        try {
                            FileInputStream fis = new FileInputStream(fichero);
                            this.imagenCargada = new Foto(fis,fichero);
               
                        } catch (FileNotFoundException ex) {
                            System.out.println(e);
                         }
            
                }
        
        }
        
        if(this.vista.botonGestionar == e.getSource()){
            CtrlGestionarInventario cg = new CtrlGestionarInventario(new FrmGestionarInventario(),this);
        }
        
        if(this.vista.botonGuardar == e.getSource()){
            if(gestionado){
                model.setNumGuia(vista.textNumero.getText());
                model.setIdGuia(Integer.parseInt(vista.textOrden.getText()));
                model.setMotivo(vista.textMotivo.getText());
                model.setPuntoPartida(vista.textMotivo.getText());
                model.setFechaInicio(new Date( Integer.parseInt(vista.textAnio.getText()),Integer.parseInt(vista.textMes.getText()) , Integer.parseInt(vista.textDia.getText())));
                model.setFechaEntrega(Calendar.getInstance().getTime());
                model.setFoto(imagenCargada);
                model.setGestionado(true);
            
                GuiaRemisionDAO.insertar(model);
                compraDTO.setEstado(true);
                OrdenCompraDAO.modificar(compraDTO);
                this.limpiar();
            }else{
                 JOptionPane.showMessageDialog(null, "Porfavor, Gestione el inventario");
            }
            
            
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
    
}
