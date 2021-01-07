package 분기문;

import java.util.Scanner;

public class 분기문3 {

	public static void main(String[] args) {
		// 2개의 양의 정숫값을 읽어 후자가 전자의 약수이면 "B는 의 약수이다."
		// 라고 표시하고 그렇지 않으면 "B는 A의 약수가 아니다" 라고 표시하는 프로그램
		// 실행결과 : 변수 A : 12
		//		    변수 B : 4
		//		B는 A의 약수입니다.
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("변수 A : " );
		System.out.println("변수 B : " );
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A % B == 0) {
			System.out.println("B는 A의 약수입니다.");
		}
		else {
			System.out.println("B는 A의 약수가 아닙니다.");
		}

	}

}
