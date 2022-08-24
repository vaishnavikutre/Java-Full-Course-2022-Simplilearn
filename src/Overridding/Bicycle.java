package Overridding;

public class Bicycle {
	protected int gear;
	protected int speed;
	public Bicycle(int startgear,int startspeed)
	{
		this.gear=startgear;
		this.speed=startspeed;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	void speedUp(int increment)
	{
		speed += increment;
	}
	void brake(int decrement)
	{
		speed -= decrement;
	}
	void gearValue(int newvalue)
	{
		gear = newvalue;
	}
}
