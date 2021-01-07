package 변수;

import java.util.Random;
import java.util.Scanner;

public class 변수12 {

	public static void main(String[] args) {
		// 키보드에 입력한 정숫값을 +5 또는 -5 범위의 랜덤 정숫값을 생성
		// 실행결과 : 정숫값 7
		// 입력 값의 ±5 범위의 난수를 생성했습니다.

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("정숫값 : ");
		int x = sc.nextInt();
		
		System.out.println("입력 값의 ±5 범위의 난수를 생성했습니다.");
		System.out.println("값은 : " + (x-5 + rand.nextInt(12)) + "입니다.");
		
	}

}
