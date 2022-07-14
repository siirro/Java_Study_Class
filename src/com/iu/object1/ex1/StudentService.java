package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentService {
	StudentView sv = new StudentView();
	Scanner sc; 
	Student sss;
	
	public StudentService() {
		sc = new Scanner(System.in);
		sss = new Student();
	}
	
	//removeStudent 학생들의 정보를 받아서
	//삭제하려는 학생의 번호를 입력받아요; 일치하는학생 삭제, 남은학생의정보리턴
	public void removeStudent() {
		
	}
	
	//addStudent - 학생들의 정보를 받아서
	//학생 한명 추가, 추가 완료된 학생 정보들을 리턴
	public Student [] addStudnt(Student [] s) {
		System.out.println("추가할 학생의 이름 번호 국어 영어 수학 입력");
		//Student [] sCopy;
		Student [] sCopy = new Student[s.length+1];
		int i=0;
		for(i=0;i<sCopy.length-1;i++) {
			sCopy[i] = new Student();
			sCopy[i].getName() = s[i].getName();
			sCopy[i].getNum() = s[i].getNum;
			sCopy[i].getKor() = s[i].getKor;
			sCopy[i].getEng() = s[i].getEng;
			sCopy[i].getMath() = s[i].getMath;
			sCopy[i].getTotal = s[i].getTotal;
			sCopy[i].getAvg = s[i].getAvg;
		}
		sCopy[i] = new Student();
		sCopy[i].setName(sc.next());
		sCopy[i].setNum(sc.nextInt());
		sCopy[i].setKor(sc.nextInt());
		sCopy[i].setEng(sc.nextInt());
		sCopy[i].setMath(sc.nextInt());
		sCopy[i].setTotal();
		//sCopy[i].total = sss.setTotal();
		
		
		s = sCopy;
		return s;
		
	}
	
	
	
	
	//findStudent 검색하고싶은학생의번호를입력받아서 같은번호의학생을찾아서 
	//그학생한명을리턴 없으면null리턴
	
	//리턴하려는 학생데이터
	public Student findStudent(Student [] students) {
		System.out.println("번호를 입력하세요");
		int num=sc.nextInt();
		Student student = null;
		for(int i=0;i<students.length;i++) {
			if(num == students[i].getNum()) {
			//s.setNum(sc.nextInt());
			
				student = students[i];
				//break;
				return student;
				//=break랑 같은 역할
			} 
		}
		return student;
			
		}
		
	
	
	
	
	//makeStudents 메서드 생성
	//학생수를 입력받고, 
	//학생수 만큼 정보를 입력받아요. 이름 번호 국어 영어 수학, 총점평균은 자동계산
	//학생들을 리턴
	
	public Student [] makeStudents() {
		
		System.out.println("인원수는 몇명?");
		int count=sc.nextInt();
		Student [] students = new Student[count];
		
		for(int i=0;i<students.length;i++) {
			System.out.println(i+1+"번째 학생의 이름, 번호, 국어점수, 영어점수, 수학점수를 차례대로 입력하세요");
			Student s = new Student();
			s.setName(sc.next());
			//s.name = sc.next();
			s.setNum(sc.nextInt());
			s.setKor(sc.nextInt());
			s.setEng(sc.nextInt());
			s.setMath(sc.nextInt());
			s.setTotal();
//			s.total = s.kor+s.eng+s.math;
//			s.avg = s.total/3;
			//System.out.println(name[i]);
			students[i] = s;
			
		}
		
		return students;
		
		}
		
}
