package kr.co.cls;

public class BasicClass {
	// 클래스 사용해보기
	public BasicClass() {
		// 오브젝트 생성...new 키워드 : 객체obj 생성
//				Student st1 = new Student();
		
		/*
		 * Student st1 = new Student(); // 하나더 만든다. 
		    Student st2 = new Student(); // 학생이 * 2명인거야!!!
		 * 
		 * // 필드값 접근하여 값을 할당 
		  st1.name = "김철수"; 
		  st1.age = 20; 
		  st1.studentId = "20250912";
		 * 
		 * st2.name = "이영희"; 
		 * st2.age = 24; 
		 * st2.studentId = "20250716";
		 */
		
		
//생성자---constructor 컨스트럭터....
		//객체 생성과 초기화init
		Student st1 = new Student("김철수",20,"20250912");
		Student st2 = new Student("이영희","20250912");
		//setName(String name)
		st1.setName("김명횡");  // "김철수"===>"김명횡"으로 바꿔준다.
		 // String getName()
		//USER1
		 System.out.println("~~getName()"+ st1.getName());
		 //USER2
		 String myName = st1.getName();
		 System.out.println("변경가능 이해~~~myName"+ myName);
		
		
		//함수(클레스 안에 있는) == 메서드 호출
		st1.intruduce();
		st1.study();
		System.out.println(st1.toString());
		st2.intruduce();
		st2.study();
		System.out.println(st2.toString());
		

	}

}
