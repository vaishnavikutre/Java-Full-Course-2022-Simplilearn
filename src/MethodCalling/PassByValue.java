//pass by value 
//pass by reference = return

package MethodCalling;

public class PassByValue {
	public static void main(String[] args)
	{
		int i = 1;
	    Value(i);
		System.out.println("i is :"+i);
	}
	
	
	
	
	static void Value(int i)
	{
		i=i+1;
		
	}
}
