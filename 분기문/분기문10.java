package �б⹮;

import java.util.Scanner;

public class �б⹮10 {

	public static void main(String[] args) {
		// �Է��� �������� 3���� ������ ����� ���� "�� ���� 3���� ���������ϴ�."ǥ��,
		//	"�� ���� 3���� ���� �������� 1�Դϴ�." , "�� ���� 3���� ���� �������� 2�Դϴ�."
		// ����� �ƴѰ�� "����� �ƴ� ���� �Է��߽��ϴ�."
		// ������ : �Է°� 1251
		//			�� ���� 3�� ������ ���ϴ�.
		//			�Է°� 1253
		//			�� ���� 3���� ���� �������� 2�Դϴ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		
		int num = sc.nextInt();

		if(num > 0) {
			if(num % 3 == 0){
				System.out.println("�� ���� 3���� ���������ϴ�.");
			}else if(num % 3 == 1) {
				System.out.println("�� ���� 3���� ���� �������� 1�Դϴ�.");
			}else if(num % 3 == 2) {
				System.out.println("�� ���� 3���� ���� �������� 2�Դϴ�.");
			}	
		}
		else {
			System.out.println("����� �ƴ� ���� �Է��߽��ϴ�.");
		}
	
	}

}
