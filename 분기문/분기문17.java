package �б⹮;

import java.util.Scanner;

public class �б⹮17 {

	public static void main(String[] args) {
		// 2���� ������ �Է��� ������, ū�� ǥ��
		// �� �������� ������ "�� ���� �����ϴ�."
		// ������ : ���� a : 12
		//			���� b : 3
		//			���� ���� 3�Դϴ�.
		//			ū ���� 12 �Դϴ�.
		//			���� a : 17
		//			���� b : 17
		//			�� ���� �����ϴ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �Է��ϼ���. ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a > b) {
			System.out.println("���� ����" + b + "�Դϴ�.");
			System.out.println("ū ����" + a + "�Դϴ�.");
		}else if(a < b) {
			System.out.println("���� ����" + a + "�Դϴ�.");
			System.out.println("ū ����" + b + "�Դϴ�.");
		}else if(a == b) {
			System.out.println("�� ���� �����ϴ�.");
		}
		

	}

}
