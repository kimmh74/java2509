package kr.co;

import kr.co.abstrac.AbstractClass;
import kr.co.cls.BasicClass;
import kr.co.inheit.InheritClass;
import kr.co.interf.InterfaceClass;

public class ExClass {

	public static void main(String[] args) {

//		System.out.println("test");  -----최초 확인작업.......

		// 기본클레스 연습
		BasicClass basicClass = new BasicClass();

		System.out.println("=================================================");
		System.out.println("============상속 연습   ==============================");

		// 상속 연습
		InheritClass inheritClass = new InheritClass();

		System.out.println("=================================================");
		System.out.println("============추상클래스 연습  ========명확하지않아 객체가 될수 없는 클래스 =부모클래스..매인도 X, 자식도 X=");

		AbstractClass abstractClass = new AbstractClass();
		
		System.out.println("=================================================");
		System.out.println("============인터페이스 연습   ==============================");
		
		InterfaceClass interfaceclass = new InterfaceClass();

	}

}
