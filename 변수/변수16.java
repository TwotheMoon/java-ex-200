package 변수;

public class 변수16 {

	public static void main(String[] args) {
		// String형의 변수를 문자열로 초기화 하거나 변수에 문자열을 대입
		// 실행결과 : 문자열 s1은 ABC입니다.
		//			문자열 s2는 xyz입니다.
		//			문자열 s1은 FBI입니다.
		//			문자열 s2는 xyz입니다.
		
		String s1 = "ABC";
		String s2 = "xyz";
		
		System.out.println("문자열 s1은 : " + s1 + "입니다.");
		System.out.println("문자열 s2는 : " + s2 + "입니다.");
		
		
		s1 = "FBI";
		System.out.println("문자열 s3는 : " + s1 + "입니다.");
		System.out.println("문자열 s2는 : " + s2 + "입니다." );

	}

}
