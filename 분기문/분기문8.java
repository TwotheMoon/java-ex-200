package �б⹮;

import java.util.Scanner;

public class �б⹮8 {

	public static void main(String[] args) {
		// �Է��� �������� 5�� ����������� "�� ���� 5�� �������ϴ�." ��� ǥ���ϰ�
		// �׷��� ������ "�� ���� 5�� ���������� �ʽ��ϴ�." ��� ǥ���ϴ� ���α׷�
		// ������ : �Է°� : 35
		//			�� ���� 5�� ������ ���ϴ�.
		//			�Է°� : 36
		//			�� ���� 5�� ���������� �ʽ��ϴ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		
		int num = sc.nextInt();
		
		if (num % 5 == 0) {
			System.out.println("�� ���� 5�� ������ ���ϴ�.");
		}else {
			System.out.println("�� ���� 5�� ���������� �ʽ��ϴ�.");
		}
	}

}
