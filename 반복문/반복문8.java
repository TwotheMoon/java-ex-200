package �ݺ���;

import java.util.Scanner;

public class �ݺ���8 {

	public static void main(String[] args) {
		// ���� ���� ���� ��ŭ '*' �� '+'�� ������ ���� ǥ��
		// ���� ���� : �� ���� ǥ���ұ��? 12
		//			*+*+*+*+*+*+*+*+*+
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� ǥ���ұ��? ");
		
		int num = sc.nextInt();
		if(num > 0) {
			int i = 0;
			while(i < num) {
				System.out.println("*+");
				i++;
			}
		}

	}

}
