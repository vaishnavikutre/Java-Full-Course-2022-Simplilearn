package Inheritance;

public class MountainBike extends Bicycle{

	public int seatHeight;
	
	public MountainBike(int startSpeed, int startGear,int startHeight) {
		super(startSpeed, startGear);
		// TODO Auto-generated constructor stub
		this.seatHeight=startHeight;
	}
	
	public void setHeight(int newValue)
	{
		seatHeight =newValue; 
	}
	
}
