package 분기문;

import java.util.Scanner;

public class 분기문10 {

	public static void main(String[] args) {
		// 입력한 정숫값을 3으로 나누고 결과에 따라 "이 값은 3으로 나누어집니다."표시,
		//	"이 값을 3으로 나눈 나머지는 1입니다." , "이 값을 3으로 나눈 나머지는 2입니다."
		// 양수가 아닌경우 "양수가 아닌 값을 입력했습니다."
		// 실행결과 : 입력값 1251
		//			이 값은 3을 나누어 집니다.
		//			입력값 1253
		//			이 값을 3으로 나눈 나머지는 2입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		
		int num = sc.nextInt();

		if(num > 0) {
			if(num % 3 == 0){
				System.out.println("이 값은 3으로 나누어집니다.");
			}else if(num % 3 == 1) {
				System.out.println("이 값을 3으로 나눈 나머지는 1입니다.");
			}else if(num % 3 == 2) {
				System.out.println("이 값을 3으로 나눈 나머지는 2입니다.");
			}	
		}
		else {
			System.out.println("양수가 아닌 값을 입력했습니다.");
		}
	
	}

}
