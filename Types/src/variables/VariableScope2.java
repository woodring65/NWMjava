/*
 * ������ ��� ����
 */
public class VariableScope2 {

	public static void main(String[] args) {
		int a1 = 10;
		
		System.out.println("a1=" + a1);
		
		{ // �������� �� �ܺο� ����� ������ ������ ������ �� ����.
			// int a1 = 20;
			a1 = a1 + 5; // ���� �����Ű�� ������ ������ �ݿ��ȴ�.
			System.out.println("a1=" + a1);
		}
	}
}
