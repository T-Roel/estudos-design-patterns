package org.troel.chain.billsDispenser;

public class Bill {
	
	private Integer value;
	private Bill nextBill;
	
	public Bill(Integer value) {
		this.value = value;
	}
	
	public Bill(Integer value, Bill nextBill) {
		this.value = value;
		this.nextBill = nextBill;
	}

	public void setNextBill(Bill nextBill) {
		this.nextBill = nextBill;
	}
	
	public void execute(Integer remaining) {
		if(remaining >= value) {
			int bills = remaining / value;
			remaining %= value;
			System.out.println(String.format("- %d bill(s) of $%d, $%d remaining", bills, value, remaining));
		}
		
		if(remaining == 0) {
			return;
		}
		
		if(nextBill != null) {
			nextBill.execute(remaining);
		}
	}
}
