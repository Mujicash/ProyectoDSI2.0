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
import interfaces.ControlStrategy;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import vista.FrmGestionarInventario;
import vista.FrmRegistrarGuiaRemision;

/**
 *
 * @author Usuario
 */
public class CtrlGuiaRemision implements MouseListener,ControlStrategy {
    
    private final FrmRegistrarGuiaRemision vista;
    private OrdenCompraDTO compraDTO = new OrdenCompraDTO();
    private GuiaRemisionDTO model;
    private Foto imagenCargada;
    private boolean gestionado;
    private CtrlMaster ctrl;
    
    
    
    public CtrlGuiaRemision(CtrlMaster ctrl){
        this.vista = new FrmRegistrarGuiaRemision();
        this.model = new GuiaRemisionDTO();
        this.ctrl = ctrl;
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
        this.vista.panelArchivo.repaint();
        this.vista.textAnio.setText(null);
        this.vista.textDia.setText(null);
        this.vista.textMes.setText(null);
        //this.vista.textOrden.setText(null);
        this.vista.textMotivo.setText(null);
        this.vista.textProveedor.setText(null);
        this.vista.textPartida.setText(null);
        this.vista.textNumero.setText(null);
        this.vista.textArchivo.setText(null);
    }
    
    private void llenar( GuiaRemisionDTO m){
        this.vista.textMotivo.setText(m.getMotivo());
        this.vista.textDia.setText(String.valueOf(m.getFechaInicio().getDay()));
        this.vista.textMes.setText(String.valueOf(m.getFechaInicio().getMonth() +1));
        this.vista.textAnio.setText(String.valueOf(m.getFechaInicio().getYear() + 1900));
        this.vista.textPartida.setText(m.getPuntoPartida());
        this.vista.textNumero.setText(m.getNumGuia());
        
        if(m.getImg().isBan()){
                       
            int x = this.vista.panelArchivo.getHeight();
            int y = this.vista.panelArchivo.getWidth();
            m.getImg().setSize(y, x);
            this.vista.panelArchivo.add(m.getImg());
            this.vista.panelArchivo.repaint();
                        
        }else{
                     
            this.vista.panelArchivo.removeAll();
            this.vista.panelArchivo.repaint();
        }
        
    }
    
    private boolean validarFecha(String d,String m,String a){
        
        try{
            int dia = Integer.valueOf(d);
            int mes = Integer.valueOf(m);
            int anio = Integer.valueOf(a);
            
            if(anio<=0){
                JOptionPane.showMessageDialog(null, "EL NUMERO DE LA FECHA ES INCORRECTO", "ERROR", JOptionPane.ERROR_MESSAGE);
                return false;
            }else{
                if(mes <=0){
                    JOptionPane.showMessageDialog(null, "EL NUMERO DEL MES ES INCORRECTO", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return false;
                }else if(dia>0){
                    if(mes==28 && dia<=28){
                        return true;
                    }
                    
                    if(mes==4 || mes==6 || mes==9 || mes==11){
                        if(dia<=30){
                            return true;
                        }
                    }
                    
                    if(mes==1 || mes==3 || mes==5 || mes==7|| mes==8 || mes==10 || mes==12 ){
                        if(dia<=31){
                            return true;
                        }
                    }
                    
                    
                    
                    JOptionPane.showMessageDialog(null, "LA FECHA ES INCORRECTO", "ERROR", JOptionPane.ERROR_MESSAGE);
                    
                    return false;
                    
                }else{
                    JOptionPane.showMessageDialog(null, "EL NUMERO DEL DIA ES INCORRECTO", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            }
            
            
       
        } catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "LAS FECHAS SE ESCRIBEN CON NUMERO", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(this.vista.botonBuscar == e.getSource()){
            this.limpiar();
            //System.out.println("boton buscar presionado");
            if("".equals(vista.textOrden.getText())){
                 JOptionPane.showMessageDialog(null, "LLene la casilla de numero de orden para buscar");
            }else{
                
                try{
                    int num = Integer.parseInt(vista.textOrden.getText());
            
                if(num <=0){
                    JOptionPane.showMessageDialog(null, "EL NUMERO DE ORDEN DEBE SER UN NUMERO POSITIVO", "ERROR", JOptionPane.ERROR_MESSAGE);

                }else{
                    compraDTO = OrdenCompraDAO.buscar(Integer.parseInt(vista.textOrden.getText()));
                    if(compraDTO != null){
                        ProveedorDTO provDTO;
                        provDTO = ProveedorDAO.buscar(compraDTO.getProveedor());
                        this.vista.textProveedor.setText(provDTO.getNombre());
                   
                        model = GuiaRemisionDAO.buscar(compraDTO.getIdOrdenCompra());
                        if(null != model){
                           System.out.println("si hay guia de remision\n");
                           this.llenar(model);
                           this.vista.botonArchivo.setEnabled(false);
                           this.vista.botonGestionar.setEnabled(false);
                           this.vista.botonGuardar.setEnabled(false);
                        }else{
                           model = new GuiaRemisionDTO();
                           this.vista.botonArchivo.setEnabled(true);
                           this.vista.botonGestionar.setEnabled(true);
                           this.vista.botonGuardar.setEnabled(true);
                        }    
                    }else{
                        JOptionPane.showMessageDialog(null, "No se encuentra la orden de compra");
                    }
                }
            } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "EL NUMERO DE ORDEN DEBE SER UN NUMERO ENTERO", "ERROR", JOptionPane.ERROR_MESSAGE);
            
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
            //CtrlGestionarInventario cg = new CtrlGestionarInventario(new FrmGestionarInventario(),this);
            this.ctrl.emergente(new CtrlGestionarInventario(this,this.ctrl));
        }
        
        if(this.vista.botonGuardar == e.getSource()){
            if(gestionado){
                
                if(this.validarFecha(vista.textDia.getText(), vista.textMes.getText(), vista.textAnio.getText())){
                    model.setNumGuia(vista.textNumero.getText());
                    model.setIdGuia(Integer.parseInt(vista.textOrden.getText()));
                    model.setMotivo(vista.textMotivo.getText());
                    model.setPuntoPartida(vista.textPartida.getText());
                    System.out.println();
                    model.setFechaInicio(new Date( Integer.parseInt(vista.textAnio.getText())-1900,Integer.parseInt(vista.textMes.getText())-1 , Integer.parseInt(vista.textDia.getText())));
                    model.setFechaEntrega(Calendar.getInstance().getTime());
                    model.setFoto(imagenCargada);
                    model.setGestionado(true);
            
                    GuiaRemisionDAO.insertar(model);
                    compraDTO.setEstado(true);
                    OrdenCompraDAO.modificar(compraDTO);
                    this.limpiar();
                }
                
            }else{
                 JOptionPane.showMessageDialog(null, "Por favor, Gestione el inventario");
            }
            
            
        }
        
        if(this.vista.btnRetro == e.getSource()){
            this.ctrl.visualizar(new CtrlPrincipal(this.ctrl));
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

    @Override
    public void iniciar() {
        
        this.vista.setTitle("BOTICA CRUZ DE MAYO - JAUJA");
        this.vista.setSize(1068, 569);
        this.vista.setResizable(false);
        this.vista.setLocationRelativeTo(null);
        this.vista.exploradorColor();
        this.vista.setIconImage(new ImageIcon(getClass().getResource("/images/logo.png")).getImage());
        
        this.vista.setVisible(true);
        this.vista.botonArchivo.addMouseListener(this);
        this.vista.botonBuscar.addMouseListener(this);
        this.vista.botonGestionar.addMouseListener(this);
        this.vista.botonGuardar.addMouseListener(this);
        this.vista.btnRetro.addMouseListener(this);
    }

    @Override
    public void cerrar() {
       this.vista.dispose();
        this.ctrl = null;
    }
    
}
