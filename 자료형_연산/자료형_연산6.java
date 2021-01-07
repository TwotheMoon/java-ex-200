package 자료형_연산;

import java.util.Scanner;

public class 자료형_연산6 {

	public static void main(String[] args) {
		// 3대의 정숫값의 합계와 평균을 구하는 프로그램 평균은 캐스트 연산자 이용해서 구하고 실수로 표시
		
		Scanner sc = new Scanner(System.in);
		// 실행결과 : 정숫값 x, y, z의 평균을 구합니다
		// x값 : 7
		// y값 : 8
		// z값 : 10
		// x, y, z의 평균은 8.333입니다.
		
		System.out.println("정숫값 x, y, z의 평균을 구합니다.");

		System.out.println("x값 : ");
		int x = sc.nextInt();
		System.out.println("y값 : ");
		int y = sc.nextInt();
		System.out.println("z값 : ");
		int z = sc.nextInt();
		
		double ave = (double)(x + y + z) / 3;
		System.out.printf("x, y, z의 평균은 %.3f입니다.\n" , ave);

	}

}
