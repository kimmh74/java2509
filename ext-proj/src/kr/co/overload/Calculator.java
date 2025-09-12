package kr.co.overload;

public class Calculator {

//	int cnt;---1
	// 정적변수... 2(초기값=0;)을 주고 시작함.
	static int cnt = 0;
	// 반드시 ,,,,, 클레스를 통해서 접근해야 한다.
	// 자바만의 원칙.....
//    static int total;

	static int getCnt() {
		//
		return cnt;
	}

	public static void initCnt() {
		cnt = 0;
	}

	// add( 5, 3)
//	8        int add(int num1, int num2)

	// 정수8 = 정수5 + 정수3
	public int add(int num1, int num2) {
		++cnt;
		return num1 + num2;
	}

	// 실수5.5 = 실수2.2 + 실수3.3
	public double add(double num1, double num2) {
		++cnt;
		return num1 + num2;
	}

	// 정수10 = 정수5 + 정수3 + 정수2 (타입이랑...갯수...중요하게 java)
	public int add(int num1, int num2, int num3) {
		++cnt;
		return num1 + num2 + num3;
	}

}
//	public int add(int i, int j) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

//	public void add(int i, int j) {
//		
//		}
//	
//	
//	
//	
//	public int add(int i, int j) {
//	
//		return i+j;
//	}

//	public void add(int i, int j, double d) {
//		// TODO Auto-generated method stub
//		
//	}

//	public void(..내보낼값) 함수(들어오는 매개값int + int) {
//	  return(내보낼값을 써줘야함.=>어떤 타입??? int)
//	}

//	public int 함수(들어오는 매개값int, int) {
//	  return(내보낼값을 써줘야함.=>어떤 타입??? int)
// return(int)
//	}

//	TYPE add(x,y){
//		return x+y;  타입이 중요

//	int add(int x,int y){
//		return x+y;
