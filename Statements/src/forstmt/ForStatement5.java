package forstmt;
/*
 * �ݺ���(for)
 * [����3] 1���� 100���� ���� �߿��� Ȧ���� �հ� ¦���� ���� ���϶�.
*/
public class ForStatement5 {

	public static void main(String[] args) {
		int even_sum = 0; // ¦���� ��
		int odd_sum = 0;  // Ȧ���� ��
		
		for(int cnt=1; cnt <= 100; cnt++) {
			if(cnt % 2 == 0) {
				even_sum += cnt;
				// System.out.printf("¦��(%d), ��(%d)%n", cnt, even_sum);
			}
			else {
				odd_sum += cnt;
				// System.out.printf("Ȧ��(%d), (%d)%n", cnt, odd_sum);
			}
		}
		
		System.out.printf("Ȧ���� ��(%d), ¦���� ��(%d)%n", odd_sum, even_sum);
	}
}
