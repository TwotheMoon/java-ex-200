package �޼ҵ�;

import java.util.Scanner;

public class �޼ҵ�3 {

	public static void main(String[] args) {
		// 3���� int�� �μ� a, b, c���� �߰����� ���ϴ� med �޼ҵ� �ۼ�
		// ������
		// ���� a : 1
		// ���� b : 3
		// ���� a : 2
		// �߰����� 2�Դϴ�.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� a : ");
		int a = sc.nextInt();
		
		System.out.println("���� b : ");
		int b = sc.nextInt();
		
		System.out.println("���� c : ");
		int c = sc.nextInt();
		
		System.out.println("��������" + med(a, b, c) + "�Դϴ�.");
		
	}

	
	static int med(int a, int b, int c) {

		if(a >= b) {
			if(b >= c) {
				return b;
			}else if(a <= c) {
				return a;
			}else {
				return c;
			}
		}else if(a > c) {
			return a;
		}else if(b > c) {
			return c;
		}else {
			return b;
		}
	}
	
}
