package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;	// 자바의 확장된 기능
// 간격설정
public class FramContentPaneEx extends JFrame { //  상속
	
	public FramContentPaneEx() {	//생성자 / 객체초기화
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//닫기 버튼 클릭 시 백그라운드도 꺼짐
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		contentPane.add(new JButton("add"));
		contentPane.add(new JButton("sub"));
		contentPane.add(new JButton("mul"));
		contentPane.add(new JButton("div"));
		contentPane.add(new JButton("calculate"));
		
		setSize(300, 250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FramContentPaneEx();
	}
}
