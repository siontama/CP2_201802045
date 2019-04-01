package hw3_2;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class cal extends JFrame{
	private JPanel p,p1,p2,p3,p4,p5,p6;
	private JTextField inputTextField1;
	public cal() {
		setTitle("°è»ê±â");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel();
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
		
		p1 = new JPanel();
		inputTextField1 = new JTextField(15);
		p1.add(inputTextField1);
		
		p2 = new JPanel(new GridLayout(0,4,3,3));
		p2.add(new JButton("7"));
		p2.add(new JButton("8"));
		p2.add(new JButton("9"));
		p2.add(new JButton("/"));
		p2.add(new JButton("4"));
		p2.add(new JButton("5"));
		p2.add(new JButton("6"));
		p2.add(new JButton("*"));
		p2.add(new JButton("1"));
		p2.add(new JButton("2"));
		p2.add(new JButton("3"));
		p2.add(new JButton("-"));
		p2.add(new JButton("0"));
		p2.add(new JButton("back"));
		p2.add(new JButton("="));
		p2.add(new JButton("+"));
		
		p6 = new JPanel(new GridLayout(0,4,4,4));
		p6.add(new JButton("c"));
		
		p.add(p1);
		p.add(p6);	
		p.add(p2);
		
		add(p);
		pack();
		setVisible(true);
	}
}

public class hw3_2 {
	public static void main(String[] args) {
		new cal();
	}
}
