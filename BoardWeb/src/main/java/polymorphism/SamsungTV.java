package polymorphism;

public class SamsungTV implements TV {
	
	public SamsungTV() {
		System.out.println("SaumsungTV ��ü ����");
	}
	
	public void initMethod() {
		System.out.println("��ü �ʱ�ȭ �۾� ó��..");
	}
	
	public void destroyMethod() {
		System.out.println("��ü ���� ���� ó���� ���� ó��..");
	}
	
	public void powerOn() {
		System.out.println("SamsumgTV --- ���� �Ҵ�");
	}
	public void powerOff() {
		System.out.println("SamsumgTV --- ���� ����");
	}
	public void volumeUp() {
		System.out.println("SamsumgTV --- �Ҹ� �ø���");
	}
	public void volumeDown() {
		System.out.println("SamsumgTV --- �Ҹ� ������");
	}
	
}
