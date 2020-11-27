package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ServiceDemo {

	@Autowired
	DaoDemo dao;
	
	public void add() {
		
		dao.setId(1);
		dao.setName("kartik");
		System.out.println("Added");
		
	}
	
	public String display() {
	
		System.out.println("Display");
		int id = dao.getId();
		String name = dao.getName();
		
		String data = name +" "+ Integer.toString(id);
		
		return data;
		
	}
	
	
	
	
}
