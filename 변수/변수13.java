package ����;

import java.util.Random;

public class ����13 {

	public static void main(String[] args) {
		// �Ǽ��� �� ���� ���α׷�
		// ������ : 3���� ������ �����߽��ϴ�.
		// 0.0�̻� 1.0�̸� : 0.992389128
		// 0.0�̻� 10.0�̸� : 5.547457375
		// -1.0�̻� 1.0�̸� : -0.4643643
		
		Random rand = new Random();
		
		double n1 = rand.nextDouble();
		double n2 = -1 -rand.nextDouble() * 10; 
		double n3 = -1 + 2 * rand.nextDouble();
		
		System.out.println("3���� ������ �����߽��ϴ�.");
		System.out.println("0.0�̻� 1.0�̸� :" + n1);
		System.out.println("0.0�̻� 10.0�̸� :" + n2);
		System.out.println("-1.0�̻� 1.0�̸� :" + n3 );
	}

}
