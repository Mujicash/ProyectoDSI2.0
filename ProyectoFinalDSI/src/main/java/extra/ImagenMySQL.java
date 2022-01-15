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
        g.drawImage(ruta,0,0,h.width,h.height,null);
        setOpaque(false);
        super.paintComponent(g);
    }
    
    
}
