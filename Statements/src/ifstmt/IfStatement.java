package ifstmt;
/*
 * ���ǹ�(if)
 * if(���ǽ�) {
 * }
 * 
 * ���ǽ��� ����� ���̸� ���� ����
 * ���ǽ��� ����� boolean Ÿ��
 */
public class IfStatement {

	public static void main(String[] args) {
		if(true) {
			System.out.println("���̴�");
		}
		
		int x = 9;
		if(x > 9) {  // ��
			System.out.println("x�� 9���� ũ��");
		}
		else { // ����
			System.out.println("x�� 9���� ũ�� �ʴ�");
		}
	}
}
