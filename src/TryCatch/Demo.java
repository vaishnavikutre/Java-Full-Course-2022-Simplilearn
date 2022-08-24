package TryCatch;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public void trycatch() {
		try {
			System.out.println("I am try block");
			List<Integer> list = new ArrayList<>();
			list.add(10);
			System.out.println("Element at index 1: "+list.get(1));
		} catch ( IndexOutOfBoundsException e)
		{
			System.err.println("Exception is :" +e.getMessage());
		}
		
		
		finally{
			System.out.println("I am finally block...");
		}
	}
}
