package Recursion;

public class FactorialDemo {
	public static void main(String args[])
	{
		ComplexFunction factorial = new ComplexFunction();
		int result =factorial.Factorial(5);
		System.out.println("Factorial is :" + result);
	}
}
