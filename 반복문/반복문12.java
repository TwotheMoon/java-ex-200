package �ݺ���;

import java.util.Scanner;

public class �ݺ���12 {

	public static void main(String[] args) {
		// ���� �������� 0���� ī��Ʈ �ٿ��ϴ¹����� for������ �ۼ�
		// ������ : ī��Ʈ�ٿ� �մϴ�.
		// 			���� ������ : 4
		// 4
		// 3
		// 2
		// 1
		// 0
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ī��Ʈ�ٿ� �մϴ�.");
		int x;
		do {
			System.out.println("���� ������ : ");
			x = sc.nextInt();
		}while(x <= 0);
		
		for(; x >=0; x--) {
			System.out.println(x);
		}
	}
}
