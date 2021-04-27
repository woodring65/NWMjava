package calculator;

import calcdivide.CalcDivide;

public final class Calculator extends CalcDivide {
	public Calculator() {
		super();
	}
	
	public Calculator(int sum) {
		super(sum);
	}
	
	/*
	 * �޼ҵ� �����ε�(overloading)
	 * ������ �̸����� ���ο� �޼ҵ带 ����
	 */
	public int compute(String oper, int x) {
		switch(oper) {
		case "+":
			super.compute(x);
			break;
			
		case "-":
			super.computeMinus(x);
			break;
			
		case "*":
			super.computeMultiple(x);
			break;
			
		case "/":
			super.computeDivide(x);
			break;
		}
		
		return this.sum;
	}
	
	/*
	 * (CalcDivice.java)
	 * 	public final int computeDivide(int x)
	 * final�̹Ƿ� ������ �� �� ����.
	*/
	/*
	public int computeDivide(int x) {
		this.sum *= x;
		return this.sum;
	}
	*/
	
	public void printSum() {
		System.out.println("Calculator:sum= " + this.sum);
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator(0);
		calc.compute("+", 10);
		calc.compute("*", 10);
		calc.compute("-", 50);
		calc.compute("/", 25);
		calc.printSum();
	}
}
