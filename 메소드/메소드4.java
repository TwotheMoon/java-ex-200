package 메소드;

import java.util.Scanner;

public class 메소드4 {

	public static void main(String[] args) {
		// 1부터 n까지의 정수의 합을 구해서 반환하는 메소드
		// 실행 결과 :
		// 1부터 x까지의 합을 구하자.
		// x의값 : 5
		// 1부터 5까지의 합은 15입니다.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 x까지의 합을 구하자");
		System.out.println("x의 값 : ");
		int x = sc.nextInt();
		
		System.out.println("1부터 " + x + "까지의 합은 " + sumUp(x));
	}

	static int sumUp(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++ ) {
			sum += i;
		
		}
		return sum;
	}
	
}
