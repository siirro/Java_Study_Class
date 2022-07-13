package com.iu.object3;

public class Object3Main1 {

	public static void main(String[] args) {
		ReturnTest rt = new ReturnTest();
//		rt.info();
//		int num=rt.makeRandom();
//		System.out.println(num);
//		
//		
//		
//		int [] num1=rt.makeRandom2();
//		
//		for(int i=0;i<num1.length;i++) {
//			System.out.println(num1[i]);
//		}
//		
		
		Account ac = rt.makeAccount();
		
		System.out.println(ac.title);
		System.out.println(ac.host);
		System.out.println(ac.numbers);
		System.out.println(ac.balance);
		
	}

}
