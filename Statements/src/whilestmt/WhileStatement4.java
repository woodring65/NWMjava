package whilestmt;
/*
 * �ݺ���(while)
 *   - ���ǽ��� ���̸� ���� ��� ����
 *   - ���ǽ� : �񱳿����, �������
 */
public class WhileStatement4 {
	public static void main(String[] args) {
		int cnt = 0;
		int tot = 0;
		boolean tf = true;

		while(tf) {
			if(cnt % 1000 == 0) {
				System.out.printf("cnt(%d), tot(%d) %n", cnt, tot);
				tot++;
			}
			cnt++;
			
			if(tot > 1000) {
				tf = false;
			}
		}
		
		System.out.printf("**** cnt(%d), tot(%d) %n", cnt, tot);
	}

}
