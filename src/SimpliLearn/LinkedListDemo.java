package SimpliLearn;
import java.util.*;

public class LinkedListDemo {
	public static void main(String args[])
	{
		LinkedList<String> linkedL = new LinkedList<String>();
		
		linkedL.add("a");
		linkedL.add("b");
		linkedL.addFirst("a");
		linkedL.addLast("Z");
		linkedL.add(4,"w");
		System.out.println(linkedL);
		
		linkedL.remove("a");
		System.out.println(linkedL);
		linkedL.removeFirst();
		linkedL.removeLast();
		linkedL.remove(1);
		System.out.println(linkedL);
		
		
	}
}
