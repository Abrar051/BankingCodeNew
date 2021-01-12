import java.util.Scanner;
class Customer  {
	Scanner input = new Scanner (System.in);
    String name;
    String pass;
	int acctypeList;
	int balance;
	Customer (String name , String password , int acctype , int balance)
	{
		this.name=name;
		this.pass=password;
		this.acctypeList=acctype;
	}
	public void displayData ()
	{
		System.out.println ("Your name is "+name);
		if (acctypeList==1)
		{
			System.out.println("Your account type is debit");
			System.out.println("Your balance is "+balance);
		}
		else if (acctypeList==2)
		{
			System.out.println("Your account type is credit");
			System.out.println("Your balance is "+balance);
		}
		else if (acctypeList==3)
		{
			System.out.println("Your account type is savings");
			System.out.println("Your balance is "+balance);
		}
	}
}


