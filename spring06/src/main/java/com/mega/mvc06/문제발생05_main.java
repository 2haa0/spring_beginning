package com.mega.mvc06;

import java.io.IOException;

public class 문제발생05_main {

	public static void main(String[] args) {
		문제발생05_call error = new 문제발생05_call();
		try {
			error.call();
		} catch (ArithmeticException e) {
			System.out.println("호출한 곳에서 다르게 처리, 문제발생04와 대조!");
			System.out.println("수학적인 error");
		} catch (IOException e) {
			System.out.println("호출한 곳에서 다르게 처리, 문제발생04와 대조!");
			System.out.println("입출력 error");
		} catch (Exception e) {
			System.out.println("호출한 곳에서 다르게 처리, 문제발생04와 대조!");
			System.out.println("그냥 error");
		}
		System.out.println("에러 발생 후 실행될까요?");
		System.out.println("에러 발생 후 실행될까여");
		System.out.println("에러 발생 후 실행될까유?");
	}

}
