package basics;
/*
 * �迭(Array)
 *   - �迭�� ������ �ڷ���� ���ӵ� ����
 *   - ������ �ڷḦ ó���ϴµ� ����
 *   - �迭�� ������ ���ȣ []
 *   - �ʱⰪ ������ �߰��� {}
 *   - �ʱⰪ�� ������ ������ �迭�� ũ�Ⱑ ����
 */
public class ArrayInt3 {

	public static void main(String[] args) {
		int[] a = new int[4];  // �ʱⰪ�� �������� ������ zero(0)���� �ʱ�ȭ
		
		a[0] = 1;
		a[1] = 3;
		a[2] = 5;
		a[3] = 7;
		
		int tot = a[0] + a[1] + a[2] + a[3];
		
		System.out.printf("a: [%d]+[%d]+[%d]+[%d]=[%d]\n", a[0], a[1], a[2], a[3], tot);
	}

}
