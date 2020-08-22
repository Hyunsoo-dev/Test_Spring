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
		System.out.println("SaumsungTV 按眉 积己");
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("SaumsungTV 按眉 积己 (2)");
		this.speaker = speaker;
	}
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("SamsungTV 按眉 积己 (3)");
		this.speaker = speaker;
		this.price = price;
	}
	
	public void initMethod() {
		System.out.println("按眉 檬扁拳 累诀 贸府..");
	}
	
	public void destroyMethod() {
		System.out.println("按眉 昏力 傈俊 贸府且 肺流 贸府..");
	}
	
	public void powerOn() {
		System.out.println("SamsumgTV --- 傈盔 囊促 " + price + " 盔");
	}
	public void powerOff() {
		System.out.println("SamsumgTV --- 傈盔 馋促");
	}
	public void volumeUp() {
		
		speaker.volumeUp();
		
	}
	public void volumeDown() {
		
		speaker.volumeDown();
	}
	
}
