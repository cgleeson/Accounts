package account;
import static java.lang.Math.*;

public class Driver {
	
	

	public static void main(String[] args) {

		Account acc = new Account("Jack", 100);
		Account accTwo = new Account("Jill", 30);
		//Driver d = new Driver();
		
		System.out.println("Name: "+acc.getName()+"\nAcc No: "+acc.getId()
				+"\nBal: "+acc.getBalance()+"\nDate created: "+acc.getDate().toString());
		
		System.out.println("Name: "+accTwo.getName()+"\nAcc No: "+accTwo.getId()
				+"\nBal: "+accTwo.getBalance()+"\nDate created: "+accTwo.getDate().toString());
		
		System.out.println("The number of accounts created is: "+ Account.numberOfAccounts);
		
		for (int i=0 ; i<5 ; i++){
			accTwo.deposit(125, accTwo);
		}
		
		System.out.println("Deposit 100 for Jill, new balance is "+accTwo.getBalance()
				+"\n\nTransactions:\nType\tDate\t\t\tAmount"+accTwo.displayTransactions());
		
		
		acc.withdraw(45, acc);
		System.out.println("\nWithdraw 50 for Jack, new balance is "+acc.getBalance());
	
		}

	
	public double generateRandomAmount(){
		double amount =(random()+1*1000);
		return amount;
	}

}
