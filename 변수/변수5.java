package 변수;

import java.util.Scanner;

public class 변수5 {

	public static void main(String[] args) {
		// 키보드에서 입력한 정숫값을 표시하자
		// 실행결과 : 정숫값 : 123
		//			123을 입력했습니다.
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(x+"를 입력했습니다.");
	}

}
