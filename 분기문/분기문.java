package �б⹮;

import java.util.Scanner;

public class �б⹮ {

	public static void main(String[] args) {
		//�������� �о ������ ���ϴ� ���α׷� �ۼ�
		// ���� ��� : �Է°� -35
		//			���밪�� 35�Դϴ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Է°� : ");
		int num = sc.nextInt();
		int abs;
		
		if(num >= 0 ) {
			abs = num;
		}
		else  {
			abs = -num;
			System.out.println("���밪��" + abs + "�Դϴ�.");
		}

	}

}
