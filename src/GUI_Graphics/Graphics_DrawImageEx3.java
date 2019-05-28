package GUI_Graphics;

import java.awt.*;
import javax.swing.*;

public class Graphics_DrawImageEx3 extends JFrame {
	Container contentPane;
	public Graphics_DrawImageEx3() {
		setTitle("DrawImage 사용 예제3");
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
//			System.out.println("....");
			g.drawImage(image, 20, 20, 250, 100, 100, 50, 200, 200, this);
//			Image에서 일부분(200 * 200)을 잘라서 출력 
		}
	}
	public static void main(String[] args) {
		new Graphics_DrawImageEx3();
	}

}
