package com.mega.mvc08.quiz;

import java.util.ArrayList;

/*
 * Quiz. 나에 대한 data를 모아보세요.
 * 
 * 1. 전체 list를 print
 * 2. 돈 1000을 꺼내서 2000을 더 해 print
 * 3. 키 189.1을 꺼내서 10을 더 해 print
 * 4. 아침식사 여부 false를 꺼내서 아침을 먹었으면 배불러요. 아니면 배고파요.
 * 5. 성별 '남'을 꺼내서 남이면 주민번호는 1,3이에요. 
 * 6. 2~3에서 형변환(업캐스팅, 다운캐스팅),  
 */
public class CastingQuiz01 {

	public static void main(String[] args) {
		ArrayList me = new ArrayList();
		me.add(1000);
		me.add(189.1);
		me.add(false);
		me.add('남');
		
		//1
		System.out.println("돈: " + ((int)me.get(0)+2000));
		
		//2
		System.out.println("키: " + ((double)me.get(1)+10));
		
		//3
		if( (boolean)me.get(2) == false) {
			System.out.println("배고파요.");
		} else {
			System.out.println("배불러요.");
		}
		
		//4
		if ((char)me.get(3) == '남') {
			System.out.println("주민번호는 1, 3이에요.");
		} else {
			System.out.println("주민번호는 2, 4예요.");
		}
		
		/*
		 * 2. 189.1 --autoBoxing--Double--autoCasting--> Object --downCasting--Double--autoUnBoxing-->189.1
		 * 3. false --autoBoxing--Boolean--autoCasting--> Object --downCasting--Boolean--autoUnBoxing-->false
		 */
	}

}
