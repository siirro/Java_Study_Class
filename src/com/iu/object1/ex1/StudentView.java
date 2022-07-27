package com.iu.object1.ex1;

public class StudentView {
	
	//viewMessage 문자열을 받아서 그 문자열을 출력
	public void viewMessage(String message) {
		System.out.println(message);
	}
	
	//viewOne 학생 한명의 정보를 받아서 모든 정보를 출력
	public void viewOne(Student student) {
		System.out.println(student.getName()+"\t"+student.getNum()+"\t"+student.getTotal()+"\t"+student.getAvg());
	}
	
	
	//viewAll 학생들의 정보를 받아서 모든 정보를 출력

	public void viewAll(Student [] students) {
		
		System.out.println("name\tnum\ttotal\tavg");
		
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i].getName()+"\t"+students[i].getNum()+"\t"+students[i].getTotal()+"\t"+students[i].getAvg());
			
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
