package 자료형_연산;

import java.util.Scanner;

public class 자료형_연산3 {

	public static void main(String[] args) {
		// float형 변수와 double형 번수에 값을 읽어서 표시하는 프로그램
		// 실행 결과 : 변수 x는 float형입니다. 변수 y는 double형 입니다.
		// x : 0.12345678901234567890
		// y : 0.12345678901234567890
		// x = 0.123456789
		// y = 0.123456789012345678
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x : ");
		float x = sc.nextFloat();
		System.out.println("y : ");
		double y = sc.nextDouble();
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
