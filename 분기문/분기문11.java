package �б⹮;

import java.util.Scanner;

public class �б⹮11 {

	public static void main(String[] args) {
		// �Է��� ������ ���� ��/��/��/��/�� �� �����ϴ� ���α׷� �ۼ�
		//				100 80 60 40 20
		// ������ : ���� : 68
		//			��
		//			���� : 89
		//			��
		//			���� 102
		//			�߸��� ���� �Դϴ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		
		int point = sc.nextInt();
		
		if(point >= 0 && point <= 100) {
			if(point >= 81 && point <= 100) {
				System.out.println("��");
			}
			else if(point >= 61 && point <= 80) {
				System.out.println("��");
			}
			else if(point >= 41 && point <= 60) {
				System.out.println("��");
			}
			else if(point >= 21 && point <= 40) {
				System.out.println("��");
			}
			else {
				System.out.println("��");
			}
		}
		else {
			System.out.println("�߸��� ���� �Դϴ�.");
		}

	}

}
