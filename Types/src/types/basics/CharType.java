/*
 * ����Ÿ��(char)
 * 1. 2����Ʈ ���� ����(0~65535, 0x0000~0xffff)
 * 2. �����ڵ�(Unicode) 2����Ʈ
 * 3. ��������ǥ(')�� ���Ѵ�.
 */

package basics;

public class CharType {

	public static void main(String[] args) {
		char ch = 65;
		char chA = 0x41;
		char chA1 = 0x0041;		
		char A = 'A';
		char a = 'a';
		char han = '��';
		char uc = '\uac00';
		
		System.out.println(ch);
		System.out.println(chA);
		System.out.println(chA1);
		System.out.println(A);
		System.out.println(a);
		System.out.println(han);
		System.out.println(uc);
	}
}
