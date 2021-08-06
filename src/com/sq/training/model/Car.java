package com.sq.training.model;

public class Car extends Vehicle {
	
	@Override
	public void ride() {
		super.ride();
		System.out.println("Car Riding");
	}
	
	@Override
	public void stop() {
		super.stop();
		System.out.println("Car Stopping");
	}

}
