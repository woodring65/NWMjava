/*
 * ����(int)
 * 4����Ʈ(32��Ʈ)
 * ���� : -2147483648~2147483647
 * �ڹٿ��� ������ �⺻ Ÿ��
 */
package basics;

public class IntType {

	public static void main(String[] args) {
		int min = -2147483648;
		int max = 2147483647;
		
		System.out.println("min int=" + min);
		System.out.println("max int=" + max);
		
		int max1 = max + 1;
		int min1 = min - 1;

		System.out.println("(+2147483648 + 1)=" + max1);
		System.out.println("(-2147483648 - 1)=" + min1);
	}

}
