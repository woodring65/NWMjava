package basics;
/*
 * [����] 9*9�� 2���� �迭�� ����� 1���� ���������� 1�� ������ ���� �־��.
 */
public class example1 {

	public static void main(String[] args) {
		int[][] td = new int[9][9];

		int cnt = 0;
		for(int x = 0; x < 9; x++) {
			for(int y = 0; y < 9; y++) {
				td[x][y] = ++cnt;
				System.out.printf("[%2d] ", td[x][y]);
			}
			System.out.println();
		}
	}
}
