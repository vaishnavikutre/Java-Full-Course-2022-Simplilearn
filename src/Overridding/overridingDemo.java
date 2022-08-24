//if the superclass defines the method then the subclass again defines the method with the exact same signature this is called method overriding.

package Overridding;

public class overridingDemo {
	public static void main(String args[])
	{
		Bicycle bc = new Bicycle(12, 40);
		
		bc.brake(7);
		System.out.println("Speed after applying break :" + bc.speed);
		bc.speedUp(6);
		System.out.println("Speed after increment :" + bc.speed);
		
		Bicycle mb = new MountainBike(30, 30, 50);
		System.out.println("Speed :" + mb.speed);
		System.out.println("Gear :" + mb.gear);
		mb.brake(6);
		System.out.println("Speed after applying brake :" + bc.speed);
		mb.speedUp(8);
		System.out.println("Speed after increment :" + bc.speed);
	}
}
