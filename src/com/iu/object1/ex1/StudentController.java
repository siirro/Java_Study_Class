package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentController {
	
	//start 메서드를 선언
	//System.out.println("1.입력 2.조회 3.검색 4.삭제 5.추가 6.종료");
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int count;
		while(flag) {
		System.out.println("1.입력 2.조회 3.검색 4.삭제 5.추가 6.종료");
		System.out.println("번호를 고르세요");
		int select = sc.nextInt();
		System.out.println(select+"번 을 골랐습니다");
		if(select==1) {
			System.out.println("인원수는 몇명?");
			count=sc.nextInt();
			
			
		} else if(select==2) {
			
		}
		if(select==6) {
			break;
		}
		}
	}
}
