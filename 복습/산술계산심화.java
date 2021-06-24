package 복습;

public class 산술계산심화 {

	public static void main(String[] args) {
		int x = 111;
		int y = 222;
		
		System.out.println("두 수의 합은:" + (x + y));
		System.out.println("두 수의 나눗셈은 :" + x / y);
		
		
		int sum = x + y;
		int avg = sum/2;		
		
		System.out.println("두 점수의 합은:" + sum);
		System.out.println("평균은 " + avg);
		//자바에서는 정수와 정수의 계산은 무조건 정수
		//자바에서는 하나라도 실수면 무조건 실수의 결과
		double avg2 = sum / 2.0;
		System.out.println(avg2);
		
		int count = 2;
		avg2 = sum / (double)count;
		System.out.println(avg2);
		//캐스팅:cpu가 원래 데이터의 타입을 다른 타입으로 강제로 변환하는것
		//강제로 타입 변환, 강제형변환
		
		//(x)int x2 = 22.0;
		double y2 = 22;
		//int의 범주를 포함하고 있는 변수가 double(double > int)
	}

}
