package �ڷ���_����;

import java.util.Scanner;

public class �ڷ���_����5 {

	public static void main(String[] args) {
		// 3���� �������� �о ����� �Ǽ��� ǥ��
		// ���� ��� : ������ x, y, z�� ����� ���մϴ�.
		// x�� : 7
		// y�� : 8
		// z�� : 10
		// x, y, z�� ����� 8.333�Դϴ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ x, y, z�� ����� ���մϴ�.");
		
		System.out.println("x�� : " );
		int x = sc.nextInt();
		
		System.out.println("y�� : ");
		int y = sc.nextInt();
		
		System.out.println("z�� : ");
		int z = sc.nextInt();
		
		double ave = (x+y+z)/3.0;
		
		System.out.println("x, y, z�� ����� " + ave);

	}

}
