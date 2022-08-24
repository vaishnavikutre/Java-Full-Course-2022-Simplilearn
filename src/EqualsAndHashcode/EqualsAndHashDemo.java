package EqualsAndHashcode;

public class EqualsAndHashDemo {
	public static void main(String args[])
	{
		Student john1 = new Student(1,"Vaishu","Nehru nagar");
		Student john2 =  new Student(1,"Vaishnu","Azad Nagar");
		Student john3 = new Student(2,"Vaishu","Nehru nagar");
		
		System.out.println(john1.equals(john2));
		System.out.println(john3.equals(john2));
		
		
	}
}
