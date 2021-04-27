package phone;

public class DmbCellPhone extends CellPhone {
	int channel;
	
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;     // �θ��� �Ӽ�
		this.color = color;     // �θ��� �Ӽ�
		this.channel = channel; // �ڽ��� �Ӽ�
	}
	
	void turnOnDmb() {
		System.out.println("ä�� (" + channel + ")���� DMB ����� ����");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä�� (" + channel + ")�� ����");
	}
	
	void turnOffDmb() {
		System.out.println("DMB ����� ����");
	}
}
