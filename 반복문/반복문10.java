package �ݺ���;

import java.util.Scanner;

public class �ݺ���10 {

	public static void main(String[] args) {
		// ���� ������ n�� �о 1���� n ������ 1������ ���� ���ϴ� ���α׷�
		// ���� ��� : ���� ������ : 5
		// 1���� 5������ ���� 120�Դϴ�.
		
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("���� ������");
			n = sc.nextInt();
		}
		while(n <=0 ); 
			int factorial = 1;
			int i = 1;
		while(i <= n) {
			factorial *= i;
			i++;
		}
		System.out.println("1����" + n + "������ ����" + factorial + "�Դϴ�.");
		

	}

}
