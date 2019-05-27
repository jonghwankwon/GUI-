package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;	// 자바의 확장된 기능

public class FramContentPaneEx2 extends JFrame { //  상속
	
	public FramContentPaneEx2() {	//생성자 / 객체초기화
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//닫기 버튼 클릭 시 백그라운드도 꺼짐
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.orange);
		contentPane.setLayout(new FlowLayout());
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(350, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FramContentPaneEx2();
	}
}
