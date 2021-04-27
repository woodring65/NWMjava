/*
 * ���(�Һ��� ��)
 *   - static final type constant = value
 *   - ������ �� �ʱⰪ�� �����ϰų�
 *   - ������Ͽ��� �ʱⰪ�� �����ؾ� �Ѵ�.
 * (Math.class)
 *   - public static final double PI = 3.14159265358979323846;
 */
package finalconst;

public class Earth {
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static { // �������
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
	
	public static void main(String[] args) {
		System.out.printf("������: (%f) \n", Math.PI);
		System.out.printf("������ ������: %f km \n", Earth.EARTH_RADIUS);
		System.out.printf("������ ǥ����: %f km^2 \n", Earth.EARTH_SURFACE_AREA);
	}
}
