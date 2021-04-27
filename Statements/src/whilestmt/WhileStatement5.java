package whilestmt;
/*
 * �ݺ���(while)
 *   - ���ǽ��� ���̸� ���� ��� ����
 *   - ���ǽ� : �񱳿����, �������
 */
public class WhileStatement5 {
	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			// if(keyCode != 13 && keyCode != 10) { // CR, LF
			if(keyCode != 13) { // CR
				System.out.println();
				System.out.println("+--------+--------+--------+");
				System.out.println("| 1.���� | 2.���� | 3.���� |");
				System.out.println("+--------+--------+--------+");
				System.out.print("> ���� : ");
			}
			
			keyCode = System.in.read();
			// System.out.println("> keyCode : " + keyCode);
			
			if(keyCode == 49) { // '1'
				speed++;
				System.out.printf("-> ����ӵ�(%d)\n", speed);
			}
			else if(keyCode == 50) { // '2'
				speed--;
				System.out.printf("-> ����ӵ�(%d)\n", speed);
			}
			else if(keyCode == 51) { // '3'
				run = false;
			}
		} // while
		
		System.out.printf("����: ����ӵ�(%d)\n", speed);
	}
}
