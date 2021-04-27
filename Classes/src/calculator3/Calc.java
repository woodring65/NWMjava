/*
 * ��Ģ������ �ϴ� ���ڰ���
 * Ŭ���� : Calc
 * �Ӽ� : ?
 * �޼ҵ� : plus, minus, multiple, divide, sum, print
 *    - plus(int x)     : ���ϱ�
 *    - minus(int x)    : ����
 *    - multiple(int x) : ���ϱ�
 *    - divide(int x)   : ������
 *    - print() : ��Ģ���� ����� ���
 * Ȯ��: �Ǽ����� ó��    
 */
package calculator3;

class Calc {
	int total;
	
	Calc() {
		total = 0;
	}
	
	Calc(int total) {
		this.total = total;
	}
	
	void sum(int[] values) { // �迭
		for(int x : values) {
			total += x;
		}
	}
	
	void plus(int ... values) { // ��������
		for(int x : values) {
			total += x;
		}
	}
	
	void minus(int x) {
		total -= x;
	}

	void multiple(int x) {
		total *= x;
	}
	
	void divide(int x) {
		total /= x;
	}
	
	
	void print(String title) {
		System.out.printf("[%s] total: %d\n", title, total);
	}
	
	double total() {
		return total;
	}
}
