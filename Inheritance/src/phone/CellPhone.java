package phone;

public class CellPhone {
	String model;
	String color;
	
	void powerOn() {
		System.out.println("�����ѱ�");
	}
	
	void powerOff() {
		System.out.println("��������");
	}
	
	void bell() {
		System.out.println("���Ҹ�");
	}
	
	void sendVoice(String message) {
		System.out.println("�ڱ�:"  + message);
	}
	
	void receiveVoice(String message) {
		System.out.println("����:" + message);
	}
	
	void hangUp() {
		System.out.println("��ȭ����");
	}
}
