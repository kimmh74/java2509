package ch04.sec03;

public class SwitchNoBreakCaseExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int time = (int) (Math.random() * 4) + 8;  // 8<= ..... <=11 사이의 정수 뽑기
		double ran = Math.random();
		System.out.println(ran);
		
		double ran2 = ran * 4;
		System.out.println(ran2);
		
		int ran3 = (int) (ran * 4);
		System.out.println(ran3);
		
		int time = ran3 + 8;
		System.out.println("8더한 값:" + time + "-------");

		switch (time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다..");
		case 10:
			System.out.println("업무를 합니다..");
		case 11:
			System.out.println("외근을 합니다..");
		}

	}

}
