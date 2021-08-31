package com.mega.mvc08.generic;

import java.util.ArrayList;

public class Generic01 {

	public static void main(String[] args) {
		/*
		 * 가변적인 data의 모음으로 변화가 무쌍하다.
		 * 때문에 배열을 쓰면 아니되고 Arraylist로 선언해야한다.
		 */
		ArrayList list = new ArrayList();
		list.add(100); // 자동형변환
		
		
		ArrayList<Integer> listInt = new ArrayList<>(); //제너릭
		/* 
		 * 		 * 하나의 data type만 넣으려고 하는 경우
		 * ArrayList<형>을 선언 해주면 됨
		 * generic 프로그램을 사용하면 casting을 하지 않아도 된다.
		 * add하는 item을 자동으로 integer로 변환해서 넣어줌!
		 */
		listInt.add(100);
		listInt.add(200);
		listInt.add(300);
		
		int i1 = listInt.get(0);
		System.out.println(i1 + 1);

		ArrayList<Double> listDouble = new ArrayList<Double>();
		
		

	}

}
