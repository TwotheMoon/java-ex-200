package �б⹮;

import java.util.Scanner;

public class �б⹮5 {

	public static void main(String[] args) {
		// �������� �Է¹޾� ��ȣ(���/����/0)�� �����Ѵ� ���α׷�
		// ������ : ������ : 37
		//			���� ����Դϴ�.
		//			������ : 0
		//			���� 0�Դϴ�.
		//			������ : -35
		//			���� �����Դϴ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է����ּ���.");
		
		int num = sc.nextInt();
		
		
		if(num > 0) {
			System.out.println("���� ����Դϴ�.");
		}else if(num == 0) {
			System.out.println("���� 0�Դϴ�.");
		}else if(num < 0) {
			System.out.println("���� �����Դϴ�.");
		}
		else {
			System.out.println();
		}

	}

}
