package forstmt;
/*
 * �ݺ���(for)
 * for(�ʱ�ȭ��; ���ǽ�; ������) {
 *    ó���ڵ�(���๮)
 * }
 * 
 * for() ������ ����� ������ ���ú����μ� ���� ����� �������.
 */
public class ForStatement3 {

	public static void main(String[] args) {
		// 1���� 10���� �հ�
		for(int x=1, sum=0; x <= 10; x++) {
			sum += x;
			System.out.printf("x(%d), sum(%d)\n", x, sum);
		}

		// System.out.printf("sum(%d)\n", sum);
	}
}
