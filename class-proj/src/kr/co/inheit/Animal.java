package kr.co.inheit;

//개와 고양이의 공통된 값과 엑션 ......
public class Animal {

	String name;
	int age;
	
	public Animal() {
		
	}
	

	/// 만들고..field(name,age)를 만든다....
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}




	public void displayinfo() {
		System.out.println("Animal-정보출력");

	}

	public void eat() {
		System.out.println("Animal-먹는다");

	}

	public void makeSound() {
		System.out.println("Animal-소리를 낸다.");

	}

}
