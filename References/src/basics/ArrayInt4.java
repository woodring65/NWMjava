package basics;
/*
 * �迭(Array)
 *   - �迭�� ������ �ڷ���� ���ӵ� ����
 *   - ������ �ڷḦ ó���ϴµ� ����
 *   - �迭�� ������ ���ȣ []
 *   - �ʱⰪ ������ �߰��� {}
 *   - �ʱⰪ�� ������ ������ �迭�� ũ�Ⱑ ����
 */
public class ArrayInt4 {

	public static void main(String[] args) {
		int[] a = null; // �ǰ�
		
		if(a == null) {
			System.out.println("a is null :" + a);
			a = new int[]{ 1, 3, 5, 0 };
		}
		
		a[3] = a[0] + a[1] + a[2];
		
		System.out.printf("a: [%d]+[%d]+[%d]=[%d]\n", a[0], a[1], a[2], a[3]);
	}

}
