package 분기문;

import java.util.Scanner;

public class 분기문21 {

	public static void main(String[] args) {
		// 월을 1~12의 정숫값으로 읽어 해당하는 계절을표시하는 프로그램
		// 실행결과 : 몇 월입니까? : 6
		//			여름
		//			몇 월 입니까? : 11
		//			가을
		//			몇 월 입니까? :13
		//			그런 월은 없습니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 월입니까? : ");
		int month = sc.nextInt();
		
		switch (month) {
		case 12 :
		case 1 :
		case 2 : System.out.println("겨울");
			break;
		case 3 :
		case 4 :
		case 5 : System.out.println("봄");
			break;
		case 6 :
		case 7 :
		case 8 : System.out.println("여름");
			break;
		case 9 :
		case 10 : 
		case 11 : System.out.println("가을");
			break;
		default : System.out.println("그런 월은 없습니다.");
			break;
		}

	}

}
