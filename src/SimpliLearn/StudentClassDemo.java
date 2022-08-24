package SimpliLearn;

public class StudentClassDemo {
	String name;
	int age;
	String address;
	
	public StudentClassDemo(String name,int age,String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public void setAddress(String address)
	{
		this.address=address;
	}
	
	public String getName(String name)
	{
		return name;
	}
	
	public int getAge(int age)
	{
		return age;
	}
	
	public String getAddress(String address)
	{
		return address;
	}
	
	public static void main(String args[])
	{
		StudentClassDemo vaishu = new StudentClassDemo("Vaishnavi", 22 ,"Nehru nagar");
		System.out.println(vaishu.address);
		System.out.println(vaishu.age);
		System.out.println(vaishu.name);
		
		System.out.println(vaishu.getName("Rama"));
		System.out.println(vaishu.name);
		
	}
	
}
