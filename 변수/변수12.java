package ����;

import java.util.Random;
import java.util.Scanner;

public class ����12 {

	public static void main(String[] args) {
		// Ű���忡 �Է��� �������� +5 �Ǵ� -5 ������ ���� �������� ����
		// ������ : ������ 7
		// �Է� ���� ��5 ������ ������ �����߽��ϴ�.

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("������ : ");
		int x = sc.nextInt();
		
		System.out.println("�Է� ���� ��5 ������ ������ �����߽��ϴ�.");
		System.out.println("���� : " + (x-5 + rand.nextInt(12)) + "�Դϴ�.");
		
	}

}
