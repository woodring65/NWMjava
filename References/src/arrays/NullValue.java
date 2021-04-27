package arrays;
/*
 * null value
 *  - ��ȿ�� ��
 *  - ����Ÿ���� ��(null) ���� ���� �� �ִ�.
 *  - ����Ÿ���� ���̸� ������ ���ÿ� �Ҵ��� �ǰ� ������ �Ҵ���� ���� ����
 * 
 */
public class NullValue {

	public static void main(String[] args) {
		String hello = null;
		
		System.out.println("hello=" + hello);
		// System.out.printf("hello(%s), length(%d) \n", hello, hello.length()); // java.lang.NullPointerException

		if(hello == null) {
			// hello = "hello, world";
			hello = new String("hello, world!");
		}
		
		System.out.printf("hello(%s), length(%d) \n", hello, hello.length());
	}

}
