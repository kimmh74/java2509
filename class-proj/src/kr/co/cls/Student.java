package kr.co.cls;

public class Student {

	// toSting하고... private로 ..public을 바꿔준다....  불러오기 위해서 getter........소스 = getter만들기.. 이름/학번...getter..
	//setname...... 
	
	private String name;
	int age;
	private String studentId;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}


	
	// public지우는거는 이안에서면 사용할 수 있도록

	// 전체필드를 사용자에게 입력받는 생성자 (constructor)생성.. 클래스와 이름이같은 생성자..컨스트럭터...
	// 김철수..컨스트럭터..BasicClass에서 만든다.
	// new Student("김철수", 20 , "20250912")--- 마지막 ...toString 만들고 this로 만드는 방법. 마지막에 생성해준다.
	public Student(String name, int age, String studentId) {
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}

	// 필수** 입력 필드를 사용자에게 입력받는 생성자 constructor .......... 리콰이어드....
	// 이영희 .. 컨스트럭터
	// new Student("김철수", "20250912")
	public Student(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
	}

	void intruduce() {
		System.out.println(this.name + "를 소개합니다.");

	}

	void study() {
		System.out.println(this.studentId + "번이 공부합니다.");

	}

	
	// source  ====>   Generate toSring
	// 마우스 오른쪽...소스=> toSting...................
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", studentId=" + studentId + "]";
	}

}
