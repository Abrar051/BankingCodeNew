//import java.util.ArrayList;
import java.util.Scanner;
public class Bank {

	

	public static void main (String args[])
	{
		//Customer customers = new Customer(name, pass, acctypeList, acctypeList); 
		Customer[] customers = new Customer[100];
		Account[] accounts = new Account[100];


		//create new savings
		Credit credit = new Credit(100);


		//create new debit


		//create new credit


		//add them to account array
		accounts[0] = credit;
		accounts[1] = new Debit();


		//withdraw
//		accounts[0].withdraw(100);
		accounts[1].withdraw(100);




	}
}

