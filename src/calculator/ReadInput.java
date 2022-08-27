package calculator;

import java.util.Scanner;

public class ReadInput {
	public static String read() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Expression:(for ex.2+3*7/6)");
		String InputExp = sc.next();
		sc.close();
		return InputExp;
	}
}
