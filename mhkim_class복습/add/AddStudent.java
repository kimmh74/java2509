package com.net.mhkim.add;

public class AddStudent {

	public AddStudent() {
		// EX1. 객체 생성
				System.out.println("EX1. 객체 생성");
				Student st = new Student();
				Student st1 = new Student();
//				Student1 st1 = null;
//				int cnt = 0;

				System.out.println(st);
				System.out.println(st1);
//				System.out.println(cnt); 

				System.out.println();
				System.out.println("================================================");

				// EX2. 객체 생성 및 속성 정의와 사용..객체방식 접근법
				System.out.println("EX2. 객체 생성 및 속성 정의와 사용");

				Student2 st2 = new Student2();
				st2.name = "김명횡";
				st2.age = 30;
				st2.studentId = "20250910";

				System.out.println(st2.name);
				System.out.println(st2.age);
				System.out.println(st2.studentId);

				System.out.println();
				System.out.println("================================================");

				// EX3. 객체생성, 메소드(함수) 정의와 사용,
				System.out.println("EX3. 객체생성, 메소드(함수) 정의와 사용,");

				Student3 st3 = new Student3();
				st3.intruduce();
				st3.study();

				System.out.println();
				System.out.println("================================================");

				// EX4. 생성자 constructor
				System.out.println("EX4. 생성자 constructor");

				// 선언부>> int num;
				Student4 st4;

				// 구현부>> num =10 st4 = new Student4();
				st4 = new Student4();

				System.out.println();
				System.out.println("================================================");

				// EX5. 객체 생성자(argument 전달 및 사용)
				System.out.println("EX5. 객체 생성자(argument 전달 및 사용)");

				Student5 st5;
				st5 = new Student5();

				Student5 st5_a = new Student5("희찬");
				Student5 st5_b = new Student5("지현", 29);
				Student5 st5_c = new Student5("창일", 22, "20250722");

				System.out.println();
				System.out.println("================================================");

				// EX6. 1~5번 종합 : 객체생성,필드생성,생성자에서 필드초기화, 메서드 생성
				System.out.println("EX6. 1~5번 종합 : 객체생성,필드생성,생성자에서 필드초기화, 메서드 생성");

				Student6 st6;
				//기본생성자
				st6 = new Student6();
				
				//매개1개
				Student6 st6_a = new Student6("주환");
				
				//매개2개_필수 필드입력
				Student6 st6_b = new Student6("20250808", "근철");
				
				//매개3개_전체 필드입력
				Student6 st6_c = new Student6("20250809", "지민",25);
				
				System.out.println(st6_a.name);
				System.out.println("------------------------------");
				System.out.println(st6_b.stId);
				System.out.println(st6_b.name);
				System.out.println(st6_b.age);     // 초기화값이 온다.
				System.out.println("------------------------------");
				System.out.println(st6_c.stId);
				System.out.println(st6_c.name);
				System.out.println(st6_c.age);   
				
				System.out.println();
				System.out.println("================================================");

				// EX7. method 함수 : 액션_행동 => 버튼 컨퍼넌트라 생각하면됨.
				System.out.println("EX7. method 함수 : 액션_행동 => 버튼 컨퍼넌트라 생각하면됨.");
				
				st6_a.introduce();
				st6_c.introduce();
						
				st6_b.study();
				st6_c.study();
				
				
	}
	
}
