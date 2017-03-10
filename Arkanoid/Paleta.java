import java.awt.*;
import java.applet.*;

public class Paleta extends Block{
	public static final int VELX =50;
	public Paleta(){
		super(300, 850, 200, 20, Color.red);
    }
    public void move(int direccion){
    	if(direccion==Arkanoid.DERECHA)
    		x += VELX;
    	else
    		x -= VELX;
    	if(x>=995)
    		x=800;
    	if(x <=0)
    		x=0;
		
    }
}
