package �޼ҵ�;

import java.util.Scanner;

public class �޼ҵ�2 {

	public static void main(String[] args) {
		// 3���� int�� �μ� a, b, c�� �ּڰ��� ���ϴ� min �޼��� �ۼ�
		// ���� ��� :
		// ���� a : 1
		// ���� b : 3
		// ���� c : 2
		// �ּڰ��� 1�Դϴ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� a : ");
		int a = sc.nextInt();
		
		System.out.println("���� b : ");
		int b = sc.nextInt();
		
		System.out.println("���� c : ");
		int c = sc.nextInt();
		
		int result = min(a, b, c);
		
		System.out.println("�ּڰ��� : " + result + "�Դϴ�.");
	}

	static int min(int a, int b, int c) {
		int min = a;
		if(b < min) {
			min = b;
		}
		else if(c < min) {
			min = c;
		}
		
		return min; 
	}
	
}
