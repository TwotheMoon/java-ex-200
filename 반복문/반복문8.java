package 반복문;

import java.util.Scanner;

public class 반복문8 {

	public static void main(String[] args) {
		// 읽은 값의 갯수 만큼 '*' 와 '+'를 번갈아 가며 표시
		// 실행 예시 : 몇 개를 표시할까요? 12
		//			*+*+*+*+*+*+*+*+*+
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 개를 표시할까요? ");
		
		int num = sc.nextInt();
		if(num > 0) {
			int i = 0;
			while(i < num) {
				System.out.println("*+");
				i++;
			}
		}

	}

}
