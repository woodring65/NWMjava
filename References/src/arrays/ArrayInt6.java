package arrays;
/*
 * �迭(Array)
 *   - �迭�� ������ �ڷ���� ���ӵ� ����
 *   - ������ �ڷḦ ó���ϴµ� ����
 *   - �迭�� ������ ���ȣ []
 *   - �ʱⰪ ������ �߰��� {}
 *   - �ʱⰪ�� ������ ������ �迭�� ũ�Ⱑ ����
 */
public class ArrayInt6 {

	public static void main(String[] args) {
		int[] a = new int[]{ 1, 3, 5, 7 };
		int[] b = new int[4];
		int[] c = new int[4];
		
		for(int col = 0; col < a.length; col++) {
			System.out.printf("a[%d]=[%d]\n", col, a[col]);
			b[col] = a[col];
		}
		
		System.out.println("[b]");
		for(int col = 0; col < b.length; col++) {
			System.out.printf("b[%d]=[%d]\n", col, b[col]);
		}
		
		System.out.println("[x]");
		System.arraycopy(a, 0, c, 0, a.length);
		for(int colx : c) {
			System.out.printf("x=[%d]\n", colx);
		}
		
		
	}

}
