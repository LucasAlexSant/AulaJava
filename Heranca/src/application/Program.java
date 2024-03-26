package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Joao", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "maria", 0.0, 500);

		// UPCASTING

		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "BOB", 0, 200);
		Account acc3 = new SavingsAccount(1004, "JEFERSON", 0.0, 0.1);

		// DOWNCAST

		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);

		// BusinessAccount acc5 =(BusinessAccount)acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 =(BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("LOAN!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}
}