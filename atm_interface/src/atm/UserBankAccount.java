package atm;

import java.util.Scanner;

public class UserBankAccount {
     private float balance=10000f;
     private Scanner getScanner;

     public  UserBankAccount() {
         getScanner = new Scanner(System.in);
     }

	public void withdraw() {
		int amount=0;
		System.out.println("Enter the amount");
		amount=getScanner.nextInt();
		if(amount<=balance) {
			this.balance-=amount;
			System.out.println("Sucessfully withdrawed");
			checkBalance();
		}
		else {
			System.out.println("Oops!,Not enough Balance to Withdraw");
		}
	}
	public void deposit() {
		int amount=0;
		System.out.println("Enter amount to Deposit");
		amount=getScanner.nextInt();
		balance+=amount;
		System.out.println("Amount Deposited to your Account");
		checkBalance();

	}
	
	public void checkBalance() {
		if (balance>=500) {
			System.out.println("Your Current Balance:"+balance);
		} else {
            System.out.println("Your account has minimum balance:"+balance);
		}
	}
	
	
}
