package swstmt;
/*
 * ���ǹ�: switch
 * [����] ��޿� ���� ���� ȯ��
 * ������ ��޴����� �߻����Ѽ� (A~F)
 * �� ��޿� ���� �Ʒ��� ���� ������ �����϶�.
 * A:100, B:90, C:80, D:70, E:60, F:50
 */
public class SwitchStatement4a {

	public static void main(String[] args) {
		String area = "����";
		// String area = "����";
		// String area = "�λ�";
		String areano = "";
		
		if(area.equals("����"))	{
			areano = "02";
		} else if(area.equals("����")) {
			areano = "042";
		} else if(area.equals("�λ�")) {
			areano = "051";
		}
		
		System.out.printf("������ȣ: %s(%s)\n",  area, areano);
	}
}
