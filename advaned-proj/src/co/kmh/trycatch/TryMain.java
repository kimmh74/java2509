package co.kmh.trycatch;

public class TryMain {
	public TryMain() {
		// ArrayIndexOutOfBoundsException
//		try {
//			int[] myNums = { 1, 2, 3 };
//			System.out.println(myNums[10]);
//		} catch (Exception e) {
//
//			//자바가 보여주는 오류 메세지.........빨강색
//			e.printStackTrace();
//			System.out.println("너의 인덱스는 틀렸어.. 너는 3개잖아 10번째는 없어.. ");
//			
//			// try 구문을 나가기전에 해야할 작업....
//		}finally {
//			System.out.println("끝~~~날때 try~ catch구문을 나기기전에 해야할일은 여기 작성한다. 수행");
//						
//		}

//		
//System.out.println("=========================================================");		
//		
//		// throw 키워드 : Exception 개발자 정의 오류.
//		chechAge(15);
//		
//	}
//
//	private void chechAge(int age) {
//
//		if (age < 18) {
//			throw new ArithmeticException("18세 미만은 입장이 제한됩니다.");
//		} else {
//			System.out.println("허가합니다.18세 이상이군요!!");
//		}

		// 다중 try ~ catch 구문

		int[] nums = { 1, 2, 3 };
		try {
			// 배열의 인덱스 try ~ catch...
			System.out.println(nums[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException: 배열의 인텍스 초과");
		}
		try {
			// 연산의 try ~ catch...
			int result = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException:연산오류");
		}
		try {
			// 배열의 인덱스 try ~ catch...
			System.out.println(nums[10]);
		} catch (Exception e) {
			System.out.println("Exception22:배열의 인덱스 초과오류");
		}

		try {
			// 연산의 try ~ catch...
			int result = 10 / 0;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception33:연산오류");
		}
		try {
			// 연산의 try ~ catch...
			int result = 10 / 0;
			int[] numbers = { 1, 2, 3 };
			System.out.println(numbers[10]);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException  e) {
			e.printStackTrace();
			System.out.println("Exception55:연산 + 배열 인덱스 오류");
		}

	}
}
