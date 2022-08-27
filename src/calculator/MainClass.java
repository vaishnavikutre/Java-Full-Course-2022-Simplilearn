package calculator;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MainClass {
	public static void main(String args[])
	{
		final String InputExp = ReadInput.read();
		Queue<String> numbers;
		Queue<String> operators;
		
		String NumberArr[] = InputExp.split("[-+*/]");
		String OperatorArr[] = InputExp.split("[0-9]+");
		
		numbers = new LinkedList<String>(Arrays.asList(NumberArr));
		operators = new LinkedList<String>(Arrays.asList(OperatorArr));
		
		Double res = Double.parseDouble(numbers.poll());
		
		while(!numbers.isEmpty())
		{
			String opr = operators.poll();
			Operate sign;
			switch(opr)
			{
			case "+":
				sign = new Add();
				break;
			case "-":
				sign = new Substract();
				break;
			case "*":
				sign = new Multiply();
				break;
			case "/":
				sign = new Divide();
				break;
			default:
				continue;
					
			}
			double num=Double.parseDouble(numbers.poll());
			res=sign.getResults(res,num);
		}
		System.out.println(res);
	}
	
}
