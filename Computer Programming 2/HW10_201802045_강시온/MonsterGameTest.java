import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;
import java.util.*;

public class MonsterGameTest{
	public static void main(String[] args) {
		new MonsterGame();
	}
}

class MonsterGame extends JFrame {

	private JLabel player = new JLabel("@");
	private JLabel monster = new JLabel("M");
	public int how_much_move = 5;
	public int player_x, player_y, monster_x, monster_y;

	MonsterGame() {
		this.setTitle("MONSTER GAME");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		player_x = 150;
		player_y = 150;
		Window window = new Window();
		setContentPane(window);
		this.setVisible(true);
	}

	class KeyBoard extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_UP) {
				player_y -= how_much_move;
			}
			if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				player_y += how_much_move;
			}
			if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				player_x -= how_much_move;
			}
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				player_x += how_much_move;
			}
			player.setLocation(player_x, player_y);
		}
	}
	class Window extends JPanel {
		Window() {		
			this.setLayout(null);
			Random random = new Random();
			monster_x = random.nextInt(300);
			monster_y = random.nextInt(300);
			this.add(player);
			this.add(monster);
			player.setForeground(Color.RED);
			player.setBounds(player_x, player_y, 15, 15);
			monster.setBounds(monster_x, monster_y, 15, 15);
			this.addKeyListener(new KeyBoard());
			this.setFocusable(true);
			this.grabFocus();
			MonsterThread thread = new MonsterThread();
			thread.start();
		}
	}
	class MonsterThread extends Thread {
		public void run() {
			while (true) {
				if (monster_x > player_x) {
					monster_x -= how_much_move;
				}

				if (monster_x < player_x) {
					monster_x += how_much_move;
				}

				if (monster_y > player_y) {
					monster_y -= how_much_move;
				}

				if (monster_y < player_y) {
					monster_y += how_much_move;
				}
				
				monster.setLocation(monster_x, monster_y);

				if ((player_x - monster_x < 5 && player_x - monster_x > -5) &&
						(player_y - monster_y < 5 && player_y - monster_y > -5)) {
					System.out.println("GAME OVER!");
					System.exit(0);
				}

				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					return;
				}
			}
		}
	}
}