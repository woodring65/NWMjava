package chap04;
/*
 * 1���� 100������ ���� �߿��� 3�� ����� ����
 */
public class Exercise03 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int cnt=1; cnt<=100; cnt++) {
			if(cnt % 3 == 0) {
				sum += cnt;
			}
		}

		System.out.printf("3�� ����� ��(%d)\n", sum);
	}

}
