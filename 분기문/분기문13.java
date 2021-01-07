package 분기문;

import java.util.Scanner;

public class 분기문13 {

	public static void main(String[] args) {
		// 2개의 정숫값을 읽어서 두 값의 차를 표시하는 프로그램
		// 실행결과 : 정수 a : 12
		//			정수 b : 3
		//			두 값의 차는 9입니다.
		//			정수 a : 3
		//			정수 b : 12
		//			두 값의 차는 9입니다.
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int num = a - b;
		if(num >= 0) {
			System.out.println("두 값의 차는 : " + num);
		}
		else
			System.out.println("두 값의 차는 : " + -num);

	}

}
