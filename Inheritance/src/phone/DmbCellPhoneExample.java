package phone;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		
		System.out.println("DmbCellPhone.channel=" + dmbCellPhone.channel);
		
		// ��ӹ��� �θ��� �޼ҵ�
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("�ȳ��ϼ���");
		dmbCellPhone.receiveVoice("�ݰ����ϴ�");

		// �ڽ��� �޼ҵ�
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(11);
		dmbCellPhone.turnOffDmb();	
		System.out.println("DmbCellPhone.channel=" + dmbCellPhone.channel);
	}

}
