package chap04;
import java.util.Scanner;
/*
 * ����, ���, ��ȸ, ����
 */
public class Exercise07 {
	public static void main(String[] args) throws Exception {
		boolean run = true;
		int balance = 0;
		int keyCode = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			if(keyCode != 13 && keyCode != 10) { // CR, LF
				System.out.println();
				System.out.println("+--------+--------+--------+--------+");
				System.out.println("| 1.���� | 2.��� | 3.�ܰ� | 4.���� |");
				System.out.println("+--------+--------+--------+--------+");
				System.out.print("> ���� : ");
			}

			keyCode = System.in.read();
			
			if(keyCode == 49) { // 2. ����
				System.out.print("���ݾ�> ");
				int money = scanner.nextInt();
				balance += money;
			}
			else if(keyCode == 50) { // 2. ���
				System.out.print("��ݾ�> ");
				int money = scanner.nextInt();
				balance -= money;
			}
			else if(keyCode == 51) { // 3. �ܰ�
				System.out.printf("�ܰ�> (%d)\n", balance);
			}
			else if(keyCode == 52) { // 4. ����
				run = false;
			}
		} // while
		
		System.out.printf("����: �����ܰ�(%d)\n", balance);
	}
}
