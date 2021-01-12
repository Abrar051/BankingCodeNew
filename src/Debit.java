import java.util.Scanner;

public class Debit extends Account {

	@Override
	protected void withdraw(float amnt) {
		if(this.amount < amnt)
			return;
		this.amount-=amnt;

	}

	@Override
	protected void deposit(float amnt) {
		this.amount+=amnt;

	}
}
