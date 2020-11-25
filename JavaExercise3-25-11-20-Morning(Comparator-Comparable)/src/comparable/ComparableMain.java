package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableMain {

	public static void main(String... strings) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(10);
		list.add(0);
		list.add(5);
		list.add(4);
		
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("----Complex List Sorting----");
	
		List<Shop> list2 = new ArrayList<Shop>();
		list2.add(new Shop(1, "shampoo" , 1000.0));
		list2.add(new Shop(4, "soap" , 100.0));
		list2.add(new Shop(2, "conditioner" , 2000.0));
		list2.add(new Shop(3, "towel" , 500.0));
		
		Collections.sort(list2);
		
		for(int i=0;i<list2.size();i++)
		{
		
			System.out.println(list2.get(i));
		}
		
		
		
		
		
	}
	
	
}
