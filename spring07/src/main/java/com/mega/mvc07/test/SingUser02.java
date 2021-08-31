package com.mega.mvc07.test;

public class SingUser02 {

	public static void main(String[] args) {
	for (int i = 0; i < 1000; i++) {
		/*
		 * SingleObject2 single2 = new SingleObject2();
		 * 싱글톤은 이렇게 쓸 수 없다!
		 */	
		SingleObject02 single2 = SingleObject02.getInstance();
	}
		System.out.println(SingleObject02.count + "개");
		System.out.println(SingleObject02.count * 8 + 4);
	}

}
