package 반복문;

import java.util.Scanner;

public class 반복문9 {

	public static void main(String[] args) {
		// 양의 정숫값을 읽어서 그 자릿수를 출력하는 프로그램
		// 실행 결과 : 양의 정숫값의 자릿수를 표시합니다.
		// 양의 정숫값 : 1254
		// 입력한 숫자는 4자리입니다.
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("양의 정숫값의 자릿수를 표시합니다.");
		int x;
		do {
			System.out.println("양의 정숫값 : ");
			x = sc.nextInt();
		}while(x <= 0); 
			int digit = 0;
		while(x > 0) {
			digit++;
			x /= 10;
		}
		System.out.println("입력한 숫자는 " + digit + "자리입니다.");
	}

}
