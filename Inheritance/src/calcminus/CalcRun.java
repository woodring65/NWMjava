package calcminus;

public class CalcRun {

	public static void main(String[] args) {
		CalcMinus calc = new CalcMinus(1000);
		int sum = calc.compute(10);
		sum = calc.computeMinus(900);
		System.out.println("Calc:sum=" + sum);
		
		System.out.println("Calc:sum=" + calc.getSum());

		// CalcRun�� Calc�κ��� ��ӵ��� �ʾ����Ƿ� Calc.sum�� ������ �� ����.
		// System.out.println("Calc:sum=" + calc.sum); 
	}
}
