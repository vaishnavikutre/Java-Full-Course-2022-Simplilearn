package SimpliLearn;
import java.util.*;


public class AArrayList{

	public static void main(String args[])
	{
		List<Integer> arrayL = new ArrayList<>(5);
		
		for(int i=1;i<=5;i++)
		{
			arrayL.add(i);
		}
		System.out.println(arrayL);
		
		arrayL.remove(3);//remove element at index 3
		System.out.println(arrayL);
		
		//enhanced for loop
		for(int i :arrayL)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		
		//normal for loop
		for(int i=0;i<arrayL.size();i++)
		{
			System.out.print(arrayL.get(i)+" ");
		}
	}
}