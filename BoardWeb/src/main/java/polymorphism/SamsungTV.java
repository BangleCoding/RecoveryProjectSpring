package polymorphism;

public class SamsungTV implements TV{
	
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("======> 1. 伙己 按眉积己");
	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker()龋免");
		this.speaker = speaker;
	}
	public void setPrice(int price) {
		System.out.println("===> setPrice()龋免");
		this.price = price;
	}
	public SamsungTV(Speaker speaker) {
		System.out.println("======> 2. 伙己 按眉积己 2");
		this.speaker = speaker;
	}
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("======> 3. 伙己 按眉积己 3");
		this.speaker = speaker;
		this.price = price;
	}
	public void powerOn() {
		System.out.println("samsung tv - turn on 啊拜 : " + price);
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
