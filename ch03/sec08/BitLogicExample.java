package ch03.sec08;

import java.nio.file.spi.FileSystemProvider;

public class BitLogicExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 25 = " + (45 | 25));
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("~45 = " + (~45));
		System.out.println("------------------------------------------------");

		// p95페이지----- 논리 연산자....

		byte receiveData = -120;

		
		System.out.println("========================================================");	
		// 정수 10의 2진수
		int num = 10;
		int num2 = 11;
		System.out.println(Integer.toBinaryString(num) + "---" + Integer.toBinaryString(num2));
		System.out.println("------------------------ 정수 10의 2진수값 출력함. ");

		// 2진수 1010,1011에 대한 10진수값
		System.out.println("------------------2진수 1010,1011에 대한 10진수값-------------------");
		byte[] dat = { 0b1010, 0b1011 };
		for (byte b : dat) {
			int val = b;
			System.out.println(val);
		}
		System.out.println("========================================================");
		System.out.println(
				"------------------------------------------------------------------------------------------------");
		;

		// 방법1 : 비트 논리곱 연산으로 Unsigned 정수 얻기
		int unsignedInt1 = receiveData & 255;
		System.out.println(unsignedInt1);

		// 방법2 : 자바 API를 이용해서 Unsigned 정수 얻기
		int unsignedInt2 = Byte.toUnsignedInt(receiveData);
		System.out.println(unsignedInt2);

		int test = 136;
		byte btest = (byte) test;
		System.out.println(btest);
	}

}
