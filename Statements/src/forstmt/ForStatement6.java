package forstmt;
/*
 * �ݺ���(for)
 * [����4] 1���� 100���� ���� �߿��� 2�� ����� ���� ���϶�.
 * ����1) 1���� 100���� 1�� �����ϴ� ���
*/
public class ForStatement6 {

	public static void main(String[] args) {
		int two_sum = 0;
		
		for(int cnt=1; cnt <= 10; cnt++) {
			if(cnt % 2 == 0) {
				two_sum += cnt;
				System.out.printf("¦��(%d), ��(%d)%n", cnt, two_sum);
			}
		}
		
		System.out.printf("¦���� ��%n", two_sum);
	}
}
