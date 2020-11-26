package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortMain {

	public static void main(String... strings) {
		List<Shop> list = new ArrayList<Shop>();
		List<Shop> list1 = new ArrayList<Shop>();
		list.add(new Shop(1, "Soap", 100.0));
		list.add(new Shop(3, "Shampoo", 300.0));
		list.add(new Shop(2, "Conditioner", 200.0));

		list1.add(new Shop(1, "Soap", 100.0));
		list1.add(new Shop(3, "Shampoo", 300.0));
		list1.add(new Shop(2, "Conditioner", 200.0));

		// Using comparable
		System.out.println("Using Comparable");
		Collections.sort(list);
		System.out.println(list);

		// Using comparator
		System.out.println("Using Comparator -  Ascending");
		Comparator<Shop> c = new Comparator<Shop>() {
			@Override
			public int compare(Shop o1, Shop o2) {
				return o1.getId() - o2.getId();
			}
		};
		Collections.sort(list1, c);
		System.out.println(list1);

		// Using comparator
		System.out.println("Using Comparator -  Descending");
		Comparator<Shop> c1 = new Comparator<Shop>() {
			@Override
			public int compare(Shop o1, Shop o2) {
				return o2.getId() - o1.getId();
			}
		};
		Collections.sort(list1, c1);
		System.out.println(list1);

	}

}
