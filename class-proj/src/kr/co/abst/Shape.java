package kr.co.abst;

public abstract class Shape {
	public Shape() {
		
	}

	//추상메소드 : 구현부가 없다... 메소드 정의만 했다... 1개라도 가지고 있으면 추상클래스다.자식한테 물려줘서 구현을한다.. 자식 필수..
	abstract String getShapeType();

}
