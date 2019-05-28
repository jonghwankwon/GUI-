package GUI_Graphics;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Graphics_Traffic_Light extends JFrame {
	public Graphics_Traffic_Light() {
		add(new MyPanel());
		setSize(300, 500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Graphics_Traffic_Light();
	}
}
class MyPanel extends JPanel implements ActionListener {
	boolean flag = false;
	private int light_number = 0;

	public MyPanel() {
		setLayout(new BorderLayout());
		JButton b = new JButton("traffic Light turn on");
		b.addActionListener(this);
		add(b, BorderLayout.SOUTH);
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.black);
		g.drawOval(100, 100, 100, 100);
		g.drawOval(100, 200, 100, 100);
		g.drawOval(100, 300, 100, 100);
		if(light_number == 0) {
			g.setColor(Color.RED);
			g.fillOval(100, 100, 100, 100);
		}else if (light_number == 1) {
			g.setColor(Color.GREEN);
			g.fillOval(100, 200, 100, 100);
		}else{
			g.setColor(Color.YELLOW);
			g.fillOval(100, 300, 100, 100);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(++light_number >= 3)light_number = 0;
		repaint();	// paintComponent 재호출
	}
}
