package 변수;

import java.util.Scanner;

public class 변수15 {

	public static void main(String[] args) {
		// 입력한 주소를 표시하는 프로그램 작성
		// 실행결과 : 주소 : 서울특별시 관악구
		//		  주소는 서울특별시 관악구 입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주소를 입력해주세요 : ");
		String adress = sc.nextLine();
		System.out.println("주소는 " + adress + "입니다.");

	}

}
