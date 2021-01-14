import java.util.Scanner;

public class Debit extends Account {

	public Debit(int accNo, float amnt) {
		this.accNo = accNo;
		this.amount = amnt;
	}

	@Override
	protected void withdraw(float amnt) {
		if(this.amount < amnt)
			return;
		this.amount-=amnt;

	}

}
