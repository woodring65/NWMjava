package whilestmt;
/*
 * �ݺ���(while, for)
 * [����11] ������
 *   ����: break, continue�� �̿��϶�
 *   - 2�ܺ��� 5�ܱ����� 30�̸��� ���
 *   - 6�ܺ��� 9�ܱ����� 30�̻��� ���
*/
public class WhileStatement9 {
	public static void main(String[] args) {
		int x = 1;
		
		while(++x <= 9) {
			System.out.printf("[%d��]\n", x);
			
			for(int y=1; y <= 9; y++) {
				int z = x * y;
				
				if(x >= 2 && x <=5) {
					if(z >= 30) { 
						break;
					}
					System.out.printf("[%d]*[%d]=[%d]%n", x, y, z);
				}
				else if(x >= 6 && x <= 9) {
					if(z < 30) {
						continue;
					}
					System.out.printf("[%d]*[%d]=[%d]%n", x, y, z);
					/*
					if(z >= 30) {
						System.out.printf("[%d]*[%d]=[%d]%n", x, y, z);
					}
					*/
				}
			} // for(y)
			
			System.out.println("-----------------------------------");
		} // while(x)
		
		System.out.println("[THE END]");
	}
}
