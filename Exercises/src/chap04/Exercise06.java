package chap04;
/*
 * �ݺ���(for)�� �̿��Ͽ� �ƽ��͸���ũ(*) �ﰢ�� ���
 */
public class Exercise06 {

	public static void main(String[] args) {
		for(int x = 1; x <= 5; x++) {
			for(int y = 0; y < x; y++) { // y= [0], [0, 1], [0,1,2], [0,1,2,3] [0,1,2,3,4]
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
