package �б⹮;

import java.util.Scanner;

public class �б⹮9 {

	public static void main(String[] args) {
		// �Է��� �������� 10�� ����̸� "�� ���� 10�� ����Դϴ�." ǥ��,
		// �׷��������� "�� ���� 10�� ����� �ƴմϴ�." ��� ǥ���ϴ� ���α�
		//	������ ������� "���� �������� �Է��߽��ϴ�." ǥ��
		// ������ : �Է°� : 1250
		//			�� ���� 10�� ����Դϴ�.
		//			�Է°� : 1254
		//			�� ���� 10�� ����� �ƴմϴ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		
		int num = sc.nextInt();
		
		if(num > 0) {
			if(num % 10 == 0) {
				System.out.println("�� ���� 10�� ����Դϴ�.");
			}
			else {
				System.out.println("�� ���� 10�� ����� �ƴմϴ�.");
			}
		}
		else {
			System.out.println("���� �������� �Է��߽��ϴ�.");
		}
	}

}
