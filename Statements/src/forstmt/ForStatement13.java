package forstmt;
/*
 * �ݺ���(for)
 * [����11] ������
 *   - ó�� ������ ���� ����� 30���� ũ�� ��ü �ݺ����� ����
*/
public class ForStatement13 {

	public static void main(String[] args) {
		int cnt = 0;
		
		Blockend1:for(int x = 2; x <= 9; x++) {
			System.out.printf("[%d��]\n", x);
			for(int y=1; y <= 9; y++) {
				int z = x * y;
				if(z > 30) {
					break Blockend1;
				}
				System.out.printf("[%d]*[%d]=[%d]%n", x, y, z);
				++cnt;
			}
			
			
			System.out.println("-----------------------------------");
		}
		
		System.out.println("[THE END] total count=" + cnt);
	}
}
