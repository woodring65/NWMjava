package basics;
/*
 * 2���� �迭
 */
public class TwoArrayInt2 {

	public static void main(String[] args) {
		int[][] td = new int[2][3];
		
		for(int row=0; row < td.length; row++) { // td.length: ���� ũ��(����)
			for(int col=0; col < td[row].length; col++) { // td[row].length �÷��� ũ��(����)
				td[row][col] = row * col;
				System.out.printf("td[%d][%d]=[%d]\n", row, col, td[row][col]);
				
			}
		}
	}
}
