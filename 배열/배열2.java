package �迭;

public class �迭2 {

	public static void main(String[] args) {
		// ��� ������ 5���� int�� �迭�� ������� 5,4,3,2,1�� �����ϴ� ���α׷�
		// ���� ���
		// a[0] = 5;
		// a[1] = 4;
		// a[2] = 3;
		// a[3] = 2;
		// a[4] = 1;
		
	int[] a = new int[5];
	
	for(int i = 0; i < a.length; i++)
		a[i] = 5 - i;
	
	for(int i = 0; i < a.length; i++)
		System.out.println("a[" + i + "] = " + a[i]);

	}

}
