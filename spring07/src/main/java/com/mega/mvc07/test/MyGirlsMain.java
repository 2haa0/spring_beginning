package com.mega.mvc07.test;

public class MyGirlsMain {

	public static void main(String[] args) {
		
		Girl girl01 = new Girl("길순", 13);
		Girl girl02 = new Girl("길숙", 10);
		Girl girl03 = new Girl("옥순", 56);
		
		System.out.println(girl01);
		System.out.println(girl02);
		System.out.println(girl03);
		System.out.println("전체 " + Girl.count + "명, 평균 " + (float)(Girl.ageSum/Girl.count) + "세");
		
	}

}
