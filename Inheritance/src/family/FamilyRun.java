package family;

public class FamilyRun {

	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();

		boolean eq = (parent == child);
		System.out.println("[Parent == Child] : " + (eq));
		
		
		System.out.println("Parent: money=" + parent.money);
		System.out.println("Child: money=" + child.money);
		

		parent.print("�θ�");
		child.print("�ڳ�");
	}

}
