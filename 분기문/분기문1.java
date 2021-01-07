package 분기문;

import java.util.Scanner;

public class 분기문1 {

	public static void main(String[] args) {
		// 키보드로 입력한 정숫값이 음이면 "이 값은 음의 값입니다" 라고 하는 프로그램 작성
		// 실행결과 :  입력값 -10
		//			이 값은 음의 값입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력값 : ");
		
		int num = sc.nextInt();
		if(num < 0) {
			System.out.println("이 값은 음의 값입니다.");
		}
		
	}

}
