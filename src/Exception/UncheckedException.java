package Exception;

public class UncheckedException {
	private static String d;

	public static void main(String args[])
	{
		int data=100/0;
		System.out.println(data);
		
		d = null;
		System.out.println(d.charAt(0));
		
	}
}
