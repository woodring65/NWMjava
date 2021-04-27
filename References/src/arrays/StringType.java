package arrays;

public class StringType {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int c = a;

		System.out.println("a == b : " + (a == b)); // ������ ��
		System.out.println("c == a : " + (c == a)); // ������ ��

		// ������ ��
		String hello1 = "hello";
		String hello2 = "hello";
		String hello3 = hello1;

		System.out.printf("hello1 == hello2 : (%b)(%s) \n", (hello1 == hello2), hello1); // �ּҷ� ��
		System.out.printf("hello3 == hello1 : (%b)(%s) \n", (hello3 == hello1), hello3); // �ּҷ� ��
		
		String hello4 = hello1 + ", world";
		String hello5 = new String(hello4);
		System.out.printf("hello4 == hello5 : (%b)(%s)(%s) \n", (hello4 == hello5), hello4, hello5); // �ּҷ� ��
		
		// ���ڿ�(String)�� ���� ���ϱ� ���ؼ��� String.equals(String)
		System.out.printf("hello4.equals(hello5) : (%b), hello4(%s), hello5(%s) \n", hello4.equals(hello5), hello4, hello5);
	}
}
