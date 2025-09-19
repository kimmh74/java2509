package kr.co.ext;

public class Cat extends Animal {

	boolean isInDoor;

	public Cat(String name, int age, boolean isInDoor) {
		super(name, age);
		this.isInDoor = isInDoor;
	}

//	public void makeSound() {
//		super.makeSound();
// System.out.println("야옹야옹");		
//	}

	@Override
	public void makeSound() {
		System.out.println("야옹야옹");
		super.makeSound();
	}

	public void climb() {
		System.out.println("고양이가 점프 3단점프");
	}
	
	
//	public Cat() {
//		
//	}
}
