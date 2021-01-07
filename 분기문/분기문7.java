package 분기문;

import java.util.Scanner;

public class 분기문7 {

	public static void main(String[] args) {
		// 2개의 변수 a,b 값을 입력받아 대소 관계를 표시
		// "a가 크다." "b가 크다." "a와 b가 같다."
		// 실행결과 : 변수 a: 12		5		10
		//			변수 b: 3			15		10
		//			a가 크다		 b가 크다		a와 b가 같다
		
		Scanner sc = new Scanner(System.in);
		System.out.println("a와 b의 값을 입력하세요.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("변수 a : " + a);
		System.out.println("변수 b : " + b);
		
		if(a > b) {
			System.out.println("a가 크다.");
		} else if(a < b) {
			System.out.println("b가 크다.");
		}else if(a == b){
			System.out.println("a와 b가 같다");
		}
	
	}

}
