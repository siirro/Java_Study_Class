package com.iu.object4;

public class Car {
	
	String company="쌍용";
	String brand;
	String color;
	boolean gear; //true면 오토, false면 수동
	
	//Instance 초기화 블럭 {}
//	{
//		this.company="기아";
//		this.brand="k5";
//		this.color="Black";
//		this.gear=false;
//	}
	
	//생성자
	public Car(String brand, String color) {
		this.company="현대";
		this.brand=brand;
		this.color=color;
		this.gear=true;
	}
	
	public Car(String color) {
		this("아반떼",color);
//		this.company="현대";
//		this.brand="아반떼";
//		this.color=color;
//		this.gear=true;
	}
	
	public Car() {
		this("White");
//		this.company="현대";
//		this.brand="아반떼";
//		this.color="white";
//		this.gear=true;
	}
	
	public void info() {
		System.out.println("Company : "+this.company);
		System.out.println("Brand : "+this.brand);
		System.out.println("Color : "+this.color);
		System.out.println("Gear : "+this.gear);
	}
}
