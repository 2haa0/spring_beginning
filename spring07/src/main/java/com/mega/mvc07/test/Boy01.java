package com.mega.mvc07.test;

public class Boy01 {
	/* 
	 * 2. 싱글톤 문제
	 * Boy1.java를 프로토타입 객체용으로 만드세요.
	 * Boy2.java를 싱글톤 객체용으로 만드세요.

	 * BoyMain1.java
	 * Boy1 boy11 = new Boy1();
	 * Boy1 boy12 = new Boy1();
	 * BoyMain2.java
	 * Boy2 boy1 = Boy2.getInstance();
	 * Boy2 boy2 = Boy2.getInstance();
	 * 
	 * 21. 프로토타입과 싱글톤으로 객체 생성시 각각 생성된 객체수를 프린트해보세요.
	 * 22. 서버프로그래밍시 프로토타입으로 객체를 계속 생성하면 어떤 일이 발생할 것 같은가요?
	 *     위의 예를 들어서 설명해주세요.
	 * 23. 서버프로그래밍시 DAO, Controller등과 같은 것은 싱글톤으로 객체를 계속 생성하고
     *     DTO는 프로토타입으로 객체를 생성한다. 이 둘의 차이점이 무엇일까요?
	 */

	public Boy01() {
		System.out.println("프로토타입");
	}
}