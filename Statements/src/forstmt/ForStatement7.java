package forstmt;
/*
 * �ݺ���(for)
 * [����4] 1���� 100���� ���� �߿��� 3�� ����� ���� ���϶�.
 * ����1) 1���� 100���� 1�� �����ϴ� ���
*/
public class ForStatement7 {

	public static void main(String[] args) {
		int three_sum = 0;
		
		for(int cnt=1; cnt <= 100; cnt++) {
			if(cnt % 3 == 0) {
				three_sum += cnt;
				System.out.printf("3�� ���(%d), ��(%d)%n", cnt, three_sum);
			}
		}
		
		System.out.printf("3�� ����� ��(%d)%n", three_sum);
	}
}
