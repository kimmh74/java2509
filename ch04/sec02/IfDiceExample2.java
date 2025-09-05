package ch04.sec02;

public class IfDiceExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ran = Math.random();
		int num = (int)(ran*6)+1				;
		
		
		
		System.out.println("랜덤값은:??" + ran +"---");
		
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		}else if(num==2) {
			System.out.println("2번이 나왔습니다.");
		}else if(num==3) {
			System.out.println("3번이 나왔습니다.");
		}else if(num==4) {
			System.out.println("4번이 나왔습니다.");
		}else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		}else if(num==6) {
			System.out.println("6번이 나왔습니다.");
			
		}

	}

}
