package forstmt;
/*
 * �ݺ���(for)
 * [����11] ������
 *   - ó�� ������ ���� ����� 30���� ũ�� ��ü �ݺ����� ����
*/
public class ForStatement15 {

	public static void main(String[] args) {
		for(int x = 2; x <= 9; x++) {  // block A
			for(int y=1; y <= 9; y++) { // block B
				int z = x * y;
				System.out.printf("[%d]*[%d]=[%d]%n", x, y, z);
			}
			System.out.println("-----------------------------------");
		}
	}
}
