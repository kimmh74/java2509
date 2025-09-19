package kr.co.ext;

import kr.co.inter.Swimmable;
import kr.co.inter.Walkable;

public class Duck extends Animal implements Swimmable,Walkable {

	public Duck(String name, int age) {
		//Animal.java 부모를 참조.....
	super(name,age);
	}

	@Override
	public void walk() {
		System.out.println("뒤뚱뒤뚱 걷는다.");
		
	}

	@Override
	public void swim() {
		System.out.println("퐁당퐁당 수영해요.");
		
	}

}
