/*
 * �̱���(Singleton)
 *   - ������ �ϳ��� ��ü�� �����ȴ�.
 */
package statics;

public class Seriesx2 {
	static Seriesx2 static_series = new Seriesx2(1);
	int series = 0;
	int count = 1;

	// �� �޼ҵ带 ȣ���ϰ� �Ǹ� �̹� ������� static_series�� �����Ͽ�
	// ������ �ϳ��� ����ϵ��� �����Ͽ�
	static Seriesx2 getInstance(int count) {
		// Seriesx2 series = Seriesx2.static_series;
		// series.setCount(count);
		Seriesx2.static_series.setCount(count);
		
		return Seriesx2.static_series;
	}

	//-----------------------------------------------
	// private�� �ܺο��� new�� �� �� ����
	//-----------------------------------------------
	private Seriesx2(int count) {
		this.count = count;
	}
	//-----------------------------------------------
	
	void setCount(int count) {
		Seriesx2.static_series.count = count;
	}
	
	
	int getSeries() {
		series += count;
		return series; 
	}

	String makeModel(String pid) {
		String str = String.valueOf(getSeries());
		String model = pid + "-S-" + str;
		return model;
	}
}
