package �б⹮;

import java.util.Scanner;

public class �б⹮12 {

	public static void main(String[] args) {
		// 2���� �Ǽ����� ū ���� ǥ���ϴ� ���α׷� �ۼ�
		// ������ : �Ǽ� a : 25.7
		//			�Ǽ� b : 15.3
		//			ū ���� ���� 35.7�Դϴ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("2���� �Ǽ��� �Է��ϼ���.");
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		System.out.println("�Ǽ� a : " + a);
		System.out.println("�Ǽ� b : " + b);
		
		double bigger;
		
		if(a > b) {
			bigger = a;
		}
		else {
			bigger = b;
		}
		
		System.out.println("ū ���� ���� : " + bigger + "�Դϴ�.");
	}

}
