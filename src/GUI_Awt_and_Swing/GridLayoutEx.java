package GUI_Awt_and_Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;	// 자바의 확장된 기능
// GridLayout
public class GridLayoutEx extends JFrame { //  상속
	
	public GridLayoutEx() {	//생성자 / 객체초기화
		setTitle("BorderLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//닫기 버튼 클릭 시 백그라운드도 꺼짐
		Container contentPane = getContentPane();
		
		GridLayout gl = new GridLayout(5, 2);
		gl.setVgap(50);	//두 행 사이의 수직 간격 vGap이 5px로 설정
		contentPane.setLayout(gl);
		contentPane.add(new JLabel("이름"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("학번"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("학과"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("과목"));
		contentPane.add(new JTextField(""));
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GridLayoutEx();
	}
}
