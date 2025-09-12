package kr.co.inheit;

public class InheritClass {
	public InheritClass() {

		// 생성자.... new로 obj를 만들어야함.
		Dog dog = new Dog("멍멍이", 3, "골든리트리버");
		Cat cat = new Cat("야옹이", 2, true);

		System.out.println("=====강아지=======");

		dog.displayinfo();
		dog.eat();
		dog.makeSound();
		// 공통만 먼저...method만 만들어서...dog에서 Animal에 복사해줌....cat에 오류가 사라진다..(중요)

		// 각자속성..따로 만든다.dog
		dog.wagTail();

		System.out.println("==== dog/cat 공통된 method를 Animal로 복사하고.. 삭제한다. 공통된 정보======중요함.==========");
		System.out.println("=====고양이======");
		cat.displayinfo();
		cat.eat();
		cat.makeSound();

		// 각자속성..따로 만든다. cat
		cat.climb();

	}

}
