package 메소드;

import java.util.Scanner;

public class 메소드3 {

	public static void main(String[] args) {
		// 3개의 int형 인수 a, b, c에서 중간값을 구하는 med 메소드 작성
		// 실행결과
		// 정수 a : 1
		// 정수 b : 3
		// 정수 a : 2
		// 중간값은 2입니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 a : ");
		int a = sc.nextInt();
		
		System.out.println("정수 b : ");
		int b = sc.nextInt();
		
		System.out.println("정수 c : ");
		int c = sc.nextInt();
		
		System.out.println("증간값은" + med(a, b, c) + "입니다.");
		
	}

	
	static int med(int a, int b, int c) {

		if(a >= b) {
			if(b >= c) {
				return b;
			}else if(a <= c) {
				return a;
			}else {
				return c;
			}
		}else if(a > c) {
			return a;
		}else if(b > c) {
			return c;
		}else {
			return b;
		}
	}
	
}
