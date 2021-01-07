package 메소드;

import java.util.Scanner;

public class 메소드2 {

	public static void main(String[] args) {
		// 3개의 int형 인수 a, b, c중 최솟값을 구하는 min 메서드 작성
		// 실행 결과 :
		// 정수 a : 1
		// 정수 b : 3
		// 정수 c : 2
		// 최솟값은 1입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 a : ");
		int a = sc.nextInt();
		
		System.out.println("정수 b : ");
		int b = sc.nextInt();
		
		System.out.println("정수 c : ");
		int c = sc.nextInt();
		
		int result = min(a, b, c);
		
		System.out.println("최솟값은 : " + result + "입니다.");
	}

	static int min(int a, int b, int c) {
		int min = a;
		if(b < min) {
			min = b;
		}
		else if(c < min) {
			min = c;
		}
		
		return min; 
	}
	
}
