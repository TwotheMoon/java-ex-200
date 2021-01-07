package 자료형_연산;

public class 자료형_연산8 {

	public static void main(String[] args) {
		// folat형의 변수를 0.0부터 1.0까지 0.001씩 증가시키며 표시, 그 옆에 int형 변수를 0부터
		// 1000까지의 1씩 증가시켜가며 1000으로 나눈 값을 표시
		
		System.out.println("float      int");
		System.out.println("-------------------");
		
		float x = 0.0f;
		for(int i =0; i <= 1000; i++, x += 0.001F)
			System.out.printf("%9.7f  %9.7f\n ", x, (float)i /1000);

	}

}
