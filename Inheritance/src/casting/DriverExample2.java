package casting;

public class DriverExample2 {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		
		vehicle.run();
		
		//�θ� ��ü�� ����ü�� �ڽ��� �ƴϸ�
		//������ ĳ������ ������ ���� ������ �߻�
		Bus bus= (Bus)vehicle;
		bus.run();
	}

}
