/*
 * ����Ÿ�Ժ�ȯ
 * 1. Ư���� Ÿ������ ���� ��ȯ
 * 2. ūŸ�Կ��� ���� Ÿ������ ��ȯ(�ڷ��� �ս��� �߻�)
 * 3. �Ǽ��� ������ ��ȯ��Ű�� �Ҽ��� ���ϴ� �������� ������ ���Ѵ�.
 */
package conversion;

public class TypeCasting2 {

	public static void main(String[] args) {
		float pi = 3.14159f;
		double pid = 3.14159;
		int pix = (int)pi;
		int pix1 = (int)pid;
		
		System.out.printf("pi(%f), pid(%f), pix(%d), pix1(%d)\n", pi, pid, pix, pix1);
	}
}
