/*
 * �ٸ� Ÿ���� �� �ǿ����ڰ� ���� �� ū Ÿ������ ��ȯ �� ������ �Ѵ�.
 */
package conversion;

public class OperCasting {

	public static void main(String[] args) {
		int intvalue = 12345;
		double dblval = 0.12345;
		double retval = intvalue + dblval;
		
		System.out.println(intvalue);
		System.out.println(dblval);
		System.out.println("���:" + retval);
		System.out.printf("���(%f) = (%d) + (%f)\n", retval, intvalue, dblval);
		
		double dblval2 = 3.123;
		double retval2 = intvalue + (int)dblval2; // �Ҽ��� ���ϴ� ����(12348 = 12345 + 3)
		System.out.println(intvalue);
		System.out.println(dblval2);
		System.out.println(retval2);
		System.out.printf("���(%f) = (%d) + (%f)\n", retval2, intvalue, dblval2);
	}

}
