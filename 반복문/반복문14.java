package �ݺ���;

import java.util.Scanner;

public class �ݺ���14 {

	public static void main(String[] args) {
		// 1���� n ������ ���� ���ϴ� ���α׷� for�� �ۼ�
		// ������ : 1���� n������ ���� ���մϴ� n�� �� : 5
		// 			1���� 5������ ���� 15�Դϴ�.
		Scanner sc = new Scanner(System.in);
		System.out.println("1���� n ������ ���� ���մϴ�.");
		int n;
		do {
			System.out.println("n�� �� : ");
			n = sc.nextInt();
		}while(n <= 0);
		int sum = 0;
		for (int i = 0; i <= n; i++)
			sum += i; 
		System.out.println("1����" + n + "������ ����" + sum + "�Դϴ�.");
	}

}
