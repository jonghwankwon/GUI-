package GUI_Graphics;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class Graphics_DrawLineMouseEx extends JFrame {
	Container contentPane;
	Graphics_DrawLineMouseEx() {
		setTitle("Drawing Line by Mouse 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Graphics_DrawLineMouseEx();
	}
	class MyPanel extends JPanel {
		Vector<Point> vs = new Vector<Point>();
		Vector<Point> ve = new Vector<Point>();

		Point startP = null;
		Point endP = null;

		public MyPanel() {
			addMouseListener(new MouseAdapter(){
				public void mousePressed(MouseEvent e) {
					startP = e.getPoint();
				}
				public void mouseReleased(MouseEvent e) {
					endP = e.getPoint();
					vs.add(startP);
					ve.add(endP);
					repaint();
				}
			});
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			for(int i=0; i<vs.size(); i++) {
				Point s = vs.elementAt(i);
				Point e = ve.elementAt(i);
				g.drawLine((int)s.getX(), (int)s.getY(), 
						(int)e.getX(), (int)e.getY());
			}
		}
	}
} 