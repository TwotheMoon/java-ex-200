package 분기문;

import java.util.Scanner;

public class 분기문5 {

	public static void main(String[] args) {
		// 정숫값을 입력받아 부호(양수/음수/0)를 판정한는 프로그램
		// 실행결과 : 정숫값 : 37
		//			값이 양수입니다.
		//			정숫값 : 0
		//			값이 0입니다.
		//			정숫값 : -35
		//			값이 음수입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("값을 입력해주세요.");
		
		int num = sc.nextInt();
		
		
		if(num > 0) {
			System.out.println("값이 양수입니다.");
		}else if(num == 0) {
			System.out.println("값이 0입니다.");
		}else if(num < 0) {
			System.out.println("값이 음수입니다.");
		}
		else {
			System.out.println();
		}

	}

}
