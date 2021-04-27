/*
 * 1. ������ ��¥�� ���� �׸��� ������ ���
 * 2. �� ������ �ѱ۷� ǥ��(������, ȭ����, ������, �����, �ݿ���, �����, �Ͽ���)
 * 3. �� ������ �ѱ۷� ǥ��(��, ����, ����, �ܿ�)
 */
package enumeration;

import java.util.Calendar;

public class Workday2 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
		int year  = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) + 1;
		int day   = today.get(Calendar.DAY_OF_MONTH);
		int week  = today.get(Calendar.DAY_OF_WEEK);  // �Ͽ���(1) ~ �����(7)
		
		System.out.printf("������ (%d)�� (%d)�� (%d)�� (%d)���� \n", year, month, day, week);
	
		// ����
		System.out.printf("������ (%d)�� (%d)�� (%d)�� (%s) %n",
				year, month, day, 
				(week == 1) ? WeekKorean.�Ͽ���
				: (week == 2) ? WeekKorean.������
				: (week == 3) ? WeekKorean.ȭ����
				: (week == 4) ? WeekKorean.������
				: (week == 5) ? WeekKorean.�����
				: (week == 6) ? WeekKorean.�ݿ��� : WeekKorean.�����); 
				
	}
}
