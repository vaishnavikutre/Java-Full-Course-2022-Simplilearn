
//constructor demo
package SimpliLearn;

public class Cuboid {
	int height;
	int weight;
	int depth;
	
	public Cuboid(int height,int weight,int depth)
	{
		this.height=height;
		this.depth=depth;
		this.weight=weight;
	}
	public Cuboid(int height,int weight)
	{
		this.height=height;
		this.weight=weight;
		this.depth=10;
	}
	public Cuboid()
	{
		this.height=10;
		this.depth=10;
		this.weight=10;
	}
	
	public Cuboid(int dimensions)
	{
		this.height=dimensions;
		this.depth=dimensions;
		this.weight=dimensions;
	}
	
	public int volume()
	{
		return height * weight * depth;
	}
	
	public static void main(String args[])
	{
		Cuboid stdcuboid = new Cuboid(12,22,34);
		int volume = stdcuboid.volume();
		System.out.println("Volume of standard cuboid :" + volume);
		
		Cuboid defaulthdepthcuboid = new Cuboid(12,22);
		int volume1 = defaulthdepthcuboid.volume();
		System.out.println("Volume of cuboid with default depth :" + volume1);
		
		Cuboid defaultcuboid = new Cuboid();
		int volume2 = defaultcuboid.volume();
		System.out.println("Volume of cuboid with default dimensions :" + volume2);
		
		Cuboid fixedcuboid = new Cuboid(22,44,55);
		int volume3 = fixedcuboid.volume();
		System.out.println("Volume of cuboid with fixed dimensions :" + volume3);
		
	}
	
}
