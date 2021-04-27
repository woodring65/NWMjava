/*
 * �θ� ������ �ִ� �ʵ�(money)�� �ڽ��� �ٽ� ���� �� �� �ִ�.
 * �θ��� �޼ҵ带 ���ؼ� �θ�� �ڽĿ� ���� �� �ʵ�(money)�� �����ϰ� �Ǹ�
 * �ڽ��� �ʵ�(money)�� �ƴ� �θ��� �ʵ�(money) ���� �����ϰ� �ȴ�.
 */
package family;

public class Child3 extends Parent {
	int money = 900;
	int stock = 700;
	
	void print(String title) {
		int parentMoney = super.money; // �θ��� �Ӽ��� ����
		System.out.printf("Parent: [%s] money=(parent:%d)(%d), stock(%d)\n", 
				title, parentMoney, this.money, this.stock);
	}
	
	int addStock(int stock) {
		this.stock += stock;
		return this.stock;
	}
}
