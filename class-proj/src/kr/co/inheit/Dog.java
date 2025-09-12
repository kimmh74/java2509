package kr.co.inheit;

//나의 extends Animal...부모를 초기화하는 공통된 내용..super를 달아줘야 한다.name... gae... 공통
public class Dog extends Animal {

	String breeds;

	public Dog(String name, int age, String breeds) {
		super(name, age);
		this.breeds = breeds;
	}

//	System.out.println("==== dog method를 Animal로 복사하고.. 삭제한다. 공통된 정보================");
//	public void displayinfo() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void eat() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void makeSound() {
//		// TODO Auto-generated method stub
//		
//	}

	public void wagTail() {
		System.out.println("dos-꼬리를 흔든다");

	}

	@Override
	public void eat() {
		super.eat();
		System.out.println(this.name + "가 뼈다귀를 먹어요.");
	}

	@Override
	public void displayinfo() {
		super.displayinfo();
		System.out.println("강아지:" + this.name);
		System.out.println("강아지:" + this.age);
	}
}
