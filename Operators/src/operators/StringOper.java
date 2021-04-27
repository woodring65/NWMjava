package operators;
/*
 * ���ڿ� ����(==. !=)
 * ���ڿ� ������ ���� ���ϴ� ���� �ƴ϶� ���� ����� ��ġ(�޸� ����)�� ���Ѵ�.
 * 
 */
public class StringOper {

	public static void main(String[] args) {
		String str1 = "abc";             // ������(.TEXT) ������ ������ �ܰ迡�� ������ ��ġ�� ����
		String str2 = "abc";             // ������(.TEXT) ������ ������ �ܰ迡�� ������ ��ġ�� ����
		String str3 = new String("abc"); // heap(�������� �����Ǵ� �޸� ����)
		String str4 = str3;              // link(����, ������ heap�� �޸� ������ ����)
		
		boolean eqstr = (str1 == str2);  // ���� ��ġ�� ��(���� ���ϴ� ���� �ƴϴ�)
		boolean nestr = (str1 != str2);
		System.out.printf("str1(%s) == str2(%s) -> (%b)\n",  str1, str2, eqstr);
		System.out.printf("str1(%s) != str2(%s) -> (%b)\n",  str1, str2, nestr);
		
		boolean eqstr3 = (str1 == str3);
		boolean nestr3 = (str1 != str3);
		System.out.printf("str1(%s) == str3(%s) -> (%b)\n",  str1, str3, eqstr3);
		System.out.printf("str1(%s) != str3(%s) -> (%b)\n",  str1, str3, nestr3);

		boolean eqstr4 = (str3 == str4);
		boolean nestr4 = (str4 != str4);
		System.out.printf("str3(%s) == str4(%s) -> (%b)\n",  str3, str4, eqstr4);
		System.out.printf("str4(%s) != str4(%s) -> (%b)\n",  str3, str4, nestr4);
		
		// ���ڿ��� ���� ��
		boolean str1n3 = str1.equals(str3);
		System.out.printf("String.equals: str1(%s) == str3(%s) -> (%b)\n",  str1, str3, str1n3); // ����(true)
		
	}

}
