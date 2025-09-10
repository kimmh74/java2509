package com.ex.st;

public class Student6 {

	//--------- 클레스 내에서 공통적으로 사용되는 값을 지정.
	// field 필트 추가....
	String name;
	int age = 20;
	String studentId;

	//---------- 클레스가 처음 오브젝트로 생성될때, 어떻게 생성될 것인가?,,,,,~~~
	// 기본생성자...커스터 마이징
	public Student6() {

		System.out.println(name + age + studentId);
		System.out.println("기본_학생이 생성 되었습니다.");
	}

	// 매개변수가 있는 생성자(필수입력)
	public Student6(String argName, String argStudentId) {
		this.name = argName;
		this.studentId = argStudentId;
//	System.out.println(studentId + "-" + name + "학생이 생성 되었습니다.");
		System.out.println("^^" + this.studentId + "-" + this.name + "학생이 생성 되었습니다.");

	}

	// 매개변수 최종 전체 종합(모든 필드를 다 적용해줌)
	public Student6(String argName, int argAge, String argStudentId) {
		this.name = argName;
		this.age = argAge;
		this.studentId = argStudentId;
//	System.out.println(studentId + "-" + name + "학생은 생성 되었습니다." + "-" + age);
		System.out.println(this.studentId + "-" + this.name + "학생은 생성 되었습니다." + "-" + this.age);
		System.out.println();
	}


	
	//====================== 클래스를 통한 오브젝트를 생성했을때,,, 액션 

	public void study() {
		System.out.println("^^"+this.name+"님이 공부를 합니다.");
		
	}

	public void introduce() {
		System.out.println("^^"+this.name+" 학생을 소개합니다..");
		
	}
	
	
	
	
	
	
	

}
