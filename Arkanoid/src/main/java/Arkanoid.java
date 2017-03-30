
import java.awt.Graphics;
import java.awt.Event;
import java.awt.Image;
import java.awt.Color;
import java.awt.Rectangle;
import java.applet.*;
import java.util.List;
import java.util.ArrayList;

public class Arkanoid extends Applet implements Runnable{
	public static final int NUMFIL = 5;
	public static final int NUMCOL = 10;
	public static final int DERECHA = 0;
	public static final int IZQUIERDA = 1;
	Thread animacion;
	Image imagen;
	Bola bola;
	Graphics noseve;
	List <Block> bloques;
	Color colores [] = {Color.red, Color.green, Color.blue, Color.yellow, Color.pink};
	int x, y;
	Paleta paleta;
	Boolean ganador=false;
 	public void init(){
		bloques = new ArrayList<Block>();
		for (int i = 0; i<NUMFIL; i++){
			x = 40;
			y += 80;
			for (int j = 0; j<NUMCOL; j++){
				bloques.add (new Block(x,y,70,50,colores[i]));
				x +=90;
			}	
		}
		y = 80;
		bola = new Bola (400,850,15,15,Color.red);					
		paleta=new Paleta();
		imagen = this.createImage(1000,900);
		noseve = imagen.getGraphics();
		
	}
	
	public void start(){
		animacion = new Thread(this);
		animacion.start();//Llama metodo run
	}
	
	public void paint(Graphics g){
		noseve.setColor(Color.black);
		noseve.fillRect(0,0,1000,900);
		for (int i = 0; i<bloques.size(); i++)
				bloques.get(i).draw(noseve);	
		bola.draw(noseve);
		paleta.draw(noseve);
		if(bola.isGameOver()){
			noseve.setColor(Color.white);
			noseve.drawString("GAME OVER", 500, 450);
		}
		if(ganador){
			noseve.setColor(Color.white);
			noseve.drawString("ERES UN CHAMPION", 500, 450);
			bola.setVelX(0);
			bola.setVelY(0);
		}
		g.drawImage(imagen,0,0,this);
   	}
   	
   	public void update (Graphics g){
   		paint(g);
   	}
  	
 	public void run(){
    	while(true){
			bola.move(bloques, paleta);
			if(bloques.size()==0){
				ganador = true;
			}	
			repaint();
    	try{
    		Thread.sleep(10);
    	}catch(InterruptedException e){};
    	}
    }
    public boolean keyDown(Event ev,int tecla){
   		if (tecla == 1006){ 
			paleta.move(IZQUIERDA); 
		}else if (tecla == 1007){ 
			paleta.move(DERECHA); 
		} 
		
    	return true;
    }
}
    
