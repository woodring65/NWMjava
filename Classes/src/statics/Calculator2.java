/*
 * Ŭ������ �����������(static)�� �ϳ��� Ŭ�����κ��� ������ ��ü�� ��� �ϳ��� �����ȴ�.
 * ��ü�� �Ҽӵ� ����� �ƴ϶� Ŭ������ �Ҽӵ� ����̴�.
 */
package statics;

public class Calculator2 {
	String id;
	static float pi = 3.14f;
	int total = -1;
	
	Calculator2(String id, int total, float pi) {
		this.id = id;
		this.total = total;
		Calculator2.pi = pi;
	}
	
	void println() {
		System.out.printf("[%s]\n", this.id);
		System.out.println("> total=" + this.total);
		System.out.println("> pi=" + Calculator2.pi);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Calculator2 calc1 = new Calculator2("calc1", 9, 0.14f);
		calc1.println();
		
		Calculator2 calc2 = new Calculator2("calc2", 10, 3.14159f);
		calc2.println();
		
		calc1.println(); // pi�� ���������� ������ ���� ���� 
	}

}
