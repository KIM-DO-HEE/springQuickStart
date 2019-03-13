package com.biz.tv;

public class SamsungTV implements TV {
	public SamsungTV() {
		System.out.println("SamsungTV °´Ã¼ »ı¼º");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV Àü¿ø ÄÒ´Ù");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV Àü¿ø ²ö´Ù");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV º¼·ı ³ôÀÎ´Ù");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV º¼·ı ÁÙÀÎ´Ù");
	}
	
}
