package com.biz.tv;

public class LgTV implements TV {

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("LGTV 전원 켠다");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("LGTV 전원 끈다");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("LGTV 볼륨 높인다");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("LGTV 볼륨 줄인다");
	}

}
