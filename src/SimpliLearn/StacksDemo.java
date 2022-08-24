//LIFO

package SimpliLearn;
import java.util.Stack;
public class StacksDemo {
	public static void main(String args[])
	{
		Stack<String> s = new Stack<>();
		s.push("A");
		s.push("B");
		s.push("A");
		s.push("C");
		
		System.out.println(s);
		System.out.println("Top element :" + s.peek());
		
		String poppedE =s.pop();
		System.out.println("Popped element :" + poppedE);
		System.out.println(s);
		System.out.println("Top element :" + s.peek());
	}
	
}
