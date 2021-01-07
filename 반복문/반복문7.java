package 반복문;

import java.util.Scanner;

public class 반복문7 {

	public static void main(String[] args) {
		// 입력한 갯수만큼 '*'을 표시 
		// 실행결과 : 몇 개의 *을 표시할까요?:12
		//	************
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇개의 *을 표시할까요? : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			int i = 0;
			while(i < num) {
				System.out.print("*");
				i++;
			}
			
			
		}

	}

}
