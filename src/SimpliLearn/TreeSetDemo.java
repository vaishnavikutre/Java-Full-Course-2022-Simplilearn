package SimpliLearn;

import java.util.TreeSet;
public class TreeSetDemo {
	public static void main(String args[])
	{
		TreeSet<String> treeset = new TreeSet<>();
		treeset.add("a");
		treeset.add("z");
		treeset.add("f");
		System.out.println(treeset);//it will print in natural order
		
	}
}
