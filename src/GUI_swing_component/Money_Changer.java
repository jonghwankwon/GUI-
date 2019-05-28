package GUI_swing_component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Money_Changer extends JFrame {

	public Money_Changer() {
		setTitle("Mmoney_Changer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(300, 300);
		setVisible(true);
	}
	class MyPanel extends JPanel{
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		String [] text = {"오만원","만원","천원","500원","100원","50원","10원","1원"};
		JTextField source;
		JTextField [] tf = new JTextField [8];

		MyPanel() {
			setBackground(Color.PINK);
			setLayout(null);
			//금액 레이블
			JLabel la = new JLabel("금액");
			la.setHorizontalAlignment(JLabel.RIGHT);
			la.setSize(50, 20);
			la.setLocation(20, 20);
			add(la);

			// 금액을 입력하는 JTextField
			source = new JTextField(30);
			source.setSize(100,20);
			source.setLocation(100,20);
			add(source);

			//계산 버튼
			JButton calcBtn = new JButton("계산");
			calcBtn.setSize(70,20);
			calcBtn.setLocation(210, 20);
			add(calcBtn);

			//계산된 액수별 돈의 갯수
			for(int i=0; i<text.length; i++) {
				la = new JLabel(text[i]);
				la.setHorizontalAlignment(JLabel.RIGHT);
				la.setSize(50, 20);
				la.setLocation(50, 50+i*20);
				add(la);
				
				tf[i] = new JTextField(30);
				tf[i].setHorizontalAlignment(JTextField.CENTER);
				tf[i].setSize(70, 20);
				tf[i].setLocation(120, 50+i*20);

				add(tf[i]);
			}
			//계산 버튼의 Action 리스너
			calcBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String str = source.getText();	//입력된 금액 문자열
					if(str.length() == 0)return;//입력된 금액이 없음
					
					int money = Integer.parseInt(str);
					int res;	//정수값
					for(int i=0; i<unit.length; i++) {
						res = money/unit[i];	//unit[i]의 개수 계산
						tf[i].setText(Integer.toString(res));
						if(res > 0) money = money%unit[i]; // money 갱신
					}
					
				}
			});
		}
	}
	public static void main(String[] args) {
		new Money_Changer();
	}
}
