package forstmt;
/*
 * �ݺ���(for)
 * for(�ʱ��; ���ǽ�; ������) {
 *    ó���ڵ�(���๮)
 * }
 * 
 * �ʱ�� : �ݺ����� ó�� ����� ��
 * ���ǽ� : �ʱ�ȭ�Ŀ� ������ �������� �Ǵ�
 * ������ : ���ǽ��� ������ �� ���� ���๮�� ���� ��, �� ��°���� ����ȴ�.
 * 
 * �ݺ���(for)���� ����� ������ ���ú����μ� ���� ����� �������.
 */
public class ForStatement1a {

	public static void main(String[] args) {
		for(int x = 1; x <= 10; x++) {
			System.out.printf("x(%d)\n", x);
		}
		
		System.out.printf("x(%d)\n", 1);
		System.out.printf("x(%d)\n", 2);
		System.out.printf("x(%d)\n", 3);
		System.out.printf("x(%d)\n", 4);
		System.out.printf("x(%d)\n", 5);
		System.out.printf("x(%d)\n", 6);
		System.out.printf("x(%d)\n", 7);
		System.out.printf("x(%d)\n", 8);
		System.out.printf("x(%d)\n", 9);
		System.out.printf("x(%d)\n", 10);
	}
}
