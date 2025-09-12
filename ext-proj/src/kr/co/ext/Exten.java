package kr.co.ext;

public class Exten {

	public static Exten ext;

	public Exten() {
		// 상속 기능 구현

		System.out.println("===========================================");

		// 최상위 클래스 Animal
//		Dog dog = new Dog();
//		Cat cat = new Cat();
//		Dog dog = new Dog("똘이", 2);
//		Cat cat = new Cat("나비", 3);
		Dog dog = new Dog("똘이", 2, "골든리트리버");
		Cat cat = new Cat("나비", 3, "페르시안");
		/*
		 * System.out.println(dog.name+dog.age+dog.breeds);
		 * System.out.println(Cat.name+Cat.age+Cat.breeds);
		 */

//		dog.name = "나는 멍멍이";
//		cat.name = "나는 야옹이";

		System.out.println(dog.name + dog.age);
		System.out.println(cat.name + cat.age);

		System.out.println(dog);
		System.out.println(cat);

		System.out.println("<<품종==확인방법>>");

		System.out.println(dog.name + dog.age + dog.breeds);
		System.out.println(cat.name + cat.age + cat.breeds);

		System.out.println("===========================================");
		//@OVerride -- toString(_) class를 이용해서 인자를 받아 화면에 출력
//		System.out.println(dog.toString());
//		System.out.println(dog.displayInfo());
//		System.out.println(cat.displayInfo());
		dog.displayInfo();
		System.out.println("------------------------");
		cat.displayInfo();
		System.out.println("------------------------");
		dog.sound();
		cat.sound();
		
	}
}
