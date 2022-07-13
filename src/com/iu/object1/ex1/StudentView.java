package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentView {
	//viewMessage 문자열을 받아서 그 문자열을 출력
	
	Scanner sc = new Scanner(System.in);
	
	public void viewMessage(String message) {
		System.out.println(message);
	}
	
	//viewOne 학생 한명의 정보를 받아서 모든 정보를 출력
	public void viewOne(Student student) {
		System.out.println(student.name);
		System.out.println(student.num);
		System.out.println(student.total);
		System.out.println(student.avg);
	}
	
	
	//viewAll 학생들의 정보를 받아서 모든 정보를 출력

	public void viewAll(Student [] students) {
		
		System.out.println("name\tnum\ttotal\tavg");
		
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i].name+"\t"+students[i].num+"\t"+students[i].total+"\t"+students[i].avg);
		}
//		for(int i=0;i<students.length;i++) {
//			System.out.println(students[i].name);
//			System.out.println(students[i].num);
//			System.out.println(students[i].total);
//			System.out.println(students[i].avg);
//		}
		
		//Student [] s = new Student();
//		StudentService ss = new StudentService();

//		
		
	}
}
