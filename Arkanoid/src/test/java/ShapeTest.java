import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShapeTest {

	Shape shape;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDibujarWhenShapeIsNotVisible() {
		shape = new MyShapeVisibleFalse(0, 0, 0, 0, Color.BLUE);
		Graphics g = new GraphipcsTest();
		shape.dibujar(g);
		Assert.assertEquals(Color.BLUE, shape.getColor());
		Assert.assertNull(g.getColor());

	}

	@Test
	public void testDibujarWhenShapeIsVisible() {
		shape = new MyShapeVisibleTrue(0, 0, 0, 0, Color.BLUE);
		Graphics g = new GraphipcsTest();
		shape.dibujar(g);
		Assert.assertEquals(Color.BLUE, shape.getColor());
		Assert.assertNotNull(g.getColor());

	}

	@Test
	public void testColor() {
		shape = new MyShapeVisibleFalse(0, 0, 0, 0, Color.BLUE);
		Assert.assertEquals(Color.BLUE, shape.getColor());
	}

	class MyShapeVisibleTrue extends Shape {

		public MyShapeVisibleTrue(int x, int y, int width, int height, Color color) {
			super(x, y, width, height, color);
		}

		@Override
		public boolean isVisible() {
			return visible;
		}
	}

	class MyShapeVisibleFalse extends Shape {


		public MyShapeVisibleFalse(int x, int y, int width, int height, Color color) {
			super(x, y, width, height, color);
		}

		@Override
		public boolean isVisible() {
			return false;
		}
	}

	class GraphipcsTest extends Graphics {

		private Color color;

		@Override
		public Graphics create() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void translate(int x, int y) {
			// TODO Auto-generated method stub

		}

		@Override
		public Color getColor() {
			return color;
		}

		@Override
		public void setColor(Color c) {
			color = c;
		}

		@Override
		public void setPaintMode() {
			// TODO Auto-generated method stub

		}

		@Override
		public void setXORMode(Color c1) {
			// TODO Auto-generated method stub

		}

		@Override
		public Font getFont() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setFont(Font font) {
			// TODO Auto-generated method stub

		}

		@Override
		public FontMetrics getFontMetrics(Font f) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Rectangle getClipBounds() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void clipRect(int x, int y, int width, int height) {
			// TODO Auto-generated method stub

		}

		@Override
		public void setClip(int x, int y, int width, int height) {
			// TODO Auto-generated method stub

		}

		@Override
		public java.awt.Shape getClip() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setClip(java.awt.Shape clip) {
			// TODO Auto-generated method stub

		}

		@Override
		public void copyArea(int x, int y, int width, int height, int dx, int dy) {
			// TODO Auto-generated method stub

		}

		@Override
		public void drawLine(int x1, int y1, int x2, int y2) {
			// TODO Auto-generated method stub

		}

		@Override
		public void fillRect(int x, int y, int width, int height) {
			// TODO Auto-generated method stub

		}

		@Override
		public void clearRect(int x, int y, int width, int height) {
			// TODO Auto-generated method stub

		}

		@Override
		public void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
			// TODO Auto-generated method stub

		}

		@Override
		public void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
			// TODO Auto-generated method stub

		}

		@Override
		public void drawOval(int x, int y, int width, int height) {
			// TODO Auto-generated method stub

		}

		@Override
		public void fillOval(int x, int y, int width, int height) {
			// TODO Auto-generated method stub

		}

		@Override
		public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
			// TODO Auto-generated method stub

		}

		@Override
		public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
			// TODO Auto-generated method stub

		}

		@Override
		public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {
			// TODO Auto-generated method stub

		}

		@Override
		public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {
			// TODO Auto-generated method stub

		}

		@Override
		public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {
			// TODO Auto-generated method stub

		}

		@Override
		public void drawString(String str, int x, int y) {
			// TODO Auto-generated method stub

		}

		@Override
		public void drawString(AttributedCharacterIterator iterator, int x, int y) {
			// TODO Auto-generated method stub

		}

		@Override
		public boolean drawImage(Image img, int x, int y, ImageObserver observer) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean drawImage(Image img, int x, int y, int width, int height, ImageObserver observer) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean drawImage(Image img, int x, int y, Color bgcolor, ImageObserver observer) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean drawImage(Image img, int x, int y, int width, int height, Color bgcolor,
				ImageObserver observer) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2,
				ImageObserver observer) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2,
				Color bgcolor, ImageObserver observer) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void dispose() {
			// TODO Auto-generated method stub

		}
	}

}
