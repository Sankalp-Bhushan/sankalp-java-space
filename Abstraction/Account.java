package Abstraction;

public abstract class Account {
	protected String name, number, phone;
	protected double balance;

	protected abstract void withdraw(int amount);

	protected abstract void deposit(int amount);
	
	protected  void display(double balance2) {
		System.out.println("Balance : " + balance2);
	}
}
