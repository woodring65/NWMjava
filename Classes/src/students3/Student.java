package students3;

public class Student {
	String no;
	String name;
	int age = -1;
	
	School school = new School();
	
	/*
	String schoolname;
	String schooladdress;
	String schoolbuild;
	*/ 

	Student() {
		System.out.println("Student: �⺻������");
		age = 0;
	}
	
	Student(String no, String name, int age) {
		System.out.println("Student: �й�, �̸�, ����");
		this.no = no;
		this.name = name;
		this.age = age;
	}
	
	Student(String no, String name, int age, String schoolname, String schooladdress, String schoolbuild) {
		this(no, name, age);  // �ڱ� �ڽ��� �����ڸ� ȣ��, �ٸ� ǥ���� ���� �ֿ켱���� ����Ǿ�� �Ѵ�.
		this.school.name = schoolname;
		this.school.address = schooladdress;
		this.school.buildyear = schoolbuild;
		System.out.println("Student: ��ü�Ӽ�");
	}
	
	void printAll() {
		print();
		printSchool();
	}
	
	void printSchool() {
		System.out.println("[�б�����]");
		System.out.println("\t> �б��̸�: " + this.school.name);
		System.out.println("\t> �б��ּ�: " + this.school.address);
		System.out.println("\t> �����⵵: " + this.school.buildyear);
	}

	void print() {
		printTitle("[�л��������]");
	}
	
	void print(String title) {
		printTitle(title);
	}
	
	void printTitle(String title) {
		System.out.println(title);
		System.out.println("\t> �й�: " + this.no);
		System.out.println("\t> �̸�: " + this.name);
		System.out.println("\t> ����: " + this.age);
		/*
		System.out.println("\t> �г�: " + this.major);
		System.out.println("\t> �а�: " + this.subject);
		System.out.println("\t> ����: " + this.status);
		System.out.println("\t> ����: " + this.score);
		*/
	}

	// �л��� ������ �ִ� school ��ü�� ����
	School schoolObject() {
		return school;
	}
}
