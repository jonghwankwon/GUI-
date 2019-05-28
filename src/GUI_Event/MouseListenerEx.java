package GUI_Event;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseListenerEx  extends JFrame {
	JLabel la;

	MouseListenerEx() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel contentPane = new JPanel();
		setContentPane(contentPane);
		setLayout(null);
		contentPane.addMouseListener(new MyMouseListener());

		la = new JLabel("hello");
		la.setSize(50, 20);
		la.setLocation(30, 30);
		contentPane.add(la);

		setSize(200,200);
		setVisible(true);
	}
	class MyMouseListener implements MouseListener{
		public void mousePressed(MouseEvent e) {
			int x = e.getX();		//┏	마우스 버튼이 눌러진 위치를 알아내어
			int y = e.getY();		//┣
			la.setLocation(x, y);	//┗ la("hello" 문자열)를 그 위치로 옮긴다.
		}
		
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}
	public static void main(String[] args) {
		new MouseListenerEx();
	}
}
