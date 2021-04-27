/*
 * �Ǽ�(double)
 * 8byte: ��ȣ(1byte) + ����(11bit) + ����(52bit)
 */

package basics;

public class DoubleType {

	public static void main(String[] args) {
		double pi = 3.14159;
		double fv = -0.12345;
		double f8 =  0.12345678;
		double f9 =  0.123456789;
		double f9a = 0.123456785;
		double f9b = 0.123456786;
		double f9c = 0.123456787;
		double f9d = 0.123456788;
		double f9e = 0.123456789;
		double f10 = 0.1234567891;
		
		System.out.println("pi=" + pi);
		System.out.println("fv=" + fv);
		System.out.println("f8=" + f8);   // �ִ� �Ҽ������� 8�ڸ�����
		System.out.println("f9=" + f9);  
		System.out.println("f9a=" + f9a);
		System.out.println("f9b=" + f9b);
		System.out.println("f9c=" + f9c);
		System.out.println("f9d=" + f9d);
		System.out.println("f9e=" + f9e);
		System.out.println("f10=" + f10);
		
		// ��ü ��ȿ�ڸ� 16�ڸ�
		double fx1 = 12345.12345678;
		System.out.println("fx1=" + fx1); 

		double fx2 = 1234567.12345678;
		System.out.println("fx2=" + fx2);
		
		double fx3 = 0.123456712345678e7; // e7 = 10�� 7�� (10 * 10 * 10 * 10 * 10 * 10 * 10)
		System.out.println("fx3=" + fx3);
		
		
		double dxm = 0.123456789012345678;
		System.out.println("dxm=" + dxm);
	}

}
