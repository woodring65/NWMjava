/*
 * ������ �б�
 * ����Ÿ��(primitive)�� ������ ���Ǳ� ���� �ݵ�� ���� �Ҵ�Ǿ�� �Ѵ�.
 */

public class VariableRead {
	public static void main(String[] args) {
		int x = 0;
		int y; // ���� y�� ����� �� �ʱⰪ�� �Ҵ���� ������ �б� ���� ���� �Ҵ�Ǿ�� �Ѵ�. 
		int z;
		
		y = x; // ���Ǳ� ���� �Ҵ�Ǿ�� �Ѵ�.

		// z = z + 1; ����
		z = y + x;
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
	}
}
