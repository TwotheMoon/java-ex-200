package ����;

import java.util.Scanner;

public class ����14 {

	public static void main(String[] args) {
		// Ű����� �Է��� ���� �̸����� �λ��ϴ� ���α׷�
		// ������ : �� : ��
		//			�̸� : ����
		//			�ȳ��ϼ���. �̴��� ��.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է����ּ��� : ");
		String firstName = sc.next();
		System.out.println("�� : " + firstName );
		
		System.out.println("�̸��� �Է����ּ���.");
		String secondName = sc.next();
		System.out.println("�̸� : " + secondName);
		
		System.out.println("�ȳ��ϼ���." + firstName + secondName + "��.");
	
	}

}
