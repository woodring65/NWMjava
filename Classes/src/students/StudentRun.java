/*
 * ��� Ŭ������ �ν��Ͻ�ȭ �Ǿ�߸� ��ü�μ� ����� �� �ִ�.
 * ��ü.�Ӽ�
 * ��ü.�޼ҵ�()
 */
package students;

public class StudentRun {
	String me = "StudentRun!!!";
	
	public static void main(String[] args) {
		StudentRun strun = new StudentRun(); // ����(declare)
		System.out.println(strun.me);
		
		Student student = new Student(); // ����(declare)
		student.printInfo();
		
		String info = student.info("����");
		System.out.println(info);
		
		Student student2 = new Student();
		System.out.println("(student == student2) ? " + (student == student2));
				
	}

}
