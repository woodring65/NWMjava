package forstmt;
/*
 * �ݺ���(for)
 * [����2] 1���� 100���� �հ踦 ���϶�.
 * ����1 : 10������ �߰� ����� ����϶�.
 * ����2 : ������ ������(%)�� ���� �ʰ� �ذ��϶�
*/
public class ForStatement4a {

	public static void main(String[] args) {
		int sum = 0;

		for(int x = 1; x <= 100; x++) {  
			sum += x;
			
			if((x / 10 * 10) == x) { 
				System.out.printf("x(%d), sum(%d)\n", x, sum);
			}
		}

		System.out.printf("sum(%d)\n", sum);		
	}
}
