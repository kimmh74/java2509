package kr.co.ext;

public class ExtClass {
	public ExtClass() {
		
		//new 오브젝트 만드는거....
//		Dog dog9 = new Dog();
//		Cat cat9 = new Cat();
 		Dog dog = new Dog("바둑이",3,"골든리트리버");
		Cat cat = new Cat("야옹이",2,true);

//		 System.out.println(dog.name);
	     System.out.println(dog.getName());
	     System.out.println(dog.breeds);
	     
	     dog.makeSound();
	     cat.makeSound();
	     
	}

}
