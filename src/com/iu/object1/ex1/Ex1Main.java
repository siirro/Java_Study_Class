package com.iu.object1.ex1;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");

		Student st1 = new Student();
		
		st1.name = "웅이";
		st1.num = 1;
		st1.kor = 100;
		st1.eng = 100;
		st1.math = 100;
		st1.total = st1.kor+st1.eng+st1.math;
		st1.avg = st1.total/3;

		//Student student2 = new Student();		
		//Student student3 = new Student();
		//위를 반복문으로
		
		Student st = null;
		Scanner sc = new Scanner(System.in);
		Student [] students = new Student[3];
		for(int i=0;i<3;i++) {
			st = new Student();
			System.out.println("이름을 입력하세요");
			st.name = sc.next();
			students[i] = st;
		}
		
		for(int i=0;i<3;i++) {
		System.out.println(students[i].name);
		}
		
		System.out.println(st.name);
		

		System.out.println("프로그램 시작");
	}

}
