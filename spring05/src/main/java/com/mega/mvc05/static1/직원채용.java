package com.mega.mvc05.static1;

public class 직원채용 {

	public static void main(String[] args) {
		Day c1 = new Day("홍길동", "남", 25);
		Day c2 = new Day("김길동", "여", 26);
		Day c3 = new Day("송길동", "남", 27);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println("직원 " + Day.count + "명");
		System.out.println("평균 " + (Day.sum/Day.count) + "살");
	}

}
