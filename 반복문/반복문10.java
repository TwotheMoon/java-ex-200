package 반복문;

import java.util.Scanner;

public class 반복문10 {

	public static void main(String[] args) {
		// 양의 정숫값 n을 읽어서 1부터 n 까지의 1까지의 곱을 구하는 프로그램
		// 실향 결과 : 양위 정숫값 : 5
		// 1부터 5까지의 곱은 120입니다.
		
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("양의 정숫값");
			n = sc.nextInt();
		}
		while(n <=0 ); 
			int factorial = 1;
			int i = 1;
		while(i <= n) {
			factorial *= i;
			i++;
		}
		System.out.println("1부터" + n + "까지의 곱은" + factorial + "입니다.");
		

	}

}
