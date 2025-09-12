package kr.co.abstrac;

//추상 클래스 :   <=   반대   => 명확한...클래스..
public class AbstractClass {
	//도형만들기: color, 위치(x , y,위치값), 원(반지름r), 사각형(w위드,h하이) -- 필수 메소드를 만들어야함다.
	public AbstractClass (){
	Circle circle = new Circle("red",10.0,10.0,5);
	Rectangle rectangle = new Rectangle("blue",30.0,10.0,8.0,5.0);

	System.out.println(circle.getShapeType());
	System.out.println(rectangle.getShapeType());
}
}
