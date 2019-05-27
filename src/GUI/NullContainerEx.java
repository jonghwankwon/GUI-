package GUI;

import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame {
	NullContainerEx() {
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();

		c.setLayout(null);

		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130, 50);
		la.setSize(200, 20);
		c.add(la);
		for(int i=1; i<=9; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i*15, i*15);
			b.setSize(50, 20);
			c.add(b);
		}
		for(int k=1; k<=9; k++) {
			JButton b = new JButton(Integer.toString(k));
			b.setLocation(k*15, k*15);
			b.setSize(50, 20);
			c.add(b);
		}
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new NullContainerEx();
	}
}