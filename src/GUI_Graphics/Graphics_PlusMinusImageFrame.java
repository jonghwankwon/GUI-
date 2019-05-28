package GUI_Graphics;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Graphics_PlusMinusImageFrame extends JFrame {

	public Graphics_PlusMinusImageFrame() {
		setTitle("그래픽 이미지 확대 축소 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(300, 400);
		setVisible(true);
		getContentPane().requestFocus();
	}

	class MyPanel extends JPanel {
		ImageIcon imgIcon = new ImageIcon("images/eat.jpg");
		Image img = imgIcon.getImage();
		int width;
		int height;

		public MyPanel() {
			width = img.getWidth(this);
			height = img.getHeight(this);
			addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					System.out.println("----------");	//검사
					if(e.getKeyChar() == '+') {			//확대
						width = (int)(width*1.1);
						height = (int)(width*1.1);
						repaint();
					}else if(e.getKeyChar() == '-') {	//축소
						width = (int)(width*0.9);
						height = (int)(width*0.9);
						repaint();
						
					}
				}
			});
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, width, height, this);
		}
	}
	public static void main(String[] args) {
		new Graphics_PlusMinusImageFrame();
	}
}