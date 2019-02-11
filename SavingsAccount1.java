
public class SavingsAccount1 extends Account1{
	final double minBalance = 500.0;

	public SavingsAccount1()
	{
		
	}
	
	public SavingsAccount1(long accNum, double balance, Persons1 accHolder)
	{
		super(accNum, balance, accHolder);
	}
	@Override
	public void withdraw(double withAmount) 
	{
		if(balance - withAmount > minBalance)
		{
			balance = balance - withAmount;
			System.out.println("Show the balance: " + balance);
		}
		else
		{
			System.out.println("Insuffient Fund");
		}
	}

}
