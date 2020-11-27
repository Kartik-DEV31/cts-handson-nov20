package ComparatorUsingStreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorMain {

	public static void main(String... strings) {

		List<LaptopShop> allProducts = new ArrayList<LaptopShop>();
		allProducts.add(new LaptopShop(4.1, "HP", 50000.0));
		allProducts.add(new LaptopShop(4.0, "DELL", 45000.0));
		allProducts.add(new LaptopShop(4.5, "Lenovo", 65000.0));
		allProducts.add(new LaptopShop(4.6, "HP", 75000.0));
		allProducts.add(new LaptopShop(4.9, "Lenovo", 55000.0));
		allProducts.add(new LaptopShop(3.0, "DELL", 25000.0));

		List<LaptopShop> product = new ArrayList<LaptopShop>();

		for (int i = 0; i < allProducts.size(); i++) {

			if (allProducts.get(i).getName() == "HP") {
				product.add(allProducts.get(i));
			}

		}

		Collections.sort(product, (P1, P2) -> P2.getRating().compareTo(P1.getRating()));

		// using traditional For loop
		System.out.println("------using traditional For loop------");
		for (int i = 0; i < product.size(); i++)
			System.out.println(product.get(i));

		// Using new For Loop
		System.out.println("------Using new For Loop------");
		for (LaptopShop L : product)
			System.out.println(L);

		// Using Stream APi
		System.out.println("------Using Stream APi------");
		List<LaptopShop> allProducts2 = new ArrayList<LaptopShop>();
		allProducts2.add(new LaptopShop(4.1, "HP", 50000.0));
		allProducts2.add(new LaptopShop(4.0, "DELL", 45000.0));
		allProducts2.add(new LaptopShop(4.5, "Lenovo", 65000.0));
		allProducts2.add(new LaptopShop(4.6, "HP", 75000.0));
		allProducts2.add(new LaptopShop(4.9, "Lenovo", 55000.0));
		allProducts2.add(new LaptopShop(3.0, "DELL", 25000.0));
		List<LaptopShop> product2 = allProducts2.stream()
				.filter(item -> item.getName().equals("HP") || item.getName().equals("Lenovo"))
				.filter(item -> item.getPrice() > 60000).sorted((L1, L2) -> L2.getRating().compareTo(L1.getRating()))
				.collect(Collectors.toList());
		for (LaptopShop laptopShop : product2) {
			System.out.println(laptopShop);
		}

		// Using Map-Intermediate Stream operation
		System.out.println("------Using Map-Intermediate Stream operation------");
		allProducts2.stream().map(item -> item.getName()).distinct().collect(Collectors.toList())
				.forEach(item -> System.out.println(item));

	
		
		
	}

}
