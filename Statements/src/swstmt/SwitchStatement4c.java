package swstmt;
/*
 * ���ǹ�: switch
 * [����] ��޿� ���� ���� ȯ��
 * ������ ��޴����� �߻����Ѽ� (A~F)
 * �� ��޿� ���� �Ʒ��� ���� ������ �����϶�.
 * A:100, B:90, C:80, D:70, E:60, F:50
 */
public class SwitchStatement4c {

	public static void main(String[] args) {
		// String area = "����";
		String area = "����";
		// String area = "�λ�";
		
		String areano = "";
		
		switch(area) {
		case "����": {
				areano = "02";
				String tel = "007";
				System.out.printf("����: %s(%s)\n", areano, tel);
			}
			break;
			
		case "����": {
				areano = "042";
				String tel = "008";
				System.out.printf("����: %s(%s)\n", areano, tel);
			}
			
		case "�λ�": {
				areano = "051";
				String tel = "009";
				System.out.printf("�λ�: %s(%s)\n", areano, tel);
			}
			
		default: {
				String tel = "010";
				System.out.printf("��: %s(%s)\n", areano, tel);
			}
		}
		
		// �� ���ο��� ����� ����(tel)�� �ܺ� ������ ������ �� ����.
		// System.out.printf("����: %s(%s)\n", areano, tel);
		
		System.out.printf("������ȣ: %s(%s)\n",  area, areano);
	}
}
