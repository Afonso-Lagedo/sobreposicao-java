package entities;

public final class SavingsAccount extends Account{//FINAL a classe n�o pode ser herdada 

	private Double interestRate;
	
	public SavingsAccount () {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance +=balance * interestRate;
	}
	
	@Override //indicando que � uma sobreposi��o
	public void withdraw (double amount) {
		balance -= amount;
	}
	
	
	
}
