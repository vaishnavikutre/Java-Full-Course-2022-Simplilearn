package StaticNestedClass;

public class OuterClass {
	static int outerMember = 30;
	int instance = 10;
	private static int privateMember = 90;
	
	static class StaticNestedClass{
		void display() {
			System.out.println("outer member :"+outerMember);
			System.out.println("outer  private member :"+privateMember);
			//System.out.println("non static member :"+instance);
			
		}
	}
}
