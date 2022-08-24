package ATM;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account{
	
	Scanner Input =new Scanner(System.in);
	HashMap<Integer,Integer> data = new HashMap<Integer,Integer>();
	DecimalFormat numberFormat = new DecimalFormat(" '$'###,##0.00");

	public void getLogin() throws IOException
	{
		int x=1;
	     
		do {
		data.put(1,1);
		data.put(2, 2);
		
		try
		{
			System.out.println("..........Welcome to SBI ATM..........");
			System.out.println("......................................");
			System.out.println("Enter Customer Number :");
			setCustomerNumber(Input.nextInt());
			System.out.println("Enter PIN Number:");
			setPinNumber(Input.nextInt());
			
		}catch (Exception e)
		{
			System.out.println("Invalid Number!!!!!!!!!!!!!!!!!!");
			x=2;
		}
		int cn = getCustomerNumber();
		int pn = getPinNumber();
		if(data.containsKey(cn) && data.get(cn) == pn)
		{
			getAccountType();
			x=2;
		}else 
			System.out.println("Wrong number!!!!!!!");
		}while(x==1);	
}
		
		public void getAccountType()
		{
			System.out.print("Enter your Account Type :");
			System.out.println("\nType 1 -Checking Account \nType 2 -Saving Account\nType 3 - Exit");
			
			int option = Input.nextInt();
			switch(option)
			{
			case 1 :
				getChecking();
				break;
			case 2:
				getSaving();
				break;
			case 3:
				System.out.println("Thanks for visiting....");
				System.out.println();
				System.out.println();
				
				try {
					getLogin();
					break;
				} catch (IOException e) {
					//e.printStackTrace();
					getAccountType();
					break;
				}
			default:
				System.out.println("Invalid Choice!!!!!!!!");
				getAccountType();
				break;
			}
			
		}

		public void getSaving() {
			System.out.println("Saving Account :");
			System.out.println("Type 1- View Balance");
			System.out.println("Type 2- Deposite Money");
			System.out.println("Type 3- Withdraw Money");
			System.out.println("Type 4-Exit");
			
			int option = Input.nextInt();
			switch(option)
			{
			case 1:
				System.out.println("Checking Account Balance :" + numberFormat.format(getSavingBalance()));
				getAccountType();
				break;
			case 2:
				getSavingDepositeInput();
				getAccountType();
				break;
			case 3:
				getSavingWithdrawInput();
				getAccountType();
				break;
			case 4:
				System.out.println("Thanks for visiting ATM,Bye....");
				System.out.println();
				System.out.println();
				try {
					getLogin();
					break;
				} catch (IOException e) {
					//e.printStackTrace();
					getAccountType();
					break;
				}
				
			default:
				System.out.println("Invalid choice!!!!!!!!!");
				getAccountType();
				break;
			}
		}

		public void getChecking() {
			System.out.println("Checking Account :");
			System.out.println("Type 1- View Balance");
			System.out.println("Type 2- Deposite Money");
			System.out.println("Type 3- Withdraw Money");
			System.out.println("Type 4-Exit");
			
			int option = Input.nextInt();
			switch(option)
			{
			case 1:
				System.out.println("Checking Saving Account's Balance :" + numberFormat.format(getCheckingBalance()));
				getAccountType();
				break;
			case 2:
				getCheckingDepositeInput();
				getAccountType();
				break;
			case 3:
				getCheckingWithdrawInput();
				getAccountType();
				break;
			case 4:
				System.out.println("Thanks for visiting ATM,Bye....");
				System.out.println();
				System.out.println();
				try {
					getLogin();
					break;
				} catch (IOException e) {
					//e.printStackTrace();
					getAccountType();
					break;
				}
			default:
				System.out.println("Invalid choice!!!!!!!!!");
				getAccountType();
				break;
			}
			
		}
}
