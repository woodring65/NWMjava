package basics;
/*
 * �迭(Array)
 *   - �迭�� ������ �ڷ���� ���ӵ� ����
 *   - ������ �ڷḦ ó���ϴµ� ����
 *   - �迭�� ������ ���ȣ []
 *   - �ʱⰪ ������ �߰��� {}
 *   - �ʱⰪ�� ������ ������ �迭�� ũ�Ⱑ ����
 */
public class ArrayInt2 {

	public static void main(String[] args) {
		int[] a;
		
		// System.out.println("a is null" + a); // The local variable a may not have been initialized
		
		a = new int[]{ 1, 2, 3, 0};
		
		a[3] = a[0] + a[1] + a[2];
		
		System.out.printf("a: [%d]+[%d]+[%d]=[%d]\n", a[0], a[1], a[2], a[3]);
	}

}
