package �б⹮;

import java.util.Scanner;

public class �б⹮14 {

	public static void main(String[] args) {
		// �� �������� ���� 100 ������ ��� "�� ���� ���� 10�����Դϴ�" ǥ��,
		// "�� ���� ���� 11 �̻��Դϴ�." ǥ�� ���α׷�
		// ������ : ���� a :12
		//			���� b : 3
		//		 	�� ���� ���� 10 �����Դϴ�.
		//			���� a : 35
		//			���� b : 23
		//			�� ���� ���� 11�̻��Դϴ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���� �Է��� �ּ���.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("���� a : " + a);
		System.out.println("���� b : " + b);
		
		int diff = a >= b  ? a - b : b - a;
		
		if(diff <= 10) {
			System.out.println("�� ���� ���� 10 �����Դϴ�.");
		}
		else {
			System.out.println("�� ���� ���� 11 �̻��Դϴ�.");
		}
		
		

	}

}
