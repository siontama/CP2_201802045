package hw3_1;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class cal extends JFrame{
	private JPanel p,p1,p2;
	private JTextField inputTextField1,inputTextField2,outputTextField;
	private JButton b1;
	public cal() {
		setTitle("이자 계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel();
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
		
		p1 = new JPanel(new BorderLayout());
		p1.add(new JLabel("원금을 입력하시오."),BorderLayout.WEST);
		inputTextField1 = new JTextField(5);
		p1.add(inputTextField1, BorderLayout.EAST);
		
		p2 = new JPanel(new BorderLayout());
		p2.add(new JLabel("이율을 입력하시오."),BorderLayout.WEST);
		inputTextField2 = new JTextField(5);
		p2.add(inputTextField2, BorderLayout.EAST);
		
		b1 = new JButton("변환");
		b1.setAlignmentX(Component.CENTER_ALIGNMENT);
		outputTextField = new JTextField(30);
		
		p.add(p1);
		p.add(p2);
		p.add(b1);
		p.add(outputTextField);
		
		add(p);
		pack();
		setVisible(true);
	}
}

public class hw3_1 {
	public static void main(String[] args) {
		new cal();
	}
}