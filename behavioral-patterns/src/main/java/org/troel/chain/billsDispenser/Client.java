package org.troel.chain.billsDispenser;

public class Client {

	public static void main(String[] args) {
		Dispenser atm = new Dispenser();
		System.out.println("Withdrawing $230");
		atm.withdraw(230);
		System.out.println("-----------");
		System.out.println("Withdrawing $1589");
		atm.withdraw(1589);
	}
}
