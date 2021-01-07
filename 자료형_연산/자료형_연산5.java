package 자료형_연산;

import java.util.Scanner;

public class 자료형_연산5 {

	public static void main(String[] args) {
		// 3개의 정숫값을 읽어서 평균을 실수로 표시
		// 실행 결과 : 정숫값 x, y, z의 평균을 구합니다.
		// x값 : 7
		// y값 : 8
		// z값 : 10
		// x, y, z의 평균은 8.333입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정숫값 x, y, z의 평균을 구합니다.");
		
		System.out.println("x값 : " );
		int x = sc.nextInt();
		
		System.out.println("y값 : ");
		int y = sc.nextInt();
		
		System.out.println("z값 : ");
		int z = sc.nextInt();
		
		double ave = (x+y+z)/3.0;
		
		System.out.println("x, y, z의 평균은 " + ave);

	}

}
