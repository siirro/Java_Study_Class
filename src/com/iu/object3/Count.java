package com.iu.object3;

public class Count {
	
	//메서드 오버로딩 조건:
	//1. 개수가 다르다
	//2. 타입이 다르다
	//이것 이외에는 오버로딩 불가
	
	public void hap(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public void hap2(int num1, double num2) {
		System.out.println(num1+num2);
	}
	
	public void hap(int num1, int num2, int num3) {
		
	}
	
	public void hap(double num2, int num) {
		
	}
	
}
