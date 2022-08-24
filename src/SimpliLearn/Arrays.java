package SimpliLearn;

public class Arrays {
	public static void main(String args[])
	{
		int[] array1;
		array1=new int[4];
		array1[0]=1;
		array1[1]=2;
		array1[2]=3;
		array1[3]=4;
		System.out.println("Element at index 0 :" + array1[0]);
		System.out.println("Element at index 1 :" + array1[1]);
		System.out.println("Element at index 2 :" + array1[2]);
		System.out.println("Element at index 3 :" + array1[3]);
		
		char[] array2;
		array2=new char[2];
		array2[0]='A';
		array2[1]='B';
		System.out.println("Element at index 0 :" + array2[0]);
		System.out.println("Element at index 1 :" + array2[1]);
		
		String[] array3;
		array3=new String[2];
		array3[0]="Vaishu";
		array3[1]="Kutre";
		System.out.println("Element at index 0 :" + array3[0]);
		System.out.println("Element at index 1 :" + array3[1]);
	}
}
