package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDEmo {
	public static void main(String args[])
	{
		List<Student> list = new ArrayList<>();
		Student rekha = new Student(6,"rekha","Nehru nagar");
		Student rama =  new Student(1,"Vaishnu","Azad Nagar");
		Student john = new Student(4,"Vaishu","Nehru nagar");
		
		list.add(john);
		list.add(rekha);
		list.add(rama);
		
		Collections.sort(list);
		
		System.out.println("After sorting:");
		list.forEach(Student -> System.out.println(Student.getName()));
		
		
		
		
		
		
	}
}
