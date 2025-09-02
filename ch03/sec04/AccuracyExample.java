package ch03.sec04;

public class AccuracyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//실수연산보다 정수연산을 추천
		
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;

		double result = apple - number*pieceUnit;
		System.out.println("사과 1개에서 남은 조각: " + result);
		System.out.println("사과 1개에서 남은 양: " + result / 10.0);

	}

}
