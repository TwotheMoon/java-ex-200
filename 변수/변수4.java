package 변수;

public class 변수4 {

	public static void main(String[] args) {
		//	3개의 int형 변수에 값을 대입해 합계와 평균 구하기
		// 실행결과 : x값은 63입니다.
		//			y갑은 18입니다.
		//			z값은 52입니다.
		//			합계는 133입니다.
		//			평균은 44입니다.
		
		// 방법 1
		int x = 63;
		int y = 18;
		int z = 52;
		System.out.println("x값은 " + x + "입니다.");
		System.out.println("y값은 " + y + "입니다.");
		System.out.println("z값은 " + z + "입니다.");
		System.out.println("합계는 " + (x + y + z) + "입니다.");
		System.out.println("평균은 " + (x + y + z)/3 + "입니다.");
		
		// 방법 2
		int sum = x + y + z;
		System.out.println("합계는 " + sum + "입니다.");
		System.out.println("평균은 " + sum/3 + "입니다.");

	}

}
