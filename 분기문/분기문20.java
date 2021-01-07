package 분기문;

import java.util.Random;

public class 분기문20 {

	public static void main(String[] args) {
		// 0, 1, 2 중 하나의 난수를 생성해서 0 이면 가위 1 이면 바위 2 이면 보
		
		Random rand = new Random();
		
		System.out.println("컴퓨터가 낸것 : ");
		int hand = rand.nextInt(3);	//0~2사이의 난수
	
		switch (hand) {
		case 0 : System.out.println("가위");
		break;
		case 1 : System.out.println("바위");
		break;
		case 2 : System.out.println("보");
		break;
			
		}
	}

}
