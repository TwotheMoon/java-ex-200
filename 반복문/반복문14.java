package 반복문;

import java.util.Scanner;

public class 반복문14 {

	public static void main(String[] args) {
		// 1부터 n 까지의 합을 구하는 프로그램 for문 작성
		// 실행결과 : 1부터 n까지의 합을 구합니다 n의 값 : 5
		// 			1부터 5까지의 합은 15입니다.
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 n 까지의 합을 구합니다.");
		int n;
		do {
			System.out.println("n의 값 : ");
			n = sc.nextInt();
		}while(n <= 0);
		int sum = 0;
		for (int i = 0; i <= n; i++)
			sum += i; 
		System.out.println("1부터" + n + "까지의 합은" + sum + "입니다.");
	}

}
