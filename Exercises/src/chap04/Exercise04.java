package chap04;
/*
 * while���� Math.random()�� �̿��Ͽ� �� ���� �ֻ����� ������ �� ������ ���� (��1, ��2) ���·� ����ϰ�,
 * ���� ���� 5�� �ƴϸ� ��� �ֻ����� ������, ���� ���� 5�̸� ������ ����
 */
public class Exercise04 {

	public static void main(String[] args) {
		int cnt = 0;
		while(true) {
			int x = (int)(Math.random() * 6 + 1);  // ��1
			int y = (int)(Math.random() * 6 + 1);  // ��2
			
			if((x + y) == 5) {
				System.out.printf("cnt[%d] (%d, %d) STOP!!!\n", ++cnt, x, y);
				break;
			}
			System.out.printf("cnt[%d] (%d, %d)\n", ++cnt, x, y);
		}
	}

}
