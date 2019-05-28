package GUI_Graphics;

import java.awt.*;
import javax.swing.*;

public class Graphics_MouseDragPracticeFrame extends JFrame {
	public Graphics_MouseDragPracticeFrame() {
		setTitle("이미지 그리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(300, 400);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		ImageIcon imgIcon = new ImageIcon("images/eat.jpg");
		Image img = imgIcon.getImage();
		
		public MyPanel() {	// 버튼 생성
			setLayout(new FlowLayout());
			add(new JButton("Click"));
		}

		public void paintComponent(Graphics g) {	//사진 크기 조절
			super.paintComponent(g);
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		}
	}
	public static void main(String[] args) {
		new Graphics_MouseDragPracticeFrame();
	}

}
