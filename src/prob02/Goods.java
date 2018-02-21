package prob02;

public class Goods {
	private String name;
	private int price;
	private int countOfStock;

	
	public Goods(String name, int price, int countOfStock) {
		this.name = name;
		this.price = price;
		this.countOfStock = countOfStock;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCountOfStock() {
		return countOfStock;
	}
	public void setCountOfStock(int countOfStock) {
		this.countOfStock = countOfStock;
	}
	
	public void show() {
		System.out.println(name+"(가격:"+price+"원)이 "+countOfStock+"개 입고 되었습니다.");
	}
}
