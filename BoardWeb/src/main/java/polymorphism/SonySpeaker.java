package polymorphism;

import org.springframework.stereotype.Component;

@Component("sony")
public class SonySpeaker implements Speaker  {
	
	public SonySpeaker() {
		System.out.println("====> 소니 스피커 객체 생성");
	}
	
	public void volumeUp() {
		System.out.println("sony 볼륨 올린다");
	}
	
	public void volumeDown() {
		System.out.println("sony 볼륨 내린다");
	}

}
