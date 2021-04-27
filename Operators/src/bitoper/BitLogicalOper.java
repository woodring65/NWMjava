package bitoper;
/*
 * ��Ʈ �� ������
 *   - AND : &,   a & b, a�� b�߿� ��� 1�̸� 1, �ƴϸ� 0
 *   - OR  : |,   a | b, a�� b�߿� �ϳ��� 1�̸� 1, �� �� 0�̸� 0
 *   - XOR : ^,   a ^ b, a�� b�߿� �ϳ��� 1�̸� 1, �� �� ������ 0
 */
public class BitLogicalOper {

	public static void main(String[] args) {
		byte a = 0x0f;
		byte b = 0x0a;
		byte and = (byte)(a & b);
		byte or = (byte)(a | b);
		byte xor = (byte)(a ^ b);
		
		PrintBinaryString("a", a);
		PrintBinaryString("b", b);
		PrintBinaryString("and", and);
		PrintBinaryString("or", or);
		PrintBinaryString("xor", xor);
	}

	public static void PrintBinaryString(String title, int value) {
		String strbin = Integer.toBinaryString(value);
		System.out.printf("%s: value(%d)(0x%x), [%s]\n", title, value, value, strbin);
	}
}
