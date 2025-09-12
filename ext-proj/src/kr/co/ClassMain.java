package kr.co;

import kr.co.overload.Calcu;
import kr.co.ext.Exten;

public class ClassMain {

	public static void main(String[] args) {
		
		// 메소드 오버로드 == 상속을 배우기전에 배웠음
		//오버로드 = 계산기에서 배웠음/
		Calcu calc = new Calcu();
		
		// 상속.. ext 패키지..
		Exten.ext = new Exten() ;

	}

}
