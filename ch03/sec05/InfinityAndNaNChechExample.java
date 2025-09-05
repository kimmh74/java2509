package ch03.sec05;

public class InfinityAndNaNChechExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 5;
		double y = 0.0;
		//0으로 나누어 떨어지지 않으므로 무한대 infinity
		double z = x / y;
		// double z = x%y;

		// 잘못된 코드
		System.out.println(z + 2);

		// 알맞은 코드..........예외처리(중요...이런경우에 대비해라)
		if (Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		} else {
			System.out.println(z + 2);
		}

	}

}
