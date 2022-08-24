package SimpliLearn;

public class ArithmeticOperators {
	public static void main(String args[])
	{
		int result=2 + 1;
		System.out.println("2 + 1 = " + result);
		int originalResult = result;
		
		result = result - 1;
		System.out.println(originalResult +" - 1 = " + result);
	    originalResult = result;
		
		result = result * 2;
		System.out.println(originalResult +" * 2 = " + result);
		originalResult = result;
		
		result = result / 2;
		System.out.println(originalResult +" / 2 = " + result);
		originalResult = result;
		
		result = result % 2;
		System.out.println(originalResult +" % 2 = " + result);
		
	}
}
