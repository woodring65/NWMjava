package calcminus;

import calc.Calc;

public class CalcMinus extends Calc {
	public CalcMinus() {
		super();  // �θ��� �����ڸ� ȣ��
	}
	
	public CalcMinus(int sum) {
		super(sum); // �θ��� �����ڸ� ȣ��
	}
	
	public int computeMinus(int x) {
		this.sum -= x;
		return this.sum;
	}

	public static void main(String[] args) {
		CalcMinus calc = new CalcMinus(1000);
		int sum = calc.compute(10);
		sum = calc.computeMinus(900);
		System.out.println("Calc:sum=" + sum);
		
		System.out.println("Calc:sum=" + calc.getSum());

		// CalcMinus�� Calc�κ��� ��ӵǾ��� ������ Calc.sum�� ������ �� �ִ�.
		System.out.println("Calc:sum=" + calc.sum); 
	}
}
