package com.sq.training.model;

public class Vehicle {
	private int wheels;
	private int seats;
	private String type;
	
	public Vehicle(int wheels, int seats, String type) {
		this.seats = seats;
		this.type = type;
		this.wheels = wheels;
	}
	
	public Vehicle(int wheels, int seats) {
		this.seats = seats;
		this.wheels = wheels;
	}
	
	public Vehicle() {
	}
	
	public void ride() {
		System.out.println("Vehicle Riding with wheels " + this.wheels);
	}
	
	public void stop() {
		System.out.println("Vehicle Stopping with wheels " + this.wheels);
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
