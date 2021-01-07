package 분기문;

import java.util.Scanner;

public class 분기문9 {

	public static void main(String[] args) {
		// 입력한 정숫값이 10의 배수이면 "이 값은 10의 배수입니다." 표시,
		// 그렇지않으면 "이 값은 10의 배수가 아닙니다." 라고 표시하는 프로그
		//	음수를 읽을경우 "음의 정숫값을 입력했습니다." 표시
		// 실행결과 : 입력값 : 1250
		//			이 값은 10의 배수입니다.
		//			입력값 : 1254
		//			이 값은 10의 배수가 아닙니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		
		int num = sc.nextInt();
		
		if(num > 0) {
			if(num % 10 == 0) {
				System.out.println("이 값은 10의 배수입니다.");
			}
			else {
				System.out.println("이 값은 10의 배수가 아닙니다.");
			}
		}
		else {
			System.out.println("음의 정숫값을 입력했습니다.");
		}
	}

}
