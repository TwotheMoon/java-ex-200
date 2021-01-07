package 변수;

import java.util.Scanner;

public class 변수7 {

	public static void main(String[] args) {
		// 키보드에 입력한 정숫값에 마지막 자릿수를 제외한 값과 마지막 자릿수 표시
		// 실행결과 : 정숫값 1275
		//			마지막 자릿수를 제외한 값은 127입니다.
		//			마지막 자릿수는 5입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값을 입력해주세요.");
		int isum = sc.nextInt();
		
		System.out.println("마지막 자릿수를 제외한 값은 " + isum / 10 + "입니다.");
		System.out.println("마지막 자릿수는 " + isum % 10 + "입니다.");

	}

}
