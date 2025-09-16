package polymorphism;

public class SamsungTV implements TV{
	
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("======> 1. �Ｚ ��ü����");
	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker()ȣ��");
		this.speaker = speaker;
	}
	public void setPrice(int price) {
		System.out.println("===> setPrice()ȣ��");
		this.price = price;
	}
	public SamsungTV(Speaker speaker) {
		System.out.println("======> 2. �Ｚ ��ü���� 2");
		this.speaker = speaker;
	}
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("======> 3. �Ｚ ��ü���� 3");
		this.speaker = speaker;
		this.price = price;
	}
	public void powerOn() {
		System.out.println("samsung tv - turn on ���� : " + price);
	}
	public void powerOff() {
		System.out.println("samsung tv - turn off");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
}
