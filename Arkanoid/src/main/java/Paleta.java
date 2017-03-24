import java.awt.Color;

public class Paleta extends Shape {
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

	public boolean isVisible() {
		return visible;
	}
}
