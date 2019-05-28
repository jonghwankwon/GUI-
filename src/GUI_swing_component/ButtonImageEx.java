package GUI_swing_component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonImageEx extends JFrame {
	Container contentPane;
	ButtonImageEx() {
	setTitle("버튼에 아이콘 달기 예제");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	contentPane = getContentPane();
	contentPane.setLayout(new FlowLayout());
	
	ImageIcon normalIcon = new ImageIcon("images/다운로드.png");
	ImageIcon rolloverIcon = new ImageIcon("images/다운로드.png");
	ImageIcon pressedIcon = new ImageIcon("images/다운로드.png");
	
	JButton btn = new JButton("call~~", normalIcon);
	btn.setRolloverIcon(rolloverIcon);
	btn.setPressedIcon(pressedIcon);
	contentPane.add(btn);
	
	setSize(400, 400);
	setVisible(true);
	}
	public static void main(String[] args) {
		new ButtonImageEx();
	}
}
