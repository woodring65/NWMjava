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
public class ForStatement9a {

	public static void main(String[] args) {
	
		for(int cnt = 1; cnt <= 2020; cnt++) {
			if(cnt % 4 == 0) {
				if(cnt % 100 != 0 || cnt % 400 == 0) {
					System.out.printf("����:(%d) %n", cnt);
				}
			}
		}
		
		for(int x = 1; x <= 2020; x++) {
			if((x % 4 == 0) && ((x % 100 != 0) || (x % 400 == 0))) {
				System.out.printf("����:(%d) %n", x);
			}
			else {
				System.out.printf("���:(%d) %n", x);
			}
		}
	}
}
