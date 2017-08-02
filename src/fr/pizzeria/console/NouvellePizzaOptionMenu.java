package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class NouvellePizzaOptionMenu extends OptionMenu {

	private IPizzaDao dao;
	private Scanner scanner;

	public NouvellePizzaOptionMenu(IPizzaDao dao, Scanner scanner) {
		this.dao = dao;
		this.scanner = scanner;
	}

	public void execute() {

		System.out.println("Ajout d'une nouvelle pizza");
		System.out.println("Veuillez saisir le code:");
		String code = scanner.next().toUpperCase();

		System.out.println("Veuillez saisir le nom (sans espace):");
		String nom = scanner.next();

		System.out.println("Veuillez saisir le prix:");
		String prixStr = scanner.next();

		// Conversion du prix en double
		double prix = Double.parseDouble(prixStr);
		Pizza nouvellePizza = new Pizza(code, nom, prix);

		dao.saveNewPizza(nouvellePizza);

	}

}
