package �ڷ���_����;

import java.util.Scanner;

public class �ڷ���_����3 {

	public static void main(String[] args) {
		// float�� ������ double�� ������ ���� �о ǥ���ϴ� ���α׷�
		// ���� ��� : ���� x�� float���Դϴ�. ���� y�� double�� �Դϴ�.
		// x : 0.12345678901234567890
		// y : 0.12345678901234567890
		// x = 0.123456789
		// y = 0.123456789012345678
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x : ");
		float x = sc.nextFloat();
		System.out.println("y : ");
		double y = sc.nextDouble();
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
