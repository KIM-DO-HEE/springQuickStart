package com.biz.tv;

public class AppleSpeaker implements Speaker {

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("Apple Speaker -- 소리 울린다");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("Apple Speaker -- 소리 내린다");
	}

}
