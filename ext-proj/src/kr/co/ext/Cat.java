package kr.co.ext;

//Animal 클래스 상속을 확장한다.. 통합된 기능의확장 DOG/CAT에 확장extends...Animal
//그다음에..초기화
public class Cat extends Animal {
//
//	String name;

	String breeds;

	// 기본초기화(부모기본초기화)
	public Cat() {
		super();
	}

	public Cat(String name, int age) {
		super(name, age);
	}

	public Cat(String name, int age, String breeds) {
		super(name, age);
		this.breeds = breeds;
	}

//	public String displayInfo() {
//		return "Cat [breeds=" + breeds + "]";
//	}
	public void displayInfo() {
		super.displayInfo();
	System.out.println("Cat: "+this.breeds);
}
	
	
	//부모의 sound를 이용하기위해서 sound를 치면 오버라이드를 참조하여 추가한다.
	@Override
	public void sound() {
			super.sound();
			System.out.println(name+"가 야옹 야옹 운다.");
	}
	
	
	
}
