package swstmt;
/*
 * ���ǹ�: switch
 * [����] ��޿� ���� ���� ȯ��
 * ������ ��޴����� �߻����Ѽ� (A~F)
 * �� ��޿� ���� �Ʒ��� ���� ������ �����϶�.
 * A:100, B:90, C:80, D:70, E:60, F:50
 */
public class SwitchStatement4 {

	public static void main(String[] args) {
		// String area = "����";
		// String area = "����";
		String area = "�λ�";
		
		String areano = "";
		
		switch(area) {
		case "����":
			areano = "02";
			break;
			
		case "����":
			areano = "042";
			break;
			
		case "�λ�":
			areano = "051";
			break;
		}
		
		System.out.printf("������ȣ: %s(%s)\n",  area, areano);
	}
}
