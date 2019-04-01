import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class HW4_01 extends JFrame {
	public HW4_01() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("원 그리기");
		setVisible(true);
		add(new Mypanel());
	}
	public static void main(String[] args) {
		HW4_01 s = new HW4_01();
	}
}

class Circle {
	int radius;
	int centerX;
	int centerY;
	Color color;

	public Circle(int radius, int centerX, int centerY, Color color) {
		this.radius = radius;
		this.centerX = centerX;
		this.centerY = centerY;
		this.color = color;
	}

	void drawCircle(Graphics g) {
		g.setColor(color);
		g.fillOval(centerX, centerY, radius, radius);
	}

	public void paintComponent(Graphics g) {
		drawCircle(g);
	}
}


class Mypanel extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Circle[] circle = new Circle[20];
		for (int i = 0; i < 10; i++) {
			circle[i] = new Circle((int) (Math.random() * 300), (int) (Math.random() * 250),
					(int) (Math.random() * 250), new Color((int) (Math.random() * 255.0), (int) (Math.random() * 255.0),
							(int) (Math.random() * 255.0)));
			circle[i].paintComponent(g);
		}
	}
}