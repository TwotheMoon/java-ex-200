package �޼ҵ�;

import java.util.Scanner;

public class �޼ҵ�4 {

	public static void main(String[] args) {
		// 1���� n������ ������ ���� ���ؼ� ��ȯ�ϴ� �޼ҵ�
		// ���� ��� :
		// 1���� x������ ���� ������.
		// x�ǰ� : 5
		// 1���� 5������ ���� 15�Դϴ�.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("1���� x������ ���� ������");
		System.out.println("x�� �� : ");
		int x = sc.nextInt();
		
		System.out.println("1���� " + x + "������ ���� " + sumUp(x));
	}

	static int sumUp(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++ ) {
			sum += i;
		
		}
		return sum;
	}
	
}
