package comparator;

public class Shop implements Comparable<Shop> {
	Integer id;
	String name;
	Double price;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public Shop(Integer id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public int compareTo(Shop o) {
		// TODO Auto-generated method stub
		return this.id - o.getId();
	}
	@Override
	public String toString() {
		return "Shop [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
	
}
