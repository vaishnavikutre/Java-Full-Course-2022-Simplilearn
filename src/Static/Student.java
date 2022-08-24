//static method can access static variable
//non static method can access static and nonstatic variable

package Static;

public class Student {
	
	//static block
	//it will execute only once when the class is loaded
	static
	{
		System.out.println("It will execute only once when the class is loaded");
		//int age; //it s static variable
	}
	
	String name;
	String address;
	static String collegeName = "NVN";
	static int count=0;
	
	public Student(String name,String address)
	{
		this.name=name;
		this.address=address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	static void countStudent()
	{
		count = count + 1;
	}
	
	public int getCount()
	{
		return count;
	}
	
}
