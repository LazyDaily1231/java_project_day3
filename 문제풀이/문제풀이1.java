package 문제풀이;

import javax.swing.JOptionPane;

public class 문제풀이1 {

	public static void main(String[] args) {
	
	//1.
	int x = 5;
	int price = 5000;
	
	if (x*price > 20000) {
		JOptionPane.showMessageDialog(null,"할인해드릴게요");
	} else {
		JOptionPane.showMessageDialog(null, "총 커피값을 내세요");

	}
	
	//2.
	int age = 100;
	System.out.println("내 내년 나이는" +(age + 1) + "세입니다" );
	
	
	if ((age + 1)>100) {
		JOptionPane.showMessageDialog(null, "이제부터 시작");
		System.out.println("이제부터 시작");
	} else {
		JOptionPane.showMessageDialog(null, "아직 젊어요");
		System.out.println("아직 젊어요");
	}
	//3.
	int waterEa = 2;
	int waterPrice = 1000;
	int waterTotal = waterEa * waterPrice;
	int maskEa = 3;
	int maskPrice = 2000;
	int maskTotal = maskEa * maskPrice;
	
	
	JOptionPane.showMessageDialog(null,"생수의 금액은 " +(waterEa * waterPrice)+"원" + "입니다");
	JOptionPane.showMessageDialog(null,"마스크의 금액은 " + (maskEa * maskPrice)+ "원" + "입니다");
	JOptionPane.showMessageDialog(null,"총 금액은 " + (waterTotal + maskTotal) +"원"+ "입니다");
	
	
	//4.
	for (int i = 0; i < 1000; i++) {
	System.out.println("나는 짱");
	}
	//5.
	int korean= 75;
	int math = 50;
	int sum = korean + math;
	JOptionPane.showMessageDialog(null,"두 과목의 총합은 " + sum + "점 입니다");
	
	
	int count = 2; 
    double avg = 2.0; 
    avg = sum/(double)count;
    JOptionPane.showMessageDialog(null, "두 과목의 평균은 " + avg + "점 입니다");

	
	
	}

}
