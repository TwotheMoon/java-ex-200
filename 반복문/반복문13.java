package 반복문;

import java.util.Scanner;

public class 반복문13 {

	public static void main(String[] args) {
		// 양의 정숫값을 0부터 카운트업
		// 실행결과 : 카운트업 합니다.
		// 양의 정숫값 : 4
		// 0
		// 1
		// 2
		// 3
		// 4
		
		Scanner sc = new Scanner(System.in);
		int x;
		do {
			System.out.println("양의 정숫값 : ");
			x = sc.nextInt();
		}while(x <= 0);
		
		for(int i = 0; i <= x; i ++) {
			System.out.println(i);
		}

	}

}
