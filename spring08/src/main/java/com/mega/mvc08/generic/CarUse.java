package com.mega.mvc08.generic;

public class CarUse {

	public static void main(String[] args) {
		Car<String> carS = new Car<String>();
		Car<Integer> carI = new Car<Integer>();
		carS.size = "big";
		carI.size = 100;
		
		System.out.println(carS);
		System.out.println(carI);
	}
}
