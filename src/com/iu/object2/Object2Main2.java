package com.iu.object2;

import java.util.Scanner;

public class Object2Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Dog, 2. Cat, 3. Tiger");
		int select = sc.nextInt();
		AnimalSound as = new AnimalSound();
		System.out.println("횟수를 입력");
		int count = sc.nextInt();
		
		
		if(select==1) {
			for(int i=0;i<count;i++) {
			as.dogSound();
			}
		}else if(select==2) {
			for(int i=0;i<count;i++) {
			as.catSound();
			}
		}else {
			for(int i=0;i<count;i++) {
			as.tigerSound();
			}
			
		}
		
		
		
	}

}
