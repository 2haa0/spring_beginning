package com.mega.mvc08.quiz;

public class BallPenMain extends Product {
	/*
	 * Quiz01
	 * SuperClass: 학용품, 가격, 회사, 사다()
	 * SubClass: 볼펜, 두께, 글을쓰다()
	 */
	
	public static void main(String[] args) {
		BallPen p1 = new BallPen();
		p1.company = "mega";
		p1.price = 1000;
		p1.size = 10;
		p1.buy();
		p1.write();
		System.out.println(p1);
	}

}
