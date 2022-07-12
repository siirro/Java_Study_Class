package com.iu.object2;

import java.util.Scanner;

public class Object2Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//sal 메서드 생성
		Method3 m3 = new Method3();
		//월급 입력
		int salary = 5000000;
		
		m3.sal(salary);
		System.out.println(salary);
		
		//int num2 =0;
		m3.hap(10, 20);
		
//		System.out.println("이름, 나이, 이메일주소 입력");
//		String name = sc.next();
//		int age = sc.nextInt();
//		String email = sc.next();
//		
//		
//		m3.info(name, age, email);
		
		m3.info("iu", 30, "sdfdsf@sf");
		
		Member member = new Member();
		member.name="suji";
		member.age=30;
		member.email="suji@naver.com";
		
		m3.info2(member);
		System.out.println(member.age);
		
		
		
		
	}

}
