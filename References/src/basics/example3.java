package basics;
/*
 * [����] 9*9�� 2���� �迭�� ����� 1���� ���������� 1�� ������ ���� �־��.
 * �� ��� ���� ���� ���϶�
 */
public class example3 {

	public static void main(String[] args) {
		int[][] td = new int[10][10];

		int tot1 = 0;
		int tot2 = 0;
		int cnt = 0;
		for(int x = 0; x < 9; x++) {
			for(int y = 0; y < 9; y++) {
				++cnt;
				if(x == y) {
					td[x][y] = cnt;
					tot1 += cnt;
				}
				else {
					td[x][y] = 0;
				}
				
				if((8-x) == y) {
					tot2 += cnt;
				}
				
				System.out.printf("[%3d] ", td[x][y]);
			}
			System.out.printf("= [%3d] [%3d]\n", tot1, tot2);
		}
	}
}
