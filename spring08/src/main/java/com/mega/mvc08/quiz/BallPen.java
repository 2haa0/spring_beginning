package com.mega.mvc08.quiz;

public class BallPen extends Product {
	/*
	 * Quiz01
	 * SuperClass: 학용품, 가격, 회사, 사다()
	 * SubClass: 볼펜, 두께, 글을쓰다()
	 */
	
	int size;
	
	public void write() {
		System.out.println("볼펜으로 글을 쓰다.");
	}

	@Override
	public String toString() {
		return "BallPen [size=" + size + ", price=" + price + ", company=" + company + "]";
	}
	
}
