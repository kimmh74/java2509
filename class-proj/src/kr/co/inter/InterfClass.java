package kr.co.inter;

import kr.co.ext.Bird;
import kr.co.ext.Duck;

public class InterfClass {

	public InterfClass() {
		//이름,나이,날개폭
		Bird bird = new Bird("참새",1,25.5);
		Duck duck = new Duck("도널드",3);
		
		bird.makeSound();
	    bird.walk();
		bird.fly();
	    System.out.println("------------------------");
		duck.makeSound();
		duck.walk();
		duck.swim();
	    System.out.println("=====================================");
		
// 인터페이스를 타입으로 사용해보자
		Walkable[] walkAni = {bird,duck};
		for (Walkable w : walkAni) {
			w.walk();
		}
		
		// 다형성 인터페이스
		testWalk(bird);
		testWalk(duck);
		testSwim(duck);	
			
	}

	public static void testWalk(Walkable walkable) {
		walkable.walk();
	}
	
//	private void testWalk(Walkable walkable) {
//		walkable.walk();
//		
//	}

	private void testSwim(Swimmable swimmer) {
		swimmer.swim();
		
	}

}
