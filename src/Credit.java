import java.util.Scanner;

public class Credit extends Account {
	public Credit(int amnt) {

		this.amount = amnt;
	}

	@Override
	protected void withdraw(float amnt) {
		if(amnt > (this.amount+(this.amount/2)))
			return;
		this.amount-=amnt;
	}

	@Override
	protected void deposit(float amnt) {

	}
}
