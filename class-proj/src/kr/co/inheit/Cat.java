package kr.co.inheit;

public class Cat extends Animal {

	boolean isIndoor;

	// 나의 extends Animal...부모를 초기화하는 공통된 내용..super를 달아줘야 한다. name... gae... 공통
	public Cat(String name, int age, boolean isIndoor) {
		super(name, age);
		this.isIndoor = isIndoor;
	}

	public void climb() {
		System.out.println("cat-점프점프");

	}

	@Override // 부모 Animal에 있는 속성을 커스터마이징 했다는 개발자의 설명이라 생각....Override.....
	public void eat() {
		super.eat();
		System.out.println(this.name + "가 츄루를 먹어요.");

	}

	// boolean값을 추가하기는 방법.... 3항연산자....... true/false...... 초기값 true..? "예" :"아니오"
	@Override
	public void displayinfo() {
		super.displayinfo();
		System.out.println("실내묘: " + (isIndoor ? "예" : "아니요"));
	}

}
