package polymorphism;

import org.springframework.stereotype.Component;

@Component("apple")
public class AppleSpeaker implements Speaker{
	
	public AppleSpeaker() {
		System.out.println("===> Apple ����Ŀ ��ü ����");
	}
	@Override
	public void volumeUp() {
		System.out.println("���� ����Ŀ > �Ҹ� �ø��� ");
		
	}
	
	@Override
	public void volumeDown() {
		System.out.println("���� ����Ŀ > �Ҹ� ������.");		
	}

}
