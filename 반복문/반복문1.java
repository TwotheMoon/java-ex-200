package �ݺ���;

import java.util.Scanner;

public class �ݺ���1 {

	public static void main(String[] args) {
		// �������� ��ȣ�� ������ ǥ���ϴ� sign ���α׷�
		
		Scanner sc= new Scanner(System.in);
		int retry;
		
		do {
			System.out.println("������ : ");
			int n =sc.nextInt();
			
			if(n > 0)
				System.out.println("�� ���� ����Դϴ�.");
		else if(n < 0)
			System.out.println("�� ���� �����Դϴ�.");
		else
			System.out.println("�� ���� 0 �Դϴ�.");
			retry = sc.nextInt();
		}while(retry == 1);

	}

}
