package bootcamp;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Stream;

public class ejercicioTaller2 {

	public static BigDecimal total = new BigDecimal("0");
	public static BigDecimal priceIVA = new BigDecimal("0");
	public static BigDecimal iva = new BigDecimal("0");
	
	public static void main(String[] args) {
		
		List<Product> shoppingCart = List.of(
				new Product("Clothes", new BigDecimal("15.90"), TaxEnum.NORMAL),
				new Product("Bread", new BigDecimal("1.5"), TaxEnum.SUPERREDUCED),
				new Product("Meat", new BigDecimal("13.99"), TaxEnum.REDUCED),
				new Product("Cheese", new BigDecimal("3.59"), TaxEnum.SUPERREDUCED),
				new Product("Coke", new BigDecimal("1.89"), TaxEnum.REDUCED),
				new Product("Whiskey", new BigDecimal("19.90"), TaxEnum.NORMAL));
		
		shoppingCart.stream().forEach((p)-> {
			iva = p.getPrice().multiply(p.getTax().getPrecio());
			total= total.add(p.getPrice().add(iva));
			});
			System.out.println("Tu compra tiene un total de " + total + " €");
			
			Stream <Product> producto=shoppingCart.stream().filter((pro)->pro.getName().startsWith("C")).sorted();
			producto.forEach((p) -> {
				System.out.println("Los productos que empiezan por C son " + p.getName());
			});
	}

}
