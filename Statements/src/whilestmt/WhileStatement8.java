package whilestmt;
/*
 * �ݺ���(while, for)
 * [����11] ������
 *   - 2�ܺ��� 5�ܱ����� 30�̸��� ���
 *   - 6�ܺ��� 9�ܱ����� 30�̻��� ���
*/
public class WhileStatement8 {
	public static void main(String[] args) {
		int cnt = 0;
		int x = 2;
		
		while(x <= 9) {
			System.out.printf("[%d��]\n", x);
			for(int y=1; y <= 9; y++) {
				int z = x * y;
				
				if((x >= 2 && x <=5) && z < 30) { 
					System.out.printf("[%d]*[%d]=[%d]%n", x, y, z);
				}
				else if((x >= 6 && x <= 9) && z >= 30) {
					System.out.printf("[%d]*[%d]=[%d]%n", x, y, z);
				}

				++cnt;
			} // for(y)
			
			x++;
			System.out.println("-----------------------------------");
		} // while(x)
		
		System.out.println("[while end] total count=" + cnt);
	}
}
