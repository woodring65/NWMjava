/*
 * ����Ÿ�Ժ�ȯ
 * 1. Ư���� Ÿ������ ���� ��ȯ
 * 2. ūŸ�Կ��� ���� Ÿ������ ��ȯ(�ڷ��� �ս��� �߻�)
 */
package conversion;

public class TypeCasting {

	public static void main(String[] args) {
		int intvalue = 300; // 0x012c(0001 0010 1100)
		// byte bytevalue = intvalue; // Type mismatch: cannot convert from int to byte
		byte bytevalue = (byte)intvalue; // 0x012c(0001 0010 1100) -> 0x2c(0010 1100)

		System.out.printf("int(%d)(%x), byte(%d)(%x)\n", intvalue, intvalue, bytevalue, bytevalue);

	}

}
