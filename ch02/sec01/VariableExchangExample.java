package ch02.sec01;

public class VariableExchangExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=3;
		int y=5;
		System.out.println("X:"+ x + ",Y:"+ y );
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("--------------------------");
		System.out.println("X:" + x + ",Y:" + y);
		
		
		
	}

}
