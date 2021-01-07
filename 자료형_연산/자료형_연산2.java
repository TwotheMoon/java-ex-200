package 자료형_연산;

import java.util.Scanner;

public class 자료형_연산2 {

	public static void main(String[] args) {
		// 10빈 정수를 8진수와 16진수로 표시하는 프로그램
		// 실행결과 : 정수 : 27
		//		   8 진수는 33입니다.
		//		   16 진수는 1b입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 :" );
		int x = sc.nextInt();
		
		System.out.printf("8진수는 %o입니다.\n" , x);
		System.out.printf("16진수는 %x입니다 \n", x);
		

	}

}
