package SimpliLearn;

import java.util.HashMap;
import java.util.Map.Entry;
public class HashMapDEmo {
	public static void main(String args[])
	{
		HashMap<String,Integer> hashmap = new HashMap<>();
		hashmap.put("A", 1);
		hashmap.put("B", 2);
		hashmap.put("C", 3);
		
		System.out.println(hashmap);
		
		System.out.println("Is map contains A :"+ hashmap.containsKey("A"));
		int v = hashmap.get("A");
		System.out.println("Value of A is "+ v);
		
		for(String set:hashmap.keySet())
		{
			System.out.println("Key :" + set + " Value :" + hashmap.get(set));
		}
		
		for(Entry<String, Integer> entry : hashmap.entrySet())
		{
			System.out.println("Key =" + entry.getKey()+ " Value =" + entry.getValue() );
		}
		
		
		
	}
}
