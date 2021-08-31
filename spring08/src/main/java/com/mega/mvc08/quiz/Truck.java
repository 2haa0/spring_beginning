package com.mega.mvc08.quiz;

public class Truck<A, B> {
	A weight;
	B distance;
	
	@Override
	public String toString() {
		return "Truck [weight=" + weight + ", distance=" + distance + "]";
	}
}
