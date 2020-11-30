package accountDetaisApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountDetailsMain  {

	public static void main(String... strings) {

		Scanner scan = new Scanner(System.in);
		String choice = null;
		int n = 0;
		AccountDetailsService service = new AccountDetailsServiceImpl();
		List<AccountDetailsPojo> list = new ArrayList<AccountDetailsPojo>();

		do {
			System.out.println("1: Add Account");
			System.out.println("2: Remove Account");
			System.out.println("3: Find Account by Account-number");
			System.out.println("4: Display all Accounts");
			System.out.println("5: Display Accounts having the balance less than 1000");

			System.out.print("---Enter your Choice : ");

			n = scan.nextInt();

			switch (n) {
			case 1:

				System.out.print("Enter accountNumber : ");
				Integer id = scan.nextInt();

				System.out.print("Enter Balance : ");
				Double balance = scan.nextDouble();

				try {
					service.add(id, balance);
				} catch (Exception e) {
					// TODO Auto-generated catch block
				System.out.println(e);
				}

				break;

			case 2:
				System.out.print("Remove the account number : ");
				Integer accountNumber = scan.nextInt();
				try {
					service.removeAccount(accountNumber);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e);
				}
				break;

			case 3:
				System.out.print("Find the account number : ");
				Integer accountNumber1 = scan.nextInt();
				try {
					list = service.findAccountByAccountNumber(accountNumber1);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e);
				}
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
				;
				break;
			case 4:
				list = service.displayAllAccounts();
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
				;
				break;
			case 5:
				list = service.displayAccountsHavingThBalanceLessThan1000();
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}

				break;
			default:
				System.out.println("---Wrong Input Entered - Try again.---");
				break;
			}

			System.out.print("---Want to continue (y or n) :---");
			Scanner scan2 = new Scanner(System.in);
			choice = scan2.nextLine().toLowerCase();
			

		} while (choice.equals("y"));

		System.out.println("---Thankyou for using application...---");

	}

}
