package 분기문;

import java.util.Scanner;

public class 분기문14 {

	public static void main(String[] args) {
		// 두 정숫값의 차가 100 이하인 경우 "두 값의 차는 10이하입니다" 표시,
		// "두 값의 차는 11 이상입니다." 표시 프로그램
		// 실행결과 : 정수 a :12
		//			정수 b : 3
		//		 	두 값의 차는 10 이하입니다.
		//			정수 a : 35
		//			정수 b : 23
		//			두 값의 차는 11이상입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 값을 입력해 주세요.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("정수 a : " + a);
		System.out.println("정수 b : " + b);
		
		int diff = a >= b  ? a - b : b - a;
		
		if(diff <= 10) {
			System.out.println("두 값의 차는 10 이하입니다.");
		}
		else {
			System.out.println("두 값의 차는 11 이상입니다.");
		}
		
		

	}

}
