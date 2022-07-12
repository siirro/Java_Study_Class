package com.iu.object1.ex1;

import java.util.Scanner;

public class Ex1Main2 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Scanner sc = new Scanner(System.in);
		Student [] students = new Student[3];
		Student st = new Student(); //이게 문제네..  얘를 for문 아래로 옮겨서 새로운 변수를 만들어서 거기다가 한개씩 집어넣어야함
		
		for(int i=0;i<students.length;i++) {
			System.out.println("이름을 입력하세여");
			st.name=sc.next();//a,b,c 차례대로 입력햇음.
			students[i] = st;
		}
		
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i].name);
		}
		

		System.out.println("프로그램 시작");
	}

}
