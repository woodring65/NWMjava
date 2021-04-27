package arrays;
import java.util.Arrays;

/*
 * 2���� �迭
 * 2���� �迭�� ������ 2���� �迭�� ����
 * ����: 1. ������ ũ�⸦ �𸥴�.
 *       2. System.arraycopy()�� ���� �ʴ´�.
 */
public class TwoArrayInt7 {

	public static void main(String[] args) {
		int[][] td = new int[][]{ {11,12}, {21,22,23}, {31,32} };
		
		for(int row=0; row < td.length; row++) {
			for(int col=0; col < td[row].length; col++) {
				System.out.printf("td[%d][%d]=[%d]\n", row, col, td[row][col]);
			}
		}

		System.out.println("���� ���� ũ��: td.length=" + td.length);
		System.out.println("�� ���� ���� ũ��: td.length=" + td[0].length);
		System.out.println("�� ���� ���� ũ��: td.length=" + td[1].length);
		System.out.println("�� ���� ���� ũ��: td.length=" + td[2].length);
		
		int[][] tx = new int[td.length][];
		for(int row=0; row < td.length; row++) {
			tx[row] = new int[td[row].length];
			for(int col=0; col < tx[row].length; col++) {
				tx[row][col] = td[row][col];
				System.out.printf("tx[%d] ", tx[row][col]);
			}
			System.out.println();
		}
		
		System.out.println(Arrays.deepToString(tx));
		
	}
}
