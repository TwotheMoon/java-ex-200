package 변수;

import java.util.Scanner;

public class 변수9 {

	public static void main(String[] args) {
		// 삼각형의 밑변과 높이를 입력받아 삼각형의 넓이를 구하는 프로그램
		// 실행결과 : 삼각형의 넓이를 구합니다.
		//			밑변 : 6.5
		//			높이 : 3.5
		//			넓이는 11.375
		Scanner sc = new Scanner(System.in);
		
		System.out.println("삼각형의 넓이를 구하는 프로그램 실행.");
		System.out.println("계속 하시려면 엔터를 눌러주세요..." );
		String enter = sc.nextLine();
		
		
		
		System.out.println("밑변를 적어주세요 : ");
		double width = sc.nextDouble();
		System.out.println("밑변 : " + width);
		
		System.out.println("높이를 적어주세요 : ");
		double high = sc.nextDouble();
		System.out.println("높이 : " + high);
		
		
		System.out.println("삼각형의 넓이를 구하고 있습니다 계속하시려면 엔터를 눌러주세요");
		Scanner sc2 = new Scanner(System.in);
		String enter2 = sc2.nextLine();
		
		System.out.println("삼각형의 넓이는 : " + (width * high)/2 + "입니다.");
		sc.close();
	}

}
