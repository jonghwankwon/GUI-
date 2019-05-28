package GUI_swing_component;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

import javax.swing.JFrame;

public class TextAreaEx extends JFrame {
	Container contentPane;
	TextAreaEx() {
		setTitle("텍스트 영역 만들기  예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.add(new MyCenterPanel(), BorderLayout.CENTER);
		setSize(300,300);
		setVisible(true);
	}
	class MyCenterPanel extends JPanel {
		JTextField tf;
		JButton btn;
		JTextArea ta;
		MyCenterPanel() {
			tf = new JTextField(20);
			btn = new JButton("추가");
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ta.append(tf.getText()+"\n");	// 버튼이 선택되면 ta의 끝에 tf에 입력된 문자열을 추가함

				}
			});
			ta = new JTextArea("hello", 7, 20);	// 20x7 크기에 “hello”문자열을 가진 JTextArea 컴포넌트 생성
			add(new JLabel("아래 창에 문자열을 입력하고 버튼을 클릭하세요"));
			add(tf);
			add(btn);
			add(new JScrollPane(ta));	// 스크롤바를 출력하기 위해 JTextArea 컴포넌트를 JScrollPane에 삽입하고 JScrollPane 객체를 패널에 삽입
		}
	}		
	public static void main(String [] args) {
		new TextAreaEx();
	}
} 