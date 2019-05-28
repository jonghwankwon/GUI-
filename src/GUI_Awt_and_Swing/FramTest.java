package GUI_Awt_and_Swing;

import javax.swing.*;	// 자바의 확장된 기능

public class FramTest {
	public static void main(String[] args) {
		JFrame jf = new JFrame("타이틀 입력");
	//	jf.setTitle("타이틀 입력");
		jf.setSize(500, 500);	// 크기 조절
		jf.setLocation(200, 300);	//위치 설정
		jf.setResizable(false);	//크기 고정
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//닫기 버튼 클릭 시 백그라운드도 꺼짐
		jf.setVisible(true);
	}
}
