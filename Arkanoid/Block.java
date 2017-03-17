
import java.awt.Color;

public class Block extends Shape {
	private boolean visible = true;
	public Color color;

	public Block(int x, int y, int width, int height, Color color) {
		super(x, y, width, height, color);

	}

	public boolean isVisible() {
		return visible;
	}

}