/*
 * Ŭ������ �����������(static)�� �ϳ��� Ŭ�����κ��� ������ ��ü�� ��� �ϳ��� �����ȴ�.
 * ��ü�� �Ҽӵ� ����� �ƴ϶� Ŭ������ �Ҽӵ� ����̴�.
 */
package statics;

public class Calculator3 {
	static float pi = 3.14f;

	String id;
	int total = -1;
	
	Calculator3(String id, int total, float pi) {
		this.id = id;
		this.total = total;
		Calculator3.pi = pi;
	}
	
	void println() {
		System.out.printf("[%s]\n", this.id);
		System.out.println("> total=" + this.total);
		System.out.println("> pi=" + Calculator3.pi);
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("Calculator3: pi=" + Calculator3.pi);
		// System.out.println("Calculator3: id=" + Calculator3.id);
	}
}
