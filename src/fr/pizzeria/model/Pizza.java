package fr.pizzeria.model;

//import java.util.Locale.Category;

public class Pizza {
	public Pizza(BasePizza category, String code, String nom, double prix) {

		this.category = category;
		this.code = code;
		this.nom = nom;
		this.prix = prix;

	}

	private BasePizza category;
	private String code;
	private String nom;
	private double prix;

	
	public BasePizza getCategory() {
		return category;
	}

	public void setCategory(BasePizza category) {
		this.category = category;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String toString() {
		return this.category+ " > " +this.code + " > " + this.nom + " > " + this.prix;

	}

}
