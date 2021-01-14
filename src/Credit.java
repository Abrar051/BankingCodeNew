import java.util.Scanner;

public class Credit extends Account {
	public Credit(int accNo, float amnt) {
		this.accNo = accNo;
		this.amount = amnt;
	}

	@Override
	protected void withdraw(float amnt) {
		if(amnt > (this.amount+(this.amount/2)))
			return;
		this.amount-=amnt;
	}
}
