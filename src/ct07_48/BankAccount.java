package ct07_48;

public class BankAccount {

	private String accountNumber;
	
	private String accountHolder;
	
	private int balance;
	
	
	public BankAccount(String accountNumber,String accountHolder,int balance) {
		
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		
		this.balance += amount;
	}
	
	public void withdraw(int amount) {
		
		if(amount>this.balance) {
			
			System.out.println("残高不足!");
			
		}else {
			this.balance -= amount;
			
			System.out.println("口座残高: "+ this.balance+"円");
		}

	}
	
	
}
