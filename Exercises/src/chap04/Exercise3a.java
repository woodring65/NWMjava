package chap04;
/*
 * 1���� 100������ ���� �߿��� 3�� ����� ����
 */
public class Exercise3a {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int cnt=0; cnt<=100; cnt += 3) {
			sum += cnt;
		}

		System.out.printf("3�� ����� ��(%d)\n", sum);
	}
}
