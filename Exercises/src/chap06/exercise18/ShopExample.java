package chap06.exercise18;

public class ShopExample {

	public static void main(String[] args) {
		ShopService svc1 = ShopService.getInstnace();
		ShopService svc2 = ShopService.getInstnace();
		
		if(svc1 == svc2) {
			System.out.println("(svc1 == svc2) ���� ���� ��ü�̴�.");
		}
		else {
			System.out.println("(svc1 == svc2) �ٸ� ���� ��ü�̴�.");
		}

		System.out.println("x=" + svc1.getX());
		
		// ShopService svc = new ShopService();
		/*
		// StackOverflowError
		ShopService svc3 = svc1.getInstnace2();
		if(svc1 == svc3) {
			System.out.println("(svc1 == svc3) ���� ���� ��ü�̴�.");
		}
		else {
			System.out.println("(svc1 == svc3) �ٸ� ���� ��ü�̴�.");
		}
		*/
	}

}
