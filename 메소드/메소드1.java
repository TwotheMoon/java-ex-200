package 메소드;

import java.util.Scanner;

public class 메소드1 {

	public static void main(String[] args) {
		// 입력한 int형 정숫값이 음수이면 -1 을 0이면 0을 양수이면 1을 반환하는 signOf메소드
		// 실행결과 정수 x :13
		// signOf(x)는 1입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 x : ");
		int x = sc.nextInt();
		
		int s = signOf(x);
		System.out.println("signOf(x)는" + s + "입니다.");
	}

	static int signOf(int n) {
		int sign = 0;
		
		if(n > 0) {
			sign = 1;
		}
		else if(n < 0) {
			sign = -1;
		}
		else {
			sign = 0;
		}
		return sign;
		
	}
}
