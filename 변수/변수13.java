package 변수;

import java.util.Random;

public class 변수13 {

	public static void main(String[] args) {
		// 실수형 값 랜덤 프로그램
		// 실행결과 : 3개의 난수를 생성했습니다.
		// 0.0이상 1.0미만 : 0.992389128
		// 0.0이상 10.0미만 : 5.547457375
		// -1.0이상 1.0미만 : -0.4643643
		
		Random rand = new Random();
		
		double n1 = rand.nextDouble();
		double n2 = -1 -rand.nextDouble() * 10; 
		double n3 = -1 + 2 * rand.nextDouble();
		
		System.out.println("3개의 난수를 생성했습니다.");
		System.out.println("0.0이상 1.0미만 :" + n1);
		System.out.println("0.0이상 10.0미만 :" + n2);
		System.out.println("-1.0이상 1.0미만 :" + n3 );
	}

}
