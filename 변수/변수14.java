package 변수;

import java.util.Scanner;

public class 변수14 {

	public static void main(String[] args) {
		// 키보드로 입력한 성과 이름으로 인사하는 프로그램
		// 실행결과 : 성 : 이
		//			이름 : 더문
		//			안녕하세요. 이더문 씨.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성을 입력해주세요 : ");
		String firstName = sc.next();
		System.out.println("성 : " + firstName );
		
		System.out.println("이름을 입력해주세요.");
		String secondName = sc.next();
		System.out.println("이름 : " + secondName);
		
		System.out.println("안녕하세요." + firstName + secondName + "씨.");
	
	}

}
