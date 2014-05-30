package account;

import java.util.Date;

public class Transaction {
	
	private int id;
	private Date date;
	private String type;
	private double amount;
	private static int counter;
	
	public Transaction(String type, double amount) {
		this.type = type;
		this.amount = amount;
		this.date = this.setDate();
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = counter;
		counter++;
	}

	public Date getDate() {
		return date;
	}

	public Date setDate() {
		return this.date = new Date();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String toString(){
		String transactionDetails = this.getType()+" "+this.getDate().toString()+" "+this.amount;
		return transactionDetails;
		
	}

}
