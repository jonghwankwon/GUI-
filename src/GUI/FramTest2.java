package GUI;

import javax.swing.*;	// 자바의 확장된 기능

public class FramTest2 extends JFrame { //  상속
	
	public FramTest2() {	//생성자 / 객체초기화
		setTitle("타이틀 입력");
		setSize(500, 500);	// 크기 조절
		setLocation(200, 300);	//위치 설정
		setResizable(false);	//크기 고정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//닫기 버튼 클릭 시 백그라운드도 꺼짐
		setVisible(true);		
	}
	
	public static void main(String[] args) {
		new FramTest2();
	}
}
