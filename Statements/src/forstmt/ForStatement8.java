package forstmt;
/*
 * �ݺ���(for)
 * [����6] ������
*/
public class ForStatement8 {

	public static void main(String[] args) {
		int cnt = 0;
		
		for(int x = 2; x <= 9; x++) {
			System.out.printf("--------------------------\n");
			System.out.printf("          [%d��]          \n", x);
			System.out.printf("--------------------------\n");
			for(int y=1; y <= 9; y++) {
				System.out.printf("[%d]*[%d]=[%d]%n", x, y, x*y);
				++cnt;
			}
		}
		
		System.out.println("total count=" + cnt);
	}
}
