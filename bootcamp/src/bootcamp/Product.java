package bootcamp;

import java.math.BigDecimal;

public class Product implements Comparable<Product> {
	private String name;
	private BigDecimal price;
	private TaxEnum tax;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public TaxEnum getTax() {
		return tax;
	}
	public void setTax(TaxEnum tax) {
		this.tax = tax;
	}
	public Product(String name, BigDecimal price, TaxEnum tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}
	public Product() {
		
	}
	@Override
    public int compareTo(Product o) {
        int ordenado=this.name.compareTo(o.getName());
        return ordenado;
    }
	
}
