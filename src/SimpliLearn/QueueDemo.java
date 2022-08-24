//First in first out

package SimpliLearn;
import java.util.PriorityQueue;
import java.util.Queue;
public class QueueDemo {
	public static void main(String args[])
	{
		Queue<String> queue= new PriorityQueue<>();
		queue.add("A");
		queue.add("B");
		queue.add("B");
		queue.add("C");
		
		System.out.println("Original Queue :" + queue);
		
		System.out.println("Top element :" + queue.peek());
		
		queue.remove();
		System.out.println("After removing :" + queue);
		
		queue.remove();
		System.out.println("After removing :" + queue);
		
		System.out.println("Top element :" + queue.peek());
		
		String head = queue.poll();
		System.out.println("removed head :" + head);
		
		System.out.println("After removing :" + queue);
		
	}
}
