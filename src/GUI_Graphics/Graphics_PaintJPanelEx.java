package GUI_Graphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graphics_PaintJPanelEx extends JFrame {
	Container contentPane;
	
	Graphics_PaintJPanelEx() {
		setTitle("Jpanel paintComponent 예제");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		Mypanel panel = new Mypanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(250, 200);
		setVisible(true);
	}
	
	class Mypanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.blue);	//사각형의 색상
			g.drawRect(10, 10, 50, 50);	//사각형 그리기
			g.drawRect(50, 50, 50, 50);
			g.drawRect(90, 90, 50, 50);
		}
	}
	public static void main(String[] args) {
		new Graphics_PaintJPanelEx();
	}
}
