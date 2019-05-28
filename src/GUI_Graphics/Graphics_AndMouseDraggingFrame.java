package GUI_Graphics;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.*;

public class Graphics_AndMouseDraggingFrame extends JFrame {

	public Graphics_AndMouseDraggingFrame() {
		setTitle("이미지 위에 원그리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(300, 400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		ImageIcon imgIcon = new ImageIcon("images/eat.jpg");
		Image img = imgIcon.getImage();
		int ovalX=100, ovalY=100;

		public MyPanel() {
			addMouseMotionListener(new MouseMotionAdapter() {
				public void mouseDragged(MouseEvent e) {
					ovalX = e.getX();
					ovalY = e.getY();
					repaint();
				}
			});
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			g.setColor(Color.GREEN);
			g.fillOval(ovalX, ovalY, 20, 20);
		}
	}
	public static void main(String[] args) {
		new Graphics_AndMouseDraggingFrame();
	}
}