package enumeration;

public class Weekday {

	public static void main(String[] args) {
		Week week = Week.MON;
		
		System.out.println("Week=" + week);
		
		if(week == Week.SUN) {
			System.out.println("������ �Ͽ����Դϴ�.");
		}
		else {
			System.out.println("������ �����Դϴ�.");
		}
	}

}
