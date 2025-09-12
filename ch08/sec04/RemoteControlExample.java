package ch08.sec04;

import ch08.sec02.Audio;

public class RemoteControlExample {
	public static void main(String[] args) {
		//인터페이스 변수 선언
		RemoteControl rc;
		
		//Televisio 객체를 생성하고 인터페이스 변수에 대입
		rc = new Television();
		rc.turnOn();
		
		//rc 변수에 Audio 객체를 대입(교체시킴)
		rc = new Audio();
		rc.trunOn();
		rc.setVolume(5);
		rc.turnOff();

	}

}
