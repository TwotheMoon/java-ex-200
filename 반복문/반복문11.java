package �ݺ���;

import java.util.Scanner;

public class �ݺ���11 {

	public static void main(String[] args) {
		// ��ȣ ���ڸ� ������ ������ŭ ����ߴ� ������ for ������ �ۼ�
		// ���� ��� : �� ���� *�� ǥ���ұ��? : 12
		// **********
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� *�� ǥ���ұ��? : ");
		int num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			System.out.println("*");
		}

	}

}
