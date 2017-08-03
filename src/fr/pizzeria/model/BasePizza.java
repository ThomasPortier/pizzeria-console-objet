package fr.pizzeria.model;

public enum BasePizza {
	TOMATE("Base Tomate"), CREME("Base Crème"), PATATE("Base Patate");

	private String base;
	
	private BasePizza(String base) {
		this.base = base;
	}

	public String getValue() {
		return base;
	}
	
	

}
