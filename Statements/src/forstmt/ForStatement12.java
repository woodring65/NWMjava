package forstmt;
/*
 * �ݺ���(for)
 * [����11] ������
 *   - ���� ����� 30���� ũ�� ������� ����
*/
public class ForStatement12 {

	public static void main(String[] args) {
		int cnt = 0;
		
		for(int x = 2; x <= 9; x++) {
			System.out.printf("[%d��]\n", x);
			for(int y=1; y <= 9; y++) {
				int z = x * y;
				if(z > 30) {
					break;
				}
				System.out.printf("[%d]*[%d]=[%d]%n", x, y, z);
				++cnt;
			}
			
			System.out.println("-----------------------------------");
		}
		
		System.out.println("total count=" + cnt);
	}
}
