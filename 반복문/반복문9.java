package �ݺ���;

import java.util.Scanner;

public class �ݺ���9 {

	public static void main(String[] args) {
		// ���� �������� �о �� �ڸ����� ����ϴ� ���α׷�
		// ���� ��� : ���� �������� �ڸ����� ǥ���մϴ�.
		// ���� ������ : 1254
		// �Է��� ���ڴ� 4�ڸ��Դϴ�.
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("���� �������� �ڸ����� ǥ���մϴ�.");
		int x;
		do {
			System.out.println("���� ������ : ");
			x = sc.nextInt();
		}while(x <= 0); 
			int digit = 0;
		while(x > 0) {
			digit++;
			x /= 10;
		}
		System.out.println("�Է��� ���ڴ� " + digit + "�ڸ��Դϴ�.");
	}

}
