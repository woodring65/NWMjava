package casting;

public class DriverExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		//�θ� ��ü�� �ڽ� ��ü�� ������ ���� ����
		//Bus bus = vehicle;
		
		//������ ĳ������ �ؾ� ��
		//��. �θ� ��ü�� ����ü�� ĳ���� �Ǵ� �ڽ��̾�� �Ѵ�.
		Bus bus= (Bus)vehicle;
		bus.run();
	}

}
