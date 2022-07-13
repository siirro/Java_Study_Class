package com.iu.object3;

import java.util.Random;
import java.util.Scanner;

public class ReturnTest {
	Scanner sc = new Scanner(System.in);
	
	//makeAccount
	//통장 정보 입력 title, host, 통장번호, 잔액 입력받아서 리턴
	
	public Account makeAccount() {
		Account ac = new Account();
		
		
		System.out.println("통장의 이름, 예금주, 번호, 잔액을 차례대로 입력하세요");
		ac.title = sc.next();
		ac.host = sc.next();
		ac.numbers = sc.next();
		ac.balance = sc.nextLong();
		
		
		
		return ac;
		
	}
	
	
	
	//호출시 숫자를 받아서 그 숫자만큼 랜덤한 수를 뽑아서 리턴
	public int [] makeRandom2() {
		
		Random random = new Random();
		
		System.out.println("숫자를 입력하세요");
		int count = sc.nextInt();
		int [] num1 = new int[count];
		for(int i=0;i<count;i++) {
			num1[i] = random.nextInt(50);
		}
		
		return num1;
		
	}
	
	
	public int makeRandom() {
		Random random = new Random();
		int num = random.nextInt(50);
		
		//return 리턴하려는 Date
		return num;
	}
	
	public void info() {
		System.out.println("실행 후 그냥 종료");
	}
}
