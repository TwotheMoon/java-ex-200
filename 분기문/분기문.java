package 분기문;

import java.util.Scanner;

public class 분기문 {

	public static void main(String[] args) {
		//정수값을 읽어서 절댓값을 구하는 프로그램 작성
		// 실행 결과 : 입력값 -35
		//			절대값은 35입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력값 : ");
		int num = sc.nextInt();
		int abs;
		
		if(num >= 0 ) {
			abs = num;
		}
		else  {
			abs = -num;
			System.out.println("절대값은" + abs + "입니다.");
		}

	}

}
