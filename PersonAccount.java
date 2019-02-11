import java.util.Scanner;
public class PersonAccount {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Persons1 smith = new Persons1();
		Persons1 kathy = new Persons1();
		Account1 smithAcc = new CurrentAccount1();
		Account1 kathyAcc = new SavingsAccount1();
		
		long accNum1 = (long)(Math.random()*10000);
		smithAcc.setAccNum(accNum1);
		smith.setName("Smith");
		smith.setAge(21);
		smithAcc.setBalance(2000);
		smithAcc.setAccHolder(smith);
		System.out.println(smithAcc.toString());
		System.out.println("The updated balance of Smith's Account is: ");
		smithAcc.depositAmount(2000);
		System.out.println(smithAcc.toString());
		double balance = smithAcc.getBalance();
		System.out.println(balance);
		Account1 savingsAcc = new SavingsAccount1(accNum1,balance,smith);
		System.out.println("Enter the withdrawal amount: ");
		double withAmount = sc.nextDouble();
		savingsAcc.withdraw(withAmount);
		System.out.println("Enter the overDraft limit: ");
		double overDraftLimit1 = sc.nextDouble();
		Account1 currAcc = new CurrentAccount1(accNum1, balance, smith, overDraftLimit1);
		currAcc.withdraw(overDraftLimit1);
		
		System.out.println("*****************************************");
		
		long accNum2 = (long)(Math.random()*10000);
		kathyAcc.setAccNum(accNum2);
		kathy.setName("Kathy");
		kathy.setAge(22);
		kathyAcc.setBalance(3000);
		kathyAcc.setAccHolder(kathy);
		System.out.println(kathyAcc.toString());
		System.out.println("The updated balance of Kathy's Account is: ");
		kathyAcc.withdraw(1000);
		System.out.println(kathyAcc.toString());
		double bal = kathyAcc.getBalance();
		System.out.println(bal);
		Account1 savingsAcc1 = new SavingsAccount1(accNum1,balance,kathy);
		System.out.println("Enter the withdrawal amount: ");
		double withAmounts = sc.nextDouble();
		savingsAcc1.withdraw(withAmounts);
		System.out.println("Enter the overDraft limit: ");
		double overDraftLimit2 = sc.nextDouble();
		Account1 currAccs = new CurrentAccount1(accNum2, balance, kathy, overDraftLimit2);
		currAccs.withdraw(overDraftLimit2);
		 
		
	}

}
