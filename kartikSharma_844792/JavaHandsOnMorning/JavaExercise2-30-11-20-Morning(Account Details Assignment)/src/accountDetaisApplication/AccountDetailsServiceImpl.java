package accountDetaisApplication;

import java.util.ArrayList;
import java.util.List;

public class AccountDetailsServiceImpl implements AccountDetailsService  {
	List<AccountDetailsPojo> data = new ArrayList<AccountDetailsPojo>();

	@Override
	public void add(int accountNumber, Double balance) throws Exception {

		int count = 0;

			for (int i = 0; i < data.size(); i++) {
				if (data.get(i).getAccountNumber().equals(accountNumber)) {

					count = count + 1;

					throw new Exception("AccountAlreadyException");
				}

			}

			if (count == 0) {

				data.add(new AccountDetailsPojo(accountNumber, balance));
			}

		} 
	
		

	@Override
	public List<AccountDetailsPojo> findAccountByAccountNumber(int accountNumber) throws Exception {
		List<AccountDetailsPojo> account = new ArrayList<AccountDetailsPojo>();

		for (int i = 0; i < data.size(); i++) {
			if (data.get(i).getAccountNumber().equals(accountNumber))
				account.add(data.get(i));
		}

		if (account.size() == 0)
			throw new Exception("AccountNotFoundException");

			 
		return account;
	}

	@Override
	public void removeAccount(int accountNumber) throws Exception {

	
		
			if (findAccountByAccountNumber(accountNumber) == null) 

				throw new Exception("AccountNotFoundException");
			 
			else {
				for (int i = 0; i < data.size(); i++) {
					if (data.get(i).getAccountNumber().equals(accountNumber))

					{

						data.remove(i);
						System.out.println("Account " + accountNumber + " Removed Successfully");
					}
				}

			}

		}


	@Override
	public List<AccountDetailsPojo> displayAllAccounts() {
		
		
		
		return data;
	}

	@Override
	public List<AccountDetailsPojo> displayAccountsHavingThBalanceLessThan1000() {

		int count = 0;
		List<AccountDetailsPojo> account = new ArrayList<AccountDetailsPojo>();
		for (int i = 0; i < data.size(); i++) {
			if (data.get(i).getBalance() < 1000.0) {
				count = count + 1;
				account.add(data.get(i));
			}

		}
		if (count == 0) {
			System.out.println("no such accounts found");
		}

		return account;
	}

}
