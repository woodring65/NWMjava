/*
 * [Ŭ������ ������]
 *   1. �����ڸ� �������� ������ �����Ϸ��� �⺻�����ڸ� �ڵ����� ����� �ش�.
 *   2. Ŭ������ �����ڴ� Ŭ������ �̸��� �����ؾ� �Ѵ�.
 *   3. ���� Ÿ���� ����.
 *   4. �����ڸ� ������ ����� ������ �Ķ���Ͱ� �޶�� �Ѵ�.
 *   5. this�� Ŭ������ ��ü�� �Ǿ��� �� ������ �ִ� �޸� �ּ�
 */
package students2;

class Student {
	String no;
	String name;
	int age;
	String major;
	String subject;
	String handphone;
	boolean status;
	float score;
	
	Student() { // ������(�⺻)
		System.out.println("Student -> �⺻ ������");
		this.status = true;
	}
	
	Student(String no, String name) { // ������(�й�, �̸�)
		System.out.printf("Student -> ������2: no(%s), name(%s)\n", no, name);
		this.no = no;
		this.name = name;
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
		System.out.println("\t> �г�: " + this.major);
		System.out.println("\t> �а�: " + this.subject);
		System.out.println("\t> ����: " + this.status);
		System.out.println("\t> ����: " + this.score);
	}

}
