package com.mega.mvc06;

public class 문제발생04_call {
	public void call() {
		try {
			System.out.println(3/0);
		} catch (Exception e) {
			System.out.println("예외처리는 내가 다 함");
		}
	}
}
