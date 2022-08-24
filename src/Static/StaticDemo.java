//static keyword comes with fields and methods to class not for instances or object
//Student.collegeName 
//collegeNAme is initiated only once when the class called 

package Static;

public class StaticDemo {
	public static void main(String args[])
	{
		
	
	Student s=new Student("Vaishu","a.p.m.c. road,Belgaum");
	System.out.println("Name :" +s.name);
	System.out.println("Address : "+s.address);
	System.out.println("College Name :" + Student.collegeName);
	}
}
