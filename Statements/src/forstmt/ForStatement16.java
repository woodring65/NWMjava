package forstmt;
/*
 * �ݺ���(for)
 * [����11] ������
 *   - ó�� ������ ���� ����� 30���� ũ�� ��ü �ݺ����� ����
*/
public class ForStatement16 {

	public static void main(String[] args) {
		int cnt = 0;
		boolean blockend = false;
		
		for(int x = 2; x <= 9; x++) {  // block A
			
			System.out.printf("[%d��]\n", x);
			
			for(int y=1; y <= 9; y++) { // block B
				int z = x * y;
				if(z > 30) {
					blockend = true;
					break;  // block B Ż��
				}
				System.out.printf("[%d]*[%d]=[%d]%n", x, y, z);
				++cnt;
			}
			
			if(blockend) {
				System.out.printf("[%d] ���� �� %n", x);
				break; // block A�� Ż��
			}
			
			System.out.println("-----------------------------------");
		}
		
		System.out.println("[THE END] total count=" + cnt);
	}
}
