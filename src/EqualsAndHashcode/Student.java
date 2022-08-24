package EqualsAndHashcode;

public class Student {
	private int rollnumber;
	private String name;
	private String address;
	
	public Student(int rollnumber,String name,String address)
	{
		this.setAddress(address);
		this.setName(name);
		this.setRollnumber(rollnumber);
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
	public boolean equals(Object obj)
	{
		if(this == obj)
			return true;
		if(obj == null || this.getClass()!=obj.getClass())
			return false;
		
		Student student = (Student) obj;
		
		return(student.rollnumber ==this.rollnumber);
		
	}
	
	@Override
	public int hashCode()
	{
		return this.rollnumber;
	}
	
}
