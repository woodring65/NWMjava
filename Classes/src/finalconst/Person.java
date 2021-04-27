/*
 * [final field]
 *   - �ʱⰪ�� ���ʿ� �� �� �����Ǹ� ������ �� ����.
 *   - �ʱⰪ�� �����ϴ� ���
 *     1. ������ �� ����
 *     2. �����ڿ��� ����
 */
package finalconst;

public class Person {
	final String nation = "Korea";	// �ʱⰪ�� ������ �� ����
	final String ssn;				// �ʱⰪ�� �����ڿ��� �����ؾ� �Ѵ�.
	String name;
	
	Person() {
		this.ssn = "20210101-1234567";
		// this.nation = "USA";
	}
	
	Person(String ssn, String name) {
		// this.nation = "USA";
		this.ssn = ssn;
		this.name = name;
	}
	
	void set(String ssn, String name) {
		// this.ssn = ssn;
		this.name = name;
	}
	
	void print() {
		System.out.println("ssn : " + this.ssn);
		System.out.println("name : " + this.name);
	}

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.set("987654-7654321", "�ܱ���");
		p1.print();
		
		Person p2 = new Person("123456-1234567", "�ѱ���");
		// p2.nation = "�̱�";
		p2.print();
	}

}
