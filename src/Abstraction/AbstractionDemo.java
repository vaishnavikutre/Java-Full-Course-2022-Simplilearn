package Abstraction;

public class AbstractionDemo {
	public static void main(String args[])
	{
		ObjectShape ob = new Circle();
		ob.draw();
		ob.reshape();
		
		ObjectShape ob2 = new Triangle();
		ob2.draw();
		ob2.reshape();
	}
}
