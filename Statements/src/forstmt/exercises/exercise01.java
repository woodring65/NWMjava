package forstmt.exercises;
/*
 * �ݺ���(for)
 * [����4] 0���� 99���� ���� �߿��� Ȧ���� ���� ���϶�.
*/
public class exercise01 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int cnt=0; cnt <= 99; cnt++) {
			if(cnt % 2 == 1) {
				sum += cnt;
				System.out.printf("Ȧ��(%d), ��(%d)%n", cnt, sum);
			}
		}
		
		System.out.printf("Ȧ���� ��%n", sum);
	}
}
