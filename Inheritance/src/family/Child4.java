/*
 * �θ� ������ �ִ� �ʵ�(money)�� �ڽ��� �ٽ� ���� �� �� �ִ�.
 * �θ��� �޼ҵ带 ���ؼ� �θ�� �ڽĿ� ���� �� �ʵ�(money)�� �����ϰ� �Ǹ�
 * �ڽ��� �ʵ�(money)�� �ƴ� �θ��� �ʵ�(money) ���� �����ϰ� �ȴ�.
 */
package family;

public class Child4 extends Parent {
	int money = 900;
	int stock = 700;
	
	Child4() {
		// super();
		// super(200);
		super("400");  // �θ��� �����ڸ� ȣ��
		System.out.printf("Child4.Child4(%d)\n", this.money);
		this.money += super.money;
	}
	
	/*
	 * �޼ҵ� ������(Overriding)
	 * �θ�(Parent)�� ���ǵǾ� �ִ� �޼ҵ�(print)�� �ڽ�(Child)���� ������(overriding)
	 * ������(��ü)�� ��Ӱ��迡 ���� �� �ڽ� Ŭ�������� �޼ҵ带 ��ü�� �� ���
	 */
	void print(String title) {
		int parentMoney = super.money;
		
		System.out.printf("Parent: [%s] money=(parent:%d)(%d), stock(%d)\n", 
				title, parentMoney, this.money, this.stock);
	}
	
	int addStock(int stock) {
		this.stock += stock;
		return this.stock;
	}
}
