import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HW4_02 extends JFrame {
	public HW4_02() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("주사위 던지기 프로그램");
		setVisible(true);
		Mypanel p1 = new Mypanel();
		p1.setBackground(Color.GRAY);
		add(p1);
	}
	public static void main(String[] args) {
		HW4_02 s = new HW4_02();
	}
}

class Dice {
	int number;
	int centerX;
	int centerY;

	public Dice(int centerX, int centerY, int number) {
		this.centerX = centerX;
		this.centerY = centerY;
		this.number = number;
	}

	void drawDice(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRoundRect(centerX, centerY, 100, 100, 10, 10);
		if(number == 1) {
			g.setColor(Color.BLACK);
			g.fillOval(centerX + 40, centerY + 40, 20, 20);
		}
		else if(number == 2) {
			g.setColor(Color.BLACK);
			g.fillOval(centerX + 10, centerY + 10, 20, 20);
			g.fillOval(centerX + 70, centerY + 70, 20, 20);
		}
		else if(number == 3) {
			g.setColor(Color.BLACK);
			g.fillOval(centerX + 10, centerY + 10, 20, 20);
			g.fillOval(centerX + 40, centerY + 40, 20, 20);
			g.fillOval(centerX + 70, centerY + 70, 20, 20);
		}
		else if(number == 4) {
			g.setColor(Color.BLACK);
			g.fillOval(centerX + 10, centerY + 10, 20, 20);
			g.fillOval(centerX + 70, centerY + 70, 20, 20);
			g.fillOval(centerX + 10, centerY + 70, 20, 20);
			g.fillOval(centerX + 70, centerY + 10, 20, 20);
		}
		else if(number == 5) {
			g.setColor(Color.BLACK);
			g.fillOval(centerX + 40, centerY + 40, 20, 20);
			g.fillOval(centerX + 10, centerY + 10, 20, 20);
			g.fillOval(centerX + 70, centerY + 70, 20, 20);
			g.fillOval(centerX + 10, centerY + 70, 20, 20);
			g.fillOval(centerX + 70, centerY + 10, 20, 20);
		}
		else if(number == 6) {
			g.setColor(Color.BLACK);
			g.fillOval(centerX + 10, centerY + 10, 20, 20);
			g.fillOval(centerX + 10, centerY + 40, 20, 20);
			g.fillOval(centerX + 70, centerY + 40, 20, 20);
			g.fillOval(centerX + 70, centerY + 70, 20, 20);
			g.fillOval(centerX + 10, centerY + 70, 20, 20);
			g.fillOval(centerX + 70, centerY + 10, 20, 20);
		}
		
	}

	public void paintComponent(Graphics g) {
		drawDice(g);
	}
}

class Mypanel extends JPanel {
	public void paintComponent(Graphics g) {
		Graphics graph = (Graphics)g;
		super.paintComponent(g);
		Dice[] dice = new Dice[2];
		int x1,x2,y1,y2;
		x1 = (int) (Math.random() * 250);												//1번 주사위 x좌표
		x2 = (int) (Math.random() * 250);												//2번 주사위 x좌표
		y1 = (int) (Math.random() * 250);												//1번 주사위 y좌표
		y2 = (int) (Math.random() * 250);												//2번 주사위 y좌표
		while(!(x1 + 100 < x2 || x2 + 100 < x1 || y1 + 100 < y2 || y2 + 100 < y1)) {	//주사위가 겹친지 판단
			x1 = (int) (Math.random() * 250);
			x2 = (int) (Math.random() * 250);
			y1 = (int) (Math.random() * 250);
			y2 = (int) (Math.random() * 250);
		}
		dice[0] = new Dice(x1, y1, (int) (Math.random() * 6) + 1);						//1번 주사위 객체
		dice[0].paintComponent(graph);
		dice[1] = new Dice(x2, y2, (int) (Math.random() * 6) + 1);						//2번 주사위 객체
		dice[1].paintComponent(graph);
	}
}