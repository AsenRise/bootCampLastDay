package bootcamp;

import java.math.BigDecimal;

public enum TaxEnum {
	NORMAL(new BigDecimal("0.21")), SUPERREDUCED(new BigDecimal("0.04")), REDUCED(new BigDecimal("0.10"));
	private BigDecimal precio;
	
	TaxEnum(BigDecimal precio) {
		this.precio = precio;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	
	
	
}
