package innerClass;

public class innerClassDemo {
	public static void main(String args[])
	{
		OuterClass.InnerClass oi = new OuterClass().new InnerClass();
		oi.display();
		
		OuterClass o = new OuterClass();
		o.outerClassMethod();
		o.display();
		
		
		
		
	}
}
