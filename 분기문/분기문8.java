package 분기문;

import java.util.Scanner;

public class 분기문8 {

	public static void main(String[] args) {
		// 입력한 정숫값이 5로 나누어떨어지면 "이 값은 5로 나눠집니다." 라고 표시하고
		// 그렇지 않으면 "이 값은 5로 나누어지지 않습니다." 라고 표시하는 프로그램
		// 실행결과 : 입력값 : 35
		//			이 값은 5로 나누어 집니다.
		//			입력값 : 36
		//			이 값은 5로 나누어지지 않습니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		
		int num = sc.nextInt();
		
		if (num % 5 == 0) {
			System.out.println("이 값은 5로 나누어 집니다.");
		}else {
			System.out.println("이 값은 5로 나누어지지 않습니다.");
		}
	}

}
