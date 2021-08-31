package com.mega.mvc06;


public class Quiz02_ArrayError {
/*
 * 210825 Quiz02
 */
	public void array() throws Exception {
		int[] num = {1,2,3};
		try {
			num[3] = 4;
		} catch (Exception e) {
			System.out.println("array()는 error");
		}
	}
}
