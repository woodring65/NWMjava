package operators;
/*
 * ���׿�����
 * ����(���) = (���ǽ�) ? ���� ��찪 : ������ ��찪;
 * 1. ���ǽ��� ���̸� ���� ����� ���� ����� �Ҵ�
 * 2. ���ǽ��� �����̸� ������ ����� ���� ����� �Ҵ�
 */
public class ThreeOper {

	public static void main(String[] args) {
		int score = 90;
		char grade = (score >= 90) ? 'A' : 'B';
		
		System.out.printf("score(%d) : grade(%c)\n", score, grade);

		score = 88;
		String strGrade = (score >= 90) ? "�� ���߾��!" : "�� �߾��";
		System.out.printf("score(%d) : grade(%s)\n", score, strGrade);
		
		/*
		 * [����] ��� ���
		 * A : >= 90
		 * B : >= 80
		 * C : >= 70
		 * D : >= 60
		 * F : < 60
		 */
		
		score = 66;
		grade = (score >= 90) ? 'A' 
			: (score >= 80) ? 'B' 
			: (score >= 70) ? 'C' 
			: (score >= 60) ? 'D' : 'F';
		System.out.printf("score(%d) : grade(%c)\n", score, grade);
		
		/*
		 * [����] �������
		 *   - �¸�: 3��
		 *   - ����: 2��
		 *   - �й�: 1��
		 */
		// char game = 'W'; // �¸�('W'), ���º�('S'), �й�('L')
		// char game = 'S'; // �¸�('W'), ���º�('S'), �й�('L')
		char game = 'L'; // �¸�('W'), ���º�('S'), �й�('L')
		int victory = (game == 'W') ? 3 : (game == 'S') ? 2 : 1;
		System.out.printf("game(%c) : victory(%d)\n", game, victory);
	}

}
