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
package calculator2;

class Calc {
	double total;
	
	Calc() {
		total = 0;
	}
	
	Calc(int total) {
		this.total = total;
	}
	
	Calc(double total) {
		this.total = total;
	}
	
	Calc(Calc calc) {
		total = calc.total();
	}
	
	void plus(int x) {
		total += x;
	}
	
	void plus(double x) {
		total += x;
	}
	
	void minus(int x) {
		total -= x;
	}

	void minus(double x) {
		total -= x;
	}

	void multiple(int x) {
		total *= x;
	}
	
	void multiple(double x) {
		total *= x;
	}
	
	void divide(int x) {
		total /= x;
	}
	
	void divide(double x) {
		total /= x;
	}
	
	void print() {
		System.out.println("total: " + total);
	}
	
	double total() {
		return total;
	}
}
