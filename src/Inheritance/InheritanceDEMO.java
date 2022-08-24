package Inheritance;

public class InheritanceDEMO {
	public static void main(String args[])
	{
		MountainBike mountainbike = new MountainBike(10,20,30);
		System.out.println("Speed of bike is :" + mountainbike.speed);
		System.out.println("Gear of bike is :" + mountainbike.gear);
		System.out.println("SeatHeight of bike is :" + mountainbike.seatHeight);
	
		mountainbike.applyBreak(2);
		System.out.println("Bike speed after applying brake :" + mountainbike.speed);
	}
}
