package students3;

public class StudentRun4 {

	public static void main(String[] args) {
		// Student student = new Student();
		Student student = new Student("1000", "���л�", 20, "�ѱ���", "��⼺��", "2021");
		student.printAll();
		
		School school = student.schoolObject(); 
		System.out.println(">>> �б����� <<<");
		System.out.println("\t> �б��̸�: " + school.name);
		System.out.println("\t> �б��ּ�: " + school.address);
		System.out.println("\t> �����⵵: " + school.buildyear);
		System.out.println("----------------------------------------");
		System.out.println("\t> �б��̸�: " + student.school.name);
		System.out.println("\t> �б��ּ�: " + student.school.address);
		System.out.println("\t> �����⵵: " + student.school.buildyear);
		
		school.name = "����";
		school.address = "������";
		school.buildyear = "1970";
		student.printSchool();
	}

}
