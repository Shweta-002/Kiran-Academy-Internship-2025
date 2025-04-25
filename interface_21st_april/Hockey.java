package com.interface_21st_april;

public class Hockey implements Playable {

	@Override
	public void play() {
		System.out.println("Playing Hockey...........");

	}

	public static void main(String[] args) {

		Football f = new Football();
		f.play();

		BasketBall b = new BasketBall();
		b.play();

		Hockey h = new Hockey();
		h.play();
	}

}
