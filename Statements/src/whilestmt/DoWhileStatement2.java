package whilestmt;
/*
 * �ݺ���(while)
 *   - ���ǽ��� ���̸� ���� ��� ����
 *   - ���ǽ� : �񱳿����, �������
 *--------------------------------------------------------------
 * [����]
   - ����: �ּҽ��ǵ�(0), �ִ뽺�ǵ�(100) 
   - �޴� : 
 	 1.����(+1)
       - �ִ� �����尡 �Ǹ� �ּ� ���ǵ�� ����(0)
       
     2.����(-1)
       - �ּ� ���ǵ尡 �Ǹ� �ִ� ���ǵ�� ����(100)
       
	 3.����(+10)
	   - �ִ� ���ǵ尡 100�� �Ѿ�� �Ѿ ��ŭ 0���� ����
	   - ��) 99���� ����(+10)�� �Ǹ� 9�� ����
	  
	4.����(-10)
       - �ּ� ���ǵ尡 0���� �۾����� �Ѿ ��ŭ 100���� ����
	   - ��) 1���� ����(-10)�� �Ǹ� 91�� ����
	  
	5.����
 */

public class DoWhileStatement2 {
	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		do {
			if(keyCode != 13 && keyCode != 10) { // CR, LF
				System.out.println();
				System.out.println("+------------+------------+-------------+-------------+-------------+");
				System.out.println("| 1.����(+1) | 2.����(-1) | 3.����(+10) | 4.����(-10) | 5.����('q') |");
				System.out.println("+------------+------------+-------------+-------------+-------------+");
				System.out.print("> ���� : ");
			}

			keyCode = System.in.read();
			
			if(keyCode == 49) { // ����(+1)
				speed = (speed >= 100) ? 0 : speed + 1;
				System.out.printf("-> ����ӵ�(%d)\n", speed);
			}
			else if(keyCode == 50) { // ����(-1)
				speed = (speed <= 0) ? 100 : speed - 1;
				System.out.printf("-> ����ӵ�(%d)\n", speed);
			}
			else if(keyCode == 51) { // ����(+10)
				speed += 10;
				speed = (speed > 100) ? speed - 100 : speed;
				System.out.printf("-> ����ӵ�(%d)\n", speed);
			}
			else if(keyCode == 52) { // ����(-10)
				speed -= 10;
				speed = (speed < 0) ? 100 + speed : speed;
				System.out.printf("-> ����ӵ�(%d)\n", speed);
			}
			else if(keyCode == 53 || keyCode == 81 || keyCode == 113) { // ����('5', 'q', 'Q')
				run = false;
			}
		} while(run);
		
		System.out.printf("����: ����ӵ�(%d)\n", speed);
	}
}
