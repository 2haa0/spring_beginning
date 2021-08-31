package com.mega.mvc08.casting;
/*
 * 기본형 형변환(정수, 실수, 문자, 논리)
 * 형변환(data type 변환)
 */

public class CastingPrimitive {

	public static void main(String[] args) {
		byte b1 = 100; //-128 ~ +127
		int i1 = 200;
		
		i1 = b1; //가능 int <----byte
		/*
		 * 자동으로 byte에 들어있던 100data가 int로 변환되어 저장되고
		 * 이를 자동 data 변환(자동현변환)이라고 한다.
		 */
		
		b1 = (byte)i1; // 불가능 int(큰) ----> byte(작)
		/*
		 * 강제로 int에 들어있던 100 data가 byte로 변환되어 저장되며
		 * 이를 강제 data 변환(강제형변환)이라고 한다.
		 */
		
		int i2 = 3000;
		byte b2 = (byte)i2; 
		System.out.println(b2);
		/* 
		 * 이 강제형변환의 경우 i2가 3000이라 byte의 번위 -128 ~ +127을 벗어나므로 data 손실이 일어난다.
		 * 그래서 실행할 경우 3000이 -72로 변형되어 저장된다.
		 */
	}

}
