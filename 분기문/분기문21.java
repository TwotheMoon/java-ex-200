package �б⹮;

import java.util.Scanner;

public class �б⹮21 {

	public static void main(String[] args) {
		// ���� 1~12�� ���������� �о� �ش��ϴ� ������ǥ���ϴ� ���α׷�
		// ������ : �� ���Դϱ�? : 6
		//			����
		//			�� �� �Դϱ�? : 11
		//			����
		//			�� �� �Դϱ�? :13
		//			�׷� ���� �����ϴ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���Դϱ�? : ");
		int month = sc.nextInt();
		
		switch (month) {
		case 12 :
		case 1 :
		case 2 : System.out.println("�ܿ�");
			break;
		case 3 :
		case 4 :
		case 5 : System.out.println("��");
			break;
		case 6 :
		case 7 :
		case 8 : System.out.println("����");
			break;
		case 9 :
		case 10 : 
		case 11 : System.out.println("����");
			break;
		default : System.out.println("�׷� ���� �����ϴ�.");
			break;
		}

	}

}
