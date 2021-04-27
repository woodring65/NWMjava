/*
 * ��2�� ������ Ÿ��
 * Ȯ�ι���
 * 1. ���������� int Ÿ������ ��ȯ�Ǿ� ����
 * 2. ���� �ڷ����� ū �ڷ����� ������ �Ǹ� ū �ڷ������� ��ȯ�Ǿ� ������ �����Ѵ�.
 */
package conversion;

public class example {

	public static void main(String[] args) {
		/*
		 * [����1] �ڹٿ��� ������ ���� ������ Ʋ�� ����?
		 * ����: 4��, ������ �ʱⰪ�� ������� ���� ���¿��� ���� �� �ִ�.
		 * �ؼ�: �б� ���� �ݵ�� ���� �Ҵ�Ǿ�� �Ѵ�.
		 * int x; // �ʱⰪ�� �������� ����(������ ���� �� �ִ� ����)
		 * x = 1; 
		 * int y = x + 10;
		 *    
		 */
		
		/*
		 * [����2] ���� �̸����� ��� ������ ����
		 * ����: moduleName, $value, _age
		 * �ؼ�: �����(class, int)
		 * 1. ������ ù��° ���ڷ� Ư�����ڴ� Ŭ������ ��� ������ ���� ����Ѵ�.(����)
		 */
		
		/*
		 * [����3] �ڹ��� �⺻ Ÿ��(Primitive Type) 8��
		 * ����: 
		 *   - ����Ÿ��(byte, char, short, int, long)
		 *   - �Ǽ�Ÿ��(float, double)
		 *   - ��Ÿ��(boolean)
		 */
		
		/*
		 * [����4] Ÿ��, �����̸�, ���ͳ�
		 * ����:  
		 *   - Ÿ��: int, double
		 *   - �����̸�: age, price
		 *   - ���ͳ�: 10, 3.14
		 */

		/*
		 * [����5] �ڵ� Ÿ�� ��ȯ
		 * ����: 3��, short shortvalue = charvalue;
		 * �ؼ�: char(2byte) ����� short(����, ���)
		 */
		byte bytevalue = 10;
		char charvalue = 'A';
		
		int intvalue = bytevalue;
		int intvalue2 = charvalue;
		// short shortvalue = charvalue; // Type mismatch: cannot convert from char to short
		short shortvalue = (short)charvalue; // ������ Ÿ���ɽ����� �������� ������ �ս��� �߻�
		double doublevalue = bytevalue;
		
		/*
		 * [����6]
		 * ����: 4��,  char charvar6_1 = (char)strval6; // Cannot cast from String to char
		 */
		int intval6 = 10;
		char charval6 = 'A';
		double dblvar6 = 5.7;
		String strval6 = "Aabdkfdjkfj";
		double dlbvar6_1 = (double)intval6;
		byte bvar6_1 = (byte)intval6;
		int intvar6_1 = (int)dblvar6;
		// char charvar6_1 = (char)strval6; // Cannot cast from String to char
		
		/*
		 * [����7] ������ �߸� �ʱ�ȭ �� ����?
		 * ����: 3��, char char7 = ''; // Invalid character constant
		 */
		int var7 = 10;
		long long7 = 100000000000L;
		// char char7 = ''; // Invalid character constant
		double dbl7 = 10;
		float flt7 = 10;
		
		/*
		 * [����8] ����Ŀ����� Ÿ�� ��ȯ ����, �����Ϸ� ����?
		 * ����: 1��, 
		 * �ؼ�: byte retbyte8 = byteval8 + byteval8; // Type mismatch: cannot convert from int to byte
		 */
		
		byte byteval8 = 10;
		float floatval8 = 2.5F;
		double dblval8 = 2.5;
		
		// byte retbyte8 = byteval8 + byteval8; // Type mismatch: cannot convert from int to byte
		byte retbyte8 = (byte)(byteval8 + byteval8); // (byte + byte) -> int -> byte
		int retint8 = 5 + byteval8;      // int(5) + int(byteval8) -> int
		float retfloat8 = 5 + floatval8; // float(5.0f) + float(floatval8) -> float
		double retdbl8 = 5 + dblval8;    // double(5.0) + double(dblval8) -> double
		
		/*
		 * long = int + long
		 */
		int intx1 = 100;
		long longx1 = 1000L;
		long retx1 = intx1 + longx1;  // long(intx1) + long(longx1) -> long
		System.out.println(retx1);
	}

}
