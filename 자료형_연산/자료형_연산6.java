package �ڷ���_����;

import java.util.Scanner;

public class �ڷ���_����6 {

	public static void main(String[] args) {
		// 3���� �������� �հ�� ����� ���ϴ� ���α׷� ����� ĳ��Ʈ ������ �̿��ؼ� ���ϰ� �Ǽ��� ǥ��
		
		Scanner sc = new Scanner(System.in);
		// ������ : ������ x, y, z�� ����� ���մϴ�
		// x�� : 7
		// y�� : 8
		// z�� : 10
		// x, y, z�� ����� 8.333�Դϴ�.
		
		System.out.println("������ x, y, z�� ����� ���մϴ�.");

		System.out.println("x�� : ");
		int x = sc.nextInt();
		System.out.println("y�� : ");
		int y = sc.nextInt();
		System.out.println("z�� : ");
		int z = sc.nextInt();
		
		double ave = (double)(x + y + z) / 3;
		System.out.printf("x, y, z�� ����� %.3f�Դϴ�.\n" , ave);

	}

}
