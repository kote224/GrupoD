
import java.util.List;
import java.awt.Graphics;
import java.awt.Color;


public class Bola extends Block{
	public Color color;
	int velX, velY;
	boolean fin = false;
    public Bola(int px, int py, int anc, int alt, Color col) {
    	super(px, py, anc, alt, col);
    	x = px;
    	y = py;
    	width = anc;
    	height = alt;
    	color = col;
    	velX = (int)((Math.random() * 3) + 1);
    	velY = 2;
    	
    }
    public void dibujar(Graphics g){
    	g.setColor(color);
    	g.fillOval(x, y, width, height);
    }
    public void move(List<Block> pared, Paleta pala){
    	x += velX;
    	y += velY;
    	for(int i=0; i<pared.size(); i++)
    		if(this.intersects(pared.get(i))){
    			pared.remove(i);
    			velY *=-1;
    		}
    	if(this.intersects(pala)){
    		velY = -velY;
    	}
    	if((x>=995) || (x <=0))
    		velX = -velX;
    	if(y <=0)	
    		velY = -velY;
    	if(y>=900){
    		velY=0;
    		velX=0;
    		fin=true; 
    	}
    }
    
    
}