package students2;

public class StudentRun3 {
	public static void main(String[] args) {
		Student student = new Student("007", "���ӽ�����");
		
		student.print();
		
		student.name = "��������";
		
		System.out.println("[�л�����]");
		System.out.println("\t> �й�: " + student.no);
		System.out.println("\t> �̸�: " + student.name);
		System.out.println("\t> ����: " + student.age);
		System.out.println("\t> �г�: " + student.major);
		System.out.println("\t> �а�: " + student.subject);
		System.out.println("\t> ����: " + student.status);
		System.out.println("\t> ����: " + student.score);

		student.print();

		student.name = "���ڳ׸�";
		
		student.print("[��ȭ���ΰ�]");
		
	}
}
