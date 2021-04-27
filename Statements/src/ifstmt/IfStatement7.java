package ifstmt;
/*
 * ���ǹ�: ��ø ���ǹ�
 * [����] 0���� 100�� ������ ������ �߻����Ѽ� ����� �������.
 *    - A: 90���̻�, B:80���̻�, C:70���̻�, D:60���̻�, F:60���̸�
 *    - 60�� �̸��̸� ��� �޽����� ����Ѵ�.
 *    - A : "���� ���л�" �޽����� ���
 *    - B : "�ݾ� ���л�" �޽����� ���
 *    - C,D : "������ ���" �޽����� ��� 
 *    
 *    - A~D : "�հ�" �޽��� ���
 *    - F: "����" �޽����� ���
 *    
 * ����: ��ø ���ǹ��� �Ἥ �ۼ�  
 */
public class IfStatement7 {

	public static void main(String[] args) {
		double x = Math.random();
		int score = (int)(x * 101);
		
		System.out.printf("random:(%f)(%d)%n", x, score);
		
		String pass="", msg="";
		char grade='X';
		
		if(score >= 60) {
			pass = "�հ�";
			if((score >= 90) && (score <= 100)) {
				grade = 'A';
				msg = "���� ���л�";
			}
			else if(score >= 80) {
				grade = 'B';
				msg = "�ݾ� ���л�";
			}
			else if(score >= 70) {
				grade = 'C';
				msg = "������ ���";
			}
			else if(score >= 60) {
				grade = 'D';
				msg = "������ ���";
			}			
		}
		else {
			pass = "����";
			grade = 'F';
			msg = "�ٽ� �����ϼ���";
		}
		
		System.out.printf("[%d][%c]->[%s][%s]\n", score, grade, pass, msg);
	}
}
