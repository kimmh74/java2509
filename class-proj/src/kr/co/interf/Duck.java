package kr.co.interf;

import kr.co.inheit.Animal;

public class Duck extends Animal implements Flyable, Walkable,Swimmable {

	public Duck(String name, int age) {
		//super(); 생략가능 - Animal클레스에 있음.
		
	}

	@Override
	public void Swim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

}
