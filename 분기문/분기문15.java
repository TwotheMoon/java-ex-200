package 분기문;

import java.util.Scanner;

public class 분기문15 {

	public static void main(String[] args) {
		// 키보드에서 입력한 3개의 정수 중 최솟값을 구하는 프로그램
		// 실행결과 : 정수 a : 3
		//			정수 b : 1
		//			정수 b : 2
		//			최솟값은 1 입니다.
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("정수 a : " );
		System.out.println("정수 b : " );
		System.out.println("정수 b : " );

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int min = a;
		
		if (b < min) min = b;
		if (c < min) min = c;
		
		System.out.println("최솟값은 : " + min + "입니다.");
	}

}
