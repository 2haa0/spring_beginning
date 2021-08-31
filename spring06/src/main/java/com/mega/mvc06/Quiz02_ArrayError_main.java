package com.mega.mvc06;

public class Quiz02_ArrayError_main {
/*
 * 210825 Quiz02
 * ArrayError3에서 ArrayError2의 객체 생성 후 array() method를 호출
 * 1. array() method 내에서 Try ~ Catch ~ 처리
 * 2. 호출한 곳에서 예외 처리
 */
	public static void main(String[] args) {
		Quiz02_ArrayError error = new Quiz02_ArrayError();
		try {
			error.array();
		} catch (Exception e) {
			System.out.println("main에서 error");
		} finally {
			System.out.println("error 내지 마세요!");
		}
	}
}
