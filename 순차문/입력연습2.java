package 순차문;

import javax.swing.JOptionPane;

public class 입력연습2 {

	public static void main(String[] args) {
	//오늘은 몇요일?	
	String day = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
	
	//오늘의 날씨는?
	String wheather = JOptionPane.showInputDialog("오늘의 날씨는 ");
	
	//출력은 목요일은 더워요
	JOptionPane.showMessageDialog(null, day +"은 "+ wheather);
	}

}
