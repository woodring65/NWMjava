package bitoper;
/*
 * ��Ʈ �̵� ������
 *  - �����̵�(<<) :  a << b, a�� b��ŭ �������� �̵�
 *  - �������̵�(>>) : a >> b, a�� b��ŭ ���������� �̵�(MSB�� ä������)
 *  - �������̵�(>>>) : a >>> b, a�� b��ŭ ���������� �̵�(zero�� ä������)
 */
public class BitShiftOper2 {

	public static void main(String[] args) {
		/*
		 * [����] 0x01�� ������ 0x02, 0x04, 0x08 ������.
		 * ����: ��Ʈ �̵� �����ڸ��� ����϶�.
		 */
		int one = 0x01;
		/*
		int two = one << 1;
		int four = one << 2;
		int eight = one << 3;
		*/
		int two = one << 1;
		int four = two << 1;
		int eight = four << 1;
		
		PrintBinaryString("one", one);
		PrintBinaryString("two", two);
		PrintBinaryString("four", four);
		PrintBinaryString("eight", eight);
		
	}
	
	public static void PrintBinaryString(String title, int value) {
		String strbin = Integer.toBinaryString(value);
		System.out.printf("%s: value(%d)(0x%x), [%s]\n", title, value, value, strbin);
	}
}
