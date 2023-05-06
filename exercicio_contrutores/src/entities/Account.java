package entities;

public class Account {

	private int accountNumber;
	private String accountHolder;
	private double initialDeposit;
	private double depositAccount;
	private double withdrawAccount;

	public Account(int accountNumber, String accountHolder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.initialDeposit = initialDeposit;
	}
	public Account(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}
	
	public Account(double depositAccount, double withdrawAccount) {
		this.depositAccount = depositAccount;
		this.withdrawAccount = withdrawAccount;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public double getInitialDeposit() {
		return initialDeposit;
	}
	public void setInitialDeposit(double initialDeposit) {
		this.initialDeposit += initialDeposit;
	}
	
	public double getDepositAccount() {
		return depositAccount;
	}
	public void setDepositAccount(double depositAccount) {
		this.depositAccount = depositAccount;
	}
	
	public double getWithdrawAccount() {
		return withdrawAccount;
	}
	public void setWithdrawAccount(double withdrawAccount) {
		this.withdrawAccount = withdrawAccount;
	}
	
	public void Deposit(double deposit) {
		this.initialDeposit += deposit;
	}
	public void Withdraw(double withdraw) {
		this.initialDeposit -= withdraw + 5;
	}
	
	public String toString() {
		return accountNumber + ", Holder: "
				+ accountHolder
				+", Balance: $"
				+String.format("%.2f", initialDeposit);
	}
	
}
