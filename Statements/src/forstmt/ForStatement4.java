package forstmt;
/*
 * �ݺ���(for)
 * [����1] 1���� 100���� �հ踦 ���϶�.
 * ���� : 10������ �߰� ����� ����϶�.
*/
public class ForStatement4 {

	public static void main(String[] args) {
		int sum = 0;

		for(int x = 1; x <= 100; x++) {  
			sum += x;
			if((x % 10) == 0) {
				System.out.printf("x(%d), sum(%d)\n", x, sum);
			}
		}

		System.out.printf("sum(%d)\n", sum);		
	}
}
