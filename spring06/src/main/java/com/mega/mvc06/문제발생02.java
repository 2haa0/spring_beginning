package com.mega.mvc06;

import java.io.FileWriter;

public class 문제발생02 {

	public static void main(String[] args) {
		System.out.println("1. 프린트?");
		try { //이하 코드를 실행하다가 문제가 생기면
			System.out.println("2. 프린트?" + (10/1));
			FileWriter file = new FileWriter("d:\test.txt");
			file.write("내가 첫 줄\n");
			file.write("내가 둘째 줄\n");
			file.close();
		} catch (Exception e) {  //잡아서 e라는 변수에 넣어
			e.printStackTrace(); //printStackTrace:method
		}
		System.out.println("3. 프린트?");
	}

}
