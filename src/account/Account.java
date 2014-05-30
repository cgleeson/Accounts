package account;

import java.util.Date;

public class Account {

	private int id;
	private String name;
	private double balance;
	private Date date;

	private static int counter=1;
	public static int numberOfAccounts;
	private Transaction [] transactions = new Transaction [10];
	private int numberOfTransactions;

	public Transaction[] getTransactions() {
		return this.transactions;
	}

	public Account(String name, double amount) {
		this.name = name;
		this.setId();
		this.setDate();
		this.balance = this.setBalance(amount);
		numberOfAccounts++;
	}
	public int getId() {
		return id;
	}
	public void setId() {
		this.id = counter;
		counter++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public double setBalance(double amount) {
		return this.balance = amount;
	}
	public Date getDate() {
		return date;
	}
	public Date setDate() {
		return this.date = new Date();
	}

	public void deposit(double amount, Account acc){
		if (amount >=  0){
			acc.setBalance(acc.getBalance() + amount);
			Transaction t = new Transaction("Deposit", amount);
			acc.addTransaction(t);
		}
	}

	public void withdraw(double amount, Account acc){
		double balance = acc.getBalance();
		if (amount <= balance){
			acc.setBalance(balance - amount);
			Transaction t = new Transaction("Withdrawl", amount);
			acc.addTransaction(t);
		}
	}

	public void addTransaction(Transaction t){

		if(numberOfTransactions < 10){
			this.transactions[numberOfTransactions] = t;
			numberOfTransactions++;
		}
	}

	public String displayTransactions(){
		String result="";
		for(Transaction t : transactions){
			if (t != null)
			result+= "\n"+t.toString();
		}
		return result;
	}
	


}
