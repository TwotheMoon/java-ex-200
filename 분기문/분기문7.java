package �б⹮;

import java.util.Scanner;

public class �б⹮7 {

	public static void main(String[] args) {
		// 2���� ���� a,b ���� �Է¹޾� ��� ���踦 ǥ��
		// "a�� ũ��." "b�� ũ��." "a�� b�� ����."
		// ������ : ���� a: 12		5		10
		//			���� b: 3			15		10
		//			a�� ũ��		 b�� ũ��		a�� b�� ����
		
		Scanner sc = new Scanner(System.in);
		System.out.println("a�� b�� ���� �Է��ϼ���.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("���� a : " + a);
		System.out.println("���� b : " + b);
		
		if(a > b) {
			System.out.println("a�� ũ��.");
		} else if(a < b) {
			System.out.println("b�� ũ��.");
		}else if(a == b){
			System.out.println("a�� b�� ����");
		}
	
	}

}
