import java.util.Scanner;

public abstract class Credit extends Account {
	Scanner input = new Scanner(System.in);
	public int credit (int balance , int moneyChange)
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
				int limit= balance+(balance/2);
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
		}
		return balance;
	}
}
