package com.mega.mvc08.quiz;

public class 실수처리 {

	public static void main(String[] args) {
		double pie = 3.554159;
		System.out.println(Math.round(pie));
		System.out.println(Math.floor(pie));
		System.out.println(Math.ceil(pie));
		System.out.println(String.format("%.2f", pie));
		System.out.printf("내 나이는 %10d살입니다.\n", 30);
		System.out.printf("내 시력은 %.2f입니다,\n", 0.145);
		System.out.printf("내 이름은 %s입니다.", "이하영");
	}

}
