/*
 * Ŭ������ �����������(static)�� �ϳ��� Ŭ�����κ��� ������ ��ü�� ��� �ϳ��� �����ȴ�.
 *   - ��ü�� �Ҽӵ� ����� �ƴ϶� Ŭ������ �Ҽӵ� ����̴�.
 *   - Ŭ������ ��üȭ ��Ű�� �ʰ� ����Ѵ�.(new�� ���� �ʰ� ����Ѵ�)
 */
package statics;

public class Calculator {
	String id;
	static float pi = 3.14f;
	int total = -1;
	
	Calculator(String id, int total, float pi) {
		this.id = id;
		this.total = total;
		this.pi = pi;
	}
	
	void println() {
		System.out.printf("[%s]\n", this.id);
		System.out.println("> total=" + this.total);
		System.out.println("> pi=" + this.pi);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Calculator calc1 = new Calculator("calc1", 9, 0.14f);
		calc1.println();
		
		Calculator calc2 = new Calculator("calc2", 10, 3.14159f);
		calc2.println();
		
		calc1.println(); // pi�� ���������� ������ ���� ���� 
	}

}
