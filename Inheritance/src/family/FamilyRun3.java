package family;

public class FamilyRun3 {

	public static void main(String[] args) {
		Parent parent = new Parent();
		Child3 child = new Child3();

		boolean eq = (parent == child);
		System.out.println("[Parent == Child] : " + (eq));
		System.out.println("[Parent == Child] : " + (parent == child));
		
		
		System.out.println("Parent: money=" + parent.money);
		System.out.println("Child: money=" + child.money);
		

		parent.print("�θ�");
		// parent.addStock(100); // �θ�� �ڽ��� �ʵ� �� �޼ҵ忡 ������ �� ����.
		
		child.addStock(200);
		child.print("�ڳ�");
	}

}
