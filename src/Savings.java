import java.util.Scanner;
public  class Savings extends Account {
	private float limit;

	public Savings(int accNo, float amnt, float limit) {
		this.accNo = accNo;
		this.amount = amnt;
		this.limit = limit;
	}

	@Override
	protected void withdraw(float amnt) {
		if(amnt > this.limit)
			return;
		this.amount-=amnt;


	}

}
