package �ڷ���_����;

public class �ڷ���_����8 {

	public static void main(String[] args) {
		// folat���� ������ 0.0���� 1.0���� 0.001�� ������Ű�� ǥ��, �� ���� int�� ������ 0����
		// 1000������ 1�� �������Ѱ��� 1000���� ���� ���� ǥ��
		
		System.out.println("float      int");
		System.out.println("-------------------");
		
		float x = 0.0f;
		for(int i =0; i <= 1000; i++, x += 0.001F)
			System.out.printf("%9.7f  %9.7f\n ", x, (float)i /1000);

	}

}
