package com.biz.tv;

public class SonySpeaker implements Speaker {
	public SonySpeaker(){
		System.out.println("SonySpeaker °´Ã¼ »ý¼º");
	}
	
	public void volumeUp() {
		System.out.println("SonySpeaker º¼·ý ³ôÀÎ´Ù");
	}
	
	public void volumeDown() {
		System.out.println("SonySpeaker º¼·ý ³·Ãá´Ù");
	}
}
