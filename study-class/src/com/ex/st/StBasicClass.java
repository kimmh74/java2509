package com.ex.st;

public class StBasicClass {

	public StBasicClass() {

		
		 //ex1.  
		
		  System.out.println("EX.1");
		
		
		Student st1 = new Student(); System.out.println(st1);
		
		  System.out.println();
			
		
		System.out.println("EX2. 클래스에 필드를 만드는 방법 field....... public은 위험 ..default..(생략가능..같은패키지에서 com.ex에서) 중요....");
		//ex2 . 클래스에 필드를 만드는 방법 field....... public은 위험 ..default..(생략가능..같은패키지에서 com.ex에서) 중요....
		 Student2 st2 = new Student2(); 
		 st2.name = "김철수"; 
		 st2.age = 20; 
		 st2.studentId = "20250909";
		  
		  System.out.println(st2.name); System.out.println(st2.age);
		  System.out.println(st2.studentId);
		 
		
		  System.out.println("EX3. 매서드");
		  // ex3. 매서드 . 
		  Student3 st3 = new Student3(); st3.study(); st3.introduce();
		  System.out.println();
		 
		  System.out.println("EX4. 기본 생성자_커스터 마이징 ");
//		//ex4.기본 생성자_커스터 마이징 		
		Student4 st4 = new Student4();

		  System.out.println();
		  
		  System.out.println("EX5. 기본 생성자_커스터 마이징 ");
		 //ex5. 
		 
		 Student5 st5; st5 = new Student5("김명횡");
		 
		  System.out.println();
		
		  System.out.println("EX6. 1~5번 모두를 종합적으로 적용..최종 Student6 st6; st6 = new Student6(); ");
		 //ex6. 1~5번 모두를 종합적으로 적용..최종 Student6 st6; st6 = new Student6();
		  
		  Student6 st6_a = new Student6(); Student6 st6_b = new
		  Student6("김명횡","20250909"); Student6 st6_c = new
		  Student6("김영남",29,"20250701");
		  
		  st6_b.study(); st6_c.introduce();
		  
		  System.out.println("=======================");
		  
		  st6_c.study(); st6_b.introduce();
		  System.out.println();
		
		  System.out.println("EX7. getter(값을 가져오는거)와 setter(값을 넣어주는거)");
		//ex7_ getter(값을 가져오는거)와 setter(값을 넣어주는거)
		
		    Student7 st7 = new Student7();
		    System.out.println(st7.toString());
		    //설정 앞에서는 private..감춰져있음 null...
		    System.out.println("================================================");
		    
		    st7.setName("김가빈");
		    st7.age  = 26;
		    st7.setStudentId("200525134");
		    //마지막.. 처음 비교하기....
		    System.out.println(st7.toString());
		
		
	}
}
