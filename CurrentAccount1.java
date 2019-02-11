
public class CurrentAccount1 extends Account1{
	double overDraftLimit;

	public CurrentAccount1()
	{
		
	}
	public CurrentAccount1(long accNum, double balance, Persons1 accHolder, double overDraftLimit)
	{
		super(accNum, balance, accHolder);
		this.overDraftLimit = overDraftLimit;
	}

	@Override
	public void withdraw(double withAmount) 
	{
		if(balance + overDraftLimit < withAmount)
		{
			System.out.println("OverDraft limit exceeded!");
		}
		else
		{
			balance = balance - withAmount;
			System.out.println("Show Updated Balance: " + balance);
		}
	}

}
