package GUI_swing_component;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CheckBoxEx2 extends JFrame {
	JButton btn = new JButton("확인");

	public CheckBoxEx2() {
		setTitle("체크 박스 예제2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		JCheckBox b1 = new JCheckBox("버튼 비활성화");
		JCheckBox b2 = new JCheckBox("버튼 감추기");
		add(b1);
		add(b2);
		add(btn);

		b1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED)
					btn.setEnabled(false);
				else
					btn.setEnabled(true);
			}
		});
		b2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED)
					btn.setVisible(false);
				else
					btn.setVisible(true);
			}
		});

		setSize(250, 250);
		setVisible(true);
	}
	public static void main(String[] args) {
		new CheckBoxEx2();
	}
}