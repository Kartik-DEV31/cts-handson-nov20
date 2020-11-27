package ComparatorUsingStreamApi;

public class LaptopShop {

	Double rating;
	String name;
	Double price;

	public LaptopShop(Double rating, String name, Double price) {
		super();
		this.rating = rating;
		this.name = name;
		this.price = price;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "rating= " + rating + ", name= " + name + ", price= " + price;
	}

}
