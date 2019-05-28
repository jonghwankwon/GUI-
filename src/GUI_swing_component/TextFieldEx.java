package GUI_swing_component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame {
	Container contentPane;
	public TextFieldEx() {
		setTitle("텍스트 필드 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JLabel("이름 : "));
		contentPane.add(new JTextField(10));
		contentPane.add(new JLabel("학과 : "));
		contentPane.add(new JTextField("xxx 공학과"));
		contentPane.add(new JLabel("주소 : "));
		contentPane.add(new JTextField("서울시 ...", 20));
		
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextFieldEx();
	}
}
