package ����;

import java.util.Scanner;

public class ����10 {

	public static void main(String[] args) {
		// ���� ���ǿ� �ѳ��� ���ϱ�(������ 3.1416�� final ���� ���);
		// ������ : ���� �ѳ��̿� ���Ǹ� ���մϴ�.
		//			������ : 12.5
		//			�ѳ��̴� 1963.49999999998�Դϴ�.
		//			���Ǵ� 8181.24999999998�Դϴ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ���ǿ� �ѳ��̸� ���ϴ� ���α׷� ����.");
		System.out.println("��� �Ͻ÷��� ���͸� �����ּ���...");
		String enter = sc.nextLine();
		
		System.out.println("�������� �����ּ���. : ");
		double r =sc.nextDouble();
		System.out.println("�Է��Ͻ� �������� " + r);
		
		System.out.println("�ѳ��̿� ���Ǹ� ���մϴ�. ��� �Ͻ÷��� ���͸� �����ּ���.");
		
		sc.nextLine();
		sc.nextLine();
		final double pi = 3.1416;
		double surfaceArea = 4 * pi * r * r;
		double volume = 4/3.0* pi * r * r * r;
		System.out.println("�ѳ��̴� " + surfaceArea + "�Դϴ�.");
		System.out.println("���Ǵ� " + volume + "�Դϴ�.");

	}

}
