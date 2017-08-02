package fr.pizzeria.model;

public class Pizza {
	public Pizza(String code, String nom, double prix) {

		this.id = nextId;
		this.code = code;
		this.nom = nom;
		this.prix = prix;
		nextId++;
	}

	private static int nextId = 0;
	private int id;
	public String code;
	public String nom;
	public double prix;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return this.code + " > " + this.nom + " > " + this.prix;

	}

}
