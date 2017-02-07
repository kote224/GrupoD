/**
 * @(#)Block.java
 *
 *
 * @author 
 * @version 1.00 2017/2/15
 */
import java.awt.*;
import java.applet.*;

public class Block extends Rectangle{
	boolean visible = true;
	public Color color;
	public Block(int px, int py, int anc, int alt, Color colores){
		x = px;
		y = py;
		width = anc;
		height = alt;
		color = colores;
		
		
    }
    
    public void dibujar(Graphics g){
    	if(visible){
    	g.setColor(color);
    	g.fillRect(x, y, width, height);
    	}
    }
    public void actualizar(){
    	
    }
    
    
}