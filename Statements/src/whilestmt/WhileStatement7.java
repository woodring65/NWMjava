package whilestmt;
/*
 * �ݺ���(for)
 * [����11] ������
 *   - ó�� ������ ���� ����� 30���� ũ�� ��ü �ݺ����� ����
*/
public class WhileStatement7 {

	public static void main(String[] args) {
		int cnt = 0;
		int x = 2;
		
		Blockend:while(x <= 9) {
			System.out.printf("[%d��]\n", x);
			for(int y=1; y <= 9; y++) {
				int z = x * y;
				if(z > 30) {
					break Blockend;
				}
				System.out.printf("[%d]*[%d]=[%d]%n", x, y, z);
				++cnt;
			}
			
			x++;
			System.out.println("-----------------------------------");
		}
		
		System.out.println("[while end] total count=" + cnt);
	}
}
