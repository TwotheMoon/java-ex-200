package �б⹮;

import java.util.Random;

public class �б⹮20 {

	public static void main(String[] args) {
		// 0, 1, 2 �� �ϳ��� ������ �����ؼ� 0 �̸� ���� 1 �̸� ���� 2 �̸� ��
		
		Random rand = new Random();
		
		System.out.println("��ǻ�Ͱ� ���� : ");
		int hand = rand.nextInt(3);	//0~2������ ����
	
		switch (hand) {
		case 0 : System.out.println("����");
		break;
		case 1 : System.out.println("����");
		break;
		case 2 : System.out.println("��");
		break;
			
		}
	}

}
