package 분기문;

import java.util.Scanner;

public class 분기문11 {

	public static void main(String[] args) {
		// 입력한 점수에 따라 수/우/미/양/가 를 판정하는 프로그램 작성
		//				100 80 60 40 20
		// 실행결과 : 점수 : 68
		//			미
		//			점수 : 89
		//			수
		//			점수 102
		//			잘못된 점수 입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		
		int point = sc.nextInt();
		
		if(point >= 0 && point <= 100) {
			if(point >= 81 && point <= 100) {
				System.out.println("수");
			}
			else if(point >= 61 && point <= 80) {
				System.out.println("우");
			}
			else if(point >= 41 && point <= 60) {
				System.out.println("미");
			}
			else if(point >= 21 && point <= 40) {
				System.out.println("양");
			}
			else {
				System.out.println("가");
			}
		}
		else {
			System.out.println("잘못된 점수 입니다.");
		}

	}

}
