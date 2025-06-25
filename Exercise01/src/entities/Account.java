package entities;

public class Account {

	private int number;
	private double balance;
	public String name;

	public Account() {
	}

	public Account(Integer number, String name) {
		this.number = number;
		this.name = name;
	}

	public Account(Integer number, Double initialDep, String name) {
		this.number = number;
		deposit(initialDep);
		this.name = name;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBalance() {
		return balance;
	}

	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public String toString() {
		return "Account " + number + ", Holder: " + name + ",  Balance: $ "
				+ String.format("%.2f", balance);
	}
}
