package co.kmh.generics;

public class GenericsMain {
	//    암묵적인 TYPE을 쓰겠다.  {"제니","리암"};
	//                          {1,2,3};
	private  <T> void printArry(T[]arr) {
		for(T str : arr) {
			System.out.println(str);
		}
	}

	public GenericsMain() {
		
		Box<String> strBox = new Box<>();
		strBox.setValue("Hello");
		System.out.println("값은: "+ strBox.getValue());
		
		Box<Integer> intBox = new Box<>();
		intBox.setValue(50);
		System.out.println("값은: "+ intBox.getValue());
		
		System.out.println("========================================");
		
		
		//배열<String> 사용해보기
		String[]names = {"제니","리암"};
		printArry(names);
		
		//배열<Integer> 사용해보기
		Integer[]numbers = {1,2,3};
		printArry(numbers);
		
		System.out.println("========================================");
		
		Integer[] intNums = {10,20,30,40};
		Stats<Integer> intStats = new Stats<>(intNums);
		System.out.println("Integer평균: " + intStats.average());
		
		Double[] doubleNums = {1.5,2.5,3.5};
		Stats<Double> doubleStats = new Stats<>(doubleNums);
		System.out.println("Double평균: "+ doubleStats.average());
		
		
		
		
	}


	

}
