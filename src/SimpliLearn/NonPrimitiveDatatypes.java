package SimpliLearn;

public class NonPrimitiveDatatypes {
	public static void main(String args[])
	{
		String str="test"; //string will reuse same object
		System.out.println(str);
		
		String str1=new String("test"); //everytime u call this it will create new object
		System.out.println(str1);
		
		int arr[]; //array declaration
		arr=new int[2];
		arr[0]=10;
		arr[1]=1;
		//arr[2]=4;
		System.out.println(arr);
		System.out.println(arr[1]);
		System.out.println(arr[2]); //Exception error //index 2 out of bound
		
	}
}
