package com.day5;

public class MyVehicle {

	public static void main(String[] args) {
	Car SUV=new Car();
	SUV.setVname("Mahindra SUV");
	SUV.setNumberOfWheels(4);
	SUV.setNumberOfGear(6);
	SUV.setStering("Power Stering");
	SUV.setNumberOfSeats(8);
	SUV.setDoor("Sliding Door");
	SUV.setSpeedLimit(140);
	SUV.setFuelType("Diesel");
	
	//System.out.println("Vehicle moves :" +SUV.moves());
	System.out.println("Mahindra SUV Features");
	System.out.println("*********************");
	
	System.out.println("Vehicle Name:" +SUV.getVname());
	System.out.println("Numbers Of Wheel:" +SUV.getNumberOfWheels());
	System.out.println("Numbers of Gears:" +SUV.getNumberOfGear());
	System.out.println("Which Types Of Stering:" +SUV.getStering());
	System.out.println("Number of Seats" +SUV.getNumberOfSeats());
	System.out.println("Limited Speed of SUV:" +SUV.getSpeedLimit());
	System.out.println("Fuel Type of Suv:" +SUV.getFuelType());
	System.out.println("Types of Door:" +SUV.getDoor());
	SUV.moves();
	SUV.honk();
	System.out.println("\n");
	
			 Bike Bullet=new Bike();
			 Bullet.setVname("Royal Enfield");
			 Bullet.setNumberOfWheels(2);
			 Bullet.setNumberOfGear(6);
			// Bullet.setStering("");
			 Bullet.setNumberOfSeats(2);
			 Bullet.setSpeedLimit(120);
			 Bullet.setFuelType("Petrol");
			 Bullet.setHandle("Automatic");
			 	
			    System.out.println("Features of Royal Enfield");
				System.out.println("*********************");
				Bullet.showData();
			   /* System.out.println("Vehicle Name:" +Bullet.getVname());
				System.out.println("Numbers Of Wheel:" +Bullet.getNumberOfWheels());
				System.out.println("Numbers of Gears:" +Bullet.getNumberOfGear());
				//System.out.println("Which Types Of Stering:" +Bullet.getStering());
				System.out.println("Number of Seats:" +Bullet.getNumberOfSeats());
				System.out.println("Limited Speed of Royal Enfield:" +Bullet.getSpeedLimit());
				System.out.println("Bullet Handle Type:" +Bullet.getHandle());
				System.out.println("Fuel Type of Royal Enfield:" +Bullet.getFuelType());
				*/
				Bullet.moves();
				Bullet.honk();
				
				System.out.println("\n");
				
				Truck tr=new Truck();
				tr.setVname("Ashok Layland");
				tr.setNumberOfWheels(8);
				tr.setNumberOfGear(6);
				tr.setStering("Power Stering");
				tr.setNumberOfSeats(6);
				tr.setSpeedLimit(160);
				tr.setFuelType("Diesel");
				tr.setDoor("Locked Door");
				
				System.out.println("Features of AShok Layland Truck");
				System.out.println("*********************");
			    System.out.println("Vehicle Name:" +tr.getVname());
				System.out.println("Numbers Of Wheel:" +tr.getNumberOfWheels());
				System.out.println("Numbers of Gears:" +tr.getNumberOfGear());
				System.out.println("Which Types Of Stering:" +tr.getStering());
				System.out.println("Number of Seats:" +tr.getNumberOfSeats());
				System.out.println("Limited Speed of Truck:" +tr.getSpeedLimit());
				System.out.println("Fuel Type of Truck:" +tr.getFuelType());
				System.out.println("Types of Door:" +tr.getDoor());
				tr.moves();
				tr.honk();
	}
	

}
