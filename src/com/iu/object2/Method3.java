package com.iu.object2;

public class Method3 {
	
	public void sal(int salary) {
		System.out.println("월급 계산");
		System.out.println(salary*0.9677);
		salary=20;
	}
	
	public void hap(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public void info(String name, int age, String email) {
		//이름 나이 이메일주소 받아서 출력
		System.out.println(name+", "+age+", "+email);
	}
	public void info2(Member member) {
		System.out.println(member.name);
		System.out.println(member.age);
		System.out.println(member.email);
		member.age=100;
		
		
	}

}
