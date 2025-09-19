package co.kmh.generics;

public class Box<T> {
	
	T value;

	//값을 getting 가져오는거.
	public T getValue() {
		return value;
	}

	//값을 setting 넣는다.
	public void setValue(T value) {
		this.value = value;
	}

}
