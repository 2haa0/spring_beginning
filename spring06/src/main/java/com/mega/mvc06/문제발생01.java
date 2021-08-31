package com.mega.mvc06;

public class 문제발생01 {

	public static void main(String[] args) {
		System.out.println("1. 프린트?");
		try { //이하 코드를 실행하다가 문제가 생기면
			System.out.println("2. 프린트?" + (10/0));
		} catch (Exception e) {  //잡아서 e라는 변수에 넣어
			e.printStackTrace(); //printStackTrace:method
		}
		System.out.println("3. 프린트?");
	}

}
