package statics;

public class SeriesxModel2 {
	// Seriesx2�� �����ڰ� private���� �����Ǿ� �ֱ� ������ ������ �� �� ����.
	// ��ü�� new�� ���� �� ����.
	// Seriesx2 series = new Seriesx2(10);
	
	String pid;
	String model;
	
	SeriesxModel2(String pid) {
		this.pid = pid;
	}
	
	void makeProduct() {
		// Seriesx2 series = Seriesx2.getInstance(5);
		// this.model = series.makeModel(this.pid);
		this.model = Seriesx2.getInstance(5).makeModel(this.pid);
	}
	
	void printProduct() {
		System.out.printf("Product: pid(%s), model(%s)\n", this.pid, this.model);
	}

	public static void main(String[] args) {
		SeriesxModel2 sm1 = new SeriesxModel2("SM1");
		sm1.makeProduct();
		sm1.printProduct();
		
		SeriesxModel2 sm2 = new SeriesxModel2("SM2");
		sm2.makeProduct();
		sm2.printProduct();
	}
}
