package com.day5;

public class Vehicle {
protected String Vname;
protected int numberOfWheels;
protected int numberOfGear;
protected int numberOfSeats;
protected int speedLimit;
protected String FuelType;

public void moves()
{
	System.out.println("Vehicle is Running.....");
	}
public void honk()
{
	System.out.println("Vehicle is Horning.....");
}

public String getVname() {
	return Vname;
}
public void setVname(String vname) {
	this.Vname = vname;
}
public int getNumberOfWheels() {
	return numberOfWheels;
}
public void setNumberOfWheels(int numberOdWheels) {
	this.numberOfWheels = numberOdWheels;
}
public int getNumberOfGear() {
	return numberOfGear;
}
public void setNumberOfGear(int numberOfGear) {
	this.numberOfGear = numberOfGear;
}
public int getNumberOfSeats() {
	return numberOfSeats;
}
public void setNumberOfSeats(int numberOfSeats) {
	this.numberOfSeats = numberOfSeats;
}
public int getSpeedLimit() {
	return speedLimit;
}
public void setSpeedLimit(int speedLimit) {
	this.speedLimit = speedLimit;
}
public String getFuelType() {
	return FuelType;
}
public void setFuelType(String fuelType) {
	this.FuelType = fuelType;
}

public void showData()
{
System.out.println("Vehicle Name:"+getVname());
System.out.println("Number of Wheels:"+getNumberOfWheels());
System.out.println("Numbers of gears:"+getNumberOfGear());
System.out.println("Number of Seat:"+getSpeedLimit());
System.out.println("Vehicle Speed Limitation:"+getSpeedLimit());
System.out.println("Vehicle Fuel Types:"+getFuelType());
}
}
