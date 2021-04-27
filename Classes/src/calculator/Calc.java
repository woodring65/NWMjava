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
 */
package calculator;

class Calc {
	int total;
	
	Calc() {
		total = 0;
	}
	
	Calc(int total) {
		this.total = total;
	}
	
	Calc(Calc calc) {
		total = calc.total();
	}

	void plus(int x) {
		total += x;
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
	
	void print() {
		System.out.println("total: " + total);
	}
	
	int total() {
		return total;
	}
}
