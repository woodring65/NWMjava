package swstmt;
/*
 * ���ǹ�: switch
 * [����] ��޿� ���� ���� ȯ��
 * ������ ��޴����� �߻����Ѽ� (A~F)
 * �� ��޿� ���� �Ʒ��� ���� ������ �����϶�.
 * A:100, B:90, C:80, D:70, E:60, F:50
 */
public class SwitchStatement4b {

	public static void main(String[] args) {
		String area = "����";
		// String area = "����";
		// String area = "�λ�";
		String areano = "";
		
		if(area.equals("����"))	{
			areano = "02";
			String tel = "007";
			System.out.printf("����: %s(%s)\n", areano, tel);
		} else if(area.equals("����")) {
			areano = "042";
		} else if(area.equals("�λ�")) {
			areano = "051";
		}

		// �� ���ο��� ����� ����(tel)�� �ܺ� ������ ������ �� ����.
		// System.out.printf("����: %s(%s)\n", areano, tel);

		System.out.printf("������ȣ: %s(%s)\n",  area, areano);
	}
}
