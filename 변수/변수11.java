package ����;

import java.util.Random;

public class ����11 {

	public static void main(String[] args) {
		// ���� ���α׷� �ۼ�
		// ������ : 3���� ������ �����߽��ϴ�.
		// �� �ڸ��� ���� ���� : 7
		// �� �ڸ� ���� ���� : -5
		// �� �ڸ� ���� ���� : 34
		
		Random rand = new Random();
		int n1 = 1 + rand.nextInt(9);
		int n2 = -1 - rand.nextInt(9);
		int n3 = 10 + rand.nextInt(90);
		
		System.out.println("3���� ������ �����Ͽ����ϴ�.");
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
	}

}
