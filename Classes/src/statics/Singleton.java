package statics;

public class Singleton {
	public static void main(String[] args) {
		System.out.println("Singleton: main()");
		Singleton.run();
	}

	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		System.out.printf("Singleton()\n");
	}
	
	Singleton(int x) {
		System.out.printf("Singleton(%d)\n", x);
	}
	
	static Singleton getInstance() {
		return singleton;
	}

	static void run() {
		System.out.println("Singleton: run()");
		
		Singleton s1 = new Singleton();		// �ڽ��� Ŭ���������� private�̾ ���� ����
		
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		System.out.println("(s1 == s2) ? : " + (s1 == s2));
		System.out.println("(s2 == s3) ? : " + (s2 == s3));
	}
	
}
