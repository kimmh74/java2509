package ch04.sec03;

public class SwitchExample02{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num = (int) (Math.random() * 6) + 1;    //주사위 번호 하나 랜덤으로 뽑기
		double ran = Math.random();
		System.out.println("ran:"+ ran);
		
		
	  double ran2 = ran*6;
	  System.out.println("ran2:"+ ran2);
	  
	int num = (int)(ran2) +1; // 변수 마춰주는거 확인....double....int .....
	  System.out.println("num:"+ num);
		
//		int num =  (int)(ran*6)+1;
//		
//		System.out.println("num:"+ num);
		
		
//		System.out.println("랜덤값은?:" + ran +"---");

		switch(num){
			case 1:
				System.out.println("1번이 나왔습니다.");
				break;
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			case 3:
				System.out.println("3번이 나왔습니다.");
				break;
			case 4:
				System.out.println("4번이 나왔습니다.");
				break;
			case 5:
				System.out.println("5번이 나왔습니다.");
				break;
			default:
				System.out.println("6번이 나왔습니다.");
		}
	}

}
