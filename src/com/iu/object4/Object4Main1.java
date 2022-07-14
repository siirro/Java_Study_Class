package com.iu.object4;

public class Object4Main1 {

	public static void main(String[] args) {
		Resume re = new Resume(); //객체생성이자 생성자호출
		//re.Resume(); //생성자 호출은 일반적인 메서드 호출 방법으로는 X
		
		Car car1 = new Car();
		//car1.brand="토레스";
		//car1.company = "쌍용";
		
		car1.info();
		
		Car car2 = new Car("black");
		car2.info();
		
		Car car3 = new Car("그랜져","silver");
		car3.info();

	}

}
