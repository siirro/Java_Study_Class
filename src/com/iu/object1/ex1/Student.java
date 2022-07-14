package com.iu.object1.ex1;

public class Student {

	private String name;
	private int num;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	
	
	
//	public String getName() {
//		return name;
//	}
//	
//	public int getNum() {
//		return this.num;
//	}
//	
//	public int getKor() {
//		return this.kor;
//	}
//	
//	public int getEng() {
//		return this.eng;
//	}
//	
//	public int getMath() {
//		return this.math;
//	}
//	
//	public int getTotal() {
//		return this.total;
//	}
//	
//	public double getAvg() {
//		return this.avg;
//	}
//	
//	public void setName(String name) {
//		this.name=name;
//	}
//	
//	public void setNum(int num) {
//		this.num=0;
//		if(num!=0) {
//			this.num = num;
//		}
//	}
//	
//	public void setKor(int kor) {
//		this.kor=0;
//		if(num>=0&&num<=100) {
//			this.kor = kor;
//		}
//	}
//	
//	public void setEng(int eng) {
//		this.eng=0;
//		if(num>=0&&num<=100) {
//			this.eng = eng;
//		}
//	}
//	
//	public void setMath(int math) {
//		this.math=0;
//		if(num>=0&&num<=100) {
//			this.math = math;
//		}
//	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = this.checkPoint(kor);
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = this.checkPoint(eng);
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = this.checkPoint(math);
	}

	public int getTotal() {
		return total;
	}

	public double getAvg() {
		return avg;
	}
	
	private int checkPoint(int point) {
		if(point <0||point>100) {
			return 0;
		} else {
			return point;
		}
	}
	
	
	

	public void setTotal() {
		this.total = this.kor+this.eng+this.math;
		this.setAvg();
	}
	
	private void setAvg() {
		this.avg = this.total/3.0;
	}
	
}
