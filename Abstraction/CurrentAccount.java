package Abstraction;

public class CurrentAccount extends Account {
	
	public CurrentAccount(String name, String phone, double balance) {
		super.balance = balance;
		super.name = name;
		super.phone = phone;
	}

	@Override
	protected void withdraw(int amount) {
		// TODO Auto-generated method stub
		if(super.balance - amount >=0) {
			super.balance -= amount;
			super.display(balance);
		} else {
			System.out.println("You are trying to withdraw more than the  balance.");
		}
		
	}

	@Override
	protected void deposit(int amount) {
		// TODO Auto-generated method stub
		super.balance += amount;
		super.display(balance);
	}

}
