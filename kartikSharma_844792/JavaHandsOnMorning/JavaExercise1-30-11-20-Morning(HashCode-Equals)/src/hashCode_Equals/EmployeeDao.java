package hashCode_Equals;

import java.util.Random;

public class EmployeeDao {
	int account;
	
	int id;
	public EmployeeDao(int account, int id) {
		super();
		this.account = account;
		this.id = id;
	}
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	@Override
	public int hashCode() {
		
		Random random = new Random();
		int i = random.nextInt(1000);
		
		return i;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDao other = (EmployeeDao) obj;
		if (account != other.account)
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	
	
	
}
