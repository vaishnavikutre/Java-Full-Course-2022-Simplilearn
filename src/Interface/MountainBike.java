//class can have only single parent class 
//it will not support multiple inheritance
//only one parent class and multiple interfaces

package Interface;

public class MountainBike extends FourWheeler implements Bicycle,Vehicle {
	private int height;
	private int speed;
	private int gear;
	
	public MountainBike(int height,int speed,int gear)
	{
		this.gear=gear;
		this.height=height;
		this.speed=speed;
	}
	
	

	@Override
	public void Brake(int decrement)
	{
		speed = speed -decrement;
	}
	
	@Override
	public void SpeedUp(int increment)
	{
		speed = speed + increment;
	}



	

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}



	@Override
	public void twowheeler() {
		// TODO Auto-generated method stub
		
	}
	
	
}
