package forstmt;
/*
 * �ݺ���(for)
 * [����4] 1���� 100���� ���� �߿��� 2�� ����� ���� ���϶�.
 * ����2) 1���� 100���� �־��� ��� ������ ����
*/
public class ForStatement6a {

	public static void main(String[] args) {
		int two_sum = 0;
		
		for(int cnt=2; cnt <= 100; cnt += 2) {
			two_sum += cnt;
			System.out.printf("2���(%d), ��(%d)%n", cnt, two_sum);
		}
		
		System.out.printf("2�� ����� ��(%d)%n", two_sum);
	}
}
