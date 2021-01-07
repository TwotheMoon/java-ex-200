package 반복문;

import java.util.Scanner;

public class 반복문11 {

	public static void main(String[] args) {
		// 기호 문자를 임의의 개수만큼 출력했던 문제를 for 문으로 작성
		// 실행 결과 : 몇 개의 *를 표시할까요? : 12
		// **********
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 개의 *을 표시할까요? : ");
		int num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			System.out.println("*");
		}

	}

}
