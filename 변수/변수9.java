package ����;

import java.util.Scanner;

public class ����9 {

	public static void main(String[] args) {
		// �ﰢ���� �غ��� ���̸� �Է¹޾� �ﰢ���� ���̸� ���ϴ� ���α׷�
		// ������ : �ﰢ���� ���̸� ���մϴ�.
		//			�غ� : 6.5
		//			���� : 3.5
		//			���̴� 11.375
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ﰢ���� ���̸� ���ϴ� ���α׷� ����.");
		System.out.println("��� �Ͻ÷��� ���͸� �����ּ���..." );
		String enter = sc.nextLine();
		
		
		
		System.out.println("�غ��� �����ּ��� : ");
		double width = sc.nextDouble();
		System.out.println("�غ� : " + width);
		
		System.out.println("���̸� �����ּ��� : ");
		double high = sc.nextDouble();
		System.out.println("���� : " + high);
		
		
		System.out.println("�ﰢ���� ���̸� ���ϰ� �ֽ��ϴ� ����Ͻ÷��� ���͸� �����ּ���");
		Scanner sc2 = new Scanner(System.in);
		String enter2 = sc2.nextLine();
		
		System.out.println("�ﰢ���� ���̴� : " + (width * high)/2 + "�Դϴ�.");
		sc.close();
	}

}
