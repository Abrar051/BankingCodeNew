import java.util.Scanner;

public abstract class Debit extends Account {
	Scanner input = new Scanner(System.in);
	public int debit (int balance , int moneyChange , int limit)
	{
		if (balance==0)
		{
			System.out.println ("Sorry your balance is 0");
		}
		else 
		{   //withdraw 1 deposit 2
			if (moneyChange==1)
			{
				//withdraw 
				System.out.println ("Enter withdrawal amount : ");
				int withdrawAmmount = input.nextInt();
				if (withdrawAmmount>balance | withdrawAmmount>limit)
				{
					System.out.println("Sorry your balance is insufficient or your limit crossed ");
					return 0;
				}
				else
				{
					balance=balance-withdrawAmmount;
					System.out.println ("Your present balance is "+balance);
					//return balance;
				}
			}
			else if (moneyChange==2)
			{
				//desposit
				System.out.println("Enter deposit amount : ");
				int depositAmmount = input.nextInt();
				balance=balance+depositAmmount;
			}
		}
		return balance;
	}
}
