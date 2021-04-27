package basics;
/*
 * �迭(Array)
 *   - �迭�� ������ �ڷ���� ���ӵ� ����
 *   - ������ �ڷḦ ó���ϴµ� ����
 *   - �迭�� ������ ���ȣ []
 *   - �ʱⰪ ������ �߰��� {}
 *   - �ʱⰪ�� ������ ������ �迭�� ũ�Ⱑ ����
 */
public class ArrayInt5 {

	public static void main(String[] args) {
		int[] a = null; // �ǰ�
		
		if(a == null) {
			System.out.println("a is null :" + a);
			a = new int[]{ 1, 3, 5, 0 };
		}
		
		// The final field array.length cannot be assigned
		// a.length = 5; 
		
		//  java.lang.ArrayIndexOutOfBoundsException
		// a[-1] = 100;
		// a[4] = 100;
		
		for(int cnt = 0; cnt < a.length - 1; cnt++) {
			a[3] += a[cnt];
		}
		
		System.out.printf("a: [%d]+[%d]+[%d]=[%d]\n", a[0], a[1], a[2], a[3]);
	}

}
