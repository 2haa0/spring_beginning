package com.mega.mvc07.test;

public class One02 {
	static One02 object; //null
	
	
	private One02() {
		System.out.println("싱글톤");
	}
	
	public static One02 getInstance() {
	/*
	 * 1. 싱글톤은 객체를 하나만 만들고, 더이상 만들지 않는 방법
	 * 2. getinstance라는 static method를 만들어
	 * 3. 객체가 이미 만들어졌는지 check를 하게 된다.
	 */
		if (object == null) {
			//object이 null이라는 것은 아직 객체가 하나도 만들어지지 않았다라는 뜻.
			//객체가 만들어지면 주소가 들어가야 함..!
			object = new One02();
		} else {
			//object가 null이 아니라면, 객체가 만들어져서 주소값이 생겼다라는 뜻
		}
		return object;
	}
}
