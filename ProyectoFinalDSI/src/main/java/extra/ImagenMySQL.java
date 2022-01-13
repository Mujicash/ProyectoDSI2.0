/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;


/**
 *
 * @author Usuario
 */
public class ImagenMySQL extends javax.swing.JPanel{
        
    private BufferedImage ruta;
    private int ancho;
    private int alto;
    private boolean ban;

    public boolean isBan() {
        return ban;
    }

    public void setBan(boolean ban) {
        this.ban = ban;
    }
    
    public ImagenMySQL() {

    }

    public BufferedImage getRuta() {
        return ruta;
    }

    public void setRuta(BufferedImage ruta) {
        this.ruta = ruta;
    }
    
    
    
    @Override
    public void paint(Graphics g){
        Dimension h = getSize();
        //ImageIcon img = new ImageIcon(getClass().getResource(ruta));
        //Image imgExt = new ImageIcon(ruta).getImage();
        
        BufferedImage img = ruta;
        
        //g.drawImage(img.getImage(),0,0,h.width,h.height,null);
        //g.drawImage(imgExt,0,0,h.width,h.height,null);
        g.drawImage(img,0,0,h.width,h.height,null);
        setOpaque(false);
        super.paintComponent(g);
    }
    
    
}
