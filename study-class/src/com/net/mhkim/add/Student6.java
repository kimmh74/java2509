package com.net.mhkim.add;

public class Student6 {

	String stId;
	String name;
	int age = 20; // 초기값이 없으면0, 초기값을 20으로 수정함..

	// 생성자 : 오브젝트의 초기값을 담당.
	public Student6() {
		System.out.println("기본_학생이 생성 되었습니다.");
	}

	public Student6(String name) {
//		System.out.println(name+ " 학생이 생성 되었습니다.");
		this.name = name;
	}

	public Student6(String stId, String name) {
//		System.out.println(stId+"학번"+name+"학생이 생성 되었습니다.");
		this.stId = stId;
		this.name = name;

	}

	public Student6(String stId, String name, int age) {
//		System.out.println(stId+"학번"+name+"학생이 생성 되었습니다."+age+"살");
		this.stId = stId;
		this.name = name;
		this.age = age;

	}

	// method 함수 : 액션_행동양식

	public void introduce() {
		System.out.println("^^"+this.name+" 학생이 자기소개를 합니다.");

	}

	public void study() {
		System.out.println("^^"+this.name+" 학생이 공부합니다.");

	}

}
