package 변수;

import java.util.Scanner;

public class 변수10 {

	public static void main(String[] args) {
		// 구의 부피와 겉넓이 구하기(원주율 3.1416은 final 변수 사용);
		// 실행결과 : 구의 겉넓이와 부피를 구합니다.
		//			반지름 : 12.5
		//			겉넓이는 1963.49999999998입니다.
		//			부피는 8181.24999999998입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구의 부피와 겉넓이를 구하는 프로그램 실행.");
		System.out.println("계속 하시려면 엔터를 눌러주세요...");
		String enter = sc.nextLine();
		
		System.out.println("반지름을 적어주세요. : ");
		double r =sc.nextDouble();
		System.out.println("입력하신 반지름은 " + r);
		
		System.out.println("겉넓이와 부피를 구합니다. 계속 하시려면 엔터를 눌러주세요.");
		
		sc.nextLine();
		sc.nextLine();
		final double pi = 3.1416;
		double surfaceArea = 4 * pi * r * r;
		double volume = 4/3.0* pi * r * r * r;
		System.out.println("겉넓이는 " + surfaceArea + "입니다.");
		System.out.println("부피는 " + volume + "입니다.");

	}

}
