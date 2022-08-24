package innerClass;

public class OuterClass {
	void display()
	{
		System.out.println("This is OuterClass");
	}

	class InnerClass{
		void display()
	{
			System.out.println("This is innerClass");	
		}	
	}
	
	
	//method Local Class
	void outerClassMethod(){
		System.out.println("in the outer Class Method");
		class MethodLocalClass {
			
			void localInnerMethod()
			{
				System.out.println("Hi");
			}
		}
			MethodLocalClass ml = new MethodLocalClass();
			ml.localInnerMethod();
}
	
	}
