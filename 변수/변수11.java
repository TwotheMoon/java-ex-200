package 변수;

import java.util.Random;

public class 변수11 {

	public static void main(String[] args) {
		// 난수 프로그램 작성
		// 실행결과 : 3개의 난수를 생성했습니다.
		// 한 자리의 양의 정수 : 7
		// 한 자리 음의 정수 : -5
		// 두 자리 양의 정수 : 34
		
		Random rand = new Random();
		int n1 = 1 + rand.nextInt(9);
		int n2 = -1 - rand.nextInt(9);
		int n3 = 10 + rand.nextInt(90);
		
		System.out.println("3개의 난수를 생성하였습니다.");
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
	}

}
