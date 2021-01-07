package 반복문;

import java.util.Scanner;

public class 반복문12 {

	public static void main(String[] args) {
		// 양의 정숫값을 0까지 카운트 다운하는문제를 for문으로 작성
		// 실행결과 : 카운트다운 합니다.
		// 			양의 정숫값 : 4
		// 4
		// 3
		// 2
		// 1
		// 0
		
		Scanner sc = new Scanner(System.in);
		System.out.println("카운트다운 합니다.");
		int x;
		do {
			System.out.println("양의 정숫값 : ");
			x = sc.nextInt();
		}while(x <= 0);
		
		for(; x >=0; x--) {
			System.out.println(x);
		}
	}
}
