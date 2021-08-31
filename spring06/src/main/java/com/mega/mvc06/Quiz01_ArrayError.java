package com.mega.mvc06;

public class Quiz01_ArrayError {
/*
 * 210825 Quiz01
 * 1. 배열의 IndexOutOfBoundsException이면 "인덱스 에러!"라고 출력
 * 2. 다른 error면 "다른 에러!"
 * 3. error가 발생하든 안하든 상관없이.. 배열에 문제가 사라지게 해결했어요"를 출력
 */
	public static void main(String[] args) {
		int[] num = {1,2,3};
		try {
			num[3] = 4;
		} catch (IndexOutOfBoundsException e) {
			System.out.println("인덱스 에러");
		} catch (Exception e) {
			System.out.println("에효 다른 에러");
		} finally {
			System.out.println("배열에 문제가 사라지게 했어요.");
		}
		System.out.println("배열 끝");
	}

}
