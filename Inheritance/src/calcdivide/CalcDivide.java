package calcdivide;

import calcmultiple.CalcMultiple;

public class CalcDivide extends CalcMultiple {
	public CalcDivide() {
		super();
	}
	
	public CalcDivide(int sum) {
		super(sum);
	}
	
	/*
	 * final �޼ҵ�
	 */
	public final int computeDivide(int x) {
		this.sum /= x;
		return this.sum;
	}
}
