package �б⹮;

import java.util.Scanner;

public class �б⹮4 {

	public static void main(String[] args) {
		// �б⹮ 3�� ������ ������������(!) �� ����� ����
Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("���� A : " );
		System.out.println("���� B : " );
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (!(A % B == 0)) {
			System.out.println("B�� A�� ����� �ƴմϴ�.");
		}
		else {
			System.out.println("B�� A�� ��� �Դϴ�.");
		}

	}

}
