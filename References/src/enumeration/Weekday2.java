package enumeration;

public class Weekday2 {

	public static void main(String[] args) {
		String weekday = "��";
		Week week = null;

		switch(weekday) {
		case "��": week = Week.MON; break;
		case "ȭ": week = Week.TUE; break;
		case "��": week = Week.WED; break;
		case "��": week = Week.THU; break;
		case "��": week = Week.FRI; break;
		case "��": week = Week.SAT; break;
		case "��": week = Week.SUN; break;
		}
		
		System.out.println("Week=" + week);
		
		if(week == Week.SUN) {
			System.out.println("������ �Ͽ����Դϴ�.");
		}
		else {
			System.out.println("������ �����Դϴ�.");
		}
	}

}
