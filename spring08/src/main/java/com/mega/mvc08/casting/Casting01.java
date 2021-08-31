package com.mega.mvc08.casting;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import com.mega.mvc08.MemberDTO;

public class Casting01 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		MemberDTO dto = new MemberDTO();
		
		list.add("고릴라"); 
		list.add(new Date());
		list.add(new Random());
		/* 
		 * Object <--자동형변환-- String, Date, RAndom
		 * 괄호안 object가 허용되는 자리에 작은 개념인 String, Date, Random이 삽입되면서 CPU가 자동형변환 해줌
		 */
		list.add(dto);
		
		list.add(100); 
		// Object <--자동형변환--Integer--autoBoxing--int(기본형)
		
		list.add(11.11);
		// Object <--자동형변환--double--autoBoxin--double(기본형)
		
		  Object name = list.get(0); // Object
		  System.out.println(name.equals("고릴라"));
		  
		  Object dto2 = list.get(3);
		  /*
		   *  System.out.println(dto2.getId());
		   *  처럼 MemberDTO에 있는 getId method를 사용할 수 없다.
		   *  즉, 업캐스팅 되어 Object로 들어간 객체는 원래클래스가 가지고 있던 자식에서 추가된 method를 쓸수 없게된다.
		   *  superClass로 upCasting하는 경우는 subClass에서 추가된 method를 인식하지 못 한다.
		   */
		  
		  MemberDTO dto3 = (MemberDTO)list.get(3); 
		  /*
		   * MemberDTO는 Object보다 작은 개념이므로 강제형변환이 必!
		   * downCasting!
		   */
		  System.out.println(dto3.getId());
		
		  // smallQuiz01_ line24의 100에 1을 더해서 프린트 하기
		  System.out.println((Integer)list.get(4)+1);
		  //int <--atuoUnBoxing--Integer--downCasting--Object
		  
		  // smal2Quiz01_ line24의 100에 1을 더해서 프린트 하기
		  System.out.println((Double)list.get(5)+100);
		  //double <--autoUnBoxing--Double--downCasting--Object
	}

}
