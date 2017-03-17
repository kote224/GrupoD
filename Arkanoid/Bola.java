
import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

public class Bola extends Shape {
	private static final int posFloor = 900;
	private static final int posLeftSide = 0;
	private static final int posRightSide = 995;
	private int velX;
	private int velY = 2;
	private boolean gameOver = false;
    public Bola(int px, int py, int anc, int alt, Color col) {
    	super(px, py, anc, alt, col);
		setVelX(generateRandomNumber());
    }

	private int generateRandomNumber() {
		return (int)((Math.random() * 3) + 1);
	}

    public void dibujar(Graphics g){
    	g.setColor(getColor());
    	g.fillOval(x, y, width, height);
    }
    public void move(List<Block> pared, Paleta pala){
    	x += getVelX();
    	y += getVelY();
		// for (Block block : pared) {
		// if (this.intersects(block)) {
		// pared.remove(block);
		// setVelY(getVelY() * -1);
		// }
		// }
		// for (Iterator iterator = pared.iterator(); iterator.hasNext();) {
		// Block block = (Block) iterator.next();
		// if (this.intersects(block)) {
		// pared.remove(block);
		// setVelY(getVelY() * -1);
		// }
		// }
		for (int i = 0; i < pared.size(); i++) {
			if (this.intersects(pared.get(i))) {
				pared.remove(i);
				velY *= -1;
			}
		}
		if (this.intersects(pala)) {
    		setVelY(-getVelY());
    	}
		if ((x >= posRightSide) || (x <= posLeftSide))
    		setVelX(-getVelX());
		if (y <= posLeftSide)
    		setVelY(-getVelY());
		if (y >= posFloor) {
    		setVelY(0);
    		setVelX(0);
			setGameOver(true);
    	}
    }

	public boolean isGameOver() {
		return gameOver;
	}

	public void setGameOver(boolean gameOver) {
		this.gameOver = gameOver;
	}

	public int getVelX() {
		return velX;
	}

	public void setVelX(int velX) {
		this.velX = velX;
	}

	public int getVelY() {
		return velY;
	}

	public void setVelY(int velY) {
		this.velY = velY;
	}

	public boolean isVisible() {
		return visible;
	}
    
    
}