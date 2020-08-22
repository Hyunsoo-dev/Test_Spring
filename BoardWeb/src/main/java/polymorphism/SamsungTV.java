package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")
public class SamsungTV implements TV {
	
	@Autowired
	private Speaker speaker;
	private int price;
	
//	public void setSpeaker(Speaker speaker) {
//		this.speaker = speaker;
//	}
//
//	public void setPrice(int price) {
//		this.price = price;
//	}

	public SamsungTV() {
		System.out.println("SaumsungTV ��ü ����");
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("SaumsungTV ��ü ���� (2)");
		this.speaker = speaker;
	}
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("SamsungTV ��ü ���� (3)");
		this.speaker = speaker;
		this.price = price;
	}
	
	public void initMethod() {
		System.out.println("��ü �ʱ�ȭ �۾� ó��..");
	}
	
	public void destroyMethod() {
		System.out.println("��ü ���� ���� ó���� ���� ó��..");
	}
	
	public void powerOn() {
		System.out.println("SamsumgTV --- ���� �Ҵ� " + price + " ��");
	}
	public void powerOff() {
		System.out.println("SamsumgTV --- ���� ����");
	}
	public void volumeUp() {
		
		speaker.volumeUp();
		
	}
	public void volumeDown() {
		
		speaker.volumeDown();
	}
	
}
