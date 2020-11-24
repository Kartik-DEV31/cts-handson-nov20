package userCredentials;

import java.util.ArrayList;
import java.util.List;

public class UserMain {
	
	public static void main(String... args) {
		
	List<UserCredential> list = new ArrayList<UserCredential>();
	
	UserCredential cred1  =new UserCredential("1", "Kartik", "123");
	UserCredential cred2  =new UserCredential("2", "Ajay", "345");
	UserCredential cred3  =new UserCredential("3", "Ranjeet", "674");
	UserCredential cred4  =new UserCredential("4", "Shubham", "852");
	UserCredential cred5  =new UserCredential("5", "Vignesh", "111");
	
	
	
	list.add(cred1);
	list.add(cred2);
	list.add(cred3);
	list.add(cred4);
	list.add(cred5);
	
	

	for(int i =0 ;i<list.size();i++)
	{
		if(list.get(i).getName().length()>5) {
			
			System.out.println("Id: "+list.get(i).getId()+" Name: "+list
					.get(i).getName());
			
		}
		
		
	}
	
	
	
	
	}
}
