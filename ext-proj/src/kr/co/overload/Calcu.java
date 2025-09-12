package kr.co.overload;

public class Calcu {

	// 계사기 메인역할
	public Calcu() {

		Calculator calc1 = new Calculator();
		Calculator calc2 = new Calculator();

		 Calculator.initCnt();
		System.out.println("연산전resultCnt: "+ Calculator.getCnt());
		
		
////	 calc1.add(5, 3, 0.8);
//		
		//리턴값이 없는 메소드 수행
//		 calc1.add(5, 3);
//		
//		
//		//리턴값이 있는 메소드 수행
//		int result2 = calc2.add(7, 8);

		// num1 = 5, num2 = 3 ==> int 타입(타입중요)
		// int result1 =8;
//		int resultCnt;
//		resultCnt =  Calculator.getCnt();
//		System.out.println("resultCnt: "+ resultCnt);
//		
		
		// 메소드 오버로딩
		int result1 = calc1.add(5, 3);
		double result2 = calc2.add(2.2, 3.3);
		int result3 = calc2.add(5, 3, 2);

//연산결과		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);


//		calc1.cnt =100;  ---1
		// 정적변수....2 class 명....
//		Calculator.cnt = 99;

		int resultCnt;
		resultCnt =  Calculator.getCnt();
		System.out.println("연산후resultCnt: "+ resultCnt);
		
		
		
		
		 Calculator.initCnt();
		System.out.println("초기화resultCnt: "+ Calculator.getCnt());
		

//		    Calculator.total = 1000;
		
		
		
		
		

	}

}
