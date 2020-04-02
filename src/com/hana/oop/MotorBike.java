package com.hana.oop;

public class MotorBike {

//state
private int speed; //member variable

	public int getSpeed() {
		return speed;
}

public void setSpeed(int speed) {
	this.speed = speed;
	System.out.println(this.speed);
}

	void start(){
		System.out.println("bike started");
	}
}
