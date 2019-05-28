package GUI_Graphics;

import java.awt.*;
import javax.swing.*;

public class Graphics_SnowManFace extends JFrame {
	Container contentPane;
	public Graphics_SnowManFace() {
		setTitle("눈사람 얼굴");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(280, 300);
		setVisible(true);
		add(new MyPanel());
	}
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.yellow);
			g.fillOval(20, 30, 200, 200);
			g.setColor(Color.BLACK);
			g.drawArc(60, 80, 50, 50, 180, -180);
			g.drawArc(150, 80, 50, 50, 180, -180);
			g.drawArc(70, 130, 100, 70, 180, 180);
			}
		}

	public static void main(String [] args) {
		new Graphics_SnowManFace();
	}
} 
