/*
 * ��Ʈ��(���ڿ�) ��ü
 * �⺻Ÿ���� �ƴϸ� Ŭ���� Ÿ��
 * String ������ ���� ����(*)
 * ���ڿ��� ���ڵ��� ����
 * ū����ǥ(")�� ���ڿ��� ���´�.
 * ��������: 
 */
package basics;

public class StringObject {

	public static void main(String[] args) {
		String empty = ""; 			// ���ڿ�
		String name = "ȫ�浿";
		String alphabet = "abcdefg";
		String hello = "Hello";
		String world = "World";
		String helloworld = hello + ", " + world; // plus(+)�� ���ڿ��� ���� �� �� �ִ�.
		
		System.out.println("empty=" + "[" + empty + "]");
		System.out.println(name);
		System.out.println(alphabet);
		System.out.println(hello);
		System.out.println(world);
		System.out.println(helloworld);
	}

}
