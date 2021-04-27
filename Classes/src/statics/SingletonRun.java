package statics;

public class SingletonRun {
	public static void main(String[] args) {
		// �ٸ� Ŭ������ �ִ� private���� ���ǵ� �����ڴ� new�� �� �� ����.
		// Singleton s1 = new Singleton();		
		
		Singleton s1 = new Singleton(10);		
		
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		System.out.println("(s1 == s2) ? : " + (s1 == s2));
		System.out.println("(s1 == s2) ? : " + (s1 == s3));

		System.out.println("(s2 == s3) ? : " + (s2 == s3));
	}

}
