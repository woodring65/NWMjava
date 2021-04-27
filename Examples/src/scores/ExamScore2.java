package scores;


/*
[����] 5�ñ��� 
1. ���ο� ������Ʈ ExamScore�� �����.
2. ����, ����, ���� ������ �Է� �޴´�.
3. ������ ���Ѵ�.
4. ����� ���Ѵ�.
5. �� ������ ������ ��ո� ����Ѵ�.
6. ��� ������ ���� ��� ���
   - A : >= 90
   - B : >= 80
   - C : >= 70
   - D : >= 60
   - F : < 60
7. �� ��޿� ���� �޽��� ���
   - A, B ���: �Ǹ��մϴ�.
   - C, D ���: �� �� �߽��ϴ�.
   - F : ���� ����ϼ���.
*/
public class ExamScore2 {
	public static void main(String args[]) {
		int kor = 65;
		int eng = 76;
		int math = 85;
		int total = kor + eng + math;
		float avg = total / 3.0f;
		
		System.out.printf("����(%d), ����(%d), ����(%d) %n", kor, eng, math);
		System.out.printf("�հ�(%d), ���(%f) %n", total, avg);
		
		char grade = (avg >= 90) ? 'A' : 
			(avg >= 80) ? 'B' :
			(avg >= 70) ? 'C' :
			(avg >= 60) ? 'D' : 'F';
		
		System.out.printf("���(%c) %n", grade);
		
		String strMsg = (grade == 'A' || grade == 'B') ? "�Ǹ��մϴ�." :
			(grade == 'C' || grade == 'D') ? "�� ���߽��ϴ�." : "�� �� ����ϼ���.";
				
		System.out.println(strMsg);
	}
}
