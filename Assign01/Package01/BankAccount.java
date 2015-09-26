package Package01;

import java.util.Scanner;

public class BankAccount {

	
//################################ Instance Variables ##########################
	
private int accountNumber;
private String ownersName;
private double balance;

// ################################# Constructors ###############################

public BankAccount() {
	this.accountNumber=0;
	this.ownersName="";
	this.balance=0.00;
	
}


//############################### Getters #######################################
public int getAccountNumber() {
	return accountNumber;
}

public String getOwnersName() {
	return ownersName;
}

public double getBalance() {
	return balance;
}


//############################### Setters ########################################

public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}

public void setOwnersName(String ownersName) {
	this.ownersName = ownersName;
}
public void setBalance(double balance) {
	this.balance = balance;
}


//################################Displaying account info. as output ##############
public void getAccountInfo()
{
	System.out.println("\nAccount Number is :"+getAccountNumber());
	System.out.println("\nOwners Name is :"+getOwnersName());
	System.out.println("\nBalance is :"+getBalance());
}

public void Deposit()
	{
	
	
	System.out.println("Enter deposit amount");
	 Scanner DepBalance = new Scanner(System.in);
	 double doubleBalance = DepBalance.nextDouble();
	 double newBalance = getBalance() + doubleBalance;
	 setBalance(newBalance);
	 
	}

public void Withdraw()
{

System.out.println("Enter withdrawing amount");
 Scanner WitBalance = new Scanner(System.in);
 double doubleBalance = WitBalance.nextDouble();
 double newBalance = getBalance() - doubleBalance;
 setBalance(newBalance);
 
}


}
