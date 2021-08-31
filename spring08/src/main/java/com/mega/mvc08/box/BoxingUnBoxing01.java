package com.mega.mvc08.box;

import javax.swing.JOptionPane;

public class BoxingUnBoxing01 {

	public static void main(String[] args) {
		Integer i1 = new Integer(0); //참조형
		int i2 = 0; //기본형 정수
		int i3 = 0; //기본형 정수
		
		i1 = i2; //참조형(class 객체) <--autoBoxing(:큰 개념으로 자동포장)-- 기본형
		i3 = i1;
		/*
		 * java는 변수가 선언될 때 변수의 type이 결정되기 때문에
		 * 참조형변호 i1에 기본형변수 i2를 삽입하는건 기본적으로 불가능하다.
		 * But. Box과 UnBoxing에서는 참조형변수에 기본형 값을 넣는 것과
		 * 기본형변수에 참조형 값을 넣는 것이 가능하다.
		 * 
		 * 가능한 이유:
		 * 
		 */
	}
}
