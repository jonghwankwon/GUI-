package GUI_Graphics;

import java.awt.*;
import javax.swing.*;

public class Graphics_ClipEx extends JFrame {
	Container contentPane;
	public Graphics_ClipEx() {
		setTitle("클리핑 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(300, 400);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		ImageIcon imageIcon = new ImageIcon("images/사과.jpg");
		Image image = imageIcon.getImage();

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			//System.out.println("....");
			g.drawImage(image, getWidth(), getHeight(), this);
			g.setColor(Color.BLUE);
			g.setFont(new Font("SanSerif", Font.ITALIC, 40));
			g.drawString("Go Gator", 10, 150);
		}
	}
	public static void main(String[] args) {
		new Graphics_ClipEx();
	}
}