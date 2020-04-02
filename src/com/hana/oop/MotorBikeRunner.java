package com.hana.oop;

public class MotorBikeRunner {
	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();
		
		ducati.start();
		ducati.setSpeed(120);

		honda.start();
		honda.setSpeed(80);
	}

}
