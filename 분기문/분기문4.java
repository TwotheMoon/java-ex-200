package 분기문;

import java.util.Scanner;

public class 분기문4 {

	public static void main(String[] args) {
		// 분기문 3의 예제를 논리부정연산자(!) 를 사용해 수정
Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("변수 A : " );
		System.out.println("변수 B : " );
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (!(A % B == 0)) {
			System.out.println("B는 A의 약수가 아닙니다.");
		}
		else {
			System.out.println("B는 A의 약수 입니다.");
		}

	}

}
