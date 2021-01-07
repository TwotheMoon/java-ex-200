package 반복문;

import java.util.Scanner;

public class 반복문1 {

	public static void main(String[] args) {
		// 정숫값의 부호를 판정해 표시하는 sign 프로그램
		
		Scanner sc= new Scanner(System.in);
		int retry;
		
		do {
			System.out.println("정숫값 : ");
			int n =sc.nextInt();
			
			if(n > 0)
				System.out.println("이 값은 양수입니다.");
		else if(n < 0)
			System.out.println("이 값은 음수입니다.");
		else
			System.out.println("이 값은 0 입니다.");
			retry = sc.nextInt();
		}while(retry == 1);

	}

}
