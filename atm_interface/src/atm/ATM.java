package atm;

import java.util.Scanner;

public class ATM {
  public static void main(String[] args) {
	  int choice=0;
	System.out.println("ATM MACHINE");
	Scanner getScanner=new Scanner(System.in);
	System.out.println("Services:");
	System.out.println("1.Withdraw Amount");
	System.out.println("2.Deposit Amount");
	System.out.println("3.Check Balance");
	System.out.println("Choose the services:");
	choice=getScanner.nextInt();
	UserBankAccount objAccount=new UserBankAccount();
	switch (choice) {
	case 1:
		System.out.println("Withdraw Section");
		objAccount.withdraw();
		break;
	case 2:
		System.out.println("Deposit Section");
		objAccount.deposit();
		break;
	case 3:
		System.out.println("Checking Balance");
		objAccount.checkBalance();
		break;
		
	default:
		System.out.println("Enter a valid services");
		break;
	}
    
	getScanner.close();
  }
}
