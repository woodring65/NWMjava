package forstmt;
/*
 * �ݺ���(for)
 * [����7] 1���� 2020���� ���� �߿��� ������ ������ �����ϴ� ���� ����϶�.
 *       - 4�� ���������� 100���� ���������� ������ 400���� ���������� ��
 *       - 100, 200, 300, 400(*) 
 *       - ������ 4�⿡ �� ���� �´�.
 *       - 100�� �� �� ���� �ʴ´�.
 *       - 400�� �� �� �´�.
 *       
*/
public class ForStatement9 {

	public static void main(String[] args) {
		int y = 2008;
		if(y % 4 == 0) {
			if(y % 100 != 0 || y % 400 == 0) {
				System.out.printf("����:(%d) %n", y);
			}
			else {
				System.out.printf("���:(%d) %n", y);
			}
		}
		else {
			System.out.printf("���:(%d) %n", y);
		}
		
		int x = 2008;
		if((x % 4 == 0) && ((x % 100 != 0) || (x % 400 == 0))) {
			System.out.printf("����:(%d) %n", x);
		}
		else {
			System.out.printf("���:(%d) %n", x);
		}
	}
}
