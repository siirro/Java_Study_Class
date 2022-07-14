package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentController {
	Scanner sc;
	StudentService ss;
	StudentView sv;
	Student [] student5;
	
	
	//생성자
	public StudentController() {
		sc = new Scanner(System.in);
		ss = new StudentService();
		sv = new StudentView();
	}
	
	//start 메서드를 선언
	//System.out.println("1.입력 2.조회 3.검색 4.삭제 5.추가 6.종료");
	public void start() {
		
		boolean flag = true;
		
		
		while(flag) {
			System.out.println();
			System.out.println("1.입력 2.조회 3.검색 4.삭제 5.추가 6.종료");
			int select = sc.nextInt();
			System.out.println(select+"번 메뉴를 골랐습니다");
			
				if(select==1) {
					student5 = ss.makeStudents();
					
				} else if(select==2) {
					sv.viewAll(student5);
					
				} else if(select==3) {
					Student student1=ss.findStudent(student5);
					if(student1!=null) {
						sv.viewOne(student1);
					}else {
						sv.viewMessage("찾는학생이없어요");
					}
					
				} else if(select==4) {
					
				} else if(select==5) {
					ss.addStudnt(student5);
					
				} else if(select==6) {
					break;
				}
		}
	}
}
