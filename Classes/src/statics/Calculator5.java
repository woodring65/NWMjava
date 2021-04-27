/*
 * �����޼ҵ�(static method):
 *   - Ŭ������ ��üȭ ��Ű�� �ʰ� ����Ѵ�.(new�� ���� �ʰ� ����Ѵ�)
 *   - this�� ����.
 */
package statics;

public class Calculator5 {
	static int static_count = 0;
	int value = 0;

	Calculator5() {
		this.value++;
		Calculator5.static_count++;
	}
	
	void print() {
		System.out.printf("value(%d), static_count(%d)\n", this.value, Calculator5.static_count);
	}
	
	static int printStaticCount() {
		System.out.printf("printStaticCount(): static_count(%d)\n", Calculator5.static_count);
		return Calculator5.static_count;
	}
	
	static int addStaticCount(int count) {
		// this�� ����.
		// this.static_count = 0;
		// this.value = 0;
		Calculator5.static_count += count;
		return Calculator5.static_count;
	}
	
	public static void main(String[] args) {
		Calculator5.addStaticCount(10);
		Calculator5.printStaticCount();
	}
}
