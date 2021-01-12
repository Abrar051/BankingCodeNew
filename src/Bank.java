//import java.util.ArrayList;
import java.util.Scanner;
public class Bank extends Customer {	
	Bank(String name, String password, int acctype, int AccountNumber) {
		super(name, password, acctype, AccountNumber);
		// TODO Auto-generated constructor stub
	}
	

	public static void main (String args[])
	{
		//Customer customers = new Customer(name, pass, acctypeList, acctypeList); 
		Customer[] customers = new Customer[100];
		int accountNumber =0;
		Scanner input = new Scanner (System.in);
		while (true) {
			//Bank[] user = new Bank[10];
			System.out.println("Hi user would you like to register or login ?");
			System.out.println("If register enter 1 for lgin enter 2 : ");
			int a = input.nextInt();
			accountNumber++;
			if (a==1)
			{
				System.out.print("Enter name : ");
				String name = input.next();
				System.out.println();
				System.out.print("Enter pass : ");
				String pass1 = input.next();
				System.out.println();
				System.out.print("Confirm pass : ");
				String pass2 = input.next();
				//Account type 
				System.out.print("Enter account type : 1 for debit , 2 for credit , 3 for savings : ");
				int type = input.nextInt();
				switch (type)
				{
				  case 1:
					  
					
				}
				if (pass1.compareTo(pass2)==0)
				{
					System.out.println("Account created successfully .");
				    //AccountNumber = AccountNumber+1;
					System.out.println("Your account number is "+accountNumber);
					System.out.println("Please remember your account number ");
				}
				else 
				{
					System.out.println("Please make sure pass is correct");
				}
				customers[accountNumber-1] = new Bank(name,pass1,type,accountNumber); 
			}
			else if (a==2)
			{
				System.out.println("Enter your name : ");
				String name = input.next();
				System.out.println("Enter your password : ");
				String pass = input.next();
				System.out.println ("Enter your account number : ");
				int accNumber = input.nextInt();
				customers[accNumber-1].displayData();
				System.out.println("Would you like to withdraw or deposit money , if withdraw enter 1 if deposit enter 2 : ");
				int moneyChange = input.nextInt();
			}
			else
			{
				System.out.println("Please enter a valid input");
			}
			
		
	}
	}
}

