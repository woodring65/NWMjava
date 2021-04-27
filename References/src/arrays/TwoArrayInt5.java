package arrays;
/*
 * 2���� �迭
 * 2���� �迭�� ������ 1���� �迭�� ����
 * ����: arraycopy�� ���� �ʰ� ���� 
 */
public class TwoArrayInt5 {

	public static void main(String[] args) {
		int[][] td = new int[][]{ {11,12}, {21,22}, {31,32} };
		
		for(int row=0; row < td.length; row++) {
			for(int col=0; col < td[row].length; col++) {
				System.out.printf("td[%d][%d]=[%d]\n", row, col, td[row][col]);
				
			}
		}

		System.out.println("���� ũ��: td.length=" + td.length);
		int[] tx = new int[td.length * 2];
		for(int row = 0; row < td.length; row++) {
			for(int col=0; col < td[row].length; col++) {
				tx[row + col + row] = td[row][col];
				// System.out.println((row + col + row));
			}
		}
		
		for(int x : tx) {
			System.out.printf("[%d] ", x);
		}
		
		System.out.println();
	}
}
