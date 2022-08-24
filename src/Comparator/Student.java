package Comparator;

public class Student implements Comparable<Student>{
	private int rollnumber;
	private String name;
	private String address;
	private int age;
	
	public Student(int rollnumber,String name,String address,int age)
	{
		this.setAddress(address);
		this.setName(name);
		this.setRollnumber(rollnumber);
		this.age=age;
	}

	public int getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
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

	@Override
	public int compareTo(Student o) {
		
		return this.rollnumber - o.rollnumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
