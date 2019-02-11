
public abstract class Account1 {
	private long accNum;
	protected double balance;
	private Persons1 accHolder;
	public Account1()
	{
		
	}
	public Account1(long accNum, double balance, Persons1 accHolder)
	{
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	public long getAccNum() 
	{
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() 
	{
		System.out.println("The updated balance is: " + balance);
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
		if(balance >= 500)
		{
			System.out.println("The account is enabled");
			
		}
		else
		{
			System.out.println("The account is disabled");
		}
	}
	public Persons1 getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Persons1 accHolder) {
		this.accHolder = accHolder;
	}
	
	public void depositAmount(double depAmount)
	{
		balance = balance + depAmount;
		getBalance();
		
	}
	abstract public void withdraw(double withAmount);
	
	public String toString()
	{
		return "Account [accNum: " + accNum + ", balance: " + balance + ", accHolder: " + accHolder + "]";
	}
	

}
