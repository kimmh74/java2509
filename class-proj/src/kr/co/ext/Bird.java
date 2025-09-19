package kr.co.ext;

import kr.co.inter.Flyable;
import kr.co.inter.Walkable;

public class Bird extends Animal implements Flyable,Walkable {

	private double wingspan;
	
	public Bird(String name, int age, double wingspan) {
		super(name,age);
		this.wingspan = wingspan;
	}

	@Override
	public void walk() {
		System.out.println("총총총 걷는다.");
		
	}

	@Override
	public void fly() {
		System.out.println("훨훨 날아요");
		
	}
	
	// makeSound를 치면...Override할수 있음.....
	@Override
	public void makeSound() {
		System.out.println("짹짹짹");
		super.makeSound();
	}

	
}
