package com.mega.mvc05.static1;

public class Day {
	String doing;
	int time;
	String location;
	static int count;
	static int sum;
	// 멤버변수: 전역이며 자동초기화 됨.
	
	public Day(String doing, int time, String location) { //생성자 메서드
		this.doing = doing; //this는 '이 클래스(Day)'의 전역 doing변수를 의미한다.
		this.time = time;
		this.location = location;
		count++;
		sum += time;
	}
	/*
	 * static메서드는 객체생성하지 않아도 아무때에나 클래스이름으로 접근해서 
	 * 
	 */
	//public static String getAvg() {
		//return doing;
		/*
		 * static메서드 안에서는 static변수만 사용이 가능! instance변수 사용 불가능!
		 * static변수는 객체 생성후 접근 가능하기 때문에.
		 * static메서드는 객체생성하지 않아도 접근해서 처리를 해야한다.
		 */
	//}
	
	String name;
	String gender;
	int age;
	public Day(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		count++;
		sum = sum + age;
	}
	
	@Override
	public String toString() {
		return "Day [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
}
