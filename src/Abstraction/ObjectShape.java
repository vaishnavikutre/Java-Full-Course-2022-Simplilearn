//we can create concrete methods
//hiding info from outside world
//abstract class cannot be instantiated they can be subclass


package Abstraction;

public abstract class ObjectShape {
	int x,y;
	
	public ObjectShape()
	{
		System.out.println("I am default constructor...");
	}
	public void square(int x) //concrete methods
	{
		System.out.println(x*x);
	}
	
	abstract void draw();
	abstract void reshape();
}
