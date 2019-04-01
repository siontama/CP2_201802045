import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {
	private JButton button1, button2, button3, button4, button5;
	private JLabel label;
	private JPanel panel1, panel2, panel3;

	public MyFrame() {
		setTitle("Frame Test");
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();

		label = new JLabel("자바 호텔에 오신 것을 환영합니다. 숙박인원을 선택하세요.");

		button1 = new JButton("1명");
		button2 = new JButton("2명");
		button3 = new JButton("3명");
		button4 = new JButton("4명");
		button5 = new JButton("5명");

		panel1.add(label);
		
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		
		panel3.add(panel1);
		panel3.add(panel2);

		add(panel3);
		
		setVisible(true);
	}
}

public class Hotel {
	public static void main(String[] args) {
		new MyFrame();
	}
}
