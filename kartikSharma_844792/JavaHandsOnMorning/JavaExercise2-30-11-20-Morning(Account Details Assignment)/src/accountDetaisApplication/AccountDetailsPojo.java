package accountDetaisApplication;

public class AccountDetailsPojo {

	Integer accountNumber;
	Double balance;

	public AccountDetailsPojo(Integer accountNumber, Double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account Number= " + accountNumber + ", Balance= " + balance;
	}

}
