package �ݺ���;

import java.util.Scanner;

public class �ݺ���13 {

	public static void main(String[] args) {
		// ���� �������� 0���� ī��Ʈ��
		// ������ : ī��Ʈ�� �մϴ�.
		// ���� ������ : 4
		// 0
		// 1
		// 2
		// 3
		// 4
		
		Scanner sc = new Scanner(System.in);
		int x;
		do {
			System.out.println("���� ������ : ");
			x = sc.nextInt();
		}while(x <= 0);
		
		for(int i = 0; i <= x; i ++) {
			System.out.println(i);
		}

	}

}
