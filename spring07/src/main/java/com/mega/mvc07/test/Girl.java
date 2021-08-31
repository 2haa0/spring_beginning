package com.mega.mvc07.test;

public class Girl {
/*
 * 1. 전체 소녀들의 정보를 print
 * 2. 소녀 객체가 만들어졌을 때 나이를 누적할 수 있는 static 변수를 만들어서 누적처리 할 것.
 * 3. 소녀 객체가 만들어 졌을 때 인원을 누적할 수 있는 static를 만들어서 누적처리 할 것
 * 4. 전체 소녀수와 나이의 평균 구할 것 
 */
	String name = null;
	int age = 0;
	static int ageSum = 0;
	static int count = 0;
	
	public Girl(String name, int age) {
		this.name = name;
		this.age = age;
		ageSum += age;
		count ++;
	}

	@Override
	public String toString() {
		return "Girl [name=" + name + ", age=" + age + "]";
	}
}