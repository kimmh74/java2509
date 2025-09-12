package kr.co.ext;

public class Dog extends Animal {

//	 //컨스트럭트 해야함.constructor
//String name;

	// 기본초기화(부모기본초기화)
//public Dog() {
//super();
//}

//super는 기본초기화.... 상속을 받고 초기화하는 방법..까지왔음.
//public Dog(String name, int age) {
//	super(name,age);
//}

	String breeds;

//
	public Dog(String name, int age, String breeds) {
		super(name, age);
		this.breeds = breeds;
	}

	
	public void displayInfo() {
		super.displayInfo();
	System.out.println("Dos: "+this.breeds);
}
	
//부모의 sound를 이용하기위해서 sound를 치면 오버라이드를 참조하여 추가한다.
	@Override
	public void sound() {
		super.sound();
		System.out.println(name+"가 멍멍 짖는다.");
	}
	
	
	
//	public String displayInfo() {
//				return "Dog [breeds=" + breeds + "]";
//	}



//	@Override
//	public String toString() {
//		return "Dog [breeds=" + breeds + "]";
//	}

}
