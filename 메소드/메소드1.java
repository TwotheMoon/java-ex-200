package �޼ҵ�;

import java.util.Scanner;

public class �޼ҵ�1 {

	public static void main(String[] args) {
		// �Է��� int�� �������� �����̸� -1 �� 0�̸� 0�� ����̸� 1�� ��ȯ�ϴ� signOf�޼ҵ�
		// ������ ���� x :13
		// signOf(x)�� 1�Դϴ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� x : ");
		int x = sc.nextInt();
		
		int s = signOf(x);
		System.out.println("signOf(x)��" + s + "�Դϴ�.");
	}

	static int signOf(int n) {
		int sign = 0;
		
		if(n > 0) {
			sign = 1;
		}
		else if(n < 0) {
			sign = -1;
		}
		else {
			sign = 0;
		}
		return sign;
		
	}
}
