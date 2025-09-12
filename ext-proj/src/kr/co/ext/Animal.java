package kr.co.ext;

public class Animal {

	protected String name;
	protected int age;

//	public Animal() {
//	}

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
public Animal() {
		// TODO Auto-generated constructor stub
	}

//System.out.println("-----sound 부모 class----------");

public void sound() {
	System.out.println("동물소리");
}

//System.out.println("------------------------");

public void displayInfo() {
	System.out.println("Animal >>"+ "이름"+name+"\n나이: "+age);
}
}
