package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ComparatorDEmo{
	public static void main(String agrs[])
	{
		List<Student> list = new ArrayList<>();
		Student rekha = new Student(6,"rekha","Nehru nagar",20);
		Student rama =  new Student(1,"Vaishnu","Azad Nagar",80);
		Student john = new Student(4,"Vaishu","Nehru nagar",23);
		
		list.add(john);
		list.add(rekha);
		list.add(rama);
		
		Collections.sort(list);
		
		System.out.println("After sorting:");
		list.forEach(Student -> System.out.println(Student.getName()));
		
		System.out.println("For accending order of age s1 < s2 : return -1");
		System.out.println("For dec order of age s1 > s2 : return 1");
		Collections.sort(list, new AgeComparator());
		list.forEach(Student -> System.out.println(Student.getName() +":"+Student.getAge()));
	}
}
