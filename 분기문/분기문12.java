package 분기문;

import java.util.Scanner;

public class 분기문12 {

	public static void main(String[] args) {
		// 2개의 실수값중 큰 값을 표시하는 프로그램 작성
		// 실행결과 : 실수 a : 25.7
		//			실수 b : 15.3
		//			큰 쪽의 값은 35.7입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("2개의 실수를 입력하세요.");
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		System.out.println("실수 a : " + a);
		System.out.println("실수 b : " + b);
		
		double bigger;
		
		if(a > b) {
			bigger = a;
		}
		else {
			bigger = b;
		}
		
		System.out.println("큰 쪽의 값은 : " + bigger + "입니다.");
	}

}
