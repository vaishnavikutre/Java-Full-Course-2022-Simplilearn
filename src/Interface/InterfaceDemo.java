package Interface;

public class InterfaceDemo {
	public static void main(String args[])
	{
		MountainBike mb = new MountainBike(10, 20, 30);
		System.out.println("Speed is : " + mb.getSpeed());
		System.out.println("Height is : "+ mb.getHeight());
		System.out.println("Gear is :" + mb.getGear());
		mb.Brake(2);
		System.out.println("Speed after applying brake :"+ mb.getSpeed() );
		mb.SpeedUp(4);
		System.out.println("Speed after increment :"+ mb.getSpeed() );
		
		//Anonymous inner class //after writing new Bicycle ctrl+space and select anonymous class
//		Bicycle bc = new Bicycle() {
//			
//			@Override
//			public void SpeedUp(int increment) {
//				//speed = speed + increment;
//				
//			}
//			
//			@Override
//			public void Brake(int decrement) {
//				//speed = speed -decrement;
//				
//			}
//		};
//		bc.SpeedUp(4);
		
	}	
}
