/*
 * ���(�Һ��� ��)
 *   - static final type constant = value
 *   - ������ �� �ʱⰪ�� �����ϰų�
 *   - ������Ͽ��� �ʱⰪ�� �����ؾ� �Ѵ�.
 */
package finalconst;

public class RandomCounter {
	static final int MAX_RANDOM_COUNT = 100;
	
	int[] values = new int[MAX_RANDOM_COUNT];
	
	RandomCounter() {
		int cnt=0;
		
		while(true) {
			if(cnt >= MAX_RANDOM_COUNT) {
				break;
			}
			
			values[cnt++] = (int)(Math.random() * 101 + 1);
		}
	}
	
	void print() {
		for(int cnt=0; cnt < MAX_RANDOM_COUNT; cnt++) {
			System.out.printf("value[%d][%d]\n", cnt, values[cnt]);
		}
	}

	public static void main(String[] args) {
		System.out.printf("[�����߻���]\n");
		System.out.printf("������ ����: %d�� \n", MAX_RANDOM_COUNT);
		
		RandomCounter earth = new RandomCounter();
		earth.print();
	}
}
