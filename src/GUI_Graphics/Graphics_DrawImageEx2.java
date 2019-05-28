package GUI_Graphics;

import java.awt.*;
import javax.swing.*;

public class Graphics_DrawImageEx2 extends JFrame {
	Container contentPane;
	public Graphics_DrawImageEx2() {
		setTitle("DrawImage 사용 예제2");
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
			g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
		}
	}
	public static void main(String[] args) {
		new Graphics_DrawImageEx2();
	}

}
