package ifstmt;
/*
 * [����] ����� �ϴµ� ������ ��� �ִ� ���ݿ� ���� �������� �����Ѵ�.
 * ���� : 2500��
 * �ý� : 5000��
 * ��ö : 1500��
 * ���� : 1500�� �̸�
 */
public class IfStatement2 {

	public static void main(String[] args) {
		int money = 2000;
		
		if(money >= 5000) {
			System.out.println("�ýø� ź��");
		}
		else if(money >= 2500) {
			System.out.println("������ ź��");
		}
		else if(money >= 1500) {
			System.out.println("��ö�� ź��");
		}
		else {
			System.out.println("�ɾ� ����.");
		}
	}
}
