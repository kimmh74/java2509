package ch03.sec01;

public class SignOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = -100;
		x = -x;
		System.out.println("x:"+x);
		//int x = -(-x);
		
		byte b=100;
		int y = -b;
		//int y = -(100)
		System.out.println("y: "+y);

	}

}
