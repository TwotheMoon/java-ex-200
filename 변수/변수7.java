package ����;

import java.util.Scanner;

public class ����7 {

	public static void main(String[] args) {
		// Ű���忡 �Է��� �������� ������ �ڸ����� ������ ���� ������ �ڸ��� ǥ��
		// ������ : ������ 1275
		//			������ �ڸ����� ������ ���� 127�Դϴ�.
		//			������ �ڸ����� 5�Դϴ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �Է����ּ���.");
		int isum = sc.nextInt();
		
		System.out.println("������ �ڸ����� ������ ���� " + isum / 10 + "�Դϴ�.");
		System.out.println("������ �ڸ����� " + isum % 10 + "�Դϴ�.");

	}

}
