package ATM;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	private int CustomerNumber;
	private int PinNumber;
	private double CheckingBalance = 0;
	private double SavingBalance = 0;
	
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyformat = new DecimalFormat("'$'###,##0.00");
	
	public int getCustomerNumber() {
		return CustomerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		CustomerNumber = customerNumber;
	}
	public int getPinNumber() {
		return PinNumber;
	}
	public void setPinNumber(int pinNumber) {
		PinNumber = pinNumber;
	}
	public double getCheckingBalance() {
		return CheckingBalance;
	}
	public double getSavingBalance() {
		return SavingBalance;
	}
	public double calcCheckingWithdraw(double amount)
	{
		CheckingBalance = (CheckingBalance - amount);
		return CheckingBalance;
	}
	public double calcSavingWithdraw(double amount)
	{
		SavingBalance = (SavingBalance - amount);
		return SavingBalance;
	}
	public double calcCheckingDeposite(double amount)
	{
		CheckingBalance = (CheckingBalance + amount);
		return CheckingBalance;
	}
	public double calcSavingDeposite(double amount)
	{
		SavingBalance = (SavingBalance + amount);
		return SavingBalance;
	}
	protected void getSavingWithdrawInput() {
		System.out.println("Your Account's amount:"+moneyformat.format(SavingBalance));
		System.out.println("Amount you want to withdraw from Saving account:");
		double amount = input.nextDouble();
		if(amount > SavingBalance)
		{
			System.out.println("Sorry,You don't have that much amount in your Saving amount!!!!!!!!!!");
		}else if((SavingBalance - amount)>=0)
		{
			calcSavingWithdraw(amount);
			System.out.println("New Saving Account Balance:"+moneyformat.format(SavingBalance));
		}else {
			System.out.println("Amount can't be negative");
		}
	}
	
	protected void getCheckingWithdrawInput() {
		System.out.println("Your Account's amount:"+moneyformat.format(CheckingBalance));
		System.out.println("Amount you want to withdraw from Checking Account:");
		double amount = input.nextDouble();
		if(amount > CheckingBalance)
		{
			System.out.println("Sorry,You don't have that much amount in your Checking amount!!!!!!!!!!");
		}else if((CheckingBalance - amount)>=0)
		{
			calcCheckingWithdraw(amount);
			System.out.println("New Checking Account Balance:"+moneyformat.format(CheckingBalance));
		}else {
			System.out.println("Amount can't be negative");
		}
	}
	protected void getSavingDepositeInput() {
		System.out.println("Your Account's amount:"+moneyformat.format(SavingBalance));
		System.out.println("Amount you want to deposite to your Saving account:");
		double amount = input.nextDouble();
		if((SavingBalance + amount)>=0)
		{
			calcSavingDeposite(amount);
			System.out.println("New Saving Account Balance:"+moneyformat.format(SavingBalance));
		}else {
			System.out.println("Amount can't be negative");
		}	
	}
	protected void getCheckingDepositeInput() {
		System.out.println("Your Account's amount:"+moneyformat.format(SavingBalance));
		System.out.println("Amount you want to deposite to your Checking account:");
		double amount = input.nextDouble();
		if((CheckingBalance + amount)>=0)
		{
			calcCheckingDeposite(amount);
			System.out.println("New Checking Account Balance:"+moneyformat.format(CheckingBalance));
		}else {
			System.out.println("Amount can't be negative");
		}	
	}
}
