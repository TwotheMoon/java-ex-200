package �б⹮;

import java.util.Scanner;

public class �б⹮15 {

	public static void main(String[] args) {
		// Ű���忡�� �Է��� 3���� ���� �� �ּڰ��� ���ϴ� ���α׷�
		// ������ : ���� a : 3
		//			���� b : 1
		//			���� b : 2
		//			�ּڰ��� 1 �Դϴ�.
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("���� a : " );
		System.out.println("���� b : " );
		System.out.println("���� b : " );

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int min = a;
		
		if (b < min) min = b;
		if (c < min) min = c;
		
		System.out.println("�ּڰ��� : " + min + "�Դϴ�.");
	}

}
