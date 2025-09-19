package co.kmh.generics;

public class Stats<T extends Number> {

//	Integer[] nums;
//
//	public Integer[] getNums() {
//		return nums;
//	}
//
//	public void setNums(Integer[] nums) {
//		this.nums = nums;
//	}

	// Integer ==> T로 변경하여 사용

	T[] nums;

	// {10,20,30,40}
	// {1.5,2.5,3.5};
	public Stats(T[] nums) {
		this.nums = nums;
	}

	public Double average() {
		double sum = 0; // sum초기화를 해야한다...
		for (T num : nums) {
//			sum = sum+num.doubleValue();
			sum += num.doubleValue();
		}
			return sum /nums.length; //null을 .. 바꿔준다.
	}

//	public T[] getNums() {
//		return nums;
//	}
//
//	public void setNums(T[] nums) {
//		this.nums = nums;
//	}

}
