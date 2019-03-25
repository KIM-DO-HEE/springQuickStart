package com.biz.tv;

public class SamsungTV implements TV {
	private AppleSpeaker speaker;
	private int price;
	public SamsungTV(AppleSpeaker speacker, int price) {
		System.out.println("SamsungTV 객체 생성");
		this.speaker = speacker;
		this.price = price;
	}
	
	public void initmethod() {
		System.out.println("객체 초기화 작업 처리");
	}
	
	public void destroymethod() {
		System.out.println("객체 종료 작업 처리");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV 전원 켠다 (가격:"+price+")");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV 전원 끈다");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		//System.out.println("SamsungTV 볼륨 높인다");
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		//System.out.println("SamsungTV 볼륨 줄인다");
		speaker.volumeDown();
	}
	
}
