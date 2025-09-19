package kr.co.poly;

import kr.co.ext.Animal;
import kr.co.ext.Cat;
import kr.co.ext.Dog;

public class PolyClass {
	public PolyClass() {

		// 부모타입으로 받은... 다형성,,, 배열/// 업캐스팅....upcasting....
		Animal[] ani = { new Dog("바둑이", 5, "진돗개"), new Cat("나비", 3, false), new Dog("체리", 2, "푸들"),
				new Cat("까망이", 4, true) };

		System.out.println("----- 다형성 배열로 구성된 객체의 값 접근하기 -------");
		for (Animal a : ani) {
			// 다형성 - 각각의 오버라이드된 메서드 호출

			System.out.println("**" + a.getName());
			a.makeSound();
		}
		System.out.println("================자식객체의 특성값 접근================");

		for (Animal a : ani) {
			if (a instanceof Dog) {
				// 임시변수 : 타입적용울 위해서_다운태스팅...downcasting
				Dog d = (Dog) a;
				d.wagTail();
			} else if (a instanceof Cat) {
				Cat c = (Cat) a;
				c.climb();

			}

		}

	}

}
