package ifstmt;
/*
 * [����] ����� �ϴµ� ������ ��� �ִ� ���ݿ� ���� �������� �����Ѵ�.
 * ���� : 2500��, �ý� : 5000��, ��ö : 1500��,  ���� : 1500�� �̸�
 * ���� : ���� ������ ��ö, ����, �ý� ������ ���´�.
 */
public class IfStatement3 {

	public static void main(String[] args) {
		int money = 1000;
		
		if(money < 1500) {
			System.out.println("�ɾ� ����.");
		}
		else if(money >= 1500 && money < 2500) {
			System.out.println("��ö�� ź��");
		}
		else if(money >= 2500 && money < 5000) {
			System.out.println("������ ź��");
		}
		else {
			System.out.println("�ýø� ź��");
		}
	}
}
