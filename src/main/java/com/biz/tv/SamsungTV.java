package com.biz.tv;

public class SamsungTV implements TV {
	public SamsungTV() {
		System.out.println("SamsungTV ��ü ����");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV ���� �Ҵ�");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV ���� ����");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV ���� ���δ�");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV ���� ���δ�");
	}
	
}
