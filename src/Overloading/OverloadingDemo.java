//method overloading is same as polymorphism 
//polymorphism means entity can take different form ..entity may be object ,class or methods 
//same name but different forms

package Overloading;

public class OverloadingDemo {
	public void multiply(int a,int b,int c)
	{
		System.out.println(a*b*c);
	}
	public void multiply(int a,int b)
	{
		System.out.println(a*b);
	}
	public void multiply(double a,double b)
	{
		System.out.println(a*b);
	}
	public static void main(String args[])
	{
		OverloadingDemo demo = new OverloadingDemo();
		demo.multiply(3, 4);
		demo.multiply(5, 6);
		demo.multiply(4, 0, 7);
	}
}
