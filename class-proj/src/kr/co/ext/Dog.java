package kr.co.ext;

public class Dog extends Animal {
	// 선언부 - 값을 선언하는 부분
	String breeds;

	// 컨스트럭터....constructor..
	public Dog(String name, int age, String breeds) {
		// new Dog)"멍멍이",3,"골든리트리버");
		super(name, age);
		// 구현부 - 값을 넣는 부분
		this.breeds = breeds;

	}

	public void wagTail() {
		System.out.println("개가 꼬리를 살랑");
	}

//	public void makeSound() {
//		super.makeSound();
//		System.out.println("멍멍");
//		
//	}

	@Override
	public void makeSound() {
		System.out.println("멍멍");
		super.makeSound();
	}

//	public Dog() {
//		
//	}

}
