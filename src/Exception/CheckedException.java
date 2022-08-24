package Exception;
import java.io.*;
public class CheckedException {
	public static void main(String args[]) throws IOException,FileNotFoundException,MyException {
		FileReader file = new FileReader("C:\\file\text.txt");
		BufferedReader fileInput = new BufferedReader(file);
		
		//read 3 lines of text.txt file
		for(int count=0;count<3;count++)
		{
			System.out.println(fileInput.readLine());
		}
		fileInput.close();
		throw new MyException();
		
	}
	
}