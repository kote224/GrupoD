import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;


public abstract class Shape extends Rectangle {
	private Color color;
	protected boolean visible = true;
	public Shape(int x, int y, int width, int height, Color color) {
		super(x, y, width, height);
		this.setColor(color);
	}

	public void dibujar(Graphics g) {
		if (isVisible()) {
			g.setColor(color);
			g.fillRect(x, y, width, height);
		}
	}

	abstract public boolean isVisible();

	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public static final int posFloor = 900;
	public static final int posLeftSide = 0;
	public static final int posRightSide = 995;
}
