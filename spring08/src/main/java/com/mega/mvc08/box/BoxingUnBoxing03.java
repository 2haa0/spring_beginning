package com.mega.mvc08.box;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.swing.JOptionPane;

public class BoxingUnBoxing03 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("고릴라");
		list.add(new Date()); //object의 자리에는 모든 클래스(object의 자식) add 가능!
		list.add(new Random());
		/*
		 * 타이어(object)엔 한국타이어(객체, 클래스1), 일본타이어(객체, 클래스2)가 들어갈 수 있다.
		 * 즉, add(참조형 변수의 주소)
		 */
		list.add(100); //Integer <--(Atuo Boxing)-- int
		list.add(11.1); //Double <--(Atuo Boxing)-- double
		list.add(true); //Boolean <--(Atuo Boxing)-- boolean
		list.add('a'); //Character <--(Atuo Boxing)-- char
		/*
		 * 기본형은 class라 object의 자식이아니라 '상속'이라는 개념이 없는데 코드상 error가 뜨지 않는 이유
		 * '' Atuo Boxxing ''
		 */
	}
}
