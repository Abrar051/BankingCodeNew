import java.util.Scanner;
public  class Savings extends Account {
	Scanner input = new Scanner(System.in);
	public int savings (int balance , int moneyChange)
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
				if (withdrawAmmount>balance)
				{
					System.out.println("Sorry you can't withdraw more than balance");
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

