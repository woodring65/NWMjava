package chap03;
/*
 * ������(%) ������ ������ ������� 10�� ���ϴ� �ڵ��̴�.
 * NaN���� �˻��ؼ� �ùٸ� ����� ��µ� �� �ֵ��� NaN�� �˻��ϴ� �ڵ带 �ۼ��϶�
 */
public class Exercise08 {

	public static void main(String[] args) {
		double x = 5.0;
		double y = 0.0;
		// double y = 2.1;
		
		double z = x % y;
		System.out.println("z: " + z);
		
		if(Double.isNaN(z)) {
			System.out.printf("x(%f) ���� zero(0)���� ���� �� �����ϴ�.\n", x);
		}
		else {
			double result = z + 10;
			System.out.println("���: " + result);
		}
			

	}

}
