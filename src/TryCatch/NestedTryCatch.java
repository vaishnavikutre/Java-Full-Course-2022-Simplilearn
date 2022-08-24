package TryCatch;

public class NestedTryCatch {
	public static void main(String args[])
	{
		try {// 1st block
			try {// 2nd block
				try { //3rd block
					int arr[]= {1,2,3};
					System.out.println("Element at index 5 :"+arr[5]);
					
				}catch(IndexOutOfBoundsException e)
				{
					System.out.println("3rd block"+e.getMessage());
					throw e;
				}
			}catch(IndexOutOfBoundsException e)
			{
				System.out.println("2st block");
				throw e;
			}
		}catch(IndexOutOfBoundsException e)
		{
			System.out.println("1st block");
		}
		finally {
			System.out.println("Finally block..");
		}
	}
}
