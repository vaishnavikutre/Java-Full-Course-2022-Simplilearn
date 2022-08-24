package MethodCalling;

public class PassByReference {
	public static void main(String args[])
	{
		int i =1;
		int result = value(i);
		System.out.println("i is :"+result);
	
	}

	private static int value(int i) {
		// TODO Auto-generated method stub
		i=i+3;
		return i;
	}
}
