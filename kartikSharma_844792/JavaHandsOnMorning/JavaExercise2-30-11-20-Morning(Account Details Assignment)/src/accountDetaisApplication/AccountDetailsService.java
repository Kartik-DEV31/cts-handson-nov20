package accountDetaisApplication;

import java.util.List;

public interface AccountDetailsService {

	void add(int accaccountNumber, Double balance) throws Exception;

	List<AccountDetailsPojo> findAccountByAccountNumber(int accountNumber)throws Exception;

	void removeAccount(int accountNumber)throws Exception;

	List<AccountDetailsPojo> displayAllAccounts();

	List<AccountDetailsPojo> displayAccountsHavingThBalanceLessThan1000();

}
