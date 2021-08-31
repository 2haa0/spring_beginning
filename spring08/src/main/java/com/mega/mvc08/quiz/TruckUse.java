package com.mega.mvc08.quiz;
/*
 * Quiz
 * 1. 트럭의 멤버변수는 weight, distance 두 개
 * 2. 클래스를 정의할 때 type을 선언하지 않고 객체 생성시 다음과 같이 사용하려고 한다.
 * 		<String, Integer>
 * 		<Integer, String>
 * 3. t1.weight = "중량무게"
 * 	  t1.distance = 100;
 * 	
 * 	  t2.weight = 100 ;	
 * 	  t2.distance = "장거리";	
 * 
 * 4. t1, t2의 값을 print
 */

import com.mega.mvc08.generic.Car;

public class TruckUse {

	public static void main(String[] args) {
		Truck<String, Integer> t1 = new Truck<String, Integer>();
		Truck<Integer, String> t2 = new Truck<Integer, String>();
		
		t1.weight = "중량무게";
		t1.distance = 100;
		
		t2.weight = 100 ;	
		t2.distance = "장거리";	
		
		
		System.out.println("t1: " + t1);
		System.out.println("t2: " + t2);
		

	}

}
