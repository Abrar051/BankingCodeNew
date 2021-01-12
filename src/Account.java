//Withdraw or deposit
public abstract class Account  {
	protected int accNo;
	protected float amount;

	abstract protected void withdraw(float amnt);
	abstract protected void deposit(float amnt);
}

