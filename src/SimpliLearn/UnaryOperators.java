package SimpliLearn;

public class UnaryOperators {
	public static void main(String args[])
	{
		int result = +1;
		System.out.println("unary plus : " + result);
		
		result = -result;
		System.out.println("unary minus :" + result);
		
		//if we want to make -1 to +1 then use Math.abs(-1)
		
		result = result + 5;
		System.out.println("arithmetic operator -1 + 5 :" + result);
		
		result--;
		System.out.println("decrement : " + result);
		
		result++;
		System.out.println("PostIncrement : " + result);
		
		++result;
		System.out.println("PreIncrement : " + result);
		
		result++;
		System.out.println("PostIncrement : " + result);
		
		System.out.println("preIncrement: " + ++result);
		System.out.println("postIncrement : "+ result++);
		System.out.println("Value after post Increment" +result);
		
		
		boolean success = false;
		System.out.println(success);
		System.out.println(!success);
		
	}
	
}
