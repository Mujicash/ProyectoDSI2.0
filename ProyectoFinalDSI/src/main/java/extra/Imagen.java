/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class Imagen extends javax.swing.JPanel{
        
    private String ruta;

    public Imagen(String _ruta,int x,int y) {
        this.ruta = _ruta;
        this.setSize(x,y);
    }
    
    @Override
    public void paint(Graphics g){
        Dimension h = getSize();
        //ImageIcon img = new ImageIcon(getClass().getResource(ruta));
        Image imgExt = new ImageIcon(ruta).getImage();
        
        //g.drawImage(img.getImage(),0,0,h.width,h.height,null);
        g.drawImage(imgExt,0,0,h.width,h.height,null);
        setOpaque(false);
        super.paintComponent(g);
    }
    
    
}
