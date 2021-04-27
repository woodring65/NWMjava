/*
 * 1. ������ ��¥�� ���� �׸��� ������ ���
 * 2. �� ������ �ѱ۷� ǥ��(������, ȭ����, ������, �����, �ݿ���, �����, �Ͽ���)
 * 3. �� ������ �ѱ۷� ǥ��(��, ����, ����, �ܿ�)
 */
package enumeration;

import java.util.Calendar;

public class Workday5 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
		int year  = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) + 1;
		int day   = today.get(Calendar.DAY_OF_MONTH);
		int week  = today.get(Calendar.DAY_OF_WEEK);  // �Ͽ���(1) ~ �����(7)
		
		System.out.printf("������ (%d)�� (%d)�� (%d)�� (%d)���� \n", year, month, day, week);
	
		// ���ϰ� ����(�ƶ���)
		Week[] weeks = Week.values();
		SeasonArabia[] seasons = SeasonArabia.values();
		int x1 = (int)(month / 3); // ��
		int x2 = (int)(month % 3); // ������
		int season = x1 + ((x2 != 0) ? 1 : 0) - 1;
		System.out.printf("������ (%d)�� (%d)�� (%d)�� (%s) (%s) %n", year, month, day, weeks[week-1], seasons[season]);

		/*
		for(int mon = 1; mon <= 12; mon++) {
			int x1 = (int)(mon / 3); // ��
			int x2 = (int)(mon % 3); // ������
			int season = x1 + ((x2 != 0) ? 1 : 0);
			System.out.printf("mon(%d), x1(%d), x2(%d), season(%d)\n", mon, x1, x2, season);
		}
		*/
	}
}
