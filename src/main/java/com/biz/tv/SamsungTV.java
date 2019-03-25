package com.biz.tv;

public class SamsungTV implements TV {
	private AppleSpeaker speaker;
	private int price;
	public SamsungTV(AppleSpeaker speacker, int price) {
		System.out.println("SamsungTV ��ü ����");
		this.speaker = speacker;
		this.price = price;
	}
	
	public void initmethod() {
		System.out.println("��ü �ʱ�ȭ �۾� ó��");
	}
	
	public void destroymethod() {
		System.out.println("��ü ���� �۾� ó��");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV ���� �Ҵ� (����:"+price+")");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV ���� ����");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		//System.out.println("SamsungTV ���� ���δ�");
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		//System.out.println("SamsungTV ���� ���δ�");
		speaker.volumeDown();
	}
	
}
