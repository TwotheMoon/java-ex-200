package 배열;

public class 배열2 {

	public static void main(String[] args) {
		// 요소 개수가 5개인 int형 배열에 순서대로 5,4,3,2,1을 대입하는 프로그램
		// 실행 결과
		// a[0] = 5;
		// a[1] = 4;
		// a[2] = 3;
		// a[3] = 2;
		// a[4] = 1;
		
	int[] a = new int[5];
	
	for(int i = 0; i < a.length; i++)
		a[i] = 5 - i;
	
	for(int i = 0; i < a.length; i++)
		System.out.println("a[" + i + "] = " + a[i]);

	}

}
