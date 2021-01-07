package 분기문;

import java.util.Scanner;

public class 분기문17 {

	public static void main(String[] args) {
		// 2개의 정숫값 입력후 작은값, 큰값 표시
		// 두 정숫값이 같으면 "두 값이 같습니다."
		// 실행결과 : 정수 a : 12
		//			정수 b : 3
		//			작은 값은 3입니다.
		//			큰 값은 12 입니다.
		//			정수 a : 17
		//			정수 b : 17
		//			두 값이 같습니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두 값을 입력하세요. ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a > b) {
			System.out.println("작은 값은" + b + "입니다.");
			System.out.println("큰 값은" + a + "입니다.");
		}else if(a < b) {
			System.out.println("작은 값은" + a + "입니다.");
			System.out.println("큰 값은" + b + "입니다.");
		}else if(a == b) {
			System.out.println("두 값이 같습니다.");
		}
		

	}

}
