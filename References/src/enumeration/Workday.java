/*
 * 1. ������ ��¥�� ���� �׸��� ������ ���
 * 2. �� ������ �ѱ۷� ǥ��(������, ȭ����, ������, �����, �ݿ���, �����, �Ͽ���)
 * 3. �� ������ �ѱ۷� ǥ��(��, ����, ����, �ܿ�)
 */
package enumeration;

import java.util.Calendar;

public class Workday {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
		int year  = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) + 1;
		int day   = today.get(Calendar.DAY_OF_MONTH);
		int week  = today.get(Calendar.DAY_OF_WEEK);  // �Ͽ���(1) ~ �����(7)
		
		System.out.printf("������ (%d)�� (%d)�� (%d)�� (%d)���� \n", year, month, day, week);
	
		System.out.printf("������ (%d)�� (%d)�� (%d)�� ����(%s) (%s) %n",
				year, month, day, 
				(week == 1) ? Week.SUN
				: (week == 2) ? Week.MON
				: (week == 3) ? Week.TUE 
				: (week == 4) ? Week.WED 
				: (week == 5) ? Week.THU 
				: (week == 6) ? Week.FRI : Week.SAT,
				(month >= 3 && month <=5) ? Season.SPRING
				: (month >= 3 && month <=5) ? Season.SPRING
				: (month >= 6 && month <=8) ? Season.SUMMER
				: (month >= 9 && month <=11) ? Season.AUTUMN : Season.WINTER);
	}
}
