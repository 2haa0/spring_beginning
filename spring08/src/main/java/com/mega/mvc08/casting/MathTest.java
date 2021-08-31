package com.mega.mvc08.casting;

public class MathTest {

	public static void main(String[] args) {
		double data = -3.12345;
		System.out.println(Math.abs(data));
		System.out.println(Math.ceil(data));
		System.out.println(Math.round(data));
		System.out.println(Math.floor(data));
		
		System.out.println(Math.random()); //0~..1
		System.out.println(Math.random() + 10); //10~..11

	}

}
