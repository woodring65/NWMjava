package ifstmt;
/*
 * ���ǹ�: ���ǹ�
 * [����] 60���� 100�� ������ ������ �߻����Ѽ� ����� �������.
 *    A: 90���̻�, B:80���̻�, C:70���̻�, D:60���̻�, F:60���̸�
 *    MAX = 100 - 60
 *    RESULT = RANDOM * (MAX + 1) + ���۰�
 */
public class IfStatement5 {

	public static void main(String[] args) {
		double x = Math.random();
		int score = (int)(x * (100 - 60 + 1) + 60);
		
		System.out.printf("random:(%f)(%d)", x, score);
		
		char grade = 'X';
		
		if((score >= 90) && (score <= 100)) {
			grade = 'A';
		}
		else if(score >= 80) {
			grade = 'B';
		}
		else if(score >= 70) {
			grade = 'C';
		}
		else if(score >= 60) {
			grade = 'D';
		}
		else if(score >= 0 && score < 60) {
			grade = 'F';
		}
		else {
			System.out.println("������ ������ �ֽ��ϴ�.");
		}
	
		System.out.printf("Your Grade is (%c)\n", grade);
	}
}
