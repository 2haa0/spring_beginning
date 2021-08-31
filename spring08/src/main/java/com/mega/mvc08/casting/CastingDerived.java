package com.mega.mvc08.casting;

import com.mega.mvc08.quiz.BallPen;
import com.mega.mvc08.quiz.Product;

public class CastingDerived {

	public static void main(String[] args) {

		/*
		 * 형변환(casting)
		 * 파생된 데이터로 참조형변수(기본형변수 아닌 거 다! class)를 말한다.
		 * 참조형변수의 형변환은 모든 참조형이 가능하진 않다.
		 * ''상속관계에 있는 클래스 간''에만 가능하다.
		 * 즉, 배열같은 참조형변수는 불가능하다.
		 */
		
		//상속관계 따지기
		Product p = new Product(); //superClasee, 大
		BallPen b = new BallPen(); //subClass, 小
		// : 클래스간의 크기는 부모인지 자식인지 "개념"으로 판별
		
		p = b; // 大 <--자동형변환-- 小
		b = (BallPen)p; // 小 <--강제형변환-- 大
		
		
	}
}
