/*
################################################################################################
Name: Able Varghese
Student ID: 300 806 936
Program: To Display the entered input of the patient. 
Second part allows the user to create, deposit, withdraw money to his/her account and view it.
################################################################################################
*/

package Package01;
import java.util.Scanner;
public class Main {


	public static void main(String[] args) {
		 
		
	
//		Declaring object for the patient class################################	
		Patient Obj1= new Patient();

//		Receiving User Input##################################################
		
		System.out.println("Enter the patientId");
		Scanner patientId= new Scanner(System.in);
		int intPatientId= patientId.nextInt();
		
		System.out.println("Enter the firstName");
		Scanner firstName= new Scanner(System.in);
		String stringFirstName= firstName.nextLine();
	
		
		System.out.println("Enter the lastName");
		Scanner lastName = new Scanner(System.in);
		String stringLastName= lastName.nextLine();
		
		
		System.out.println("Enter the address");
		Scanner address= new Scanner(System.in);
		String stringAddress= address.nextLine();
		
		
		System.out.println("Enter the city");
		Scanner city= new Scanner(System.in);
		String stringCity= city.nextLine();
	
		
		System.out.println("Enter the province");
		Scanner province= new Scanner(System.in);
		String stringProvince= province.nextLine();
		
		System.out.println("Enter the postalCode");
		Scanner postalCode= new Scanner(System.in);
		String stringPostalCode= postalCode.nextLine();
		
//		Setting values to the instance variables#########################################
		
		 Obj1.setPatientId(intPatientId);
		 Obj1.setFirstName(stringFirstName);
		 Obj1.setLastName(stringLastName);
		 Obj1.setAddress(stringAddress);
		 Obj1.setCity(stringCity);
		 Obj1.setProvince(stringProvince);
		 Obj1.setPostalCode(stringPostalCode);
	 
//		 Calling the getPatientInfo function to get the outputs neatly.###################
		 Obj1.getPatientInfo();
		 
		 
		 
		 
		 
//###################################################### SECOND EXERCISE ##########################################################################		 
		 
		BankAccount Obj2 = new BankAccount(); 
		 
		 
		 System.out.println("\n\n**************Second Exercise***************\n\nEnter the Account Number");
		 Scanner localBankAccountNumber = new Scanner(System.in);
		 int intLocalBankAccountNumber = localBankAccountNumber.nextInt();
		 Obj2.setAccountNumber(intLocalBankAccountNumber);
		 
		 System.out.println("Enter the Owner's Name");
		 Scanner localOwnersName = new Scanner(System.in);
		 String stringLocalOwnersName = localOwnersName.nextLine();
		 Obj2.setOwnersName(stringLocalOwnersName);
		 
		 
		 String var="";
		 while(!"e".equals(var))
		 		 
		 {
			 System.out.println("\nPress 1 to deposit\nPress 2 to withdraw\nPress 3 to view Account information and Balance\nPress 'e' to exit\n");
			 Scanner varScan = new Scanner(System.in);
			 var = varScan.nextLine();	
				 
			 switch(var)
			 {	 case "1": Obj2.Deposit();
				 break;
				 case "2": Obj2.Withdraw();
				 break;
				 case "3": Obj2.getAccountInfo();
				 break;
				 case "e": return;
				 
				 
				default: return;
			 } 
			  
		 }
		 
		 
		 
		 


}}