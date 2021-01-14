//import java.util.ArrayList;
import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class Bank {

	public static Customer[] customers = new Customer[100];
	public static Account[] accounts = new Account[100];

	public static void main (String args[])
	{
		int accIndex = 0;
		while (true){
			//show welcome screen
			showWelcomeScreen();
			//take integer input
			int userAction = getIntegerInput();

			if(userAction ==1)
			{
				//login functionality
				System.out.println("Enter your acc no: ");
				int userAccNo = getIntegerInput();
				System.out.println("Enter your acc no: ");
				String pass = getStringInput();
				//get customer from customer array
				Customer customer = customers[userAccNo];
				if(passWordMatches(customer.getPass(), pass))
				{
					Account account = accounts[userAccNo];
					//withdraw or deposit
					System.out.println("Enter 1 for deposit and 2 for withdraw: ");
					int depositOrWithdraw = getIntegerInput();
					System.out.println("Enter amount: ");
					float amount = getFloat();

					if(depositOrWithdraw ==1)
						account.deposit(amount);
					else
						account.withdraw(amount);

					System.out.println("Success");
					account.printAmount();
					continue;

				}else{
					System.out.println("Pass word did not match! Try again or Register first!");
					continue;
				}
			}else if(userAction == 2){

				System.out.println("Enter name: ");
				String name = getStringInput();
				System.out.println("Enter pass: ");
				String passWord = getStringInput();
				System.out.println("Enter initial amount: ");
				float initialAmnt = getFloat();
				System.out.println("1 for Credit,  2 for debit, 3 for Savings");
				int accType = getIntegerInput();

				Customer cus = new Customer(name, passWord, accIndex++);
				customers[cus.getAccNo()] = cus;
				if(accType == 1){
					Account account = new Credit(cus.getAccNo(), initialAmnt);
					accounts[cus.getAccNo()] = account;
				}else if(accType == 2){
					Account account = new Debit(cus.getAccNo(), initialAmnt);
					accounts[cus.getAccNo()] = account;
				}else {

					System.out.println("Enter max withdrawl limit: ");
					float limit = getFloat();
					Account account = new Savings(cus.getAccNo(), initialAmnt, limit);
					accounts[cus.getAccNo()] = account;

				}
				System.out.println("Yay!!success");
				System.out.println("Try to login using your pass and acc no: "+ cus.getAccNo());
				continue;
			}

			else {
				return;
			}
		}

	}

	private static float getFloat() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextFloat();

	}

	public static boolean passWordMatches(String pass, String pass1) {
		return pass.equals(pass1);

	}

	public static String getStringInput() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next();
	}

	public static void showWelcomeScreen() {
		System.out.println("Enter 1 for signin or 2 for register");

	}

	public static int getIntegerInput(){
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();


	}
}

