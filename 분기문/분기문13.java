package �б⹮;

import java.util.Scanner;

public class �б⹮13 {

	public static void main(String[] args) {
		// 2���� �������� �о �� ���� ���� ǥ���ϴ� ���α׷�
		// ������ : ���� a : 12
		//			���� b : 3
		//			�� ���� ���� 9�Դϴ�.
		//			���� a : 3
		//			���� b : 12
		//			�� ���� ���� 9�Դϴ�.
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int num = a - b;
		if(num >= 0) {
			System.out.println("�� ���� ���� : " + num);
		}
		else
			System.out.println("�� ���� ���� : " + -num);

	}

}
