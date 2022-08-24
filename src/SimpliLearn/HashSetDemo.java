package SimpliLearn;
import java.util.*;

public class HashSetDemo {
	public static void main(String args[])
	{
		HashSet<String> hashset = new HashSet<String>();
		hashset.add("A");
		hashset.add("B");
		boolean r1 = hashset.add("C");
		System.out.println(r1);
		boolean r2 = hashset.add("C");
		System.out.println(r2);
		
		System.out.println("Is set contains c?" + hashset.contains("C"));
		
		hashset.remove("A");
		System.out.println(hashset);
		
		for(String item : hashset)
		{
			System.out.println(item);
		}
		
		
	}
}
