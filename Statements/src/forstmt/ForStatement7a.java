package forstmt;
/*
 * �ݺ���(for)
 * [����4] 1���� 100���� ���� �߿��� 3�� ����� ���� ���϶�.
 * ����2) 1���� 100���� �־��� ��� ������ ����
*/
public class ForStatement7a {

	public static void main(String[] args) {
		int three_sum = 0;
		
		for(int cnt=3; cnt <= 100; cnt += 3) {
			three_sum += cnt;
			System.out.printf("3�� ���(%d), ��(%d)%n", cnt, three_sum);
		}
		
		System.out.printf("3�� ����� ��(%d)%n", three_sum);
	}
}
