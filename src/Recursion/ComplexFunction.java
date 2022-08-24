//phenomenon of method calling itself

package Recursion;

public class ComplexFunction {
	int Factorial(int n)
	{
		if(n == 1)
			return 1;		
		else
		{
			return n * Factorial(n - 1);
		}
	}
}
