package whilestmt;
/*
 * �ݺ���(while)
 *   - ���ǽ��� ���̸� ���� ��� ����
 *   - ���ǽ� : �񱳿����, �������
 */
public class WhileStatement3 {
	public static void main(String[] args) {
		int cnt = 0;
		int tot = 0;
		boolean tf = true;

		while(tf) {
			if(tot > 1000) {
				break;
			}
			
			if(cnt % 1000 == 0) {
				System.out.printf("cnt(%d), tot(%d) %n", cnt, tot);
				tot++;
			}
			cnt++;
		}
		
		System.out.printf("**** cnt(%d), tot(%d) %n", cnt, tot);
	}

}
