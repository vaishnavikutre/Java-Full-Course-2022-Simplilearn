package Overridding;

public class MountainBike extends Bicycle {
	int seatHeight;
	public MountainBike(int startgear,int startspeed,int seatHeight)
	{
		super(startgear,startspeed);
		this.seatHeight=seatHeight;
		
	}
	
	public void setHeight(int height)
	{
		this.seatHeight = height;
	}
	
	public int getHeight()
	{
		return seatHeight;
	}
	
	@Override
	public void speedUp(int increment)
	{
		speed = speed + increment + 10;
	}
	
	@Override
	public void gearValue(int newvalue)
	{
		gear = gear + newvalue  + 10;
	}
	
	
}
