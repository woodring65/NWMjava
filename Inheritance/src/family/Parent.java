package family;

public class Parent {
	int money = 100;
	
	Parent() {
		System.out.printf("Parent.Parent(%d) 1\n", this.money);
	}

	Parent(int money) {
		this.money = money;
		System.out.printf("Parent.Parent(%d) 2\n", this.money);
	}
	
	/*
	 * �����ڳ� �޼ҵ��� �Ķ���ʹ� ���������� �ĺ����� �ʴ´�.
	 * �ñ״�ó: ����Ÿ��, �޼ҵ��̸�, �Ķ���� Ÿ��
	 *   -> �Ķ������ �������� �ñ״�ó�� �ش����� ����
	Parent(int money1) {
		this.money = x;
		System.out.printf("Parent.Parent(%d) 2\n", this.money);
	}
	*/
	
	Parent(String strMoney) {
		this.money = Integer.parseInt(strMoney);
		System.out.printf("Parent.Parent(%d) 3\n", this.money);
	}

	void print(String title) {
		System.out.printf("Parent: [%s] money=(%d)\n", title, this.money);
	}
}
