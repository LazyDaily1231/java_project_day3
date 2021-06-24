package 복습;

public class 복습1 {

	public static void main(String[] args) {
		
		int classNo = 8; 
		double temp = 26.2; 
	
		char day = '목';
		boolean food = false;		
		String lunch = "1층  가서 생각 ㄱ";		
		
		
		
		System.out.println("오늘의 온도는: " + temp + "도");
		System.out.println("오늘의 수업 수" + classNo);
		System.out.println("오늘 요일" + day);
		System.out.println("아침 먹음?" + food);
		System.out.println("점심 어케 함?" + lunch);
		System.out.println(temp == 27.5);
		System.out.println(temp > 27.5);
		
		//오늘 온도 29.2로 변경하여, 어제 온도보다 낮은지
		temp = 29.2;
		System.out.println(temp < 27.5);
		
	}

}
