package �б⹮;

import java.util.Scanner;

public class �б⹮3 {

	public static void main(String[] args) {
		// 2���� ���� �������� �о� ���ڰ� ������ ����̸� "B�� �� ����̴�."
		// ��� ǥ���ϰ� �׷��� ������ "B�� A�� ����� �ƴϴ�" ��� ǥ���ϴ� ���α׷�
		// ������ : ���� A : 12
		//		    ���� B : 4
		//		B�� A�� ����Դϴ�.
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("���� A : " );
		System.out.println("���� B : " );
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A % B == 0) {
			System.out.println("B�� A�� ����Դϴ�.");
		}
		else {
			System.out.println("B�� A�� ����� �ƴմϴ�.");
		}

	}

}
