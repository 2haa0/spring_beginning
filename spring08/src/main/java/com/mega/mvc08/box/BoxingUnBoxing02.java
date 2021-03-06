package com.mega.mvc08.box;

import javax.swing.JOptionPane;

public class BoxingUnBoxing02 {

	public static void main(String[] args) {
		//Wrapper class(포장클래스)
		String age = JOptionPane.showInputDialog("나이를 입력");
		
		/*
		 * int기본형을 가지고 정수와 관련된 여러가지 기능처리가 불가능하기 때문에
		 * 포장(Wrapper) 처리를 한다.
		 * 기본형과 관련된 여러가지 기능처리를 하고자 하는 경우 사용하려고 기본형의 특징을 가지고 클래스로 만들어 놓음.
		 * int->Integer, double->Double
		 */
		
		int age2 = Integer.parseInt(age);
		System.out.println(age2+1);
	}
}
